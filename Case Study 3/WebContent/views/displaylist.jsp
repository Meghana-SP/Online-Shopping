<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
                <style>
                    table, tr, td{
                         border: 1px solid black;
                         width : 25%;
                         text-align: center;
                    }
                </style>
</head>
<body>

                  <body style="background-color:DarkGray"; align="center">
<center>
                    <c:forEach var="product" items="${list}">
                    <form action="addtocart">
<table>       
<tr>

        <td>
          <h1><input type="hidden"name="productid" value="${product.getProductid()}"> ${product.getProductid()}</h1>
        </td>
         
         <td> 
          <h2><input type="hidden"name="productname" value="${product.getProductname()}"> ${product.getProductname()}</h2>
         </td>

          <td>               
           <h2><input type="hidden"name="productcost" value="${product.getProductcost()}"> ${product.getProductcost()}</h2>
          </td>
               
          <td>
            <h2><input type="hidden"name="productquantity" value="${product.getProductquantity()}"> ${product.getProductquantity()}</h2>
          </td>
            
          <td>                  
           <h2><input type="hidden"name="productdiscount" value="${product.getProductdiscount()}"> ${product.getProductdiscount()}</h2>
          </td>
                          
</tr>
                                
</table>       
         <input type="submit"name="btn" value="addtocart">
                               
         </form>
                
         </c:forEach>
                    
         </center>
</body>
</html>