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
	private Long age;
	
	@Column(nullable = false)
	private String category;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String userName;

	//nombre des livres empruntés
	@Column(nullable = true)
	private int nbrEmpr;
	
	
	

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



	public Long getAge() {
		return age;
	}



	public void setAge(Long age) {
		this.age = age;
	}
	
	



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



	public int getNbrEmpr() {
		return nbrEmpr;
	}



	public void setNbrEmpr(int nbrEmpr) {
		this.nbrEmpr = nbrEmpr;
	}
	
	


	public User() {
		super();
	}

	public User(Long id, String name, Long age, String category, String email, String userName, int nbrEmpr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.category = category;
		this.email = email;
		this.userName = userName;
		this.nbrEmpr = nbrEmpr;
			}

	
	
	
	

	

	
	
	
	
}
