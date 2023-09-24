package com.jsp.customer_crud_with_prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.customer_crud_with_prepared.connection.CustomerConnection;
import com.jsp.customer_crud_with_prepared.dto.Customer;

public class CustomerDao {
	
	Connection connection=CustomerConnection.getCustomerConnection();

	/*
	 * insertMethod  started
	 */
	public Customer insertCustomer(Customer customer) {
		
		String insertQuery = "insert into customer values(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerEmail());
			preparedStatement.setLong(4, customer.getCustomerPhone());
			preparedStatement.setString(5, customer.getCustomerAddress());
			
			preparedStatement.execute();
			System.out.println("data stored");
			
			return customer;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/*insertMethod ended*/
	
	
	/*
	 * updateMethods started
	 */
	public int updateCustomer(int customerId, String customerName) {
		
		String updateCustomerNameQuery="update customer set name=? where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateCustomerNameQuery);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerName);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
    public int updateCustomer(String customerEmail ,int customerId ) {
		
		String updateCustomerEmailQuery="update customer set email=? where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateCustomerEmailQuery);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerEmail);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

   public int updateCustomer(int customerId, long customerPhone) {
	
	String updateCustomerPhoneQuery="update customer set phone=? where id=?";
	
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(updateCustomerPhoneQuery);
		
		preparedStatement.setInt(2, customerId);
		preparedStatement.setLong(1, customerPhone);
		
		return preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
}
   public int updateCustomerAddress(int customerId, String customerAddress) {
		
		String updateCustomerPhoneQuery="update customer set address=? where id=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(updateCustomerPhoneQuery);
			
			preparedStatement.setInt(2, customerId);
			preparedStatement.setString(1, customerAddress);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
   
   /*
    * updateMethods ended
    */

   /*
    *deleteMethod started
    */
   public int deleteCustomer(int customerId) {
   	String deleteCustomerQuery="delete from customer where id=?";
   	try {
   		PreparedStatement ps=connection.prepareStatement(deleteCustomerQuery);
   		ps.setInt(1,customerId);
   		return ps.executeUpdate();
   	} catch (SQLException e) {
   		e.printStackTrace();
   	}
   	return 0;
   }
   
   /*
    * deleteMethod ended
    */
   
   /*
    * displayMethod started
    */
   
   public void displayCustomerDetails() {
		String displayCustomerQuery="select * from customer";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(displayCustomerQuery);
			
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()) {
			
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			long phone=rs.getLong("phone");
			String address=rs.getString("address");
			
			System.out.println("Customer Id = " +id);
			System.out.println("Customer Name = " +name);
			System.out.println("Customer Email = "+email);
			System.out.println("Customer Phone = "+phone);
			System.out.println("Customer Address = " + address);
			System.out.println("===================");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
   
   /*
    * displayMethod ended
    */
   
   /*
    * getCustomerMethod started
    */
   
   public Customer getCustomerById(int customerId) {
	   String query="select * from customer where id=?";
	   
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, customerId);
		ResultSet rs=preparedStatement.executeQuery();
		
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			long phone=rs.getLong("phone");
			String address=rs.getString("address");
			Customer c=new Customer(id,name,email,phone,address);
			return c;
			
			
		}
		
		
		} catch (SQLException e) {
		e.printStackTrace();
	}
	   return null;
	   
			   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
