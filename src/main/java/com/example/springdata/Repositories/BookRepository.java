package com.example.springdata.Repositories;

import com.example.springdata.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
