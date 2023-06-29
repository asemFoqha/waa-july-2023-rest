package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CourseRepo {
    private List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        initializeDummyCourses();
    }

    private void initializeDummyCourses() {
        courses.add(new Course(generateRandomId(), "Math", "MATH101"));
        courses.add(new Course(generateRandomId(), "Physics", "PHYS202"));
        courses.add(new Course(generateRandomId(), "English", "ENG101"));
        courses.add(new Course(generateRandomId(), "History", "HIST201"));
        courses.add(new Course(generateRandomId(), "Geography", "GEOG301"));
        courses.add(new Course(generateRandomId(), "Computer Science", "CS101"));
    }

    public List<Course> findAllCourses() {
        return courses;
    }

    public void createCourse(Course courseToAdd) {
        courses.add(courseToAdd);
    }

    public boolean deleteCourse(Course course) {
        return courses.remove(course);
    }

    private static long generateRandomId() {
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
    }
}
