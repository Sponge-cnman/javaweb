package com.itlx.Mapper;

import com.itlx.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



/**
 * @author 兵结藤诚
 * @version 1.0
 */
public interface UserMapper {
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User selectlogin(@Param("username") String username,@Param("password") String password);

    @Select("select * from tb_user where username = #{username}")
    User selectByName(String username);

    void adduser(User user);
}
