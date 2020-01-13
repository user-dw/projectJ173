package com.lovo.supplysystem.entity;

import javax.persistence.*;

/**
 * 权限实体类
 */
@Entity
@Table(name = "sys_power")
public class PowerEntity {

    /**权限id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int id;

    /**用户对象*/
    @OneToOne
    @JoinColumn(name = "u_id")
    private UserEntity user;

    /**权限等级*/
    @Column(name = "p_level")
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
