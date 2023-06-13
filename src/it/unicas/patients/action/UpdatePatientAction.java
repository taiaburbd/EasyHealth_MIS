package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.patients.pojo.Patients;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdatePatientAction extends ActionSupport{


	private String patientId;
	private String patientName;
	private String patientPhone;
	private String patientEmail;
	private String patientBloodGroup;
	private String patientDOB;
	private String patientGender;

	public String execute() {
		String statusCode = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String createdDateStr = formatter.format(new Date());
		Patients patient = new Patients(patientId, patientName, patientPhone, patientEmail,patientBloodGroup,createdDateStr,patientGender, createdDateStr);
//		System.out.println(patientId);
//		System.out.println(patient);
		int recordUpdated = PatientManagementDAO.updatePatient(patient);

		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
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
