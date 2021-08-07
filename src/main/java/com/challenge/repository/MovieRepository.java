package com.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.challenge.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{

}
