package com.swn.projectmanagesystem.user.controller;

import com.swn.projectmanagesystem.user.service.UserService;
import com.swn.projectmanagesystem.user.vo.UserLoginVo;
import com.swn.projectmanagesystem.user.vo.UserVo;
import com.swn.projectmanagesystem.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody UserLoginVo requestUser) {
        String username = requestUser.getUsername();
        String password = requestUser.getPassword();
        System.out.println("aaaaaaaaaaaaaaaaa");
        Result<UserVo> login = userService.login(requestUser);

        if (login.getCode() == 200) {
            return new Result(200, "欢迎登录");
        } else {
            return new Result(400, "登录失败");
        }


//        if (!Objects.equals("admin",username) || !Objects.equals("123456",requestUser.getPassword())){
//            String message = "账号密码错误";
////            return new Result(400);
//        }else {
////            return new Result(200);
//        }

    }
}
