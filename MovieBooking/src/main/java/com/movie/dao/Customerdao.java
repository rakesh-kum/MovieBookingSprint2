package com.movie.dao;

import java.util.Set;

import javax.persistence.EntityManager;

import com.movie.entities.Booking;
import com.movie.entities.Customer;
import com.movie.entities.Ticket;
@Repository
@Transactional
public class Customerdao implements ICustomerDao {
	@PersistenceContext
	protected EntityManager em;
	

	@Override
	public void changeUserName(Integer userid, String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeEmail(Integer userid, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Booking> getBookings(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Ticket> getTickets(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getContact(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		em.persist(customer);
		return null;
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(Integer userId) {
		// TODO Auto-generated method stub
		
	}

}
