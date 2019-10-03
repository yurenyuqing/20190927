package com.provider.controller;

import com.provider.entity.Student;
import com.provider.repository.StudentRespository;
import com.provider.repository.impl.StudentRespositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRespository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @GetMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrupdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrupdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);

    }

    @GetMapping("/index")
    public String index(){
        return "当前端口为："+ this.port;
    }
}
