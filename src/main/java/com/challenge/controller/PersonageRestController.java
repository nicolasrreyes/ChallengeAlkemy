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

import com.challenge.model.Personage;
import com.challenge.services.PersonageService;

@RestController
@RequestMapping(value = "/")
public class PersonageRestController {
	
	@Autowired
	private PersonageService personageService;
	
	@GetMapping(value = "/characters")
	public List<Personage> getAll(){
		return personageService.getAll();
	}
	@GetMapping(value = "/find/{id}")
	public Personage find(@PathVariable Long id) {
		return personageService.get(id);
	}
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<Personage> save(@RequestBody Personage personage){
		Personage obj = personageService.save(personage);
		return new ResponseEntity<Personage>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value ="/delete/{id}")
	public ResponseEntity<Personage> delete(@PathVariable Long id){
		Personage personage = personageService.get(id);
		if (personage != null) {
			personageService.delete(id);
		}else {
			return new ResponseEntity<Personage>(personage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Personage>(personage, HttpStatus.OK);
	}
}
