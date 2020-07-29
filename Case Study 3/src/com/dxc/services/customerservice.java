package com.dxc.services;

import java.util.List;

import com.dxc.dao.customerdao;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;

public class customerservice {
	
	customerdao dao=new customerdao();

	public boolean logincustomer(customer c) {
	
		return dao.logincustomer(c);
	}

	public void addtocart(int cid, int productid) {
		
		dao.addtocart(cid, productid);
		
	}

	public List<product> getallproducts() {
		
		return dao.getallproducts();
	}

	public List<product> displayfromcart(int cid) {
		
		return dao.displayfromcart(cid);
	}

	public boolean paybill(product p, double finalcost, int cid) {
		
		return dao.paybill(p, finalcost, cid);
	}

	public void addmoneytowallet(int cid, double balance) {
	
		dao.addmoneytowallet(cid, balance);
		
	}

}
