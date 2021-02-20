package com.example.springBootLab.controller;
import com.example.springBootLab.Entity.Book;
import com.example.springBootLab.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
}