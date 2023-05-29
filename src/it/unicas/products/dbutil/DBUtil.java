package it.unicas.products.dbutil;

import java.sql.*;

public class DBUtil {

	public static Connection getConnection()
	{
		Connection conn = null;
		try 
		{
      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      conn = DriverManager.getConnection("jdbc:mysql://localhost/easyhealth_db?useSSL=false&serverTimezone=UTC", "root", "");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection conn)
	{
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
