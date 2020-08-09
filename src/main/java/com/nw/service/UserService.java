package com.nw.service;

import com.nw.entity.User;

public interface UserService {

    /**
     * 根据usernmae查询用户
     * @param username
     * @return
     */
    User queryUserByUsername(String username);

}
