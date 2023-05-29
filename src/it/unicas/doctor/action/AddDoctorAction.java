package it.unicas.doctor.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.doctor.dao.DoctorManagementDAO;
import it.unicas.doctor.pojo.Doctors;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.patients.pojo.Patients;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddDoctorAction extends ActionSupport {

    private String doctorId;
    private String doctorName;
    private String doctorPhone;
    private String doctorEmail;
    private Date createdDate;

    public String execute() {
        String statusCode = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String createdDateStr = formatter.format(new Date());

        Doctors doctors = new Doctors(doctorId,doctorName, doctorPhone, doctorEmail,createdDateStr);

        int recordAdded = DoctorManagementDAO.addDoctor(doctors);

        if (recordAdded == 1) {
            statusCode = ActionSupport.SUCCESS;
        } else {
            statusCode = ActionSupport.ERROR;
        }
        return SUCCESS;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
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

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
