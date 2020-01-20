package com.yss.logback.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HelloController {


    @RequestMapping("/Hello")
    public  String Hello(String string){
        string = "Hello World !!!";
        return  string;
    }



}
