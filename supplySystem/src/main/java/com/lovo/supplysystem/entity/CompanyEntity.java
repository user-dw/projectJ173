package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 供应商实体
 */
@Entity
@Table(name = "sys_company")
public class CompanyEntity implements Serializable {

    /**供应商id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private int id;

    /**供应商名称*/
    @Column(name = "c_companyName")
    private String companyName;

    /**法人名字*/
    @Column(name = "c_managerName")
    private String managerName;

    /**公司电话*/
    @Column(name = "c_phone")
    private String phone;

    /**公司地址*/
    @Column(name = "c_address")
    private String address;

    /**工商编号*/
    @Column(name = "c_aaumNub")
    private String aaumNub;

    /**营业执照*/
    @Column(name = "c_charter", columnDefinition = "TEXT")
    private String charter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAaumNub() {
        return aaumNub;
    }

    public void setAaumNub(String aaumNub) {
        this.aaumNub = aaumNub;
    }

    public String getCharter() {
        return charter;
    }

    public void setCharter(String charter) {
        this.charter = charter;
    }
}