package edu.czjtu.demo1.controller;

import edu.czjtu.demo1.entity.User;
import edu.czjtu.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 查询所有用户
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 根据ID查询用户
    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return userService.getById(id);
    }

    // 根据邮箱查询用户
    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    // 根据用户名查询用户
    @GetMapping("/name/{name}")
    public User getByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    // 更新用户
    @PutMapping
    public boolean update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
} 