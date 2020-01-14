package com.lovo.supplysystem.service;

import com.lovo.supplysystem.entity.CompanyEntity;

/**
 * 供应商业务接口
 */
public interface ICompanyService {
    /**
     * 保存供应商
     * @param company 供应商对象
     */
    void savaCompany(CompanyEntity company);
    /**
     * 按供应商名称修改供应商状态
     * @param status 状态
     * @param companyName 供应商名称
     */
    void updateStatusByCompanyName(int status,String companyName);
}
