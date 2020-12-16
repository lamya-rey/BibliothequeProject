package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.BookRepository;
import com.catho.bibliothequeProject.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") int bookId) {
        return bookRepository.findById(bookId);
    }
}

