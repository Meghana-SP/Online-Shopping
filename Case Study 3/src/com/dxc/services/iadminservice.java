package com.dxc.services;

import java.util.List;


import com.dxc.pojos.admin;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;

public interface iadminservice {

	public boolean loginadmin(admin a);
	
	public void addadmin(admin a);
	
	public void addproduct(product p);
	
    public List<product> getallproducts();
	
	public void addcustomer(customer c);
	
	public void removecustomer(int i);
	
	public boolean findcustomer(int customerid);
}
