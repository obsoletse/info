package com.linbin.jmu.modules.login.controller;

import com.linbin.jmu.modules.login.entity.User;
import com.linbin.jmu.modules.login.service.UserService;
import com.linbin.jmu.vo.Result;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LinBin
 * @Date: 2020/8/6 22:52
 * @Version: V1.0
 * @Description:
 */
//
@RestController //相当于@ResponseBody（把接口数据返回给前端） 和@Controller（声明当前类为控制器注解）
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Result sayHello(@RequestParam("username") String username){
        return Result.ok(username + " hello springboot!");
    }

    /*@GetMapping(@RequestParam) //单纯获取数据
    @PutMapping //修改数据
    @DeleteMapping //删除数据*/
    @PostMapping("/login") //提交数据
    public Result login(@RequestBody User user){
        if (StringUtils.isNullOrEmpty(user.getUsername())){
            return Result.error("用户名不能为空！");
        }
        if (StringUtils.isNullOrEmpty(user.getPassword())){
            return Result.error("用户密码不能为空！");
        }
        User newUser = userService.queryUserByNameAndPwd(user.getUsername(),user.getPassword());
        if (newUser != null){
            return Result.ok("登录成功！");
        }
        return Result.error("用户名或密码错误！");
    }
}
