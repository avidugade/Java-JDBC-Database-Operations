package com.tka.sep08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SELECTOP2 {
	
	public static void main(String [] a) {
		
		
		String path ="com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pwd ="root";
		
		
		String query ="SELECT * FROM test.player;";
		
		try {
			
			Class.forName(path);
			System.out.println("Driver class loaded Successfully... ");
			
			Connection conn = DriverManager.getConnection(url,uname,pwd);		
			System.err.println("Connection Established sucessfully..");
			
			Statement st = conn.createStatement();
			System.out.println("Statement Created..");
			
			ResultSet rs = st.executeQuery(query);
			 System.err.println("ResultSet Generated Sucessfully..");
			 
			List<IPLTEAMS> db = new ArrayList<>();
			
			while(rs.next()){ 
				int PlayerJN = rs.getInt(1);
				String TName = rs.getString(2);
				String PName = rs.getString(3);
				int Runs =rs.getInt(4);
				int Wik =rs.getInt(5);
				
				System.out.println("PlayerJN is " +PlayerJN+ " * TName "+TName+ " * PName "+ PName+ " * Runs is " +Runs+ " * Wik is " + Wik);
				
				IPLTEAMS obj = new IPLTEAMS(PlayerJN,TName,PName,Runs,Wik );
				db.add(obj);
				
			}
			
			for(IPLTEAMS A :db) {
				
				System.out.println(A);
				
			}
//			ONLY MI TEAM
//			System.err.println("ONLY MI PLAYER");
//			
//			for(IPLTEAMS s :db) {
//				if(s.getTname().equals("MI"))
//					System.out.println(s);
//				
//			}
			
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}


		}

