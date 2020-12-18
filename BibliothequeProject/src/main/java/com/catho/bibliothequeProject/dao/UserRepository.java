package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByName (String Name);
	
	
	
	
	

	
	
}