package com.example.mongodb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mongodb.model.Caterer;
import com.example.mongodb.request.CatererRequest;
import com.example.mongodb.response.CatererResponse;
import com.example.mongodb.service.dao.CatererRepository;
import com.example.mongodb.service.impl.CatererServiceImpl;
import com.example.mongodb.to.CatererDetailsTo;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin
@RestController
@RequestMapping
public class CatererController {

	private final static Logger logger = LoggerFactory.getLogger(CatererController.class);

	@Autowired
	CatererServiceImpl service;

	@Autowired
	CatererRepository catererRepository;
	
	@RequestMapping(value = "/createCaterer", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public CatererResponse createCaterer(@RequestBody CatererRequest request) {
		logger.info("START - createCaterer{}" + request);
		
		// TODO we need to check the null for each field
		CatererResponse response = new CatererResponse();

		String responseMsg = "";

		if (request != null) {

			try {

				responseMsg = service.createCaterer(request);
				response.setMsg(responseMsg);
				response.setSuccess(true);

			} catch (Exception e) {
				response.setMsg(responseMsg);
				response.setSuccess(false);
			}

		} else {
			logger.error("Request Can not be null ");
		}

		logger.info("START-createEmployeeData() CONTROLLER -RESPONSE{} " + response);
		return response;
	}
	@CrossOrigin
	@GetMapping("/getCatererByLocation")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> getCatererByLocation(@RequestParam(required = false) String location,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {

		try {
			List<Caterer> tutorials = new ArrayList<Caterer>();
			Pageable paging = PageRequest.of(page, size);

			Page<Caterer> pagecaters;
			if (location == null)
				pagecaters = catererRepository.findAll(paging);
			else
				pagecaters = catererRepository.findByLocationCityContainingIgnoreCase(location, paging);

			tutorials = pagecaters.getContent();

			Map<String, Object> response = new HashMap<>();
			response.put("tutorials", tutorials);
			response.put("currentPage", pagecaters.getNumber());
			response.put("totalItems", pagecaters.getTotalElements());
			response.put("totalPages", pagecaters.getTotalPages());

			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@CrossOrigin
	@GetMapping("/getCatererByid/{caterId}")
	@ResponseBody
	public CatererResponse getbyIdEmployeeData(@PathVariable int caterId) {

		CatererResponse response = new CatererResponse();

		if (caterId != 0) {

			logger.info("START-getbyIdEmployeeData() request{} " + caterId);

			try {

				List<CatererDetailsTo> databyid = service.getCatererByCaterId(caterId);

				response.setMsg("Data by given id");
				response.setSuccess(true);
				response.setDetailsTo(databyid);

			} catch (Exception e) {
				response.setMsg("Exception occured during Data by given id");
				response.setSuccess(false);

			}

		} else {

			response.setMsg("ID should not be null ");
			response.setSuccess(false);

		}

		logger.info("END-getEmployeeData() CONTROLLER RESPONSE{}" + response);
		return response;

	}
}
