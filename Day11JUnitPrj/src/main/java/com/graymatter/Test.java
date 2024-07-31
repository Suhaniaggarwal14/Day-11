package com.graymatter;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Before;

public class Test {
	
	@Before
	public  static void configureConnecion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/graymatterdb","root","password");
//		
//		@Test
//		public void testConnection() {
//			assertNotNull(con);
		}
//		asserEquals(conn,dbConnection.getConnection());
	}
	