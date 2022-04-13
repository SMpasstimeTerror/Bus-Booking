package com.sunbeam.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.BusDao;
import com.sunbeam.dtos.BusDTO;
import com.sunbeam.dtos.BusFormDTO;
import com.sunbeam.dtos.Search;
import com.sunbeam.entities.Bus;
@Transactional
@Service
public class BusServiceImpl {
	@Autowired
	private  BusDao busdao;


	public List<Bus> findBusBySourceAndDestinationAndDate(Search search) {
		List<Bus> b=busdao.findBySourceAndDestinationAndDate(search.getSource(),search.getDestination(),search.getDate());
		return b;
		
	}
	

	
}
