package com.example.mongodb.service;

import java.util.List;

import com.example.mongodb.request.CatererRequest;
import com.example.mongodb.to.CatererDetailsTo;

public interface CatererService {
	
	public String  createCaterer(CatererRequest request);
	public List<CatererDetailsTo> getCatererByCaterId(int caterId);
//	public List<CatererDetailsTo> getCatererByLocation(String city);

}
