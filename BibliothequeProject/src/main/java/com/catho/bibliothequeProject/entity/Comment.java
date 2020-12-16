package com.catho.bibliothequeProject.entity;

import javax.persistence.*;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
public class Comment {

	@Column(nullable = false)
	@Id
	private Long id;

	@Column(nullable = false)
	private String message;

	@Column(nullable = true)
	private String titre;
	

	 

}
