package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 退货订单实体类
 */
@Entity
@Table(name = "sys_return")
public class ReturnEntity implements Serializable {

    /**退货订单id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private int id;

    /**退货订单编号*/
    @Column(name = "r_code", length = 48)
    private String code;

    /**竞标信息对象*/
    @ManyToOne
    @JoinColumn(name = "b_id")
    private BidEntity bid;

    /**商品编号*/
    @Column(name = "r_goodsCode", length = 48)
    private String goodsCode;

    /**退货数量*/
    @Column(name = "r_returnNum")
    private int returnNum;

    /**退货金额*/
    @Column(name = "r_returnMoney")
    private int returnMoney;

    /**退货原因*/
    @Column(name = "r_reason", length = 255)
    private String reason;

    /**退货日期*/
    @Column(name = "r_returnDate", columnDefinition = "TIMESTAMP")
    private String returnDate;

    /**退货订单完成状态*/
    @Column(name = "r_finishTag")
    private int finishTag; // 0：未完成（未收货），1：已完成（已收货）

    /**退货订单完成时间*/
    @Column(name = "r_finishDate", columnDefinition = "TIMESTAMP")
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

    public int getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(int returnNum) {
        this.returnNum = returnNum;
    }

    public int getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(int returnMoney) {
        this.returnMoney = returnMoney;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getFinishTag() {
        return finishTag;
    }

    public void setFinishTag(int finishTag) {
        this.finishTag = finishTag;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
