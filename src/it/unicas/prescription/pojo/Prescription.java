package it.unicas.prescription.pojo;

public class Prescription {

	private String prescriptionID;
	private String appointmentId;
	private String patientId;
	private String patientName;
	private String doctorId;

	private String doctorName;
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
		this.dm = historyDm;
		this.htn = htn;
		this.ihd = ihd;
		this.investigationType = investigationAdvice;
		this.treatmentPlan = treatmentPlan;
		this.doctorNote = doctorNote;
		this.status = status;
	}
	public Prescription(String prescriptionID,
						String appointmentId,
						String patientId,
						String patientName,
						String doctorId,
						String doctorName,
						String createDate,
						String status) {
		super();
		this.prescriptionID = prescriptionID;
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.createDate = createDate;
		this.status = status;

	}
	public Prescription(String prescriptionID,
						String appointmentId,
						String patientId,
						String patientName,
						String treatmentPlan,
						String createDate,
						String status) {
		super();
		this.prescriptionID = prescriptionID;
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.treatmentPlan = treatmentPlan;
		this.createDate = createDate;
		this.status = status;

	}
	public Prescription(
						String appointmentId,
						String patientId,
						String doctorId,
						String dm,
						String htn,
						String ihd,
						String ckd,
						String cabg,
						String stenting,
						String antiCoagulaut,
						String bep,
						String thyroid,
						String paceMacker,
						String medicineType,
						String medicineName,
						String medicineDose,
						String medicineDuration,
						String investigationType,
						String treatmentPlan,
						String doctorNote){
		super();
		this.appointmentId =appointmentId;
		this.patientId =patientId;
		this.doctorId =doctorId;
		this.dm =dm;
		this.htn=htn;
		this.ihd=ihd;
		this.ckd=ckd;
		this.cabg=cabg;
		this.stenting=stenting;
		this.antiCoagulaut=antiCoagulaut;
		this.bep=bep;
		this.thyroid=thyroid;
		this.paceMacker=paceMacker;
		this.medicineType=medicineType;
		this.medicineName=medicineName;
		this.medicineDose=medicineDose;
		this.medicineDuration=medicineDuration;
		this.investigationType=investigationType;
		this.treatmentPlan=treatmentPlan;
		this.doctorNote=doctorNote;
	}
	public Prescription(
			String dm,
			String htn,
			String ihd,
			String ckd,
			String cabg,
			String stenting,
			String antiCoagulaut,
			String bep,
			String thyroid,
			String paceMacker,
			String medicineType,
			String medicineName,
			String medicineDose,
			String medicineDuration,
			String investigationType,
			String treatmentPlan,
			String doctorNote,
			String createDate){
		super();
		this.dm =dm;
		this.htn=htn;
		this.ihd=ihd;
		this.ckd=ckd;
		this.cabg=cabg;
		this.stenting=stenting;
		this.antiCoagulaut=antiCoagulaut;
		this.bep=bep;
		this.thyroid=thyroid;
		this.paceMacker=paceMacker;
		this.medicineType=medicineType;
		this.medicineName=medicineName;
		this.medicineDose=medicineDose;
		this.medicineDuration=medicineDuration;
		this.investigationType=investigationType;
		this.treatmentPlan=treatmentPlan;
		this.doctorNote=doctorNote;
		this.createDate=createDate;
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Prescription{" +
				"prescriptionID='" + prescriptionID + '\'' +
				", appointmentId='" + appointmentId + '\'' +
				", patientId='" + patientId + '\'' +
				", patientName='" + patientName + '\'' +
				", doctorId='" + doctorId + '\'' +
				", doctorName='" + doctorName + '\'' +
				", dm='" + dm + '\'' +
				", htn='" + htn + '\'' +
				", ihd='" + ihd + '\'' +
				", ckd='" + ckd + '\'' +
				", cabg='" + cabg + '\'' +
				", stenting='" + stenting + '\'' +
				", antiCoagulaut='" + antiCoagulaut + '\'' +
				", bep='" + bep + '\'' +
				", thyroid='" + thyroid + '\'' +
				", paceMacker='" + paceMacker + '\'' +
				", medicineType='" + medicineType + '\'' +
				", medicineName='" + medicineName + '\'' +
				", medicineDose='" + medicineDose + '\'' +
				", medicineDuration='" + medicineDuration + '\'' +
				", investigationType='" + investigationType + '\'' +
				", treatmentPlan='" + treatmentPlan + '\'' +
				", doctorNote='" + doctorNote + '\'' +
				", createDate='" + createDate + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
