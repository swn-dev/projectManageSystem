package com.swn.projectmanagesystem.user.service;

import com.swn.projectmanagesystem.result.Result;
import com.swn.projectmanagesystem.user.vo.UserLoginVo;
import com.swn.projectmanagesystem.user.vo.UserVo;

public interface UserService {
    /*登录*/
     Result<UserVo> login(UserLoginVo userLoginVo);
}
