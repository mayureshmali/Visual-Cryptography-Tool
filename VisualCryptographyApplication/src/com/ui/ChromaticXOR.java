package com.ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChromaticXOR {
	
	private static BufferedImage img;

    public static String caller(String p1,String p2,String filedir,String filename1) throws IOException 
    {
        BufferedImage imgA = ImageIO.read(new File(p1));
        BufferedImage imgB = ImageIO.read(new File(p2));
       img=xorEffect(imgA,imgB);
        String path=filedir+"/"+filename1+"_finalres.png";
        writeImage1(path);
        return path;

    }

    private static void writeImage1(String output) throws IOException {
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

public static String caller(String p1,String p2,String p3,String filedir,String filename2) throws IOException 
{

    BufferedImage imgA = ImageIO.read(new File(p1));
    BufferedImage imgB = ImageIO.read(new File(p2));
    BufferedImage imgC = ImageIO.read(new File(p3));
   img=xorEffect(imgA,imgB,imgC);
   String path=filedir+"/"+filename2+"_finalres.png";
    writeImage2(path);
    return path;         

}

private static void writeImage2(String output) throws IOException {
   // File file = new File(output+".png");
    ImageIO.write(img, "PNG",new File(output));
}

public static BufferedImage xorEffect(BufferedImage imageA, BufferedImage imageB,BufferedImage imageC) {
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
           int pixelC =imageC.getRGB(x,y);
           int pixelXOR = pixelA | pixelB | pixelC;
           img.setRGB(x, y, pixelXOR);
        }
    }
    return img;
    }

public static String caller(String p1,String p2,String p3,String p4,String filedir,String filename3) throws IOException 
{

    BufferedImage imgA = ImageIO.read(new File(p1));
    BufferedImage imgB = ImageIO.read(new File(p2));
    BufferedImage imgC = ImageIO.read(new File(p3));
    BufferedImage imgD = ImageIO.read(new File(p4));
   img=xorEffect(imgA,imgB,imgC,imgD);
   String path=filedir+"/"+filename3+"_finalres.png";
    writeImage3(path);
    return path;         

}

private static void writeImage3(String output) throws IOException {
   // File file = new File(output+".png");
    ImageIO.write(img, "PNG",new File(output));
}

public static BufferedImage xorEffect(BufferedImage imageA, BufferedImage imageB,BufferedImage imageC,BufferedImage imageD) {
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
           int pixelC = imageC.getRGB(x, y);
           int pixelD = imageD.getRGB(x, y);
          
           int pixelXOR = pixelA | pixelB | pixelC |pixelD ;
           img.setRGB(x, y, pixelXOR);
        }
    }
    return img;
    }

public static String caller(String p1,String p2,String p3,String p4,String p5,String filedir,String filename4) throws IOException 
{

    BufferedImage imgA = ImageIO.read(new File(p1));
    BufferedImage imgB = ImageIO.read(new File(p2));
    BufferedImage imgC = ImageIO.read(new File(p3));
    BufferedImage imgD = ImageIO.read(new File(p4));
    BufferedImage imgE = ImageIO.read(new File(p5));
    img=xorEffect(imgA,imgB,imgC,imgD,imgE);
    String path=filedir+"/"+filename4+"_finalres.png";
    writeImage4(path);
    return path;         

}

private static void writeImage4(String output) throws IOException {
   // File file = new File(output+".png");
    ImageIO.write(img, "PNG",new File(output));
}

public static BufferedImage xorEffect(BufferedImage imageA, BufferedImage imageB,BufferedImage imageC,BufferedImage imageD,BufferedImage imageE) {
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
           int pixelC = imageC.getRGB(x, y);
           int pixelD = imageD.getRGB(x, y);
           int pixelE = imageE.getRGB(x, y);
           int pixelXOR = pixelA | pixelB | pixelC |pixelD | pixelE;
           img.setRGB(x, y, pixelXOR);
        }
    }
    return img;
    }
}
