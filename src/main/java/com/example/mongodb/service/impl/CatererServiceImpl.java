package com.example.mongodb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.controller.CatererController;
import com.example.mongodb.model.Caterer;
import com.example.mongodb.request.CatererRequest;
import com.example.mongodb.service.CatererService;
import com.example.mongodb.service.dao.CatererRepository;
import com.example.mongodb.to.CatererDetailsTo;

@Service
public class CatererServiceImpl implements CatererService {

	private final static Logger logger = LoggerFactory.getLogger(CatererServiceImpl.class);

	@Autowired
	CatererRepository catererRepository;

	@Override
	public String createCaterer(CatererRequest request) {

		logger.info("Startr - createEmployee{} Serviced Request{}" + request);
		String statusMsg = "";
		Caterer emp = new Caterer();
		try {

			emp.setCaterId(request.getCaterId());
			emp.setName(request.getName());
			emp.setCapacity(request.getCapacity());
			emp.setLocation(request.getLocation());
			catererRepository.insert(emp);
		//	logger.info("Start - consumeJson{} Serviced Request{}");
			
		//	logger.info("end - consumeJson{} Serviced Request{}");
			statusMsg = "Data Inserted successfully";

		} catch (Exception e) {
			statusMsg = "Exceptin occured while Inserting the Data ";
			logger.error("Exceptin occured while Inserting the Data");
		}
		logger.info("Startr - createEmployee{} Serviced RESPONSE{}" + statusMsg);
		return statusMsg;
	}

	/*
	 * @Override public List<CatererDetailsTo> getCatererByLocation(String location)
	 * {
	 * 
	 * logger.info("Startr - getEmployee{} Serviced ");
	 * 
	 * List<CatererDetailsTo> listof = new ArrayList<CatererDetailsTo>();
	 * 
	 * try { List<Caterer> catererdetails = catererRepository.findAll();
	 * 
	 * for (Caterer employeeDetails : catererdetails) {
	 * 
	 * CatererDetailsTo to = new CatererDetailsTo();
	 * to.setCaterId(employeeDetails.getCaterId());
	 * to.setName(employeeDetails.getName());
	 * to.setCapacity(employeeDetails.getCapacity());
	 * to.setLocation(employeeDetails.getLocation());
	 * 
	 * listof.add(to);
	 * 
	 * } } catch (Exception e) {
	 * logger.error("Exceptin occured while getting the Data from DB"); }
	 * 
	 * logger.info("Startr - getEmployee{} Service RESPONSE{} " + listof); return
	 * listof; }
	 */
	@Override
	public List<CatererDetailsTo> getCatererByCaterId(int caterId) {
		logger.info("Start - getbyIdEmployee{} ServiceId ");

		List<CatererDetailsTo> listof = new ArrayList<CatererDetailsTo>();
		CatererDetailsTo to = new CatererDetailsTo();

		try {
			Optional<Caterer> databyid = catererRepository.findById(caterId);

			to.setCaterId(databyid.get().getCaterId());
			to.setName(databyid.get().getName());
			to.setLocation(databyid.get().getLocation());
			to.setLocation(databyid.get().getLocation());

			listof.add(to);

		} catch (Exception e) {

			logger.error("Exceptin occured while getting the Data by id  from DB");
		}

		logger.info("End - getbyIdEmployee{} Service RESPONSE " + listof);

		return listof;

	}

}
