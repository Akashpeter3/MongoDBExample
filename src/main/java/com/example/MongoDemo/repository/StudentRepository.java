package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
    List<Student> findByName(String name);
    List<Student> findByNameAndEmail(String name, String email);
    List<Student> findByNameOrEmail(String name, String email);
    List<Student> findByDepartmentDepartmentName(String depName);
    List<Student> findBySubjectsProgram(String program);
    List<Student> findByEmailIsLike(String email);
    List<Student> findByNameStartsWith(String name);
}
