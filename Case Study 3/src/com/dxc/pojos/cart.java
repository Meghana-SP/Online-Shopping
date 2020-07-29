package com.dxc.pojos;

 

import javax.persistence.Entity;
import javax.persistence.Id;

 

@Entity
public class cart {
    @Id
  
    private int id;
    private int customerid;
    private int productid;
    
    public cart()
    {
        
    }
    
    public int getCustomerid() {
        return customerid;
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
    public int getProductid() {
        return productid;
    }
    public void setProductid(int productid) {
        this.productid = productid;
    }
    

 

}
 