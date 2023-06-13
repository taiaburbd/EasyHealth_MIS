package it.unicas.app.dao;

import it.unicas.app.pojo.App;
import it.unicas.image.pojo.MedicalImaging;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AppManagementDAO {


	public static App getTotalpatients() {
		App total_patients=null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(patient_id) AS total_patients FROM patient_list ");
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				total_patients = new App(
						rs.getString("total_patients")
					);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return total_patients;
	}
	public static App getTotalAppointment() {
		App total_appointment=null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(patient_id) AS total_appointment FROM appointment ");
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				total_appointment = new App(
						rs.getString("total_appointment")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return total_appointment;
	}
	public static App getTotalProcessImages() {
		App total_images=null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(patient_id) AS total_images FROM medical_imaging ");
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				total_images = new App(
						rs.getString("total_images")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return total_images;
	}
	public static App getTotalUsers() {
		App total_users=null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(user_name) AS total_users FROM login_info ");
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				total_users = new App(
						rs.getString("total_users")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return total_users;
	}
}
