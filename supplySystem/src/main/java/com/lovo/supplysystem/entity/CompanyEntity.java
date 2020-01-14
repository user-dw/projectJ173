package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @Column(name = "c_companyName", length = 24)
    private String companyName;

    /**营业类型集合*/
    @ManyToMany
    @JoinTable(
            name = "sys_company_scope",
            joinColumns = {@JoinColumn(name = "c_id")},
            inverseJoinColumns = {@JoinColumn(name = "s_id")})
    private List<ScopeEntity> scopeList;

    /**法人名字*/
    @Column(name = "c_managerName", length = 24)
    private String managerName;

    /**公司电话*/
    @Column(name = "c_phone", length = 24)
    private String phone;

    /**公司地址*/
    @Column(name = "c_address", length = 255)
    private String address;

    /**工商编号*/
    @Column(name = "c_aaumNub", length = 24)
    private String aaumNub;

    /**营业执照*/
    @Column(name = "c_charter", columnDefinition = "TEXT")
    private String charter;

    /**供应商状态*/
    @Column(name = "c_status")
    private int status = 0; // 0：正在核审 1：正常 2：注册未通过

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

    public List<ScopeEntity> getScopeList() {
        return scopeList;
    }

    public void setScopeList(List<ScopeEntity> scopeList) {
        this.scopeList = scopeList;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
