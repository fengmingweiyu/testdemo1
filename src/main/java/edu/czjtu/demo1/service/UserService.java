package edu.czjtu.demo1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.czjtu.demo1.entity.User;
import java.util.List;

public interface UserService extends IService<User> {
    // 根据邮箱查询用户
    User findByEmail(String email);
    
    // 根据用户名查询用户
    User findByName(String name);
    
    // 更新用户信息
    boolean updateUser(User user);
    
    // 删除用户
    boolean deleteUser(Integer id);
    
    // 查询所有用户
    List<User> getAllUsers();
} 