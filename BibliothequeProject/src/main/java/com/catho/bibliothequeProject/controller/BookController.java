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

import java.util.Optional;

@RestController
@RequestMapping(path = "/books")
public class BookController {
    @Autowired
    public BookRepository bookRepository;
    
    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id);
    }
    
    @GetMapping("/{title}")
    public Book findByTitle(@PathVariable String title) {
    	return bookRepository.findByTitle(title);
    }
    
    @DeleteMapping("/")
    public void  deleteById(@PathVariable Long id){
    	bookRepository.deleteById(id);
    }
    
    @PutMapping("/{userName}/{title}")
    public int emprunt (@PathVariable String userName,@PathVariable String title) {
		return 0;
	}
    
    @PostMapping("/")
    public Book save(@RequestBody Book book) {
    	return bookRepository.save(book);
    }
    
    @PutMapping("/")
    public Book update(@RequestBody Book book) {
    	return bookRepository.saveAndFlush(book);
    }
    
}

