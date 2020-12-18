package com.catho.bibliothequeProject.entity;

import javax.persistence.*;



@Entity
public class Comment {

	@Column(nullable = false)
	@Id
	private Long id;

	@Column(nullable = false)
	private String content;

	@Column(nullable = true)
	private String title;
	
	@ManyToOne
	@JoinColumn(name="bookId", nullable = false)
	private Book book;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable = false)
	private User user;

	public Comment() {

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Comment(Long id, String content, String title, Book book, User user) {
		super();
		this.id = id;
		this.content = content;
		this.title = title;
		this.book = book;
		this.user = user;
	}

	
	
	
	

	 

}
