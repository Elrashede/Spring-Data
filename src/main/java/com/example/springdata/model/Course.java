package com.example.springdata.model;

import com.example.springdata.model.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "course")
@Data
public class Course {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"


    )
    @Column(
            name = "id",
            updatable = false
    )


    private long courseId;

    @Column(
            name = "course_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String courseName;

    @Column(
            name = "course_language",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String courseLanguage;
    @ManyToMany(mappedBy = "courses")

    private List<Student>students=new ArrayList<>();

    public Course( String courseName, String courseLanguage,List<Student>students) {

        this.courseName = courseName;
        this.courseLanguage = courseLanguage;
        this.students=students;

    }

    public Course() {

    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseLanguage='" + courseLanguage + '\'' +
                '}';
    }
}
