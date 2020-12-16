package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book"
        , path = "books")
public interface BookRepository extends CrudRepository<Book, Integer> {
}
