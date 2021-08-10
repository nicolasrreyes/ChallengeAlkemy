package com.challenge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.challenge.commons.GenericServiceImpl;
import com.challenge.model.Movie;
import com.challenge.repository.MovieRepository;
import com.challenge.services.MovieService;
@Service
public class MovieServiceImpl extends GenericServiceImpl<Movie, Long> implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public CrudRepository<Movie, Long> getDao() {
		
		return movieRepository;
	}

}
