package com.catho.bibliothequeProject.entity;

import javax.persistence.*;

import lombok.*;


@Entity
@NoArgsConstructor
@Data

public class Comment {

	@Column(nullable = false)
	@Id
	private Long id;

	@Column(nullable = false)
	private String content;

	@Column(nullable = true)
	private String title;
	
	@ManyToOne
	@JoinColumn(name="customerId", nullable = false)
	private Book book;
	
	@ManyToOne
	@JoinColumn(name="userId", nullable = false)
	private User user;

	public Comment() {
		super();
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
