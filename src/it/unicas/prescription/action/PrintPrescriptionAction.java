package it.unicas.prescription.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.appointment.dao.AppointmentManagementDAO;
import it.unicas.appointment.pojo.Appointment;
import it.unicas.doctor.dao.DoctorManagementDAO;
import it.unicas.doctor.pojo.Doctors;
import it.unicas.patients.dao.PatientManagementDAO;
import it.unicas.patients.pojo.Patients;
import it.unicas.prescription.dao.PrescriptionManagementDAO;
import it.unicas.prescription.pojo.Prescription;

import java.util.Date;

public class PrintPrescriptionAction extends ActionSupport {

    private String prescriptionId;
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private String patientName;
    private String patientPhone;
    private String patientEmail;
    private String patientBloodGroup;
    private String patientDOB;
    private String patientSex;
    private String appointmentDate;
    private String timeslot;

    private String doctorName;
    private String doctorPhone;
    private String doctorEmail;

    private String dm;
    private String htn;
    private String ihd;
    private String ckd;
    private String cabg;
    private String stenting;
    private String antiCoagulaut;
    private String bep;
    private String thyroid;
    private String paceMacker;
    private String medicineType;
    private String medicineName;
    private String medicineDose;
    private String medicineDuration;
    private String investigationType;
    private String treatmentPlan;
    private String doctorNote;

    private String createdDate;

    public void initializeData() {
        Patients patient = PatientManagementDAO.getPatinetById(patientId);
        patientId = patient.getPatientId();
        patientName = patient.getPatientName();
        patientPhone = patient.getPatientPhone();

        patientEmail = patient.getPatientEmail();
        patientBloodGroup = patient.getPatientBloodGroup();
        patientDOB = patient.getPatientDOB();
        patientSex = patient.getPatientGender();

    }

    public void initializeDoctors() {
        Doctors doctor = DoctorManagementDAO.getDoctorById(doctorId);
        doctorId = doctor.getDoctorId();
        doctorName = doctor.getDoctorName();
        doctorPhone = doctor.getDoctorPhone();
        doctorEmail = doctor.getDoctorEmail();
    }
    public void initializeAppointment() {
        Appointment appointment= AppointmentManagementDAO.getAppointmentById(appointmentId);
        appointmentDate = appointment.getAppointmentDate();
        timeslot=appointment.getTimeslot();
    }
    public void initializePrescription() {
        Prescription prescription= PrescriptionManagementDAO.getDataById(prescriptionId);
        dm=prescription.getDm();
        htn=prescription.getHtn();
        ihd=prescription.getIhd();
        ckd=prescription.getCkd();
        cabg=prescription.getCabg();
        stenting=prescription.getStenting();
        antiCoagulaut=prescription.getAntiCoagulaut();
        bep=prescription.getBep();
        thyroid=prescription.getThyroid();
        paceMacker=prescription.getPaceMacker();
        medicineType=prescription.getMedicineType();
        medicineName=prescription.getMedicineName();
        medicineDose=prescription.getMedicineDose();
        medicineDuration=prescription.getMedicineDuration();
        investigationType=prescription.getInvestigationType();
        treatmentPlan=prescription.getTreatmentPlan();
        doctorNote=prescription.getDoctorNote();
        createdDate=prescription.getCreateDate();
    }


    public String execute() {
        initializeData();
        initializeDoctors();
        initializeAppointment();
        initializePrescription();
        return "success";
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
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

    public String getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
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

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getHtn() {
        return htn;
    }

    public void setHtn(String htn) {
        this.htn = htn;
    }

    public String getIhd() {
        return ihd;
    }

    public void setIhd(String ihd) {
        this.ihd = ihd;
    }

    public String getCkd() {
        return ckd;
    }

    public void setCkd(String ckd) {
        this.ckd = ckd;
    }

    public String getCabg() {
        return cabg;
    }

    public void setCabg(String cabg) {
        this.cabg = cabg;
    }

    public String getStenting() {
        return stenting;
    }

    public void setStenting(String stenting) {
        this.stenting = stenting;
    }

    public String getAntiCoagulaut() {
        return antiCoagulaut;
    }

    public void setAntiCoagulaut(String antiCoagulaut) {
        this.antiCoagulaut = antiCoagulaut;
    }

    public String getBep() {
        return bep;
    }

    public void setBep(String bep) {
        this.bep = bep;
    }

    public String getThyroid() {
        return thyroid;
    }

    public void setThyroid(String thyroid) {
        this.thyroid = thyroid;
    }

    public String getPaceMacker() {
        return paceMacker;
    }

    public void setPaceMacker(String paceMacker) {
        this.paceMacker = paceMacker;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineDose() {
        return medicineDose;
    }

    public void setMedicineDose(String medicineDose) {
        this.medicineDose = medicineDose;
    }

    public String getMedicineDuration() {
        return medicineDuration;
    }

    public void setMedicineDuration(String medicineDuration) {
        this.medicineDuration = medicineDuration;
    }

    public String getInvestigationType() {
        return investigationType;
    }

    public void setInvestigationType(String investigationType) {
        this.investigationType = investigationType;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getDoctorNote() {
        return doctorNote;
    }

    public void setDoctorNote(String doctorNote) {
        this.doctorNote = doctorNote;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}

