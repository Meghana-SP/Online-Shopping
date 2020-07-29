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
<center>

          <h1 style="font-size:30px; color: #2F4F4F;">DISPLAY OF CUSTOMER</h1>
              <c:forEach var="customer" items="${list}"> 
      
         <table>
         
           <body style="background-color:DarkGray"; align="center">
            
            <tr>
            
              <td>
                 <h4><c:out value="${customer.getCustomerid()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${customer.getCustomername()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${customer.getPassword()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${customer.getBalance()}"></c:out></h4>
               </td>
               
                <td>
                 <h4><c:out value="${product.getProductdiscount()}"></c:out></h4>
               </td>
               
             </tr>  
         </table>
      </c:forEach>

 
</center>

</body>
</html>