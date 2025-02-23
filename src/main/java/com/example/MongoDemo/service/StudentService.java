package com.example.MongoDemo.service;

import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.model.Subject;
import com.example.MongoDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Student> getStudentByName(String name) {
      return studentRepository.findByName(name);
    }

    public List<Student> fndStudentByNameAndEmail(String name, String email) {
        return  studentRepository.findByNameAndEmail(name,email);
    }

    public List<Student> fndStudentByNameOrEmail(String name, String email) {
        return  studentRepository.findByNameOrEmail(name,email);
    }

    public List<Student> getAllStudentsWithPagination(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo-1,pageSize);//(page-1)*pageSize
        return  studentRepository.findAll(pageable).getContent();
    }

    public List<Student> allWithSorting() {
        Sort sort = Sort.by(Sort.Direction.ASC,"name","email");
        return  studentRepository.findAll(sort);
    }

    public List<Student> byDepartmentName(String depName) {
        return  studentRepository.findByDepartmentDepartmentName(depName);
    }

    public List<Student> byProgram(String program) {
        return studentRepository.findBySubjectsProgram(program);
    }

    public List<Student> emailLike(String email) {
        return  studentRepository.findByEmailIsLike(email);
    }

    public List<Student> nameStartsWith(String name) {
        return  studentRepository.findByNameStartsWith(name);
    }
}
