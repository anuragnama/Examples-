package com.github;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;;

public class ProductDao {
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
	
	List<Product> getProducts(String category){
		List<Product> productList=new ArrayList<Product>();
		try {
			PreparedStatement stmt=cn.prepareStatement("select * from product where category=?");
			stmt.setString(1, category);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()){
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				p.setCategory(rs.getString(4));
				p.setStock(rs.getInt(5));
				productList.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productList;
		
	}

}
