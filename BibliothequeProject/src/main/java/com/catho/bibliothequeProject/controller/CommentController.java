package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.CommentRepository;
import com.catho.bibliothequeProject.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }
    @GetMapping("/{bookId}")
    public Optional<Comment> getCommentsByBookId(@PathVariable("bookId") int bookId) {
        return commentRepository.findById(bookId);
    }
}



