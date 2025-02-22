package com.example.MongoDemo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {

    @Field(name = "department_name")
    private String departmentName;
    @Field(name = "HOD")
    private String hod;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }
}
