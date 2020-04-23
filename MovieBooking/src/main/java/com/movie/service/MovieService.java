package com.movie.service;

import java.util.Set;

import com.movie.dao.ICustomerDao;
import com.movie.entities.Booking;
import com.movie.entities.Customer;
import com.movie.entities.Ticket;
@Service
public class MovieService implements Imovieservice {
	@AutoWired
	ICustomerDao dao;

	@Override
	public void changeUserName(Integer userid, String username) {
		dao.changeUserName(userid, username);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeEmail(Integer userid, String email) {
		dao.changeEmail(userid, email);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Booking> getBookings(Integer userid) {
		// TODO Auto-generated method stub
		return dao.getBookings(userid);
	}

	@Override
	public Set<Ticket> getTickets(Integer userId) {
		// TODO Auto-generated method stub
		return dao.getTickets(userId);
	}

	@Override
	public String getContact(Integer userid) {
		// TODO Auto-generated method stub
		return dao.getContact(userid);
	}

	@Override
	public Customer getCustomer(Integer userid) {
		// TODO Auto-generated method stub
		return dao.getCustomer(userid);
	}

	@Override
	public Customer getCustomer(String email) {
		// TODO Auto-generated method stub
		return dao.getCustomer(email);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.removeCustomer(customer);
		
	}

	@Override
	public void removeCustomer(Integer userId) {
		// TODO Auto-generated method stub
		dao.removeCustomer(userId);
		
	}

}
