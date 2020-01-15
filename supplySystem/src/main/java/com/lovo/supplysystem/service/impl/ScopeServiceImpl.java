package com.lovo.supplysystem.service.impl;

import com.lovo.supplysystem.dao.IScopeDao;
import com.lovo.supplysystem.entity.ScopeEntity;
import com.lovo.supplysystem.service.IScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "scopeService")
@Transactional
public class ScopeServiceImpl implements IScopeService {
    @Autowired
    IScopeDao scopeDao;
    @Override
    public void savaScope(ScopeEntity scope) {
        scopeDao.save(scope);
    }
}
