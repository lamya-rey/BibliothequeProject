package com.catho.bibliothequeProject.controller;

import com.catho.bibliothequeProject.dao.BookRepository;
import com.catho.bibliothequeProject.dao.UserRepository;
import com.catho.bibliothequeProject.entity.Book;
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
    public UserRepository userRepository;
    
    @Autowired
    public BookRepository bookRepository;

    @GetMapping("/")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/search/{name}")
    public User findByName(@PathVariable String name) {
    	return userRepository.findByName(name);
    }
    
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
    	return userRepository.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
    	userRepository.deleteById(id);
    }
    
    @DeleteMapping("/")
    public void  deleteAll(){
    	userRepository.deleteAll();
    }
    
    
    @PutMapping("/{name}/{title}")
    public int borrow(@PathVariable String name,@PathVariable String title) {
    	User foundedUser = userRepository.findByName(name);
    	Book foundedBook = bookRepository.findByTitle(title);
    	
    	if((foundedUser.getCategory().equals("enfant") && !foundedBook.getCategory().equals("enfant"))
                || (foundedUser.getCategory().equals("adulte") && foundedBook.getCategory().equals("ado"))
                || (foundedUser.getNbrEmpr()>=3)){
            return -1;
    	}
    	else {
    	    foundedUser.setNbrEmpr(foundedUser.getNbrEmpr()+1);
    	       userRepository.save(foundedUser);
    	       foundedBook.setUser(foundedUser);
    	       bookRepository.save(foundedBook);
    	      
    		return 1;
    		}
	
	}
    
    @PostMapping("/")
    public User save(@RequestBody User user) {
    	return userRepository.save(user);
    }
    
    @PutMapping("/")
    public User update(@RequestBody User user) {
    	return userRepository.save(user);
    }
}
