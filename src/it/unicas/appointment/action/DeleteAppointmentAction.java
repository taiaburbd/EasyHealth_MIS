package it.unicas.appointment.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.appointment.dao.AppointmentManagementDAO;


public class DeleteAppointmentAction extends ActionSupport{

	private String appointmentId;
	
	public String execute() {
		String statusCode = "";
		int recordDeleted = AppointmentManagementDAO.deleteAppointment(appointmentId);
		if (recordDeleted == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

}
