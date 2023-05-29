package it.unicas.patients.dao;

import it.unicas.patients.pojo.Patients;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PatientManagementDAO {
	public static List<Patients> getAllPatients(String patientName, String patientPhone, String createdDate) {
		List<Patients> patientList = new ArrayList<Patients>();
		String whereClause = "";
		if((patientName == null || patientName.equals("")) && (patientPhone == null || patientPhone.equals("")) && (createdDate == null || createdDate.equals(""))) {
			whereClause = "";
		}
		else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if(patientName != null && !patientName.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "patient_name = "+"'"+patientName+"'";
		}
		if(patientPhone != null && !patientPhone.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "patient_phone = "+"'"+patientPhone+"'";
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
			System.out.println("SELECT * FROM patient_list"+whereClause);
			ResultSet rs= st.executeQuery("SELECT * FROM patient_list"+whereClause);
			while(rs.next())
			{
				Patients patient = new Patients(rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("patient_phone"),
						rs.getString("patient_email"),
						rs.getString("patient_blood_group"),
						rs.getString("patient_dob"),
						rs.getString("patient_sex"),
						rs.getString("created_date"));
				patientList.add(patient);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return patientList;
	}
	public static Patients getPatinetById(String patientId) {
		Patients patient = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM patient_list WHERE patient_id = ?");
			ps.setString(1, patientId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				patient = new Patients(rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("patient_phone"),
						rs.getString("patient_email"),
						rs.getString("patient_blood_group"),
						rs.getString("patient_dob"),
						rs.getString("patient_sex"),
						rs.getString("created_date"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return patient;
	}public static Patients getPatinetByEmailPhone(String patientEmail, String patientPhone) {
		Patients patient = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM patient_list WHERE patient_email = ? and patient_phone= ?");
			ps.setString(1, patientEmail);
			ps.setString(2, patientPhone);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				patient = new Patients(rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("patient_phone"),
						rs.getString("patient_email"),
						rs.getString("patient_blood_group"),
						rs.getString("patient_dob"),
						rs.getString("patient_sex"),
						rs.getString("created_date"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return patient;
	}
	public static int addPatient(Patients patients) {

		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO patient_list VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1, patients.getPatientId());
			ps.setString(2, patients.getPatientName());
			ps.setString(3, patients.getPatientPhone());
			ps.setString(4, patients.getPatientEmail());
			ps.setString(5, patients.getPatientBloodGroup());
			ps.setString(6, patients.getPatientDOB());
			ps.setString(7, patients.getPatientGender());
			ps.setString(8, patients.getCreatedDate());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int updatePatient(Patients patients) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("UPDATE patient_list SET patient_name=?, patient_phone=?, patient_email=?,patient_blood_group=?,patient_dob=?,patient_sex=? WHERE patient_id=?");
			ps.setString(1, patients.getPatientName());
			ps.setString(2, patients.getPatientPhone());
			ps.setString(3, patients.getPatientEmail());
			ps.setString(4, patients.getPatientBloodGroup());
			ps.setString(5, patients.getPatientDOB());
			ps.setString(6, patients.getPatientGender());
			ps.setString(7, patients.getPatientIdId());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int deletePatient(String patientId) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM patient_list where patient_id = ?");
			ps.setString(1, patientId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
