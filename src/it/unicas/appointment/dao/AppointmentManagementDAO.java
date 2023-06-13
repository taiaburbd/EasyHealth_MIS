package it.unicas.appointment.dao;

import it.unicas.appointment.pojo.Appointment;
import it.unicas.products.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManagementDAO {
	public static List<Appointment> getAllAppointment(String patientId, String appointmentDate) {
		List<Appointment> appointmentList = new ArrayList<>();
		String whereClause = "";
		if((patientId == null || patientId.equals("")) && (appointmentDate == null || appointmentDate.equals(""))) {
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
			whereClause += "appointment.patient_id = "+"'"+patientId+"'";
		}

		if(appointmentDate != null && !appointmentDate.equals("")) {
			count ++;
			if(count != 1) {
				whereClause += " AND ";
			}
			whereClause += "appointment_date = "+"'"+appointmentDate+"'";
		}
		String joinStatement=" JOIN patient_list ON patient_list.patient_id=appointment.patient_id JOIN doctor_list ON doctor_list.id=appointment.doctor_id";
		try
		{
			Connection conn = DBUtil.getConnection();
			Statement st= conn.createStatement();
			System.out.println("SELECT * FROM appointment"+joinStatement+whereClause);
			ResultSet rs= st.executeQuery("SELECT * FROM appointment"+joinStatement+whereClause);
			while(rs.next())
			{
				Appointment appointment = new Appointment(
						rs.getString("id"),
						rs.getString("patient_id"),
						rs.getString("patient_name"),
						rs.getString("doctor_id"),
						rs.getString("dr_name"),
						rs.getString("appointment_date"),
						rs.getString("time_slot")
				);
				appointmentList.add(appointment);
			}
			
			DBUtil.closeConnection(conn);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return appointmentList;
	}public static List<Appointment> getPatientAppointment(String patientEmail, String patientPhone) {
		List<Appointment> appointmentList = new ArrayList<>();
		String whereClause = "";
		if(patientEmail != null && patientPhone != null ) {
			whereClause = " WHERE patient_list.patient_email='" + patientEmail + "' and patient_list.patient_phone=" + patientPhone;


			String joinStatement = " JOIN patient_list ON patient_list.patient_id=appointment.patient_id JOIN doctor_list ON doctor_list.id=appointment.doctor_id";
			try {
				Connection conn = DBUtil.getConnection();
				Statement st = conn.createStatement();
				System.out.println("SELECT * FROM appointment" + joinStatement + whereClause);
				ResultSet rs = st.executeQuery("SELECT * FROM appointment" + joinStatement + whereClause);
				while (rs.next()) {
					Appointment appointment = new Appointment(
							rs.getString("id"),
							rs.getString("patient_id"),
							rs.getString("patient_name"),
							rs.getString("dr_name"),
							rs.getString("appointment_date"),
							rs.getString("time_slot")
					);
					appointmentList.add(appointment);
				}

				DBUtil.closeConnection(conn);


			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return appointmentList;
	}
	public static Appointment getAppointmentById(String appointmentId) {
		Appointment appointment = null;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM appointment WHERE id = ?");
			ps.setString(1, appointmentId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				appointment = new Appointment(
						rs.getString("id"),
						rs.getString("appointment_date"),
						rs.getString("time_slot")
				);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return appointment;
	}
	public static int addAppointment(Appointment appointment) {

		int status = 0;
		System.out.println("--");
		System.out.println(appointment.getTimeslot());
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO appointment (patient_id, doctor_id, appointment_date, time_slot) VALUES(?,?,?,?)");
			ps.setString(1, appointment.getPatientId());
			ps.setString(2, appointment.getDoctorId());
			ps.setString(3, appointment.getAppointmentDate());
			ps.setString(4, appointment.getTimeslot());
			System.out.println(ps);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	public static int deleteAppointment(String appointmentId) {
		int status = 0;
		try
		{
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement("DELETE FROM appointment where id = ?");
			ps.setString(1, appointmentId);
			status = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
