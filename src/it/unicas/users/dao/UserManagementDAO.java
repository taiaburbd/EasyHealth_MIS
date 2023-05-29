package it.unicas.users.dao;

import it.unicas.users.pojo.Users;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserManagementDAO {
	public static List<Users> getAllData(String userName, String createDate) {
		List<Users> userList = new ArrayList<>();
		String whereClause = "";
		if((userName == null || userName.equals("")) && (createDate == null || createDate.equals(""))) {
			whereClause = "";
		}
		else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if(userName != null && !userName.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "user_name = "+"'"+userName+"'";
		}

		if(createDate != null && !createDate.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "create_date = "+"'"+createDate+"'";
		}
		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM login_info "+whereClause);
			ResultSet rs= st.executeQuery("SELECT * FROM login_info "+whereClause);
			while(rs.next())
			{
				Users user = new Users(
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getString("create_date")
				);
				userList.add(user);
			}
			
			DBUtil.closeConnection(conn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userList;
	}
	public static Users getItemById(String userName) {
		Users user = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM login_info WHERE id = ?");
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				user = new Users(
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getString("create_date")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	public static int addItem(Users user) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO login_info VALUES(?,?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ps.setString(3, user.getCreatedDate());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	public static int deleteItem(String userName) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM login_info where user_name = ?");
			ps.setString(1, userName);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
