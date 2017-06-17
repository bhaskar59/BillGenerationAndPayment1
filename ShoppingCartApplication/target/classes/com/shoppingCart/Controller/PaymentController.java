package com.shoppingCart.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;

import com.ShoppingCartApplication.entity.Product;

@WebServlet("/payment")
public class PaymentController {

protected void doget(HttpRequest request , HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		response.sendRedirect("PaymentPage.jsp");
		
	}
}
