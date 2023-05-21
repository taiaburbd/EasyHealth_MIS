package it.unicas.products.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.LoginInfo;

public class LoginDAO {

	public static boolean isUserValid(LoginInfo userDetails)
	{
		boolean validStatus = false;
		try
		{

			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println(userDetails.getUserName());
			System.out.println(userDetails.getPassword());

			ResultSet rs= st.executeQuery("SELECT * FROM login_info WHERE user_name = '"+userDetails.getUserName()+"' AND password = '"+userDetails.getPassword()+"'");
			while(rs.next())
			{
				validStatus = true;
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return validStatus;
	}
}
