package com.example.persistance.dao;

import java.util.List;
import java.util.Optional;

import com.example.persistance.entities.Officer;

public interface OfficerDao {
	
	Officer save(Officer officer);
	
	Optional<Officer> findById(Integer id);
	
	List<Officer> findAll();
	
	long count();
	
	void delete(Officer officer);
	
	boolean existsById(Integer id);
	

}
