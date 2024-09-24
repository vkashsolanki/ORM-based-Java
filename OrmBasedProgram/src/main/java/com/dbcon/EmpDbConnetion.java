package com.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpDbConnetion {
	public static void main(String[] args) {
		
		try {
			
			String url ="jdbc:mysql://localhost:3306/solankidb";
			String user="root";
			String pass="root";
			String query ="select * from user";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected successfully");
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			
			String name = resultSet.getString("name");
			String email = resultSet.getString("email");
			String address = resultSet.getString("address");
			
			System.out.println(name+""+email+" "+address);
			statement.close();
			connection.close();
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	

}
