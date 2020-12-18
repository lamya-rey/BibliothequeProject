package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.UserRepository;
import com.catho.bibliothequeProject.entity.User;
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
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId);
    }
    
    @GetMapping("/{name}")
    public User findByName(@PathVariable String name) {
    	return userRepository.findByName(name);
    }
    
    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
    	userRepository.deleteById(id);
    }
    
    @DeleteMapping("/")
    public void  deleteAll(){
    	userRepository.deleteAll();
    }
    
    @PutMapping("/{userName}/{title}")
    public void borrow(@PathVariable String userName,@PathVariable String title) {
	
	}
    
    @PostMapping("/")
    public User save(@RequestBody User user) {
    	return userRepository.save(user);
    }
    
    @PutMapping("/")
    public User update(@RequestBody User user) {
    	return userRepository.saveAndFlush(user);
    }
}
