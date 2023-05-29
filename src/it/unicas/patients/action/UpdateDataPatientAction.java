package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.patients.pojo.Patients;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Product;

public class UpdateDataPatientAction extends ActionSupport{

	private String patientId;
	private String patientName;
	private String patientPhone;
	private String patientEmail;
	private String patientBloodGroup;
	private String patientDOB;
	private String patientGender;
	
	public String execute() {
		Patients patient = PatientManagementDAO.getPatinetById(patientId);
		patientId = patient.getPatientId();
		patientName = patient.getPatientName();
		patientPhone = patient.getPatientPhone();
		patientEmail = patient.getPatientEmail();
		patientBloodGroup = patient.getPatientBloodGroup();
		patientDOB = patient.getPatientDOB();
		patientGender = patient.getPatientGender();
		return "success";
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientBloodGroup() {
		return patientBloodGroup;
	}

	public void setPatientBloodGroup(String patientBloodGroup) {
		this.patientBloodGroup = patientBloodGroup;
	}

	public String getPatientDOB() {
		return patientDOB;
	}

	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
}
