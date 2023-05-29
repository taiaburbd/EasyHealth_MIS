package it.unicas.prescription.dao;

import it.unicas.prescription.pojo.Prescription;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionManagementDAO {
	public static List<Prescription> getAllData(String patientId, String status) {
		List<Prescription> prescriptionList= new ArrayList<>();
		String whereClause = "";
		if((patientId == null || patientId.equals("")) && (status == null || status.equals(""))) {
			whereClause = "";
		}
		else {
			whereClause = " WHERE ";
		}
		int count = 0;
		if(patientId != null && !patientId.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "prescriptions.patient_id = "+"'"+patientId+"'";
		}


		String joinStatement=" JOIN appointment ON appointment.id=prescriptions.appointment_id " +
				"JOIN patient_list ON patient_list.patient_id=appointment.patient_id " +
				"JOIN doctor_list ON doctor_list.id=appointment.doctor_id";
		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM prescriptions"+joinStatement+whereClause);
			ResultSet rs= st.executeQuery("SELECT * FROM prescriptions"+joinStatement+whereClause);
			while(rs.next())
			{
				Prescription prescription = new Prescription(
						rs.getString("id"),
						rs.getString("appointment_id"),
						rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("dr_name"),
						rs.getString("create_date"),
						rs.getString("status")
				);
				prescriptionList.add(prescription);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prescriptionList;
	}
	public static Prescription getDataById(String prescriptionId) {
		Prescription appointment = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM prescriptions WHERE id = ?");
			ps.setString(1, prescriptionId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Prescription prescription = new Prescription(
						rs.getString("id"),
						rs.getString("appointment_id"),
						rs.getString("patient_id"),
						rs.getString("history_dm"),
						rs.getString("htn"),
						rs.getString("ihd"),
						rs.getString("investigation_advice"),
						rs.getString("treatment_plan"),
						rs.getString("doctor_note"),
						rs.getString("status")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return appointment;
	}
	public static int addData(Prescription prescription) {

		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO prescriptions VALUES(?,?,?,?,?,?,?,?,?)");
//			ps.setString(1, prescription.);
			System.out.println(ps);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int updateData(Prescription prescription) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("UPDATE prescriptions SET history_dm=?, htn=?, ihd=?, investigation_advice=?,treatment_plan=?,doctor_note=?, status=? WHERE prod_id=?");
			ps.setString(1, prescription.getHistoryDm());
			ps.setString(2, prescription.getHtn());
			ps.setString(3, prescription.getIhd());
			ps.setString(4, prescription.getInvestigationAdvice());
			ps.setString(5, prescription.getTreatmentPlan());
			ps.setString(6, prescription.getDoctorNote());
			ps.setString(7, prescription.getStatus());
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int deleteData(String itemId) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM prescriptions where id = ?");
			ps.setString(1, itemId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
