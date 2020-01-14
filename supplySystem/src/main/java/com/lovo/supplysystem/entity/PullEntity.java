package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 下拉框内容实体类
 */
@Entity
@Table(name = "sys_pull")
public class PullEntity implements Serializable {

    /**下拉框内容id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int id;

    /**下拉框内容类型*/
    @Column(name = "p_type")
    private String type; // goodsType:商品类型 sizeKey:商品规格键 sizeValue:商品规格值 scope:营业范围

    /**下拉框内容父类id*/
    @Column(name = "p_classId")
    private int classId;

    /**下拉框内容*/
    @Column(name = "p_content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
