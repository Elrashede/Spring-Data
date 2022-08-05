package com.example.springdata.model;

import com.example.springdata.model.Student;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "bag")
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bagID;
    private String bagName;
    //one-to-one relationship between student and bag
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public Bag(String bagName, Student student) {
        this.bagName = bagName;
        this.student = student;
    }

    public Bag() {

    }

    public long getBagID() {
        return bagID;
    }

    public void setBagID(long bagID) {
        this.bagID = bagID;
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
