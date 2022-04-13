package com.sunbeam.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sunbeam.dtos.BusDTO;
import com.sunbeam.dtos.BusFormDTO;
import com.sunbeam.dtos.BusResponse;
import com.sunbeam.dtos.DtoEntityConverter;
import com.sunbeam.dtos.Response;
import com.sunbeam.dtos.Search;
import com.sunbeam.entities.Bus;
import com.sunbeam.services.BusServiceImpl;
import com.sunbeam.services.StorageService;

@CrossOrigin
@RestController
public class BusControllerImpl {

	@Autowired
	private BusServiceImpl busservice;
	
	@PostMapping("/bus/search")
	public ResponseEntity<?> findBus(@RequestBody Search search) {
		List<Bus> bus=new ArrayList<>();
		System.out.println(search.toString());
		bus = busservice.findBusBySourceAndDestinationAndDate(search);
		if (bus == null)
			return Response.error("bus  not found");
		return Response.success(bus);

	}
	
	
	
	
}
