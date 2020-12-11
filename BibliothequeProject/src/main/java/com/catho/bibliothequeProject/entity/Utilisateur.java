package com.catho.bibliothequeProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	@Id
	private Long id;
	private String prenom;
	private String nom;
	private String age;
	private String cin;
	private String email;
	private String tel;
	private String login;
	private String password;
	// nombre d'emprunt des livre 
	private int nbreEmpr;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getNbreEmpr() {
		return nbreEmpr;
	}
	public void setNbreEmpr(int nbreEmpr) {
		this.nbreEmpr = nbreEmpr;
	}
	public Utilisateur(Long id, String prenom, String nom, String age, String cin, String email, String tel,
			String login, String password, int nbreEmpr) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.cin = cin;
		this.email = email;
		this.tel = tel;
		this.login = login;
		this.password = password;
		this.nbreEmpr = nbreEmpr;
	}
	
	
	
	
	

}
