package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

import java.util.List;

public interface CourseService {

    //course

    void addCourse(Course course);

    List<Course> getStudentCoursesByStudentId(int studentId) throws Exception;

    void deleteCourse(Course course);

    List<Course> getCourses();


}
