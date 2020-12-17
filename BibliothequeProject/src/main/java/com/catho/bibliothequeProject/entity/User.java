package com.catho.bibliothequeProject.entity;

import javax.persistence.*;

import lombok.*;

import java.util.*;

@Entity
@Data
public class User {

	@Column(nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String age;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String password;

	// nombre des livres empruntés
	@Column(nullable = false)
	private int nbrEmpr;

	public User() {
		super();
	}

	public User(Long id, String firstName, String lastName, String age, String email, String userName, String password,
			int nbrEmpr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.nbrEmpr = nbrEmpr;
	}
	
	
	
	
}
