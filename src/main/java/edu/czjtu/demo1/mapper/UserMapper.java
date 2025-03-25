package edu.czjtu.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjtu.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // 根据邮箱查询用户
    @Select("SELECT * FROM user WHERE email = #{email}")
    User findByEmail(String email);

    // 根据用户名查询用户
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(String name);

    // 更新用户信息
    @Update("UPDATE user SET name = #{name}, email = #{email}, password = #{password} WHERE id = #{id}")
    int updateUser(User user);

    // 删除用户
    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUser(Integer id);
} 