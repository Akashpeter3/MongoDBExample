package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
}
