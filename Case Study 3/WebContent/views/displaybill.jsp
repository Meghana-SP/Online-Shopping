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
<body bgcolor=9A9A9A>
					
					<form action="confirmpaybill">

	

		
								<h1>Product name:<input type="hidden"name="productname" value="${product.getProductname()}"> ${product.getProductname()}</h1>
							    <h2>Product Id:<input type="hidden"name="productid" value="${product.getProductid()}"> ${product.getProductid()}</h2>
							    <h2>Product cost:<input type="hidden"name="productcost" value="${product.getProductcost()}"> ${product.getProductcost()}</h2>
							    <h2>Product Quantity:<input type="hidden"name="productquantity" value="${product.getProductquantity()}"> ${product.getProductquantity()}</h2>
						        <h2>Product Discount:<input type="hidden"name="productdiscount" value="${product.getProductdiscount()}"> ${product.getProductdiscount()}</h2>
								<c:set var="cost" value="${product.getProductcost()}"></c:set>
                                <c:set var="quant" value="${product.getProductquantity()}"></c:set>
                                <c:set var="discount" value="${product.getProductdiscount()}"></c:set>
                                <c:set var="totalcost" value="${cost*quant}"></c:set>
                                <c:set var="finalcost" value="${totalcost-(totalcost*discount/100)}"></c:set>
                                <h2>Total amount<input type="hidden" name="finalcost" value="${finalcost}">${finalcost}</h2> 	
                                <input type="submit" name="btn" value="confirmpaybill">						
						
								
								
								</form>
							
			                    
</body>
</html>