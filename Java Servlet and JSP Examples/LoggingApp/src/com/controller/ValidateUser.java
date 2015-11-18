package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValidateUser
 */
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Map<String,String>users= new HashMap<String, String>();
    
    
	  @Override
	public void init() throws ServletException {
		   users.put("arjun","arjun123");
		   users.put("praful","praful123");
		   users.put("neha","neha123");
		   users.put("deep","deep123");
		   users.put("seema","seema123");
		   
	  }
		
		  
		   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= request.getParameter("user");
		String password= request.getParameter("password");
        ServletContext context= getServletContext();
        
		if(validateUser(user,password)){
			System.out.println(" Create Session...");
			context.setAttribute("user", user);
			HttpSession session = request.getSession();
			System.out.println("Set attribute.... ");
			session.setAttribute("userName", user);
			//request.getRequestDispatcher("welcome.jsp").forward(request, response);
			response.sendRedirect("welcome.jsp");
		}
		else{
			request.setAttribute("message", "invalid username or password try again... ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}




	private boolean validateUser(String user, String password) {
		if(users.containsKey(user) && users.containsValue(password)){
			return true;
		}
		return false;
	}

}
