package com.admin.goodsonline.customer.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.admin.goodsonline.customer.service.CustomerService;
import com.admin.goodsonline.entity.Customer;
@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Resource
    CustomerService customerServiceImpl;
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(@RequestParam("customerName") String customerName,
                        @RequestParam("customerPassword") String customerPassword,
                        HttpSession session,Model model)
    {
        List<Customer> list=customerServiceImpl.login(customerName, customerPassword);
        boolean flag=list.isEmpty();
        session.setAttribute("flag", flag);
        return !list.isEmpty()?"redirect:/float/index.html":"redirect:/float/login";        
    }
}
