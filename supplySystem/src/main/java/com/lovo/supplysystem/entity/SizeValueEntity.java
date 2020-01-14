package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 商品规格值实体类
 */
@Entity
@Table(name = "sys_sizeValue")
public class SizeValueEntity {

    /**商品规格值id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**商品对象*/
    @ManyToOne
    @JoinColumn(name = "g_id")
    private GoodsEntity goods;

    /**商品规格键对象*/
    @ManyToOne
    @JoinColumn(name = "sizeKey_id")
    private SizeKeyEntity sizeKey;

    /**商品规格值*/
    @Column(name = "s_sizeValue", length = 24)
    private String sizeValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GoodsEntity getGoods() {
        return goods;
    }

    public void setGoods(GoodsEntity goods) {
        this.goods = goods;
    }

    public SizeKeyEntity getSizeKey() {
        return sizeKey;
    }

    public void setSizeKey(SizeKeyEntity sizeKey) {
        this.sizeKey = sizeKey;
    }

    public String getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(String sizeValue) {
        this.sizeValue = sizeValue;
    }
}
