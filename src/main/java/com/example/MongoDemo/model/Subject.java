package com.example.MongoDemo.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {


    @Field(name = "program")
    private String program;
    @Field(name = "Mark")
    private  int mark;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
