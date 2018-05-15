package com.penguin.learn.learnspringboot.dao;

import com.penguin.learn.learnspringboot.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
