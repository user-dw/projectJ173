package com.lovo.supplysystem.service.impl;

import com.lovo.supplysystem.dao.ICompanyDao;
import com.lovo.supplysystem.entity.CompanyEntity;
import com.lovo.supplysystem.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 供应商业务接口实现类
 */
@Service(value = "companyService")
@Transactional
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    ICompanyDao companyDao;
    @Override
    public void savaCompany(CompanyEntity company) {
        companyDao.save(company);
    }

    @Override
    public void updateStatusByCompanyName(int status, String companyName) {


//        companyDao.updateStatusByCompanyName(status,companyName);
    }
}
