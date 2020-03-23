package com.ui;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class VisCrypt 
{
	int width,height;
	public void getImage(String og,String filedirc,String filename)throws Exception
	{
		BufferedImage image = ImageIO.read(new File(og)) ;
		BufferedImage sh1,sh2;
		File f1=new File(filedirc+"/"+filename+"_share1.png");
		File f2=new File(filedirc+"/"+filename+"_share2.png");
		sh1=null;
		sh2=null;
		width=image.getWidth();
		height=image.getHeight();
		System.out.println("Height = "+height+"\n width="+width);
		sh1=new BufferedImage((width*2), height, BufferedImage.TYPE_BYTE_GRAY);
		sh2=new BufferedImage((width*2), height, BufferedImage.TYPE_BYTE_GRAY);
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(image.getRGB(i,j)==(-1))
				{
					if((i+j)%2==0)
					{
					sh1.setRGB((2*i),(j),(-1));
					sh1.setRGB(((2*i)+1),(j),6777216);
					sh2.setRGB((2*i),(j),(-1));
					sh2.setRGB(((2*i)+1),(j),6777216);
					}
					else
					{
						sh1.setRGB((2*i),(j),6777216);
						sh1.setRGB(((2*i)+1),(j),(-1));
						sh2.setRGB((2*i),(j),6777216);
						sh2.setRGB(((2*i)+1),(j),(-1));
						
					}
				}
					
				else
				{
					if((i+j)%2==0)
					{
					sh1.setRGB((2*i),(j),(-1));
					sh1.setRGB(((2*i)+1),(j),6777216);
					sh2.setRGB((2*i),(j),6777216);
					sh2.setRGB(((2*i)+1),(j),(-1));
					}
					else
					{
						sh1.setRGB((2*i),(j),6777216);
						sh1.setRGB(((2*i)+1),(j),(-1));
						sh2.setRGB((2*i),(j),(-1));
						sh2.setRGB(((2*i)+1),(j),6777216);
					}
				}
			}
			
		}

		ImageIO.write(sh1,"png",f1);
		ImageIO.write(sh2,"png",f2);
	}


/*
	
	public void merge()throws Exception
	{
		
		//String path = "D:/BE PROJECT/VisCrypt"; // base path of the images

		// load source images
		BufferedImage s1 = ImageIO.read(new File("D:/BE PROJECT/VisCrypt/s1.png"));
		BufferedImage s2 = ImageIO.read(new File("D:/BE PROJECT/VisCrypt/s2.png"));

		
		// create the new image, canvas size is the max. of both image sizes
		int w = Math.max(s1.getWidth(), s2.getWidth());
		int h = Math.max(s1.getHeight(), s2.getHeight());
		BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

		// paint both images, preserving the alpha channels
		Graphics g = combined.getGraphics();
		g.drawImage(s1, 0, 0, null);
		g.drawImage(s2, 0, 0, null);
//String path="D:/BE PROJECT/VisCrypt/combined.bmp";
		// Save as new image
		ImageIO.write(combined, "PNG", new File("D:/BE PROJECT/VisCrypt/combined.png"));
		System.out.println("test Ok");
	}
	
*/	
		
	}
		





