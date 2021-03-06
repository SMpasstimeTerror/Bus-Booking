package com.sunbeam.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.sunbeam.daos.BusDao;
import com.sunbeam.daos.CustomerDao;
import com.sunbeam.daos.TicketDao;
import com.sunbeam.daos.adminDao;
import com.sunbeam.dtos.AdminDTO;
import com.sunbeam.dtos.Credentials;
import com.sunbeam.dtos.CustomerDTO;
import com.sunbeam.dtos.DtoEntityConverter;
import com.sunbeam.entities.Admin;
import com.sunbeam.entities.Bus;
import com.sunbeam.entities.Customer;
import com.sunbeam.entities.Ticket;


@Transactional
@Service
public class AdminServiceImpl {

	@Autowired
	private BusDao busDao;
	
	@Autowired
	private adminDao admindao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private DtoEntityConverter converter;
	
	@Autowired
	private CustomerDao customerdao;
	
	@Autowired
	private TicketDao ticketdao;
	
	public AdminDTO findAdminByEmail(String email) {
		Admin admin = admindao.findByEmail(email);
		return converter.toAdminDto(admin);
	}
	
	public AdminDTO findAdminByEmailAndPassword(Credentials cred) {
		Admin dbAdmin = admindao.findByEmail(cred.getEmail());
		String rawPassword = cred.getPassword();
		if(dbAdmin != null && passwordEncoder.matches(rawPassword, dbAdmin.getPassword())) {
			AdminDTO result = converter.toAdminDto(dbAdmin);
			result.setPassword("********");
			return result;
		}
		return null;
	}
	
	public Map<String, Object> saveAdmin(Admin admin) {
		String rawPassword = admin.getPassword();
		String encPassword = passwordEncoder.encode(rawPassword);
		admin.setPassword(encPassword);
		
		admin =admindao.save(admin);
		return Collections.singletonMap("insertedId", admin.getId());
	}
	
	
	
	
	
	
	
	
public Bus saveBus(Bus bus) {
	return busDao.save(bus);
	}


	public List<Bus> findAllBus() {
		
		return busDao.findAll();
	}
	
	public Map<String, Object> deleteBus(int id) {
		if(busDao.existsById(id)) {
			busDao.deleteById(id);
			return Collections.singletonMap("affectedRows", 1);
		}
		return Collections.singletonMap("affectedRows", 0);
	}
	
	
public void UpdateBus(Bus bus) {
		
		 busDao.save(bus);
	}




public List<Customer> findallcustomer() {

	return customerdao.findAll();
}
	

public List<Ticket> findallticket(){
	
	return ticketdao.findAll();
}

	}

	
	
	
	

	
