package com.lovo.supplysystem.dao;

import com.lovo.supplysystem.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户持久接口
 */
public interface IUserDao extends CrudRepository<UserEntity,Integer> {
        /**
         * 用户登录
         * @param userName 用户名
         * @param Password 密码
         * @return 用户对象
         */
        UserEntity findByUserNameAndPassword(String userName,String Password);

        /**
         * 按用户名查询用户
         * @param userName 用户名
         * @return 用户对象
         */
        UserEntity findByUserName(String userName);
}
