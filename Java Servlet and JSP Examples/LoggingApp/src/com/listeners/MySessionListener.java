package com.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.psl.dao.UserDao;


public class MySessionListener implements HttpSessionListener {

    
	
    public void sessionCreated(HttpSessionEvent event) {
       
    	System.out.println("session created....");
    	
    	UserDao dao= new UserDao();
    	dao.getConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/userdb","root","password");
    	String user=(String)event.getSession().getServletContext().getAttribute("user");
    	System.out.println("user");
    	if(user!=null)
    	dao.addUserDetails(user);
    	
    	dao.closeConnection();
    	
    	
    }

	
    public void sessionDestroyed(HttpSessionEvent event) {
       
    	UserDao dao= new UserDao();
    	dao.getConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/userdb","root","password");
    	dao.updateUserDetails((String)event.getSession().getAttribute("userName"));
    	dao.closeConnection();
    	System.out.println("session destroyd...");
    }
	
}
