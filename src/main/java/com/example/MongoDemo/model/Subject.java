package com.example.MongoDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "subjects")
public class Subject {


    @Id
    private String id;
    @Field(name = "program")
    private String program;
    @Field(name = "Mark")
    private  int mark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subject(String program, int mark) {
        this.program = program;
        this.mark = mark;
    }

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
