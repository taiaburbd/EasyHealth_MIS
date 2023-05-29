package it.unicas.image.action;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.image.dao.MedicalImagingManagementDAO;
import it.unicas.image.pojo.MedicalImaging;
import org.apache.struts2.ServletActionContext;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RetinalBloodVesselSegmentationAction extends ActionSupport {
    private String imageId;
    private String imagePath;
    private String patientId;

    public String execute() throws Exception{
        System.out.println(imagePath);
        try {
            String directory="/Users/taiaburrahman/Desktop/S2-UNICAS/DPN/Projects/EasyHealth_MIS/web/directory/";
            // Load the retinal image
            BufferedImage image = ImageIO.read(new File(directory + imagePath));

            // Perform blood vessel segmentation
            BufferedImage segmentedImage = segmentBloodVessels(image);

            // Save the segmented image
            File outputImage = new File(directory+"segmented_image/RBVS/"+imagePath);

            ImageIO.write(segmentedImage, "jpg", outputImage);

            MedicalImaging imaging=new MedicalImaging(patientId,imageId, "Retinal Blood Vessel Segmentation", "segmented_image/RBVS/"+imagePath);
            int recordAdded= MedicalImagingManagementDAO.addData(imaging);

            System.out.println("Segmentation completed successfully.");


            return "redirectUrl";
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return ERROR;
        }
    }

    public static BufferedImage segmentBloodVessels(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        // Create a new image for segmented output
        BufferedImage segmented = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        // Perform blood vessel segmentation based on thresholding
        int threshold = 120; // Adjust this threshold value as needed

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixel = new Color(image.getRGB(x, y));
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // Convert to grayscale using luminosity method
                int grayValue = (int) (red * 0.21 + green * 0.71 + blue * 0.07);

                if (grayValue > threshold) {
                    segmented.setRGB(x, y, Color.WHITE.getRGB());
                } else {
                    segmented.setRGB(x, y, Color.BLACK.getRGB());
                }
            }
        }

        return segmented;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
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
}
