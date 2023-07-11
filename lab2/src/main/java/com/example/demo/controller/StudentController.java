package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return null;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {

    }

    @DeleteMapping
    public void deleteStudent(int id) {

    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student) {

    }


}
















