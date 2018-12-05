package com.ad.weibo.adinf.controller;

import com.ad.weibo.adinf.entity.User;
import com.ad.weibo.adinf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public User save(@RequestParam(value="id",defaultValue = "4") Integer id, @RequestParam(value="name",defaultValue = "sby") String name) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPwd("8765");
        int result = this.userService.insert(user);
        System.out.println(result);

        return user;

    }

    @RequestMapping("/aaa")
    public String aaa() {
        return "ok";
    }

}
