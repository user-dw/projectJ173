package com.lovo.supplysystem.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 权限实体类
 */
@Entity
@Table(name = "sys_power")
public class PowerEntity implements Serializable {

    /**权限id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int id;

    /**权限等级*/
    @Column(name = "p_level", length = 16)
    private String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
