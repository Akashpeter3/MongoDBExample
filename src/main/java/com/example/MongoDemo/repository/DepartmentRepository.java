package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
}
