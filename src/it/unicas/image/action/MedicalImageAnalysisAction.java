package it.unicas.image.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.image.dao.MedicalImagingManagementDAO;
import it.unicas.image.pojo.MedicalImaging;

import java.util.List;


public class MedicalImageAnalysisAction extends ActionSupport {

    private List<MedicalImaging> childImageList;
    private String imageId;
    private String imageIdParent;
    private String patientId;
    private String patientName;
    private String investigationType;
    private String imagePath;
    private String createdDate;

    public String execute() {
        MedicalImaging image = MedicalImagingManagementDAO.getDataById(imageId);
        childImageList = MedicalImagingManagementDAO.getChilddata(imageId);
        imageId = image.getImageId();
        imageIdParent = image.getImageIdParents();
        patientId = image.getPatientId();
        patientName = image.getPatientName();
        investigationType = image.getInvestigationType();
        imagePath = image.getImagePath();
        createdDate = image.getCreatedDate();

        System.out.println(childImageList);
        System.out.println(imageIdParent);
        return "success";
    }

    public List<MedicalImaging> getChildImageList() {
        return childImageList;
    }

    public void setChildImageList(List<MedicalImaging> childImageList) {
        this.childImageList = childImageList;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageIdParent() {
        return imageIdParent;
    }

    public void setImageIdParent(String imageIdParent) {
        this.imageIdParent = imageIdParent;
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
