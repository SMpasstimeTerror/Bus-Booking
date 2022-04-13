package com.sunbeam.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Admin;
import com.sunbeam.entities.Customer;


public interface adminDao extends JpaRepository<Admin, Integer>{
	Admin findById(int id);
	Admin findByEmail(String email);
//	List<Customer> findAll(Customer customer);
	

}
