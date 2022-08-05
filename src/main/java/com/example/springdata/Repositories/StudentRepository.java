package com.example.springdata.Repositories;

import com.example.springdata.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
