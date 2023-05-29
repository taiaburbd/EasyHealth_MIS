package it.unicas.doctor.dao;

import it.unicas.doctor.pojo.Doctors;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoctorManagementDAO {
	public static List<Doctors> getAllDoctors(String doctorName, String doctorPhone, String createdDate) {
		List<Doctors> doctorsList = new ArrayList<>();
		String whereClause = "";
		if((doctorName == null || doctorName.equals("")) && (doctorPhone == null || doctorPhone.equals("")) && (createdDate == null || createdDate.equals(""))) {
			whereClause = "";
		}
		else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if(doctorName != null && !doctorName.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "dr_name = "+"'"+doctorName+"'";
		}
		if(doctorPhone != null && !doctorPhone.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "dr_phone = "+"'"+doctorPhone+"'";
		}
		if(createdDate != null && !createdDate.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "created_date = "+"'"+createdDate+"'";
		}
		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM doctor_list"+whereClause);
			ResultSet rs= st.executeQuery("SELECT * FROM doctor_list"+whereClause);
			while(rs.next())
			{
				Doctors doctor = new Doctors(rs.getString("id"),
						rs.getString("dr_name"),
						rs.getString("dr_phone"),
						rs.getString("dr_email"),
						rs.getString("created_date"));
				doctorsList.add(doctor);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return doctorsList;
	}
	public static Doctors getDoctorById(String doctorId) {
		Doctors doctor = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM doctor_list WHERE id = ?");
			ps.setString(1, doctorId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				doctor = new Doctors(rs.getString("id"),
						rs.getString("dr_name"),
						rs.getString("dr_phone"),
						rs.getString("dr_email"),
						rs.getString("created_date"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return doctor;
	}
	public static int addDoctor(Doctors doctor) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO doctor_list VALUES(?,?,?,?,?)");
			ps.setString(1, doctor.getDoctorId());
			ps.setString(2, doctor.getDoctorName());
			ps.setString(3, doctor.getDoctorPhone());
			ps.setString(4, doctor.getDoctorEmail());
			ps.setString(5, doctor.getCreatedDate());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int updatDoctor(Doctors doctor) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("UPDATE doctor_list SET dr_name=?, dr_phone=?, dr_email=? WHERE id=?");
			ps.setString(1, doctor.getDoctorName());
			ps.setString(2, doctor.getDoctorPhone());
			ps.setString(3, doctor.getDoctorEmail());
			ps.setString(4, doctor.getDoctorId());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int deleteDoctor(String doctorId) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM doctor_list where id = ?");
			ps.setString(1, doctorId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
