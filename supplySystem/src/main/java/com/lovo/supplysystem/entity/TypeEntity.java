package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.util.List;

/**
 * 商品类型实体类
 */
@Entity
@Table(name = "sys_type")
public class TypeEntity {

    /**商品类型id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private int id;

    /**商品类型*/
    @Column(name = "t_content", length = 24)
    private String content;

    /**商品规格集合*/
    @OneToMany(mappedBy = "type")
    private List<SizeKeyEntity> sizeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<SizeKeyEntity> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<SizeKeyEntity> sizeList) {
        this.sizeList = sizeList;
    }
}
