package com.feign.controller;

import com.feign.entity.Student;
import com.feign.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHander {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return providerFeign.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return providerFeign.index();
    }
}
