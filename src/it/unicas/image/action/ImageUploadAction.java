package it.unicas.image.action;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import it.unicas.image.dao.MedicalImagingManagementDAO;
import it.unicas.image.pojo.MedicalImaging;
import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class ImageUploadAction extends ActionSupport {
    private File imageFile;
    private String imageFileFileName;
    private String imageFileContentType;

    private String investigationType;
    private String patientId;

    // Setters for the file properties
    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public void setImageFileFileName(String imageFileFileName) {
        this.imageFileFileName = imageFileFileName;
    }

    public void setImageFileContentType(String imageFileContentType) {
        this.imageFileContentType = imageFileContentType;
    }

    // Action method to handle the image upload
    public String execute() throws IOException {
        // Define the directory to save the uploaded images
        String saveDirectory = "/Users/taiaburrahman/Desktop/S2-UNICAS/DPN/Projects/EasyHealth_MIS/web/directory/";

        setPatientId(splitPatientId(imageFileFileName));
        imageFileFileName=generateUniqueFileName(imageFileFileName);

        // Create a new File object with the save directory and the uploaded file name
        File destFile = new File(saveDirectory, imageFileFileName);

        // Copy the uploaded file to the destination file
        FileUtils.copyFile(imageFile, destFile);

        MedicalImaging imaging=new MedicalImaging(patientId,"0", investigationType, imageFileFileName);
        int recordAdded=MedicalImagingManagementDAO.addData(imaging);

        // Display a success message

        addActionMessage("Image uploaded successfully!");

        return SUCCESS;
    }
    private String generateUniqueFileName(String originalFileName) {
        String uniqueID = UUID.randomUUID().toString();
        String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        return uniqueID + extension;
    }
    private static String splitPatientId(String fileName) {
        File file = new File(fileName);
        String name = file.getName();
        int dotIndex = name.lastIndexOf(".");
        if (dotIndex > 0 && dotIndex < name.length() - 1) {
            return name.substring(0, dotIndex);
        }
        return name;
    }

    public File getImageFile() {
        return imageFile;
    }

    public String getImageFileFileName() {
        return imageFileFileName;
    }

    public String getImageFileContentType() {
        return imageFileContentType;
    }

    public String getInvestigationType() {
        return investigationType;
    }

    public void setInvestigationType(String investigationType) {
        this.investigationType = investigationType;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
