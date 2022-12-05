package com.example.ProductApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @GetMapping("/")
    public String home(){
        return "welcome to product home page";

    }

    @PostMapping("/add")
    public String add(){
        return "add product detiles here..";
    }


}
