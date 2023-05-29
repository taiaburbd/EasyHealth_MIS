package it.unicas.doctor.pojo;

public class Doctors {

	private String doctorId;
	private String doctorName;
	private String doctorPhone;
	private String doctorEmail;
	private String createdDate;

	public Doctors() {
		// TODO Auto-generated constructor stub
	}
	public Doctors(String doctorName, String doctorPhone, String doctorEmail) {
		super();
		this.doctorName = doctorName;
		this.doctorPhone = doctorPhone;
		this.doctorEmail = doctorEmail;
	}

	public Doctors(String doctorId, String doctorName, String doctorPhone, String doctorEmail,
                   String createdDate) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorPhone = doctorPhone;
		this.doctorEmail = doctorEmail;
		this.createdDate = createdDate;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Doctors{" +
				"doctorId='" + doctorId + '\'' +
				", doctorName='" + doctorName + '\'' +
				", doctorPhone='" + doctorPhone + '\'' +
				", doctorEmail='" + doctorEmail + '\'' +
				", createdDate='" + createdDate + '\'' +
				'}';
	}
}
