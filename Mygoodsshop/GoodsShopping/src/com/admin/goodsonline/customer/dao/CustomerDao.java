package com.admin.goodsonline.customer.dao;

import java.util.List;

import com.admin.goodsonline.entity.Customer;

public interface CustomerDao {

	List<Customer> retireve(String customerName, String customerPassword);
	
	
}
