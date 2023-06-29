package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseServiceImpl courseService;


    @GetMapping
    public List<Course> getStudents() {
        return courseService.getCourses();
    }

    @PostMapping
    public void addStudent(@RequestBody Course coursse) {

    }

    @DeleteMapping
    public void deleteStudent(@RequestBody int id) {

    }

    @PutMapping("{courseId}")
    public void updateStudent(@PathVariable int courseId, @RequestBody Course course) {

    }

}
