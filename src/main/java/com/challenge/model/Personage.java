package com.challenge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "personage")
public class Personage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String image;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private int weight;
	@Column
	private String history;
	@ManyToMany
	private List<Movie> movies = new ArrayList<>();
	
	
	public Personage(String name, String image, int age, int weight, String history) {
		
	}
}
