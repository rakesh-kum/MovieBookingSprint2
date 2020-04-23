package com.movie.service;

import java.util.Set;

import com.movie.entities.Booking;
import com.movie.entities.Customer;
import com.movie.entities.Ticket;

public interface Imovieservice {
public void changeUserName(Integer userid,String username);
	
	public void changeEmail(Integer userid,String email);
	
	public Set<Booking> getBookings(Integer userid);
	
	public Set<Ticket> getTickets(Integer userId);
	
	public String getContact(Integer userid);
	
	public Customer getCustomer(Integer userid);
	
	public Customer getCustomer(String email);
	
	public Customer addCustomer(Customer customer);
	
	public void removeCustomer(Customer customer);
	
	public void removeCustomer(Integer userId);
	

}
