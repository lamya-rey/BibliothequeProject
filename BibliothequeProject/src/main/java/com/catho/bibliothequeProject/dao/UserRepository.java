package com.catho.bibliothequeProject.dao;

import com.catho.bibliothequeProject.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByName (String Name);
	
	<S extends User> S save(S user);
	
	void deleteAll();
	
	public void  deleteById(Long id);
	
	
	

	
	
}