package com.lll.mybatis.dao;

import com.lll.mybatis.domain.User;

import java.util.List;

/**
 * User持久层接口
 */
public interface UserMapper {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();


    int saveUser(User user);
}
