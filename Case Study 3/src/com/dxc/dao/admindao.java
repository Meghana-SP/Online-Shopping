package com.dxc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import com.dxc.pojos.admin;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;


public class admindao implements iadmindao {

	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration=new Configuration().configure();
		sessionFactory=configuration.buildSessionFactory();
	}
	
	public void addadmin(admin a) {
	System.out.println("test2");
	admin a1=new admin();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(a1);
		System.out.println("test3");
		session.getTransaction().commit();
		
	}

	public boolean loginadmin(admin a) {
		
		Session session=sessionFactory.openSession();
		System.out.println(a.getAdminid());
		System.out.println(a.getPassword());
		Query query=session.createQuery("from admin");
		List <admin> list=query.getResultList();
		System.out.println(list);
		for(admin a1:list)
		{
			if(a.getAdminid()==(a1.getAdminid()) && a.getPassword().equals(a1.getPassword()));
			{
			   return true;
	    	}
		}
		return false;
		
	
	}

	public void addproduct(product p) {
	
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}
	
	public List<product>getallproducts()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from product");
		return query.getResultList();
	}
	
	public void addcustomer(customer c)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	    session.save(c);
	    session.getTransaction().commit();
	}
	
	public void removecustomer(int i) 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("delete from customer where customerid=:i");
		query.setParameter("i",i);
		query.executeUpdate();
		session.getTransaction().commit();
		
	}
	
	public boolean findcustomer(int customerid)
	{
		customer c=null;
		Session session=sessionFactory.openSession();
	    Query query=session.createQuery("from customer where customerid=:customerid");
	    List<customer>c1=query.getResultList();
	    try {
	    	c=c1.get(0);
	    	return true;
	    }
	    catch(Exception e)
	    {
	    	return false;
	    }
	}

	
	}


