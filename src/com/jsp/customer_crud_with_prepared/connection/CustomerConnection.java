package com.jsp.customer_crud_with_prepared.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection {
	
	public static Connection getCustomerConnection() {
		try {
			//step-1 load/register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user = "root";
			String pass = "sho@ib09";
			
			Connection connection=DriverManager.getConnection(url, user, pass);
			
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
