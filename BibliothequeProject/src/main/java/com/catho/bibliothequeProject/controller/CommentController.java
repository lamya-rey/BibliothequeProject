package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.CommentRepository;
import com.catho.bibliothequeProject.entity.Comment;
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
@RequestMapping(path = "/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Comment> getCommentsByCommentId(@PathVariable Long id) {
        return commentRepository.findById(id);
    }
    
    @GetMapping("/{title}")
    public Comment findByTitle(@PathVariable String title) {
    	return commentRepository.findByTitle(title);
    }
    
    @DeleteMapping("/")
    public void  deleteById(@PathVariable Long id){
    	commentRepository.deleteById(id);
    }
    
    @PostMapping("/")
    public Comment save(@RequestBody Comment comment) {
    	return commentRepository.save(comment);
    }
    
    @PutMapping("/")
    public Comment update(@RequestBody Comment comment) {
    	return commentRepository.saveAndFlush(comment);
    }
    
}



