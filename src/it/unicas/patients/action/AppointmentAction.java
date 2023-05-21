package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.AppointmentManagementDAO;
import it.unicas.patients.dao.DoctorManagementDAO;
import it.unicas.patients.pojo.Appointment;
import it.unicas.patients.pojo.Doctors;
import it.unicas.patients.pojo.Patients;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AppointmentAction extends ActionSupport{

	private List<Appointment> appointmentList;
	private List<Doctors> doctorList;
	private String patientId;
	private Date appointmentDate;

	private String doctorName;
	private String doctorPhone;
	private Date createdDate;
	
	public void initializeData() {
		System.out.println("****** Filter Data ******");
		System.out.println(patientId);
		System.out.println(appointmentDate);
		String appointmentDateStr = "";
		if(appointmentDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			appointmentDateStr = formatter.format(appointmentDate);
		}
		appointmentList = AppointmentManagementDAO.getAllAppointment(patientId, appointmentDateStr);

	}

	public void initializeDoctors() {
		System.out.println("****** Filter Data ******");
		System.out.println(doctorName);
		System.out.println(doctorPhone);
		System.out.println(createdDate);
		String createdDateStr = "";
		if(createdDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
			createdDateStr = formatter.format(createdDate);
		}
		doctorList = DoctorManagementDAO.getAllDoctors(doctorName, doctorPhone, createdDateStr);
	}
	
	public String execute() {
		initializeData();
		initializeDoctors();
		return "success";
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public List<Doctors> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctors> doctorList) {
		this.doctorList = doctorList;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorPhone() {
		return doctorPhone;
	}

	public void setDoctorPhone(String doctorPhone) {
		this.doctorPhone = doctorPhone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
