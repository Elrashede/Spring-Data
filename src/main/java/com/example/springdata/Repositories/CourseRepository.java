package com.example.springdata.Repositories;

import com.example.springdata.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
}
