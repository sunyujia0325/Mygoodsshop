package com.admin.goodsonline.customer.service;

import java.util.List;

import com.admin.goodsonline.entity.Customer;

public interface CustomerService {
	List<Customer> login(String customerName,String customerPassword);
	
}
