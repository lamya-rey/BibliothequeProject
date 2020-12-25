package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
	
	<S extends User> S save(S user);
	
	public User findByName (String Name);
	
	public User findByUserName (String userName);
	
	public void  deleteById(Long id);
	
	public void  deleteAll();
	
	
	
	
	
	
	

	
	
}