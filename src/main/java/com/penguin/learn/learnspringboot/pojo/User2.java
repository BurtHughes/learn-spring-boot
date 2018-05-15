package com.penguin.learn.learnspringboot.pojo;

import java.io.Serializable;
import java.util.Date;

public class User2 implements Serializable {

    private static final long serialVersionUID = -6249397911566315813L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Integer id;

    private String username;

    private String password;

    private Date birthday;
}