package com.catho.bibliothequeProject.entity;

import javax.persistence.*;


@Entity
public class User {

	@Column(nullable = false)
	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String about;

	@Column(nullable = false)
	private String date_creation;
	
	@Column(nullable = false)
	private String category;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
    private String password;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getAbout() {
		return about;
	}
	public void setAbout(String about) { this.about = about; }


	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_creation() { return date_creation; }
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}



	public User() {
		super();
	}

	public User(Long id, String name, String about, String category, String email, String userName, String date_creation, String password) {
		super();
		this.id = id;
		this.name = name;
		this.about= about;
		this.category = category;
		this.email = email;
		this.userName = userName;
		this.date_creation = date_creation;
		this.password = password;
			}
	
	
	
	

	

	
	
	
	
}
