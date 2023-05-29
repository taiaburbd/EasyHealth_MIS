package it.unicas.image.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.image.dao.MedicalImagingManagementDAO;
import it.unicas.image.pojo.MedicalImaging;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Product;

public class ImageAnalysisAction extends ActionSupport{

	private String imageId;
	private String patientId;
	private String patientName;
	private String investigationType;
	private String imagePath;
	private String createdDate;
	
	public String execute() {
		System.out.println(imageId);
//		MedicalImaging image = MedicalImagingManagementDAO.getDataById(imageId);
//		productId = product.getProductId();
//		productName = product.getProductName();
//		productCategory = product.getProductCategory();
//		productPrice = product.getProductPrice();
//		createdDate = product.getCreatedDate();
		return "success";
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
}
