package com.dxc.dao;

import java.util.List;

import com.dxc.pojos.customer;
import com.dxc.pojos.product;

public interface icustomerdao {
	
	  public boolean logincustomer(customer c);
	  
	  public List<product> getallproducts();
	  
	  public List<product> displayfromcart(int cid);

	  void addtocart(int cid, int productid);
	
	  public boolean paybill(product p, double finalcost, int cid);
	 
      public void addmoneytowallet(int cid, double balance);

}
