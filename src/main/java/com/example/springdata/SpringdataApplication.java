package com.example.springdata;

import com.example.springdata.Repositories.BookRepository;
import com.example.springdata.Repositories.StudentRepository;
import com.example.springdata.model.Book;
import com.example.springdata.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
        System.out.println("hello from jpa");


        }
    @Bean
   CommandLineRunner commandLineRunner(BookRepository bookRepository, StudentRepository studentRepository){
        return args ->{
            Book arabic=new Book("Arabic");
            Student ahmed=new Student(
                    "ahmed",
                    "Elrashidy",
                    "ahmed@gmail.com",
                    24
            );
            bookRepository.save(arabic);
            studentRepository.save((ahmed));


        };


    }


}
