package com.catho.bibliothequeProject.entity;


import javax.persistence.*;

@Entity
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
	@JoinColumn(name="userId", nullable = true)
	private User user;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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
