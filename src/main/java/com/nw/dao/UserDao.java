package com.nw.dao;

import com.nw.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    /**
     * 通过userName查询用户
     *
     * @param username
     * @return User
     */
    User queryUserByUsername(@Param("username")String username);

}
