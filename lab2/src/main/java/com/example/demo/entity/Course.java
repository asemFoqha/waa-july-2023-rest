package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {

    public Course(String name) {
        this.name = name;
    }

    private long id;
    private String name;
    private String code;

}
