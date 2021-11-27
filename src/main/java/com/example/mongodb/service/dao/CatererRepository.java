package com.example.mongodb.service.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodb.model.Caterer;
import com.example.mongodb.model.Location;

/**
 * @author Santhosh
 *
 */
@Repository
public interface CatererRepository extends MongoRepository<Caterer, Integer> {

	Page<Caterer> findByLocationCityContainingIgnoreCase(String city, Pageable pageable);

	public Caterer findByCaterId(String caterId);
}
