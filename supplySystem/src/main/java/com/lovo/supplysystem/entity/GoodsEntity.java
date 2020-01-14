package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 商品实体类
 */
@Entity
@Table(name = "sys_goods")
public class GoodsEntity {

    /**商品id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_id")
    private int id;

    /**商品编号*/
    @Column(name = "g_code", length = 48)
    private String code;

    /**商品名称*/
    @Column(name = "g_goodsName", length = 24)
    private String goodsName;

    /**商品类型*/
    @ManyToOne
    @JoinColumn(name = "t_id")
    private TypeEntity type;

    /**商品库存*/
    @Column(name = "g_stock")
    private int stock;

    /**商品图片*/
    @Column(name = "g_image", length = 48)
    private String image;

    /**商品删除标记*/
    @Column(name = "g_delTag")
    private int delTag; // 0：未删除 1：已删除

    /**供应商对象*/
    @ManyToOne
    @JoinColumn(name = "c_id")
    private CompanyEntity company;

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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getDelTag() {
        return delTag;
    }

    public void setDelTag(int delTag) {
        this.delTag = delTag;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }
}
