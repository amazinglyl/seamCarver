import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String...args){
        String filename = "C:\\Users\\lyl\\Desktop\\Capture.png";
        SeamCarver carver=new SeamCarver(filename);

        int seamH=2;
        int seamV=2;

        BufferedImage image = carver.seamCarver(seamH,seamV);

        try
        {
            // Output file path
            File output_file = new File("C:\\Users\\lyl\\Desktop\\Out.png");

            // Writing to file taking type and path as
            ImageIO.write(image,"png",output_file);

            System.out.println("Writing complete.");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
    }
}
