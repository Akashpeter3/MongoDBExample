package com.example.MongoDemo.controller;


import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    ResponseEntity<Student> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }


}
