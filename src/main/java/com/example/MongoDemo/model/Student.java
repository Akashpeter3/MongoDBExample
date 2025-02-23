package com.example.MongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.ArrayList;
import java.util.List;

@Document(collection = "student")
public class Student {

    @Id
    private String id;
    @Field(name = "name")
    private  String name;
    @Field(name = "email")
    private  String email;
    @Field(name = "departments")
    private Department department;
    @Field(name = "subjects")
    private List<Subject>subjects;
    @Field(name = "age")
    private int age;

//    @PersistenceCreator
//    public Sony(String id, String name, String email, Department department, List<Subject> subjects) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.department = department;
//        this.subjects = subjects;
//    }
//
//    public Sony(String name, String email, Department department, List<Subject> subjects) {
//        this.name = name;
//        this.email = email;
//        this.department = department;
//        this.subjects = subjects;
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
