package com.jsp.customer_crud_with_prepared.service;

import com.jsp.customer_crud_with_prepared.dao.CustomerDao;
import com.jsp.customer_crud_with_prepared.dto.Customer;

public class CustomerService {
	
	CustomerDao customerDao=new CustomerDao();
	
	/*
	 * insertMethod started
	 */
	
	public Customer insertCustomerService(Customer customer) {
		
		if((customer.getCustomerId() <=9999 && customer.getCustomerId() >=1000) ){
			if(customer.getCustomerName().length() <=16) {
				if(customer.getCustomerPhone() <=9999999999l && customer.getCustomerPhone() >=1000000000l) {
					if(customer.getCustomerAddress().length() <=20) {
					    Customer customer2=customerDao.insertCustomer(customer);
					    return customer2;
					}
					else {
						System.out.println("Adsress should be less than 20 characters");
					}
				}
				else {
					System.out.println("Phone number should be of 10 Digits");
				}
			}
			else {
				System.out.println("Name should be less than or equal to 16 characters");
			}
		}
		else {
			System.out.println("Id should be of 4 digits");
		}
		return null;
	}
	/*
	 * insertMethod ended
	 */
	
	/*
	 * updateMethod started
	 */
	
	public int updateCustomerService(int customerId,String customerName) {
		return customerDao.updateCustomer(customerId, customerName);
		
		
	}
	
	public int updateCustomerService(String customerEmail,int customerId) {
		return customerDao.updateCustomer(customerEmail, customerId);
		
	}
	public int updateCutomerService(int customerId, long customerPhone) {
		return customerDao.updateCustomer(customerId,customerPhone);
		
	}
	public int updateCutomerServiceAddress(int customerId, String customerAddress) {
		return customerDao.updateCustomerAddress(customerId,customerAddress);
		
	}
	
	/*
	 * updateMethod ended
	 */
	
	
	/*
	 * deleteMethod started
	 */
	
	public int deleteCustomer(int customerId) {
		return customerDao.deleteCustomer(customerId);
	}
	
	/*
	 * deleteMethod ended
	 */
	
	/*
	 * displayMethod started
	 */
	
	public void displayCustomerDetails() {
		customerDao.displayCustomerDetails();
	}
	
	/*
	 * displayMethod ended
	 */
	
	/*
	 * getCustomerMethod started
	 */
	public Customer getCustomerById(int customerId) {
		return customerDao.getCustomerById(customerId);
	}
	
	/*
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
