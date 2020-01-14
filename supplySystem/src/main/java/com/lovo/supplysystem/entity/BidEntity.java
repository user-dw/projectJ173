package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 竞标信息实体类
 */
@Entity
@Table(name = "sys_bid")
public class BidEntity implements Serializable {

    /**竞标信息id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "b_id")
    private int id;

    /**采购订单对象*/
    @OneToOne
    @JoinColumn(name = "p_id")
    private purchaseEntity purchase;

    /**竞标信息编号*/
    @Column(name = "b_code", length = 48)
    private String code;

    /**竞标商品单价*/
    @Column(name = "b_price")
    private int price;

    /**供货数量*/
    @Column(name = "b_provideNum")
    private int provideNum;

    /**竞标日期*/
    @Column(name = "b_bidDate", columnDefinition = "TIMESTAMP")
    private String bidDate;

    /**中标状态*/
    @Column(name = "b_tag")
    private int tag; // 0：未中标，1：已中标

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public purchaseEntity getPurchase() {
        return purchase;
    }

    public void setPurchase(purchaseEntity purchase) {
        this.purchase = purchase;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProvideNum() {
        return provideNum;
    }

    public void setProvideNum(int provideNum) {
        this.provideNum = provideNum;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
