package com.penguin.learn.springboot.dao;

import com.penguin.learn.springboot.pojo.User2;

public interface UserDao {
    public int insert(User2 user);

    public int deleteById(Integer id);

    public int update(User2 user);

    public User2 getById(Integer id);
}
