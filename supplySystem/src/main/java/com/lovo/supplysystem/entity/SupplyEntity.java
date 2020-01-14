package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 供货订单
 */
@Entity
@Table(name = "sys_supply")
public class SupplyEntity {

    /**供货订单id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**供货订单编号*/
    @Column(name = "s_code", length = 48)
    private String code;

    /**供货批次*/
    @Column(name = "s_batch", length = 8)
    private String batch;

    /**竞标对象*/
    @ManyToOne
    @JoinColumn(name = "b_id")
    private BidEntity bid;

    /**商品编号*/
    @Column(name = "s_goodsCode", length = 48)
    private String goodsCode;

    /**供货数量*/
    @Column(name = "s_supplyNum")
    private int supplyNum;

    /**当前批次总价*/
    @Column(name = "s_totalMoney")
    private int totalMoney;

    /**供货状态*/
    @Column(name = "s_supplyTag")
    private int supplyTag; // 0：未供货，1：已供货

    /**订单完成状态*/
    @Column(name = "s_finishTag")
    private int finishTag; // 0：未完成（未付款），1：已完成（已付款）

    /**供货日期*/
    @Column(name = "s_supplyDate", columnDefinition = "TIMESTAMP")
    private String supplyDate;

    /**订单完成日期*/
    @Column(name = "s_finishDate", columnDefinition = "TIMESTAMP")
    private String finishDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public BidEntity getBid() {
        return bid;
    }

    public void setBid(BidEntity bid) {
        this.bid = bid;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public int getSupplyNum() {
        return supplyNum;
    }

    public void setSupplyNum(int supplyNum) {
        this.supplyNum = supplyNum;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getSupplyTag() {
        return supplyTag;
    }

    public void setSupplyTag(int supplyTag) {
        this.supplyTag = supplyTag;
    }

    public int getFinishTag() {
        return finishTag;
    }

    public void setFinishTag(int finishTag) {
        this.finishTag = finishTag;
    }

    public String getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(String supplyDate) {
        this.supplyDate = supplyDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
