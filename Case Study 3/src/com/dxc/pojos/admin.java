package com.dxc.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class admin {



	@Id
	private int adminid;
	private String password;
	
	public admin() {
		
		adminid=1;
		password="pasword";
		
	}

	public admin(int adminid, String password) {
		super();
		this.adminid = adminid;
		this.password = password;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "admin [adminid=" + adminid + ", password=" + password + "]";
	}
	
	
	
}
