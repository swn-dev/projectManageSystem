package com.swn.projectmanagesystem.user.dao;

import com.swn.projectmanagesystem.result.Result;
import com.swn.projectmanagesystem.user.vo.UserLoginVo;
import com.swn.projectmanagesystem.user.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper {
    UserVo login(UserLoginVo userLoginVo);
}
