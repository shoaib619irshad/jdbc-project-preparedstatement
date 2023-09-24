package com.jsp.customer_crud_with_prepared.dto;


/**
 * 
 * @author Shoaib
 *
 */

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerPhone;
	private String customerAddress;
	
	
	/*
	 * no argument constructor
	 */
	public Customer() {
		super();
	}
	
	/*
	 * Argument constructor 
	 */
	public Customer(int customerId, String customerName, String customerEmail, long customerPhone,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}
	
	
	/*
	 * Getters and Setters
	 */
	
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public long getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	/*
	 * Overridden toString() method
	 */

	@Override
	public String toString() {
		return "";
	}
	
	


	

}
