package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    //student

    List<Student> getAllStudentsByMajor(String major);


    List<Student> getStudents();

    void addStudent(Student student);

    void deleteStudent(Student student);
}
