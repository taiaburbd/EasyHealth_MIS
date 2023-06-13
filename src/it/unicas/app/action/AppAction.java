package it.unicas.app.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.app.dao.AppManagementDAO;

public class AppAction extends ActionSupport {
    private String totalPatients;
    private String totalAppointment;
    private String totalProcessImages;

    public String execute() {
        totalPatients =AppManagementDAO.getTotalpatients().getTotalValues();
        totalAppointment =AppManagementDAO.getTotalAppointment().getTotalValues();
        totalProcessImages =AppManagementDAO.getTotalProcessImages().getTotalValues();
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
}
