
package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "comment"
        , path = "comments")
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}

