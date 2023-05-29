package it.unicas.booking.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.appointment.dao.AppointmentManagementDAO;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.appointment.pojo.Appointment;
import it.unicas.patients.pojo.Patients;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingAddAction extends ActionSupport {

    private String patientId;
    private String patientName;
    private String patientPhone;
    private String patientEmail;
    private String patientBloodGroup;
    private String patientDOB;
    private String patientGender;
    private String createdDate;
    private String doctorId;
    private String appointmentDate;
    private String timeslot;
    private String returnUrl;

    public String execute() {
        String statusCode = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String createdDateStr = formatter.format(new Date());
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("yyMMddms");

        String stringDate = DateFor.format(date);
        String genPatientId = "P" + stringDate;
        setPatientId(genPatientId);
        Patients patient = new Patients(getPatientId(), patientName, patientPhone, patientEmail, patientBloodGroup, createdDateStr, patientGender, createdDateStr);
        int recordAdded = PatientManagementDAO.addPatient(patient);


        if (recordAdded == 1) {
            String appointmentDateStr = createdDateStr;
            Appointment appointment = new Appointment(patientId, doctorId, appointmentDateStr, timeslot);
            AppointmentManagementDAO.addAppointment(appointment);
            statusCode = ActionSupport.SUCCESS;
        } else {
            statusCode = ActionSupport.ERROR;
        }
        returnUrl = "?patientEmail=" + patientEmail + "&patientPhone=" + patientPhone;
        return SUCCESS;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
}
