package com.example.MongoDemo.controller;


import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    ResponseEntity<Student> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    ResponseEntity<Student> createStudent(@PathVariable("id") String id){
        return studentService.getStudent(id);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudentById/{id}")
    public Student updateStudentById(@PathVariable("id") String id){
        return studentService.updateStudentById(id);
    }

    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteById(@PathVariable("id") String id)
    {
        return studentService.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll()
    {
        return studentService.deleteAll();
    }

}
