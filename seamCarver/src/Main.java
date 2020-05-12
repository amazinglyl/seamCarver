import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String...args){
        String filename = "C:\\Users\\lyl\\Desktop\\Capture.png";
//        try {
//            File file = new File(filename);
//            BufferedImage image = ImageIO.read(file);
//            double[][] energy = Energy.energy(image);
//            int a=0;
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
        SeamCarver carver=new SeamCarver(filename);

        int seamH=0;
        int seamV=30;

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
