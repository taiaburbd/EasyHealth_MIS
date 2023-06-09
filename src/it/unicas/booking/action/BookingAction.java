package it.unicas.booking.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.appointment.dao.AppointmentManagementDAO;
import it.unicas.doctor.dao.DoctorManagementDAO;
import it.unicas.appointment.pojo.Appointment;
import it.unicas.doctor.pojo.Doctors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BookingAction extends ActionSupport {

    private List<Doctors> doctorList;
    private String doctorName;
    private String doctorPhone;
    private Date createdDate;

    private String patientId;
    private String patientName;
    private String patientPhone;
    private String patientEmail;
    private String patientBloodGroup;
    private String patientDOB;
    private String patientGender;
    private String patientInfo;

    private List<Appointment> appointmentList;

    public void initializeDoctors() {
        String createdDateStr = "";
        if (createdDate != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            createdDateStr = formatter.format(createdDate);
        }
        doctorList = DoctorManagementDAO.getAllDoctors(doctorName, doctorPhone, createdDateStr);
    }

    public void checkAppointment() {
        appointmentList = AppointmentManagementDAO.getPatientAppointment(patientEmail, patientPhone);
    }


    public String execute() {
        initializeDoctors();
        checkAppointment();
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

    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
