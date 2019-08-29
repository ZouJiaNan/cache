package com.casit.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.casit.cache.service.categoryService;

@RestController
public class categoryController {
    @Autowired
    categoryService service;

    @RequestMapping("/findByName")
    public void findByname(String name){
        System.out.println(service.findByName("nike"));
    }
}
