package com.lovo.supplysystem.dao;

import com.lovo.supplysystem.entity.CompanyEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * 供应商你持久接口
 */
public interface ICompanyDao extends CrudRepository<CompanyEntity,Integer> {
    /**
     * 按供应商名称修改供应商状态
     * @param status 状态
     * @param companyName 供应商名称
     */
    @Query("update CompanyEntity set status = ?1 where companyName = ?2")
    void updateStatusByCompanyName(int status,String companyName);
}
