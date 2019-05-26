package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
//MySQLConnectioncTest 클래스 작성 page 77 20190526
public class MySQLConnectioncTest {
	
	private static final String DRIVER 	= "com.mysql.jdbc.Driver";
	private static final String URL		= "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false";
	private static final String USER	= "zerock";
	private static final String PW		= "zerock";
	
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL,USER, PW)) {
			
			System.out.println("con : "+con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
