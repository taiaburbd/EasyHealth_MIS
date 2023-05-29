package it.unicas.image.pojo;

public class MedicalImaging {

	private String imageId;

	//	Generated image saving for sibling/parenting id
	private String imageIdParents;
	private String patientId;
	private String patientName;
	private String investigationType;
	private String imagePath;
	private String createdDate;
	
	public MedicalImaging() {
		// TODO Auto-generated constructor stub
	}

	public MedicalImaging(String imageId,
						  String imageIdParents,
						  String patientId,
						  String patientName,
						  String investigationType,
						  String imagePath,
						  String createdDate) {
		super();
		this.imageId = imageId;
		this.imageIdParents = imageIdParents;
		this.patientId = patientId;
		this.patientName=patientName;
		this.investigationType = investigationType;
		this.imagePath = imagePath;
		this.createdDate = createdDate;
	}
	public MedicalImaging(String imageId,
						  String patientId,
						  String investigationType,
						  String imagePath,
						  String createdDate) {
		super();
		this.imageId = imageId;
		this.patientId = patientId;
		this.investigationType = investigationType;
		this.imagePath = imagePath;
		this.createdDate = createdDate;
	}
	public MedicalImaging(String patientId,
						  String imageIdParents,
						  String investigationType,
						  String imagePath
						  ) {
		super();
		this.imageIdParents = imageIdParents;
		this.patientId = patientId;
		this.investigationType = investigationType;
		this.imagePath = imagePath;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
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

	public String getInvestigationType() {
		return investigationType;
	}

	public void setInvestigationType(String investigationType) {
		this.investigationType = investigationType;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getImageIdParents() {
		return imageIdParents;
	}

	public void setImageIdParents(String imageIdParents) {
		this.imageIdParents = imageIdParents;
	}

	@Override
	public String toString() {
		return "MedicalImaging{" +
				"imageId='" + imageId + '\'' +
				", pImageId='" + imageIdParents + '\'' +
				", patientId='" + patientId + '\'' +
				", patientName='" + patientName + '\'' +
				", investigationType='" + investigationType + '\'' +
				", imagePath='" + imagePath + '\'' +
				", createdDate='" + createdDate + '\'' +
				'}';
	}
}
