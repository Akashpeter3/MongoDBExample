package com.example.MongoDemo.service;

import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.model.Subject;
import com.example.MongoDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<Student> createStudent(Student student) {
     Student response = studentRepository.save(student);
     return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<Student> getStudent(String id) {
      Student student =  studentRepository.findById(id).get();
      return ResponseEntity.ok(student);
    }

    public List<Student> getAllStudents() {
       return  studentRepository.findAll();

    }

    public Student updateStudentById(String id) {
       Student student = studentRepository.findById(id).get();
       student.setName("Appu");
       student.setEmail("appu@gmail.com");
       List<Subject>subjectList = new ArrayList<>();


// Adding subjects
        subjectList.add(new Subject("Math", 40));
        subjectList.add(new Subject("Science", 60));


       //subjectList.get(0).setProgram("Golang");
       student.setSubjects(subjectList);
     return studentRepository.save(student);
    }

    public String deleteById(String id) {

      studentRepository.deleteById(id);
      return "student with id "+id +" deleted ";
    }

    public String deleteAll() {
        studentRepository.deleteAll();
        return "All students deleted";
    }
}
