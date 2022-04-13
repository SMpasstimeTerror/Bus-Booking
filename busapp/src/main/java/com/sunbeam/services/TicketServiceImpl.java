package com.sunbeam.services;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.daos.TicketDao;
import com.sunbeam.entities.Customer;
import com.sunbeam.entities.Ticket;
@Service
public class TicketServiceImpl {
	@Autowired
	private TicketDao ticketdao;
	
	public Ticket saveTicket(Ticket ticket) {
		
		return ticketdao.save(ticket);
	}

	public Map<String, Object> deleteTicket(int tid) {
		if(ticketdao.existsById(tid)) {
			ticketdao.deleteById(tid);
			return Collections.singletonMap("affectedRows", 1);
		}
		return Collections.singletonMap("affectedRows", 0);
	}
	
	
}
