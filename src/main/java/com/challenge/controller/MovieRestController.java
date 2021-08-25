package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.Movie;
import com.challenge.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieRestController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping(value = "/movies")
	public List<Movie> getAll(){
		return movieService.getAll();
	}
	@GetMapping(value = "/find/{id}")
	public Movie find(@PathVariable Long id) {
		return movieService.get(id);
	}
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<Movie> save(@RequestBody Movie movie){
		Movie obj = movieService.save(movie);
		return new ResponseEntity<Movie>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value ="/delete/{id}")
	public ResponseEntity<Movie> delete(@PathVariable Long id){
		Movie movie = movieService.get(id);
		if (movie != null) {
			movieService.delete(id);
		}else {
			return new ResponseEntity<Movie>(movie, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Movie>(movie, HttpStatus.OK);
	}
}
	
	

