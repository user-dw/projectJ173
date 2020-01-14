package com.lovo.supplysystem.service;

import com.lovo.supplysystem.entity.UserEntity;

/**
 * 用户业务接口
 */
public interface IUserService {
    /**
     * 用户登录
     * @param userName 用户名
     * @param password 密码
     * @return 用户对象
     */
    UserEntity login(String userName,String password);

    /**
     * 用户注册
     * @param user 用户注册
     */
    void register(UserEntity user);

    /**
     * 按用户名查询用户（重名验证）
     * @param userName 用户名
     * @return 用户对象
     */
    UserEntity findByUserName(String userName);
}
