package com.catho.bibliothequeProject.entity;

import lombok.*;

import java.util.List;

import javax.persistence.*;

@Entity
@Data
public class Book {
	
	@Column(nullable = false)
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	//International Standard Book Number
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false)
	private String category;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable = false)
	private User user;

	public Book() {
		super();
	}

	public Book(Long id, String title, String isbn, String category, User user) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
		this.category = category;
		this.user = user;
	}
	
	



}
