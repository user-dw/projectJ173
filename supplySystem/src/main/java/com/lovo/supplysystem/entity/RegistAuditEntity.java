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
    @ManyToOne
    @JoinColumn(name = "c_id")
    private CompanyEntity company;

    /**审核信息*/
    @Column(name = "r_content", length = 255)
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
