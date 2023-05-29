package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.products.dao.ProductManagementDAO;

public class DeletePatientAction extends ActionSupport{

	private String patientId;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = PatientManagementDAO.deletePatient(patientId);
		if (recordDeleted == 1) {
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
}
