package com.lovo.supplysystem.service;

import com.lovo.supplysystem.entity.PurchaseEntity;

import java.util.List;

/**
 * 采购信息业务接口
 */
public interface IPurchaseService {

    /**
     * 保存采购信息
     *
     * @param purchase 采购信息对象
     */
    public void savePurchase(PurchaseEntity purchase);

    /**
     * 修改采购数量
     *
     * @param code 采购订单编号
     * @param num  采购数量
     */
    public void updatePurchaseNum(String code, int num);

    /**
     * 修改竞标时间
     *
     * @param id      采购订单id
     * @param bidDate 竞标时间
     */
    public void updateBidDate(int id, String bidDate);

    /**
     * 修改竞标状态
     *
     * @param id     采购订单id
     * @param bidTag 竞标状态标记
     */
    public void updateBidTag(int id, int bidTag);

    /**
     * 根据采购信息id查询采购信息
     *
     * @param id 采购订单id
     * @return 采购订单对象
     */
    public PurchaseEntity findById(int id);

    /**
     * 动态查询采购信息（竞标状态）
     *
     * @param bidTag      竞标状态标记
     * @param currentPage 当前页数
     * @return 采购订单对象集合
     */
    public List<PurchaseEntity> findByCondition(int bidTag, int currentPage);
}
