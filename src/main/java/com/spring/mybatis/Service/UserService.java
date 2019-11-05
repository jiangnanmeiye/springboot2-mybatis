package com.spring.mybatis.Service;

import com.github.pagehelper.PageInfo;
import com.spring.mybatis.model.User;

public interface UserService {
    int addUser(User user);

    PageInfo<User> finaAllUser(int pageNum, int pageSize);
}
