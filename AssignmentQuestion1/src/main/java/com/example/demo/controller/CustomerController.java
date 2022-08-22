/*
 * 1)Write an application using SpringMVC with SpringBoot.
You need to read data dynamically from Customer (customerid,customername,customerphone,customeraddress,customerloginid,
customerpassword) and then display on webpage.
 */

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController 
{
	@RequestMapping("/customer")
	public String takeDetails()
	{
		System.out.println("Customer Details");
		return "customerDetailsForm";
	}
	
	@RequestMapping("/dd")
	public String displayDetails(@RequestParam("cid") String cid, @RequestParam("cname") String cname, @RequestParam("cno") String cno, @RequestParam("caddress") String caddress,@RequestParam("clogin") String clogin,@RequestParam("cpassword") String cpassword, Model m)
	{
		System.out.println("display");
		m.addAttribute("cid",cid);
		m.addAttribute("cname",cname);
		m.addAttribute("cno", cno);
		m.addAttribute("caddress", caddress);
		m.addAttribute("clogin", clogin);
		m.addAttribute("cpassword", cpassword);
		return "shoeCustomerDetails";
	}

}
