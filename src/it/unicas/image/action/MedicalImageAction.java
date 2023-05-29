package it.unicas.image.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.image.dao.MedicalImagingManagementDAO;
import it.unicas.image.pojo.MedicalImaging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MedicalImageAction extends ActionSupport{
	
	private List<MedicalImaging> imageList;
	private String patientName;
	private String investigationType;
	private Date createdDate;
	
	public void initializePatients() {
		System.out.println("****** Filter Data ******");

		String createdDateStr = "";
		if(createdDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
			createdDateStr = formatter.format(createdDate);
		}
		imageList = MedicalImagingManagementDAO.getAlldata(patientName, investigationType, createdDateStr);
	}
	
	public String execute() {
		initializePatients();
		return "success";
	}

	public List<MedicalImaging> getImageList() {
		return imageList;
	}

	public void setImageList(List<MedicalImaging> imageList) {
		this.imageList = imageList;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
