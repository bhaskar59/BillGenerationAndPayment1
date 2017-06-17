package com.shoppingCart.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import com.ShoppingCartApplication.entity.Product;
import com.transaction.service.TransactionService;

@WebServlet("/product")
public class ProductsController{
	
@Autowired
TransactionService transactionservice;
	
	protected void doget(HttpRequest request , HttpServletResponse response) throws IOException {
		
		List<Product> productList =transactionservice.getProducts();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		response.sendRedirect("Products.jsp");
		
		
		
		
		
		
	}
}
