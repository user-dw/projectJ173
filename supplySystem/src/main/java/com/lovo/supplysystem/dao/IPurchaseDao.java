package com.lovo.supplysystem.dao;

import com.lovo.supplysystem.entity.PurchaseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 采购信息持久接口
 */
public interface IPurchaseDao extends CrudRepository<PurchaseEntity, Integer> {

    /**
     * 修改采购数量
     *
     * @param code 采购订单编号
     * @param num  采购数量
     */
    @Modifying
    @Query("update PurchaseEntity set number = ?2 where code = ?1")
    public void updatePurchaseNum(String code, int num);

    /**
     * 修改竞标时间
     *
     * @param id      采购订单id
     * @param bidDate 竞标时间
     */
    @Modifying
    @Query("update PurchaseEntity set bidDate = ?2 where id = ?1")
    public void updateBidDate(int id, String bidDate);

    /**
     * 修改竞标状态
     *
     * @param id     采购订单id
     * @param bidTag 竞标状态标记
     */
    @Modifying
    @Query("update PurchaseEntity set bidTag = ?2 where id = ?1")
    public void updateBidTag(int id, int bidTag);

    /**
     * 动态查询采购信息（竞标状态）
     *
     * @param bidTag 竞标状态标记
     * @return 采购订单对象集合
     */
    @Query("from PurchaseEntity where 1 = 1 " +
            "and (bidTag = ?1 or ?1 is null)")
    public List<PurchaseEntity> findByCondition(Integer bidTag, Pageable pageable);
}
