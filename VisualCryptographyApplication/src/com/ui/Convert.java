package com.ui;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


class Convert
{
    public static String caller(String path,String filedirc1,String filename)throws Exception
    {
        invertImage(path,filedirc1,filename);
        String pathfinal=filedirc1+"/"+filename+"_imagefinal.png";
        return(pathfinal);
        
    }

    public static void invertImage(String path,String filedirc1,String filename) {
        BufferedImage inputFile = null;
        try {
            inputFile = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int x = 0; x < inputFile.getWidth(); x++) {
            for (int y = 0; y < inputFile.getHeight(); y++) {
                int rgba = inputFile.getRGB(x, y);
                Color col = new Color(rgba, true);
                col = new Color(255 - col.getRed(),
                                255 - col.getGreen(),
                                255 - col.getBlue());
                inputFile.setRGB(x, y, col.getRGB());
            }
        }

        try {
            File outputFile = new File(filedirc1+"/"+filename+"_imagefinal.png");
            ImageIO.write(inputFile, "png", outputFile);
            	
            
        } catch (IOException e) {
            e.printStackTrace();
        }
      
    }
}