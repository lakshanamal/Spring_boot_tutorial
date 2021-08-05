package com.example.demo.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class HomeResource {

    @GetMapping("/get")
    public String home(){
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>From spring backend</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>From spring backend</h1>";
    }



}
