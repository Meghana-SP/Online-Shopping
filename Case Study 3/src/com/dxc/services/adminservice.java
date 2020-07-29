package com.dxc.services;

import java.util.List;

import com.dxc.dao.admindao;
import com.dxc.pojos.admin;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;

public class adminservice implements iadminservice
{
    admindao dao=new admindao();
    
	public void addadmin(admin a) {
		
		 dao.addadmin(a);
	}

	public boolean loginadmin(admin a) {
		
		return dao.loginadmin(a);
	}

	public void addproduct(product p) {
	
		dao.addproduct(p);
	}

	public List<product> getallproducts() {
		
		return dao.getallproducts();
	}
	
	public void addcustomer(customer c)
	{
		dao.addcustomer(c);
	}
	
	public void removecustomer(int i)
	{
		dao.removecustomer(i);
	}
	
	public boolean findcustomer(int customerid)
	{
		return dao.findcustomer(customerid);
	}

}
