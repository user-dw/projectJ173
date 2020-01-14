package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 商品规格键实体类
 */
@Entity
@Table(name = "sys_sizeKey")
public class SizeKeyEntity {

    /**商品规格键id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**商品类型*/
    @ManyToOne
    @JoinColumn(name = "t_id")
    private TypeEntity type;

    /**商品规格键*/
    @Column(name = "s_sizeKey", length = 24)
    private String sizeKey;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public String getSizeKey() {
        return sizeKey;
    }

    public void setSizeKey(String sizeKey) {
        this.sizeKey = sizeKey;
    }
}
