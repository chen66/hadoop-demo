package org.chen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019-04-13 19:01
 */
@RestController
@RequestMapping("/test")
public class TestController {



    @RequestMapping("/test")
    public String test(){



        return "test";
    }

}