
package com.catho.bibliothequeProject.dao;


import com.catho.bibliothequeProject.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "comments")
public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	public Comment findByTitle (String title);
}

