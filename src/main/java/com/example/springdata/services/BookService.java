package com.example.springdata.services;

import com.example.springdata.Repositories.BookRepository;
import com.example.springdata.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
   @Autowired
    BookRepository bookRepository;

    //getting all books record by using the method findaAll() of CrudRepository
    public List<Book> getAllBooks(){
        List<Book>books=new ArrayList<Book>();
        bookRepository.findAll().forEach(book1->books.add(book1));
        return books;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Book getBooksById(long id)
    {
        return bookRepository.findById(id).get();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Book books)
    {
        bookRepository.save(books);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(long id)
    {
        bookRepository.deleteById(id);
    }
    //updating a record by using the method save() of CrudRepository
    public void update(Book books, long bookId)
    {
        bookRepository.save(books);
    }



}
