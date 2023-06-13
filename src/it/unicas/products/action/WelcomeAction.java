package it.unicas.products.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import it.unicas.app.dao.AppManagementDAO;
import it.unicas.app.pojo.App;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Product;

public class WelcomeAction extends ActionSupport{
	private String totalPatients;
	private String totalAppointment;
	private String totalProcessImages;

	private String totalUsers;

	public String execute() {
		totalPatients = AppManagementDAO.getTotalpatients().getTotalValues();
		totalAppointment =AppManagementDAO.getTotalAppointment().getTotalValues();
		totalProcessImages =AppManagementDAO.getTotalProcessImages().getTotalValues();
		totalUsers= AppManagementDAO.getTotalUsers().getTotalValues();
		return SUCCESS;
	}

	public String getTotalPatients() {
		return totalPatients;
	}

	public void setTotalPatients(String totalPatients) {
		this.totalPatients = totalPatients;
	}

	public String getTotalAppointment() {
		return totalAppointment;
	}

	public void setTotalAppointment(String totalAppointment) {
		this.totalAppointment = totalAppointment;
	}

	public String getTotalProcessImages() {
		return totalProcessImages;
	}

	public void setTotalProcessImages(String totalProcessImages) {
		this.totalProcessImages = totalProcessImages;
	}

	public String getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(String totalUsers) {
		this.totalUsers = totalUsers;
	}
}
