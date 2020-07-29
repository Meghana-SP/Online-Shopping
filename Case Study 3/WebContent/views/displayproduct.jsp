<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 

                   <style>
                      table,tr,td{
                      border: 1px solid black;
                      width : 25%;
                      text-align:center;
                      }
                   </style>
                  

 

</head>
<body>
        
<center>
   <h1 style="font-size:30px; color: #2F4F4F;">LIST OF PRODUCTS</h1>
   <table>
   <thead>
						
						<th>Product id</th>
						<th>Product name</th>
						<th>Product cost</th>
						<th>Product quantity</th>
						<th>Product discount</th>
						
							</thead>
   
              <c:forEach var="product" items="${list}"> 
      
         
         
           <body style="background-color:DarkGray"; align="center">
           
         
         
        
            
 
            
            <tr>
            
              <td>
                 <h4><c:out value="${product.getProductid()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${product.getProductname()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${product.getProductcost()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${product.getProductquantity()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${product.getProductdiscount()}"></c:out></h4>
               </td>
               
             </tr>  
         
      </c:forEach>
      </table>

 
</center>

</body>
</html>