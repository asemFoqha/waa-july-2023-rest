package com.example.demo.service.impl;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepo;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void addCourse(Course course) {
        courseRepo.createCourse(course);
    }

    @Override
    public List<Course> getStudentCoursesByStudentId(int studentId) throws Exception {
        List<Student> studentList = studentRepo.findAllStudent();
        return Arrays.asList(studentList.stream().filter(student -> student.getId() == studentId).findFirst().get().getCoursesTaken());
    }

    @Override
    public void deleteCourse(Course course) {
        courseRepo.deleteCourse(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepo.findAllCourses();
    }
}
