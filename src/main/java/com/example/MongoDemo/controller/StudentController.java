package com.example.MongoDemo.controller;


import com.example.MongoDemo.model.Student;
import com.example.MongoDemo.repository.DepartmentRepository;
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
        System.out.println("inside getAllStudents");
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

    @GetMapping("/getName/{name}")
    public List<Student>getStudentByName(@PathVariable("name") String name){
        return  studentService.getStudentByName(name);
    }

    @GetMapping("/studentByNameAndEmail")
    public List<Student>fndStudentByNameAndEmail(@RequestParam String name , @RequestParam String email){
        return  studentService.fndStudentByNameAndEmail(name,email);
    }

    @GetMapping("/studentByNameOrEmail")
    public List<Student>fndStudentByNameOrEmail(@RequestParam String name , @RequestParam String email){
        return  studentService.fndStudentByNameOrEmail(name,email);
    }


    @GetMapping("/getAllStudentWithpagination")
    public List<Student>getAllStudentsWithPagination(@RequestParam int pageNo,@RequestParam int pageSize){
        return  studentService.getAllStudentsWithPagination(pageNo,pageSize);

    }

    @GetMapping("/allWithSorting")
    public List<Student>allWithSorting(){
        return  studentService.allWithSorting();
    }

    @GetMapping("/byDepartmentName")
  public  List<Student>byDepartmentName(@RequestParam String depName){
        return studentService.byDepartmentName(depName);
    }

    @GetMapping("/byProgram")
    public  List<Student>byProgram(@RequestParam String program){
        return studentService.byProgram(program);
    }

    @GetMapping("/emailLike")
    public  List<Student>emailLike(@RequestParam String email){
        return studentService.emailLike(email);
    }

    @GetMapping("/nameStartsWith")
    public  List<Student>nameStartsWith(@RequestParam String name){
        return studentService.nameStartsWith(name);
    }

    @GetMapping("/byDepartmentId")
    public  List<Student>byDepartmentId(@RequestParam String depId){
        return studentService.byDepartmentId(depId);
    }

}
