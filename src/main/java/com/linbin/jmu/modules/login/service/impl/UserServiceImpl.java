package com.linbin.jmu.modules.login.service.impl;

import com.linbin.jmu.modules.login.entity.User;
import com.linbin.jmu.modules.login.mapper.UserMapper;
import com.linbin.jmu.modules.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LinBin
 * @Date: 2020/8/6 23:06
 * @Version: V1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {//ctrl + i

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByNameAndPwd(String username, String password) {
        return userMapper.queryUserByNameAndPwd(username,password);
    }
}
