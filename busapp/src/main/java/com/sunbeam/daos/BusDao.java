package com.sunbeam.daos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.dtos.BusDTO;
import com.sunbeam.dtos.Search;
import com.sunbeam.entities.Bus;

public interface BusDao extends JpaRepository<Bus, Integer>{

	

	List<Bus> findBySourceAndDestinationAndDate(String source, String destination, Date date);

	

}
