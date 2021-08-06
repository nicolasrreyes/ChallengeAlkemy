package com.challenge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity(name = "genre")
public class Genre implements Serializable{

	private static final long serialVersionUID = 1L;
	 @Id
	private Long id;
	private String name;
	private String image;
	@OneToMany
	private List<Movie> movies = new ArrayList<>();

}
