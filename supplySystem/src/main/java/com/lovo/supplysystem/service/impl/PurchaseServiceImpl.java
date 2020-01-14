package com.lovo.supplysystem.service.impl;

import com.lovo.supplysystem.dao.IPurchaseDao;
import com.lovo.supplysystem.entity.PurchaseEntity;
import com.lovo.supplysystem.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 采购订单业务接口实现类
 */
@Service(value = "purchaseService")
@Transactional
public class PurchaseServiceImpl implements IPurchaseService {

    @Autowired
    private IPurchaseDao purchaseDao;

    @Override
    public void savePurchase(PurchaseEntity purchase) {
        purchaseDao.save(purchase);
    }

    @Override
    public void updatePurchaseNum(String code, int num) {
        purchaseDao.updatePurchaseNum(code, num);
    }

    @Override
    public void updateBidDate(int id, String bidDate) {
        purchaseDao.updateBidDate(id, bidDate);
    }

    @Override
    public void updateBidTag(int id, int bidTag) {
        purchaseDao.updateBidTag(id, bidTag);
    }

    @Override
    public PurchaseEntity findById(int id) {
        return purchaseDao.findById(id).get();
    }

    @Override
    public List<PurchaseEntity> findByCondition(int bidTag, int currentPage) {
        Pageable pageable= PageRequest.of(currentPage,8);
        return purchaseDao.findByCondition(bidTag, pageable);
    }
}
