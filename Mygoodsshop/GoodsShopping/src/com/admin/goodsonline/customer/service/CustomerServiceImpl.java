package com.admin.goodsonline.customer.service;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.admin.goodsonline.customer.dao.CustomerDao;
import com.admin.goodsonline.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Resource
	CustomerDao customerDaoImpl;
	HttpSession session;
	HttpServletRequest request;

	@Override
	public List<Customer> login(String customerName,String customerPassword) {
		// TODO Auto-generated method stub
		List<Customer> list = customerDaoImpl.retireve(customerName, customerPassword);
		request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		session=request.getSession();
	    if(!list.isEmpty())
	    {
	        session.setAttribute("customerName", list.get(0).getCustomerName());
	    }

	    return list;
	}
	
}
	/*@Resource
	private CustomerDaoImpl customerDaoImpl;
	
	public Customer login(String customerName,String customerPassword) {
		return this.customerDaoImpl.find();
	}
	public void regist(Customer customer) {
		this.customerDaoImpl.saveCustomer(customer);
	}*/


