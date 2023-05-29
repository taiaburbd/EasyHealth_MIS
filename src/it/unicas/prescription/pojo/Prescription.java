package it.unicas.prescription.pojo;

public class Prescription {

	private String prescriptionID;
	private String appointmentId;
	private String patientId;
	private String patientName;
	private String doctorName;
	private String historyDm;
	private String htn;
	private String ihd;
	private String investigationAdvice;
	private String treatmentPlan;
	private String doctorNote;
	private String createDate;
	private String status;

	public Prescription() {
		// TODO Auto-generated constructor stub
	}

	public Prescription(String prescriptionID,
						String appointmentId,
						String patientId,
						String historyDm,
						String htn,
						String ihd,
						String investigationAdvice,
						String treatmentPlan,
						String doctorNote,
						String status) {
		super();
		this.prescriptionID = prescriptionID;
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.historyDm = historyDm;
		this.htn = htn;
		this.ihd = ihd;
		this.investigationAdvice = investigationAdvice;
		this.treatmentPlan = treatmentPlan;
		this.doctorNote = doctorNote;
		this.status = status;
	}
	public Prescription(String prescriptionID,
						String appointmentId,
						String patientId,
						String patientName,
						String doctorName,
						String createDate,
						String status) {
		super();
		this.prescriptionID = prescriptionID;
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.createDate = createDate;
		this.status = status;

	}

	public String getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getHistoryDm() {
		return historyDm;
	}

	public void setHistoryDm(String historyDm) {
		this.historyDm = historyDm;
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

	public String getInvestigationAdvice() {
		return investigationAdvice;
	}

	public void setInvestigationAdvice(String investigationAdvice) {
		this.investigationAdvice = investigationAdvice;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Prescription{" +
				"prescriptionID='" + prescriptionID + '\'' +
				", appointmentId='" + appointmentId + '\'' +
				", patientId='" + patientId + '\'' +
				", patientName='" + patientName + '\'' +
				", doctorName='" + doctorName + '\'' +
				", historyDm='" + historyDm + '\'' +
				", htn='" + htn + '\'' +
				", ihd='" + ihd + '\'' +
				", investigationAdvice='" + investigationAdvice + '\'' +
				", treatmentPlan='" + treatmentPlan + '\'' +
				", doctorNote='" + doctorNote + '\'' +
				", createDate='" + createDate + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
