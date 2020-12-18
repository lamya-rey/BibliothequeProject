package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.BookRepository;
import com.catho.bibliothequeProject.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/book")
public class BookController {
    @Autowired
    public BookRepository bookRepository;
    
    @GetMapping("/")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    @GetMapping("/{title}")
    public Book findByTitle(@PathVariable String title) {
    	return bookRepository.findByTitle(title);
    }
    
    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
    	bookRepository.deleteById(id);
    }
    
    @DeleteMapping("/")
    public void  deleteAll(){
    	bookRepository.deleteAll();
    }
    
    @PostMapping("/")
    public Book save(@RequestBody Book book) {
    	return bookRepository.save(book);
    }
    
    @PutMapping("/")
    public Book update(@RequestBody Book book) {
    	return bookRepository.save(book);
    }
    
}

