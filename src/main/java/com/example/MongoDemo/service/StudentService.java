package com.example.MongoDemo.service;

import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public ResponseEntity<Student> createStudent(Student student) {
     Student response = studentRepository.save(student);
     return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
