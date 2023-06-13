package it.unicas.prescription.action;

import it.unicas.prescription.dao.PrescriptionManagementDAO;
import it.unicas.prescription.pojo.Prescription;

import java.util.List;

public class TreatmentAction {

    private List<Prescription> prescriptionList;
    private String patientId;
    private String status;

    public void initializeData() {
        prescriptionList = PrescriptionManagementDAO.getTreatmentData(patientId, status);
        System.out.println(prescriptionList);
    }

    public String execute() {
        initializeData();
        return "success";
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
