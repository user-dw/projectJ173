package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 用户实体类
 */
@Entity
@Table(name = "sys_user")
public class UserEntity {

    /**用户id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private int id;

    /**供应商对象*/
    @OneToOne
    @JoinColumn(name = "c_id")
    private CompanyEntity company;

    /**权限对象*/
    @ManyToOne
    @JoinColumn(name = "p_id")
    private PowerEntity power;

    /**用户名*/
    @Column(name = "u_userName", length = 24)
    private String userName;

    /**密码*/
    @Column(name = "u_password", length = 24)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }
}
