package com.penguin.learn.learnspringboot.dao;

import com.penguin.learn.learnspringboot.pojo.User2;

public interface UserDao {
    public int insert(User2 user);

    public int deleteById(Integer id);

    public int update(User2 user);

    public User2 getById(Integer id);
}
