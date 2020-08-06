package com.linbin.jmu.modules.login.service;

import com.linbin.jmu.modules.login.entity.User;

/**
 * @Author: LinBin
 * @Date: 2020/8/6 23:05
 * @Version: V1.0
 * @Description:
 */
public interface UserService {
    User queryUserByNameAndPwd(String username , String password);
}
