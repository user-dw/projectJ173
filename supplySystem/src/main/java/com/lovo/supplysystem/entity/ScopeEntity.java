package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 经营范围实体类
 */
@Entity
@Table(name = "sys_scope")
public class ScopeEntity {

    /**营业类型id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    /**营业类型*/
    @Column(name = "s_content", length = 24)
    private String content;

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
}
