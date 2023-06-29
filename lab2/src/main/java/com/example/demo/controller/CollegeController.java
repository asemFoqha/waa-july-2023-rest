package com.example.demo.controller;

import com.example.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.impl.CollegeServiceImpl;

import java.util.List;

@RestController
public class CollegeController {

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
//
//    @GetMapping("/Courses/{id}")
//    public Course getById(@PathVariable long id) {
//        return collegeService.get();
//    }

    @PutMapping("/courses/{id}")
    public void update(@PathVariable long id, @RequestBody Course Course) {

    }

    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable long id) {

    }


}
