
package com.catho.bibliothequeProject.dao;


import com.catho.bibliothequeProject.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "comment")
public interface CommentRepository extends JpaRepository<Comment, Long> {
	
    <S extends Comment> S save(S comment);
	
	public Comment findByTitle (String title);
	
	
	public void  deleteById(Long id);
	
	public void  deleteAll();
}

