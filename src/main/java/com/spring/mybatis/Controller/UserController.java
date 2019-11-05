package com.spring.mybatis.Controller;

import com.github.pagehelper.PageInfo;
import com.spring.mybatis.Service.UserService;
import com.spring.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @GetMapping("/all")
    public PageInfo<User> findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        return userService.finaAllUser(pageNum, pageSize);
    }


}
