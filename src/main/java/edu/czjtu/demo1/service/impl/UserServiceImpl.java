package edu.czjtu.demo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjtu.demo1.entity.User;
import edu.czjtu.demo1.mapper.UserMapper;
import edu.czjtu.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    @Transactional
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
    
    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user) > 0;
    }
    
    @Override
    public boolean deleteUser(Integer id) {
        return userMapper.deleteUser(id) > 0;
    }
    
    @Override
    public List<User> getAllUsers() {
        return this.list();
    }
} 