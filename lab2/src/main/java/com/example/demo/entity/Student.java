package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private Course[] coursesTaken;
}
