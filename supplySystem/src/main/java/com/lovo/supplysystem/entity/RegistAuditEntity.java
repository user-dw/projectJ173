package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 供应商审核信息表
 */
@Entity
@Table(name = "sys_registAudit")
public class RegistAuditEntity {

    /**审核信息id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private int id;

    /**供应商对象*/
    @OneToOne
    @JoinColumn(name = "c_id")
    private CompanyEntity company;

    /**审核信息状态*/
    @Column(name = "r_tag")
    private int tag; // 0：正常 1：冻结 2：注册未通过

    /**审核信息备注*/
    @Column(name = "r_comment")
    private String comment;

    /**审核日期*/
    @Column(name = "r_date", columnDefinition = "TIMESTAMP")
    private String date;

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

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
