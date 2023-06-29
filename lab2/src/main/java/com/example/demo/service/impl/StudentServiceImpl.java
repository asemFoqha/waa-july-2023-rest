package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudentsByMajor(String major) {
        List<Student> studentList = studentRepo.findAllStudent();
        return studentList.stream().filter(student -> student.getMajor().equals(major)).toList();
    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAllStudent();
    }

    @Override
    public void addStudent(Student student) {
        studentRepo.createStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepo.deleteStudent(student);
    }
}
