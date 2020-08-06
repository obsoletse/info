package com.linbin.jmu.modules.login.mapper;


import com.linbin.jmu.modules.login.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: LinBin
 * @Date: 2020/8/6 22:59
 * @Version: V1.0
 * @Description:
 */
@Mapper
//定义数据库的接口
public interface UserMapper {
    User queryUserByNameAndPwd(@Param("username") String username, @Param("password") String password);
}
