package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> students = new ArrayList<>();


    public List<Student> findAllStudent() {
        return students;
    }

    public List<Student> createStudent() {
        return students;
    }

    public List<Student> getStudentById() {
        return students;
    }

    public List<Student> updateStudent() {
        return students;
    }

    public List<Student> deleteStudent() {
        return students;
    }
}
