package it.unicas.patients.pojo;


public class Patients {

	private String patientId;
	private String patientName;
	private String patientPhone;
	private String patientEmail;
	private String patientBloodGroup;
	private String patientDOB;
	private String patientAge;
	private String patientGender;
	private String createdDate;
	
	public Patients() {
		// TODO Auto-generated constructor stub
	}

	public Patients(String patientId, String patientName, String patientPhone, String patientEmail, String patientBloodGroup, String patientDOB, String patientGender,
					String createdDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPhone = patientPhone;
		this.patientEmail = patientEmail;
		this.patientBloodGroup = patientBloodGroup;
		this.patientDOB = patientDOB;
		this.patientGender = patientGender;
		this.createdDate = createdDate;
	}

	public String getPatientIdId() {
		return patientId;
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

	public String getPatientAge() {
		String birthday = this.patientDOB;

		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		patientAge="20";
		this.patientAge = patientAge;
	}

	@Override
	public String toString() {
		return "Patients{" +
				"patientId='" + patientId + '\'' +
				", patientName='" + patientName + '\'' +
				", patientPhone='" + patientPhone + '\'' +
				", patientEmail='" + patientEmail + '\'' +
				", patientBloodGroup='" + patientBloodGroup + '\'' +
				", patientDOB='" + patientDOB + '\'' +
				", patientAge='" + patientAge + '\'' +
				", patientGender='" + patientGender + '\'' +
				", createdDate='" + createdDate + '\'' +
				'}';
	}
}
