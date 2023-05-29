package it.unicas.image.action;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import com.opensymphony.xwork2.ActionSupport;

//@Action(value = "imageAnalysis", results = { @Result(name = "success", location = "/result.jsp") })
public class MedicalImageAnalysisGenAction extends ActionSupport {
    private String message;
    private String imagePath;

    public String execute() throws Exception {
        try {
            // Load the image
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Perform image analysis
            int width = image.getWidth();
            int height = image.getHeight();
            int pixelCount = width * height;

            // Calculate the average RGB values
            long totalRed = 0;
            long totalGreen = 0;
            long totalBlue = 0;

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color pixel = new Color(image.getRGB(x, y));
                    totalRed += pixel.getRed();
                    totalGreen += pixel.getGreen();
                    totalBlue += pixel.getBlue();
                }
            }

            int avgRed = (int) (totalRed / pixelCount);
            int avgGreen = (int) (totalGreen / pixelCount);
            int avgBlue = (int) (totalBlue / pixelCount);

            // Generate a message with the average RGB values
            message = String.format("Average RGB values: Red=%d, Green=%d, Blue=%d", avgRed, avgGreen, avgBlue);

            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
