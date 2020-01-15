package com.lovo.supplysystem.controller;

import com.lovo.supplysystem.entity.CompanyEntity;
import com.lovo.supplysystem.entity.ScopeEntity;
import com.lovo.supplysystem.entity.UserEntity;
import com.lovo.supplysystem.service.ICompanyService;
import com.lovo.supplysystem.service.IScopeService;
import com.lovo.supplysystem.service.IUserService;
import com.lovo.supplysystem.util.StringInfo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    IUserService userService;
    @Autowired
    ICompanyService companyService;
    @Autowired
    IScopeService scopeService;

    @RequestMapping("login")
    public ModelAndView login(String userName, String password, HttpSession session){
        ModelAndView mv = new ModelAndView();
        UserEntity user = userService.login(userName,password);
        if(user != null){
            session.setAttribute("user",user);
            mv.setViewName("page/main.html");
        }else {
            mv.setViewName("userPage/login.html");
        }


        return mv;
    }
    @RequestMapping("register")
    public ModelAndView register(UserEntity user, CompanyEntity company, ScopeEntity scope, @RequestParam("charterImg")MultipartFile file) throws IOException {
        ModelAndView mv = new ModelAndView("regLoading.html");

        scopeService.savaScope(scope);
        //图片转化base64
        company.setCharter(new BASE64Encoder().encode(file.getBytes()));
        List<ScopeEntity> scopeList = new ArrayList<ScopeEntity>();
        scopeList.add(scope);
        company.setScopeList(scopeList);
        companyService.savaCompany(company);

        user.setCompany(company);
        userService.register(user);
        return mv;
    }
    @RequestMapping("gotoLogin")
    public ModelAndView gotoLogin(){
        ModelAndView mv = new ModelAndView("userPage/login.html");

        return mv;

    }
    @RequestMapping("gotoreg")
    public ModelAndView gotoreg(){
        ModelAndView mv = new ModelAndView("userPage/reg.html");

        return mv;

    }
    @RequestMapping("findUserName")
    @ResponseBody
    public String findUserName(String userName){
        String info = "";
        UserEntity user = userService.findByUserName(userName);
        if(user == null){
            info = StringInfo.USERNAME_REPEAT;

        }
        return info;

    }
}
