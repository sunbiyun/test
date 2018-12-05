package com.ad.weibo.adinf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Testboard {

    final private static Logger logger = LoggerFactory.getLogger(Testboard.class);


    @RequestMapping(value = "/templatetest", method = RequestMethod.GET)
    public String templatetest(ModelMap map) {
        System.out.println("qqqq");
        map.addAttribute("myname", "sby");
        logger.info("log info");
        return "testboard";
    }
}
