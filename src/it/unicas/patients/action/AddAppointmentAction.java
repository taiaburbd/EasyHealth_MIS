package it.unicas.patients.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.patients.dao.AppointmentManagementDAO;
import it.unicas.patients.pojo.Appointment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddAppointmentAction extends ActionSupport {

    private String patientId;
    private String doctorId;
    private String appointmentDate;
    private String timeSlot;

    public String execute() {
        String statusCode = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String appointmentDateStr = formatter.format(new Date());

        System.out.println(doctorId);
        System.out.println(timeSlot);
        System.out.println(appointmentDate);
        System.out.println(appointmentDateStr);
        Appointment appointment = new Appointment(patientId, doctorId, appointmentDateStr, timeSlot);
        int recordAdded = AppointmentManagementDAO.addAppointment(appointment);

        System.out.println(recordAdded);

        if (recordAdded == 1) {
            statusCode = ActionSupport.SUCCESS;
        } else {
            statusCode = ActionSupport.ERROR;
        }
        return statusCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
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

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
