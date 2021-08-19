package com.swn.projectmanagesystem.user.service.impl;

import com.swn.projectmanagesystem.result.Result;
import com.swn.projectmanagesystem.user.dao.UserMapper;
import com.swn.projectmanagesystem.user.service.UserService;
import com.swn.projectmanagesystem.user.vo.UserLoginVo;
import com.swn.projectmanagesystem.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public Result<UserVo> login(UserLoginVo userLoginVo) {
        UserVo userVo = userMapper.login(userLoginVo);
        if (userVo == null){
            return Result.fail("用户名或密码不正确");
        } else {
            return Result.success(userVo);
        }
    }
}
