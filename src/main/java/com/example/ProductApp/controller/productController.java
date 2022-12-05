package com.example.ProductApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @PostMapping("/")
    public String home(){
        return "welcome to product home page";

    }

    @PostMapping("/add")
    public String add(){
        return "welcome to product Add detiles page";

    }

    @GetMapping("/view")
    public String view(){
        return "view product detiles here";
    }


    @PostMapping("/edit")
    public String edit(){
        return "edit product detiles here";
    }


}
