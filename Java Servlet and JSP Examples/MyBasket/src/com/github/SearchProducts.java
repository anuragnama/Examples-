package com.github;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category= request.getParameter("category");
		
		ProductDao dao= new ProductDao();
		String driverName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/productdb";
		String user ="root";
		String pass ="password";
		
		
		dao.getConnection(driverName, url, user, pass);
		List<Product>productList=dao.getProducts(category);
		
		
		if(productList.size()==0 && category !=null){
			
			request.setAttribute("message", "product not available for "+ category);
			request.getRequestDispatcher("searchProducts.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("products", productList);
			request.getRequestDispatcher("showProduct.jsp").forward(request, response);
		}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}

