package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 采购信息实体类
 */
@Entity
@Table(name = "sys_purchase")
public class purchaseEntity implements Serializable {

    /**采购信息id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int id;

    /**供应商对象*/
    @ManyToOne
    @JoinColumn(name = "c_id")
    private CompanyEntity company;

    /**采购信息编号*/
    @Column(name = "p_code", length = 48)
    private String code;

    /**采购商品名称*/
    @Column(name = "p_goodsName", length = 24)
    private String goodsName;

    /**采购商品类型*/
    @Column(name = "p_goodsType", length = 24)
    private String goodsType;

    /**采购商品规格*/
    @Column(name = "p_goodsSize", length = 255)
    private String goodsSize;

    /**采购商品数量*/
    @Column(name = "p_number")
    private int number;

    /**采购订单下单时间*/
    @Column(name = "p_orderDate", columnDefinition = "TIMESTAMP")
    private String orderDate;

    /**竞标时间*/
    @Column(name = "p_bidDate", columnDefinition = "TIMESTAMP")
    private String bidDate;

    /**供货时间*/
    @Column(name = "p_supplyDate", columnDefinition = "TIMESTAMP")
    private String supplyDate;

    /**竞标标记*/
    @Column(name = "p_bidTag")
    private int bidTag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public String getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(String supplyDate) {
        this.supplyDate = supplyDate;
    }

    public int getBidTag() {
        return bidTag;
    }

    public void setBidTag(int bidTag) {
        this.bidTag = bidTag;
    }
}
