package com.ui;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class mergeXOR {

    private static BufferedImage img,imgEnhanced;

    public static String caller(String p1,String p2,String filedirc1,String filename) throws Exception 
    {

        BufferedImage imgA = ImageIO.read(new File(p1));
        BufferedImage imgB = ImageIO.read(new File(p2));
       img=xorEffect(imgA,imgB);
       //imgEnhanced=ImageEnhance(imgA,imgB);
        String path=filedirc1+"/"+filename+"_image.png";
        writeImage(path);
        Convert conv=new Convert();
        Convert.caller(path,filedirc1,filename);
		String s1=Convert.caller(path, filedirc1,filename);
        return (s1);         

    }

   

	private static void writeImage(String output) throws IOException {
       // File file = new File(output+".png");
        ImageIO.write(img, "PNG",new File(output));
    }

    public static BufferedImage xorEffect(BufferedImage imageA, BufferedImage imageB) {
        if (imageA.getWidth() != imageB.getWidth() ||
            imageA.getHeight() != imageB.getHeight())
        {
            throw new IllegalArgumentException("Dimensions are not the same!");
        }
        BufferedImage img = new BufferedImage(imageA.getWidth(),
                                              imageA.getHeight(),
                                              BufferedImage.TYPE_INT_ARGB_PRE);

        for (int y = 0; y < img.getHeight(); ++y) {
            for (int x = 0; x < img.getWidth(); ++x) {
               int pixelA = imageA.getRGB(x, y);
               int pixelB = imageB.getRGB(x, y);
               int pixelXOR = pixelA | pixelB;
               img.setRGB(x, y, pixelXOR);
            }
        }
        
       return img;
    }

}  
    
    
  /*  private static BufferedImage ImageEnhance(BufferedImage imageA, BufferedImage imageB) {
  	  if (imageA.getWidth() != imageB.getWidth() ||
  	            imageA.getHeight() != imageB.getHeight())
  	        {
  	            throw new IllegalArgumentException("Dimensions are not the same!");
  	        }
  	        BufferedImage img1 = new BufferedImage(imageA.getWidth(),
  	                                              imageA.getHeight(),
  	                                              BufferedImage.TYPE_INT_ARGB_PRE);
  	        for (int x = 0; x < img1.getWidth(); x++) {
  	            for (int y = 0; y < img1.getHeight(); y++) {
  	                int rgba = img1.getRGB(x, y);
  	                Color col = new Color(rgba, true);
  	                col = new Color(255 - col.getRed(),
  	                                255 - col.getGreen(),
  	                                255 - col.getBlue());
  	               img1.setRGB(x, y, col.getRGB());
  	            }
  	            }
  	   return img1;
	}
}
*/


