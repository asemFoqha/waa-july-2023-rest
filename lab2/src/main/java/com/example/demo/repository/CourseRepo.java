package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    List<Course> courses = new ArrayList<>(List.of(new Course[]{
            new Course("asem"),
            new Course("asem 2"),
    }));

    public List<Course> findAllCourses() {
        return courses;
    }

    public Course getCourseById(int id) {
        Course course = null;
        for (Course c : courses) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public boolean createCourse(Course courseToAdd) {
        courses.add(courseToAdd);
        return true;
    }

    public List<Course> updateCourse(int id, Course updatedCourse) {
        return courses;
    }

    public List<Course> deleteCourse() {
        return courses;
    }


    public Course getStudentsByMajor(String major){
        return new Course("test");
    }

}
