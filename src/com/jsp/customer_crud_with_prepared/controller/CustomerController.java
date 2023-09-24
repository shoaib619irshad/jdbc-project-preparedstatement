package com.jsp.customer_crud_with_prepared.controller;

import java.util.Scanner;

import com.jsp.customer_crud_with_prepared.dto.Customer;
import com.jsp.customer_crud_with_prepared.service.CustomerService;

public class CustomerController {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("main method started");
	    Customer customer=null;
	    CustomerService customerService=new CustomerService();
	    
	    System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.Get customer by Id");
	    System.out.println("Enter your option");
		
        int ch=sc.nextInt();
        switch(ch) {
        case 1:  {
        	System.out.println("Enter customer id");
        	int id=sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter customer name");
        	String name=sc.nextLine();
        	System.out.println("Enter customer email");
        	String email=sc.next();
        	System.out.println("Enter customer phone");
        	long phone=sc.nextLong();
        	sc.nextLine();
        	System.out.println("Enter customer address");
        	String address=sc.nextLine();
        	customer=new Customer (id,name,email,phone,address);
        	customerService.insertCustomerService(customer);
        }
        break;
        
        case 2: {
        	System.out.println("Now choose option to update");
        	System.out.println("1.Name\n2.Email\n3.Phone\n4.Address");
        	int ch1=sc.nextInt();
        	
        	switch(ch1) {
        	
        	case 1:{
        	   System.out.println("Enter customer id");
        	   int id=sc.nextInt();
        	   sc.nextLine();
        	   System.out.println("Enter customer name");
        	   String name=sc.nextLine();
        	
        	   int id1=customerService.updateCustomerService(id, name);
        	
        	   if(id1==1)
        		System.out.println("Data   Updated");
        	  else
        		System.out.println("Id not found please check again");
               }
               break;
               
        	case 2:{
        		System.out.println("Enter cusomer id");
         	    int id=sc.nextInt();
         	    System.out.println("Enter customer email");
         	    String email=sc.next();
         	    
         	   int id2=customerService.updateCustomerService(email,id);
         	   
         	  if(id2==1)
          		System.out.println("Data   Updated");
          	  else
          		System.out.println("Id not found please check again");
        	}
        	break;
        	case 3:{
        		System.out.println("Enter customer id");
         	    int id=sc.nextInt();
         	    System.out.println("Enter customer phone no.");
         	    long phone=sc.nextLong();
         	    
         	   int id3=customerService.updateCutomerService(id, phone);
         	   
         	  if(id3==1)
          		System.out.println("Data   Updated");
          	  else
          		System.out.println("Id not found please check again");
        	}
        	break;
        	
        	case 4:{
        		System.out.println("Enter customer id");
        		int id=sc.nextInt();
        		sc.nextLine();
        		System.out.println("Enter customer address");
        		String address=sc.nextLine();
        		int id4=customerService.updateCutomerServiceAddress(id,address);
        		
        		if(id4==1)
              		System.out.println("Data   Updated");
              	  else
              		System.out.println("Id not found please check again");
        	}
        	break;
        	
        	default:{
        		System.out.println("Please choose from the given options");
        	}
              }
        			}
        break;
        
        case 3:{
        	System.out.println("Enter customer id");
        	int id=sc.nextInt();
        	
        	int id3=customerService.deleteCustomer(id);
        	if(id3==1)
				System.out.println("Data is deleted");
			else
				System.err.println("Given id is not found");
        }
        break;
        case 4:{
        	customerService.displayCustomerDetails();
        }
        break;
        
        case 5:{
        	System.out.println("Enter customer id");
        	int id=sc.nextInt();
        	Customer x=customerService.getCustomerById(id);
        	if(x!=null) {
        	System.out.println("Id is " + x.getCustomerId());
        	System.out.println("Name is " + x.getCustomerName());
        	System.out.println("Email is " + x.getCustomerEmail());
        	System.out.println("Phone number is " + x.getCustomerPhone());
        	System.out.println("Address is " + x.getCustomerAddress());
        	}
        	else
        		System.out.println("Given id is not present");
        }
        break;

        default:
        	System.out.println("work in progress");
}
        System.out.println("main method ended");
	}
}
