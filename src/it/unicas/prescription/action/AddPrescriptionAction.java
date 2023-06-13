package it.unicas.prescription.action;

        import com.opensymphony.xwork2.ActionSupport;
        import it.unicas.app.pojo.App;
        import it.unicas.appointment.dao.AppointmentManagementDAO;
        import it.unicas.doctor.dao.DoctorManagementDAO;
        import it.unicas.appointment.pojo.Appointment;
        import it.unicas.doctor.pojo.Doctors;
        import it.unicas.patients.dao.PatientManagementDAO;
        import it.unicas.patients.pojo.Patients;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.List;

public class AddPrescriptionAction extends ActionSupport {

    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String patientName;
    private String patientPhone;
    private String patientEmail;
    private String patientBloodGroup;
    private String appointmentDate;
    private String timeslot;

    private String doctorName;
    private String doctorPhone;
    private Date createdDate;

    public void initializeData() {
        Patients patient = PatientManagementDAO.getPatinetById(patientId);
        patientId = patient.getPatientId();
        patientName = patient.getPatientName();
        patientPhone = patient.getPatientPhone();
        patientEmail = patient.getPatientEmail();
        patientBloodGroup = patient.getPatientBloodGroup();

    }

    public void initializeDoctors() {
        Doctors doctor = DoctorManagementDAO.getDoctorById(doctorId);
        doctorId = doctor.getDoctorId();
        doctorName = doctor.getDoctorName();
        doctorPhone = doctor.getDoctorPhone();
    }
    public void initializeAppointment() {
        Appointment appointment= AppointmentManagementDAO.getAppointmentById(appointmentId);
        appointmentDate = appointment.getAppointmentDate();
        timeslot=appointment.getTimeslot();
    }

    public String execute() {
        initializeData();
        initializeDoctors();
        initializeAppointment();
        return "success";
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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
}

