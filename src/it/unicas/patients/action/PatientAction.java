package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.patients.pojo.Patients;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PatientAction extends ActionSupport{
	
	private List<Patients> patientList;
	private String patientName;
	private String patientPhone;
	private Date createdDate;
	
	public void initializePatients() {
		String createdDateStr = "";
		if(createdDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			createdDateStr = formatter.format(createdDate);
		}
		patientList = PatientManagementDAO.getAllPatients(patientName, patientPhone, createdDateStr);

	}
	
	public String execute() {
		initializePatients();
		return "success";
	}

	public List<Patients> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patients> patientList) {
		this.patientList = patientList;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
