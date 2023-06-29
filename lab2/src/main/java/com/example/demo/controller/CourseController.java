package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.impl.CollegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CollegeServiceImpl collegeService;

    @PostMapping("/courses")
    public void create(@RequestBody Course Course) {
        collegeService.createCourse(Course);
    }

    @GetMapping("/courses")
    public List<Course> findAll() {
        return collegeService.findAllCourses();
    }
}
