package com.ad.weibo.adinf.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CreativeController {

    @RequestMapping("/test")
    public String methodtest() {
        return "methodtest";
    }

    @RequestMapping("/getUid/{uid}")
    public String getUid(@PathVariable("uid") Integer uid) {

        return String.format("user %s", uid);
    }
}
