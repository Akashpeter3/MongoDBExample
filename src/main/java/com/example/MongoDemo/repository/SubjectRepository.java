package com.example.MongoDemo.repository;

import com.example.MongoDemo.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepository extends MongoRepository<Subject,String> {
}
