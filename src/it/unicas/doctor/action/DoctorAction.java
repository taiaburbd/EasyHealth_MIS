package it.unicas.doctor.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.doctor.dao.DoctorManagementDAO;
import it.unicas.doctor.pojo.Doctors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DoctorAction extends ActionSupport{
	
	private List<Doctors> doctorList;
	private String doctorName;
	private String doctorPhone;
	private Date createdDate;
	
	public void initializeDoctors() {
		System.out.println("****** Filter Data ******");
		System.out.println(doctorName);
		System.out.println(doctorPhone);
		System.out.println(createdDate);
		String createdDateStr = "";
		if(createdDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			createdDateStr = formatter.format(createdDate);
		}
		doctorList = DoctorManagementDAO.getAllDoctors(doctorName, doctorPhone, createdDateStr);
	}
	
	public String execute() {
		initializeDoctors();
		return "success";
	}

	public List<Doctors> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctors> doctorList) {
		this.doctorList = doctorList;
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
