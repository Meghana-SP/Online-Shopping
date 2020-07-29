package com.dxc.dao;

 

import java.util.ArrayList;
import java.util.List;

 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

 

import com.dxc.pojos.cart;
import com.dxc.pojos.customer;
import com.dxc.pojos.product;
public class customerdao implements icustomerdao {
    private static SessionFactory sessionFactory;
    
           static{
            Configuration configuration=new Configuration().configure();
            sessionFactory=configuration.buildSessionFactory();
        }

 

        public boolean logincustomer(customer c) {
            Session session=sessionFactory.openSession();
            Query query=session.createQuery("from customer");
            List <customer> list=query.getResultList();
            System.out.println(list);
            for(customer c1:list)
            {
             
               if(c.getCustomerid()==(c1.getCustomerid())&& c.getPassword().equals(c1.getPassword()))
    {      return true;

 

        }
            }
            return false;
        }

 

    
        public List<product> getallproducts() {
            Session session=sessionFactory.openSession();
            Query query=session.createQuery("from product");
            return query.getResultList();
        
        }

 

        @Override
        public void addtocart(int cid, int productid) {
            cart c=new cart();
            c.setCustomerid(cid);
            c.setProductid(productid);
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            session.save(c);
            session.getTransaction().commit();
            System.out.println("test1");
            
            
        }

 

        public List<product> displayfromcart(int cid) {
            List<product> list=new ArrayList<product>();
            Session session=sessionFactory.openSession();
                Query query=session.createQuery("from cart");
                System.out.println("test2");
        List<cart> cartlist=query.getResultList();
        for(cart cart:cartlist)
        {
            if(cid==cart.getCustomerid())
            {
                int productid=cart.getProductid();
                Query query1=session.createQuery("from product where productid=:pid");
                query1.setParameter("pid",productid);
                List<product> list3=query1.getResultList();
                System.out.println("test3");
                for(product prod:list3)
                {
                    list.add(prod);
                }
            }
        }
            
            return list;
        }

 


        public boolean paybill(product p, double finalcost, int cid) {
            {
                Session session=sessionFactory.openSession();
                session.beginTransaction();
                Query query=session.createQuery("from customer");
                List<customer> clist=query.getResultList();
                for(customer customer:clist)
                {
                  if(cid==customer.getCustomerid())    
                  {
                      double balance=customer.getBalance();
                      if(balance<finalcost)
                      {
                          return false;
                      }
                      balance=balance-finalcost;
                      Query query1=session.createQuery("Update customer set balance=:balance where customerid=:customerid");
                       query1.setParameter("balance", balance);
                       query1.setParameter("customerid", cid);
                       query1.executeUpdate();
                  }
                } 
                
                Query query2=session.createQuery("from product");
                List<product> plist=query2.getResultList();
                for(product product:plist)
                {
                  if(p.getProductid()==product.getProductid())    
                  {
                      int quant=product.getProductquantity();
                      
                      quant=quant-p.getProductquantity();
                      Query query1=session.createQuery("Update product set productquantity=:quant where productid=:productid");
                       query1.setParameter("quant", quant);
                       query1.setParameter("productid", product.getProductid());
                       query1.executeUpdate();
                  }
                }      
                 Query query1=session.createQuery("delete from cart where customerid=:cid AND productid=:productid");
                   query1.setParameter("cid", cid);
                   query1.setParameter("productid", p.getProductid());
                   query1.executeUpdate();
                   session.getTransaction().commit();
                
                return true;

 

            }
            
        }

 


        public void addmoneytowallet(int cid, double balance)
        {
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            Query query=session.createQuery("from customer");
            List<customer> clist=query.getResultList();
            for(customer customer:clist)
            {
              if(cid==customer.getCustomerid())    
              {
                  double amount=customer.getBalance();
                 
                  balance=balance+amount;
                  Query query1=session.createQuery("Update customer set balance=:balance where customerid=:customerid");
                   query1.setParameter("balance", balance);
                   query1.setParameter("customerid", cid);
                   query1.executeUpdate();
              }      
        }

 

            
        }
        
}