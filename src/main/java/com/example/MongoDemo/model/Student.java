package com.example.MongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Document(collection = "student")
public class Student {

    @Id
    private String id;
    @Field(name = "name")
    private  String name;
    @Field(name = "email")
    private  String email;
    @DBRef
    @Field(name = "departments")
    private Department department;
    @DBRef
    @Field(name = "subjects")
    private List<Subject>subjects;
    @Field(name = "age")
    private int age;

    @Transient
    private  double percentage;

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

    public double getPercentage() {
        if (subjects!=null&&subjects.size()>0){
            AtomicInteger total = new AtomicInteger();
            subjects.forEach(subject -> {

                total.addAndGet(subject.getMark());
            });
            return  (double) Integer.parseInt(String.valueOf(total)) /subjects.size();
        }else {
            return 0.00;
        }
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
