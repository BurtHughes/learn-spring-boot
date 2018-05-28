package com.penguin.learn.springboot.dao;

import com.penguin.learn.springboot.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
