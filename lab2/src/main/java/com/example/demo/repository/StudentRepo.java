package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class StudentRepo {

    Course course1 = new Course(generateRandomId(), "Math", "MATH101");
    Course course2 = new Course(generateRandomId(), "Physics", "PHYS202");
    Course course3 = new Course(generateRandomId(), "English", "ENG101");
    Course course4 = new Course(generateRandomId(), "History", "HIST201");
    Course course5 = new Course(generateRandomId(), "Geography", "GEOG301");
    Course course6 = new Course(generateRandomId(), "Computer Science", "CS101");

    List<Student> students = new ArrayList<>(List.of(new Student[]{
            new Student(generateRandomId(), "John", "Doe", "john@example.com", "Computer Science",  new Course[]{course1, course2}),
            new Student(generateRandomId(), "Jane", "Smith", "jane@example.com", "English Literature", new Course[]{course3, course4, course5}),
            new Student(generateRandomId(), "Mike", "Johnson", "mike@example.com", "Physics", new Course[]{course6})
    }));

    public List<Student> findAllStudent() {
        return students;
    }

    public void createStudent(Student student) {
        students.add(student);
    }

    public boolean deleteStudent(Student student) {
        return students.remove(student);
    }
private static long generateRandomId() {
        return Math.abs(UUID.randomUUID().getMostSignificantBits());
        }
}
