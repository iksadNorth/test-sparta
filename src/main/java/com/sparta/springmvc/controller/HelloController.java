package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @GetMapping("/post")
    @ResponseBody
    public String post() {
        return "Post Method 요청";
    }

    @GetMapping("/put")
    @ResponseBody
    public String put() {
        return "Put Method 요청";
    }

    @GetMapping("/delete")
    @ResponseBody
    public String delete() {
        return "Delete Method 요청";
    }
}
