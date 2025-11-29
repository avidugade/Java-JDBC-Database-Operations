package com.tka.sep08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class INSERTOP {

	public static void main(String[] args) {
		
		String path = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pwd ="root";
		
//		String query = "SELECT * FROM studentdb";

		String 	insertquery = "INSERT INTO SALES VALUES (?,?,?,?,?)";
		
		try {
//			Step 1
			Class.forName(path);
			System.err.println("Driver class loaded Successfully... ");
			
//			step 2
			Connection conn =DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connection Established sucessfully..");
			
//			Step 3
			
//			      Statement st = conn.createStatement();
//			      System.err.println("Statement Created Sucessfully..");
			
			PreparedStatement pst =conn.prepareStatement(insertquery);
			
			        pst.setInt(1,21);
			        pst.setString(2,"MI");
			        pst.setString(3,"RYAN RIKLETON");
			        pst.setInt(4,1200);
			        pst.setInt(5,0);
			        
			        System.err.println("Statement Created Sucessfully..");
			        
			         int ack =pst.executeUpdate();
			         System.out.println(ack);
			          if(ack > 0) {
			        	  System.err.println("Data Inserted Successfully..with pk = "+ ack);
			          }else {
			          System.err.println("Something Went Wrong...");
			          }
			     
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
