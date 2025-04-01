package com.hbn.CloudDeployment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Hello from cloud deployment app";
    }

    @GetMapping("/info")
    public void aboutSystem(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
    }

}
