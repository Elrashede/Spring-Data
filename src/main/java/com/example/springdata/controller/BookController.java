package com.example.springdata.controller;

import com.example.springdata.model.Book;
import com.example.springdata.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

BookService bookService;

@GetMapping("/book")
private  List<Book>getAllBooks(){
    return bookService.getAllBooks();
  }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/book/{bookid}")
    private Book getBooks(@PathVariable("bookid")int bookid){
      return bookService.getBooksById(bookid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid)
    {
        bookService.delete(bookid);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private long saveBook(@RequestBody Book books)
    {
        bookService.saveOrUpdate(books);
        return books.getBookID();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/books")
    private Book update(@RequestBody Book books)
    {
        bookService.saveOrUpdate(books);
        return books;
    }
}
