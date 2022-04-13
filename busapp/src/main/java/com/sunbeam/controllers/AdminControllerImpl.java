package com.sunbeam.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dtos.AdminDTO;
import com.sunbeam.dtos.BusFormDTO;
import com.sunbeam.dtos.BusResponse;
import com.sunbeam.dtos.Credentials;
import com.sunbeam.dtos.CustomerDTO;
import com.sunbeam.dtos.DtoEntityConverter;

import com.sunbeam.dtos.Response;
import com.sunbeam.entities.Admin;
import com.sunbeam.entities.Bus;
import com.sunbeam.entities.Customer;
import com.sunbeam.entities.Ticket;
import com.sunbeam.services.AdminServiceImpl;

import com.sunbeam.services.StorageService;
;


@CrossOrigin
@RestController
	public class AdminControllerImpl {
		
	@Autowired
	private AdminServiceImpl adminservice;
	
	@Autowired
	private DtoEntityConverter dtoEntityConverter;
	
	
	@Autowired
	private StorageService storageService;
	
	@PostMapping("/admin/signin")
	public ResponseEntity<?> signIn(@RequestBody Credentials cred) {
		AdminDTO adminDto = adminservice.findAdminByEmailAndPassword(cred);
		if(adminDto == null)
			return Response.error("admin not found");
		return Response.success(adminDto);
	}
	
	
	
	@PostMapping("/admin/signup")
	public ResponseEntity<?> signUp(@RequestBody Admin admin) {
		Map<String, Object> result = adminservice.saveAdmin(admin);
		return Response.success(result);
	}
	
	
	
	@PostMapping("/addbus")
	public ResponseEntity<BusResponse> saveBus( BusFormDTO busDto) {
		Bus bus = dtoEntityConverter.busFormDtoToEntity(busDto);
		String thumbnail = storageService.store(busDto.getThumbnail());
	    bus.setThumbnail(thumbnail);
		adminservice.saveBus(bus);
		return BusResponse.success(bus);
	}
	
		
	
	@GetMapping("/allbus")
	public ResponseEntity<?> BusList() {
	 List<Bus> buslist=new ArrayList<>();
	 buslist=adminservice.findAllBus();
		return Response.success(buslist);
	}
	
	@DeleteMapping("/bus/delete/{id}")
	public ResponseEntity<?> deleteBus(@PathVariable("id") int id) {
		  Map<String, Object> result =adminservice.deleteBus(id);
		return Response.success(result);
	}
	
		@PutMapping("/update")
		public ResponseEntity<?>updateBus( BusFormDTO busDto){
			Bus bus = dtoEntityConverter.busFormDtoToEntity(busDto);
			String thumbnail = storageService.store(busDto.getThumbnail());
		    bus.setThumbnail(thumbnail);
			adminservice.UpdateBus(bus);
			return BusResponse.success(bus);
			
		}
	@GetMapping("/allcustomers")
	public ResponseEntity<?> getallcustomers(){
		
			List<Customer> result=adminservice.findallcustomer();
		return Response.success(result);
		}
		
	
	@GetMapping("/alltickets")
	public ResponseEntity<?>getalltickets(){
		
		List<Ticket> ticket=adminservice.findallticket();
		return Response.success(ticket);
	}
	
	
		
		
		}
		

		
		
		
	


