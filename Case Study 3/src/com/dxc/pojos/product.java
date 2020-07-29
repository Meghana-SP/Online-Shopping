package com.dxc.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
	
	@Id
	
	private int productid;
	private String productname;	
	private double productcost;	
	private double productdiscount;
	private int productquantity;
	
	public product() {
		
	}

	public product(int productid, String productname, double productcost, double productdiscount, int productquantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcost = productcost;
		this.productdiscount = productdiscount;
		this.productquantity = productquantity;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductcost() {
		return productcost;
	}

	public void setProductcost(double productcost) {
		this.productcost = productcost;
	}

	public double getProductdiscount() {
		return productdiscount;
	}

	public void setProductdiscount(double productdiscount) {
		this.productdiscount = productdiscount;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
				+ ", productdiscount=" + productdiscount + ", productquantity=" + productquantity + "]";
	}
	
	

}
