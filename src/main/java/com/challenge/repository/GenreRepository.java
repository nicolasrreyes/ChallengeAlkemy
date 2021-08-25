package com.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.challenge.model.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {

}
