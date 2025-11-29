package com.tka.sep08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECToperation {

	public static void main(String[] args) {
		
		String path = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pwd ="root";
		
		String query = "SELECT * FROM studentdb";
//		String Query = "SELECT * FROM miplayer";
		
		
		try {
//			Step 1
			Class.forName(path);
			System.err.println("Driver class loaded Successfully... ");
			
//			step 2
			Connection conn =DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connection Established sucessfully..");
			
//			Step 3
			
			      Statement st = conn.createStatement();
			      
			        ResultSet rs =st.executeQuery(query);
			        System.err.println("ResultSet Generated Sucessfully..");
			        
			        int count = 0;
			        while(rs.next()) {
			        	
			        	int StdID =rs.getInt(1);
			        	int RollNo =rs.getInt(2);
			        	String Name =rs.getString(3);
			        	int Marks =rs.getInt(4);
			        	
			        	System.out.println("StdID is " +StdID+ " * RollNo is "+RollNo+ " * Name is "+ Name + " * Marks is " +Marks);
			        	
//			        	count++;
//			        	System.err.println(count);
			        }
			  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
