package com.dxc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.pojos.admin;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;
import com.dxc.services.adminservice;

@Controller
@RequestMapping("/views")
public class admincontroller 
{
	adminservice service=new adminservice();
	String status=" ";
	
	@RequestMapping("/add")
	public String add(@ModelAttribute admin a)
	{
		System.out.println("test1S");
		service.addadmin(a);
		
		return "message";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute admin a,Model m)
	{
		boolean b=service.loginadmin(a);
		if(b)
		{
			return "adminoptions";
		}
		else
		{
			status="Login Credential Is Invalid....!!!!";
			m.addAttribute("status", status);
			return "message1";
		}
	}
	
	@RequestMapping("/addproduct")
	public String addproduct(@ModelAttribute product p)
	{
		service.addproduct(p);
		return "message2";
	}
	
	@RequestMapping("/displayproduct")
	public String getallproducts(Model m)
	{
		List<product>list=service.getallproducts();
		m.addAttribute("list",list);
		return "displayproduct";
	}
	
	@RequestMapping("/addcustomer")
	public String addcustomer(@ModelAttribute customer c)
	{
		service.addcustomer(c);
		return "message3";
	}
	
	@RequestMapping("/removecustomer")
	public String removecustomer(@ModelAttribute customer c)
	{
		int i=c.getCustomerid();
		service.removecustomer(i);
		return "message4";
	}
	
	@RequestMapping("/find")
	public String find(@RequestParam("customerid") int customerid, Model m, HttpSession session)
	{
		boolean status=true;
		session.setAttribute("customerid", customerid);
		status=service.findcustomer(customerid);
		String msg;
		
		if(status==false)
		{
			return "message5";
		}
		else
		{
			return "removecustomer";
		}
	}
	
  }
	

