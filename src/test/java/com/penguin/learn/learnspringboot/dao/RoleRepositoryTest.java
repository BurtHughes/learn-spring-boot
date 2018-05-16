package com.penguin.learn.learnspringboot.dao;

import com.penguin.learn.learnspringboot.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {
    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testInsert() {
        Role role = new Role();
        role.setName("管理员");
        role.setDescr("测试");
        Role result = this.roleRepository.save(role);
        System.out.println(result);
    }

    @Test
    public void testFindOne() {
        Role roleExam = new Role();
        roleExam.setId(2);
        Example<Role> example = Example.of(roleExam);
        Role role = this.roleRepository.findOne(example).get();
        System.out.println(role);
    }

    @Test
    public void testUpdate() {
        Role role = new Role();
        role.setId(1);
        role.setName("管理员");
        role.setDescr("控制权限");
        Role result = this.roleRepository.save(role);
        System.out.println(result);
    }

    @Test
    public void testDelete() {
        Role role = new Role();
        role.setId(2);
        this.roleRepository.delete(role);
    }
}
