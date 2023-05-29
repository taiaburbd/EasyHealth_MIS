package it.unicas.prescription.action;

import it.unicas.prescription.dao.PrescriptionManagementDAO;
import it.unicas.prescription.pojo.Prescription;
import java.util.List;

public class PrescriptionAction {

    private List<Prescription> prescriptionList;
    private String patientId;
    private String status;

    public void initializeData() {
        System.out.println("****** Filter Data ******");
        System.out.println(patientId);
        System.out.println(status);
        prescriptionList = PrescriptionManagementDAO.getAllData(patientId, status);

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
