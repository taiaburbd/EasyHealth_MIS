package it.unicas.prescription.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.appointment.dao.AppointmentManagementDAO;
import it.unicas.prescription.dao.PrescriptionManagementDAO;


public class DeletePrescriptionAction extends ActionSupport{

	private String prescriptionID;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = PrescriptionManagementDAO.deleteData(prescriptionID);
		if (recordDeleted == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public String getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
}
