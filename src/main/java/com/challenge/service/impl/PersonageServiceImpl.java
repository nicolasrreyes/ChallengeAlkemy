package com.challenge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.challenge.commons.GenericServiceImpl;
import com.challenge.model.Personage;
import com.challenge.repository.PersonageRepository;
import com.challenge.services.PersonageService;

@Service
public class PersonageServiceImpl extends GenericServiceImpl<Personage, Long> implements PersonageService{
	
	@Autowired
	private PersonageRepository personageRepository;
	
	@Override
	public CrudRepository<Personage, Long> getDao() {
		
		return personageRepository;
	}

}
