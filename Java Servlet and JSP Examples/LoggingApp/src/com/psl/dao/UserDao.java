package com.psl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.sun.jmx.snmp.Timestamp;

public class UserDao {

	Connection cn = null;

	public void getConnection(String driverName,String url,String userName,String password){
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cn=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean addUserDetails(String user){
		String qry= "insert into logininfo(username ,logintime)values(??)";
		try{
			PreparedStatement pstmt=cn.prepareStatement(qry);
			pstmt.setString(1, user);
			java.sql.Timestamp t = null;
			pstmt.setTimestamp(2, t, Calendar.getInstance(TimeZone.getTimeZone("UTC")));
			pstmt.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	
		public void closeConnection(){
			try{
				cn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		public boolean updateUserDetails(String user) {
			
			String qry= "update logininfo set logoutTime=? where username=?";
			try{
				PreparedStatement pstmt=cn.prepareStatement(qry);
				java.sql.Timestamp t = null;
				pstmt.setTimestamp(2, t, Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				//pstmt.setTimestamp(2, getCurrentTimeStamp());
				pstmt.setString(2, user);
				pstmt.executeUpdate();
				return true;
			}  catch(SQLException e){
				e.printStackTrace();
			}
			return false;
			
		}

	}
	

