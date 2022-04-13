package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	Customer findById(int id);
	Customer findByEmail(String email);
	

}
