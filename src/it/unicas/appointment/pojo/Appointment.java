package it.unicas.appointment.pojo;

public class Appointment {

	private String appointmentId;
	private String patientId;
	private String patientName;

	private String doctorId;
	private String doctorName;
	private String appointmentDate;
	private String timeslot;

	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public Appointment(String appointmentId, String patientId,String patientName, String doctorName, String appointmentDate,String timeslot) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.timeslot = timeslot;
	}
	public Appointment(String appointmentId, String patientId,String patientName,String doctorId, String doctorName, String appointmentDate,String timeslot) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.timeslot = timeslot;
	}

	public Appointment(String patientId, String doctorId, String appointmentDate, String timeSlot) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.timeslot = timeSlot;
	}
	public Appointment(String appointmentId,String appointmentDate, String timeSlot) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.timeslot = timeSlot;
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

	@Override
	public String toString() {
		return "Appointment{" +
				"appointmentId='" + appointmentId + '\'' +
				", patientId='" + patientId + '\'' +
				", patientName='" + patientName + '\'' +
				", doctorId='" + doctorId + '\'' +
				", doctorName='" + doctorName + '\'' +
				", appointmentDate='" + appointmentDate + '\'' +
				", timeslot='" + timeslot + '\'' +
				'}';
	}
}
