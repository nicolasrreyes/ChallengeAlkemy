package com.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.challenge.model.Personage;

public interface PersonageRepository extends CrudRepository<Personage, Long> {

}
