package com.example.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create bySeptember
 * 2019/6/26
 * 17:26
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/")
    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/hello2")
    public String sayHello2(){
        return "hello";
    }
}
