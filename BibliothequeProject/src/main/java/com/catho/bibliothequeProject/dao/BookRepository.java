package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {
	
	public Book findByTitle (String title);
	
	
	
	
	
    
	
}
