package com.casit.cache.controller;

import com.casit.cache.bean.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.casit.cache.service.categoryService;

import java.util.Random;

@RestController
public class categoryController {
    @Autowired
    categoryService service;

    @RequestMapping("/findByName")
    public void findByname(category c){
        System.out.println(service.findByName(c));
    }

    @RequestMapping("/update")
    public void update(){
        category c=new category();
        c.setName("AJ"+(int)(Math.random()*10000%10+1));
        service.update(c);
    }

    @RequestMapping("/delete")
    public void delete(category c){
        service.delete(c);
    }
}
