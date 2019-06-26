package com.example.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("test2 update1");
        System.out.println("test2 update2");
        return "test";
    }
}
