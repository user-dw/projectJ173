package com.lovo.supplysystem.service.impl;

import com.lovo.supplysystem.dao.IUserDao;
import com.lovo.supplysystem.entity.UserEntity;
import com.lovo.supplysystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务接口实现类
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    @Override
    public UserEntity login(String userName, String password) {
        return userDao.findByUserNameAndPassword(userName,password);
    }

    @Override
    public void register(UserEntity user) {
        userDao.save(user);
    }

    @Override
    public UserEntity findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
