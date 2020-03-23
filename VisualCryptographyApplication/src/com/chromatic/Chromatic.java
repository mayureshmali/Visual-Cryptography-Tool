package com.chromatic;

import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Chromatic
{
	int width,height;
	
	/** This will get image path and process the original image to create multiple shares out of it
	 * @param originalImagePath
	 * @param shareOnePath
	 * @param shareTwoPath
	 * @throws Exception
	 */
	public void getImage(String originalImagePath, String shareOnePath, String shareTwoPath)throws Exception
	{
		BufferedImage image = ImageIO.read(new File( originalImagePath)); // "C:/Users/Pushkar/workspace/Chromatic1/samp.jpg"
		
		BufferedImage sh1,sh2;
		File f1=new File( shareOnePath);		// "s1.jpg");
		File f2=new File(shareTwoPath); 		// "s2.jpg");
		
//		File f3=new File("merge.jpg");
		sh1=null;
		sh2=null;
		width=image.getWidth();
		height=image.getHeight();
		System.out.println("Height = "+height+"\n width="+width);
		sh1=new BufferedImage((width), height, BufferedImage.TYPE_INT_RGB);
		sh2=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		/*for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				sh1.setRGB(i,j,6777216);
				sh2.setRGB(i,j,6777216);
			}
			}
			*/
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(((i+j)%2==0)&&((i+j)%3!=0))
				{
					sh1.setRGB(i,j,image.getRGB(i,j));
				}
				else
				{
					sh2.setRGB(i,j,image.getRGB(i,j));	
					
				}
				
			}
			
		}


		ImageIO.write(sh1,"jpg",f1);
		ImageIO.write(sh2,"jpg",f2);

	}
	
	public void getImage(String originalImagePath, String shareOnePath, String shareTwoPath, String shareThreePath)throws Exception
	{
BufferedImage image = ImageIO.read(new File( originalImagePath)); // "C:/Users/Pushkar/workspace/Chromatic1/samp.jpg"
		
		BufferedImage sh1,sh2,sh3;
		File f1=new File( shareOnePath);		// "s1.jpg");
		File f2=new File(shareTwoPath); 		// "s2.jpg");
		File f3=new File( shareThreePath);
//		File f3=new File("merge.jpg");
		sh1=null;
		sh2=null;
		sh3=null;
		width=image.getWidth();
		height=image.getHeight();
		System.out.println("Height = "+height+"\n width="+width);
		sh1=new BufferedImage((width), height, BufferedImage.TYPE_INT_RGB);
		sh2=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		/*for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				sh1.setRGB(i,j,6777216);
				sh2.setRGB(i,j,6777216);
			}
			}
			*/
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(((i+j)%2==0) && ((i+j)%4==0))
				{
					sh3.setRGB(i,j,image.getRGB(i,j));
				}
					else
					{
						if(((i+j)%2==0)&&((i+j)%3!=0))
						{
							sh1.setRGB(i,j,image.getRGB(i,j));
						}
							else
								{
									sh2.setRGB(i,j,image.getRGB(i,j));	
								}
					}
			}
			
		}


		ImageIO.write(sh1,"jpg",f1);
		ImageIO.write(sh2,"jpg",f2);
		ImageIO.write(sh3,"jpg",f3);
	}
	public void getImage(String originalImagePath, String shareOnePath, String shareTwoPath, String shareThreePath, String shareFourPath)throws Exception
	{
BufferedImage image = ImageIO.read(new File( originalImagePath)); // "C:/Users/Pushkar/workspace/Chromatic1/samp.jpg"
		
		BufferedImage sh1,sh2,sh3,sh4;
		File f1=new File( shareOnePath);		// "s1.jpg");
		File f2=new File(shareTwoPath); 		// "s2.jpg");
		File f3=new File( shareThreePath);
		File f4=new File( shareFourPath);
//		File f3=new File("merge.jpg");
		sh1=null;
		sh2=null;
		sh3=null;
		sh4=null;
		width=image.getWidth();
		height=image.getHeight();
		System.out.println("Height = "+height+"\n width="+width);
		sh1=new BufferedImage((width), height, BufferedImage.TYPE_INT_RGB);
		sh2=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh4=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		/*for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				sh1.setRGB(i,j,6777216);
				sh2.setRGB(i,j,6777216);
			}
			}
			*/
		
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(((i+j)%2==0)&&((i+j)%5==0))
					/*LCM OF THE NUMBERS BASICALLY.IF WE USE 2,3,5 IT WILL BE MULTIPLES OF 30...30,60,90 
					SO ON so more discrete the image and less of details in the image...
					logic for more shares can be easily developed by us if you want...
					*/
					
				{
					sh4.setRGB(i,j,image.getRGB(i,j));
				}
				else
				{
				if(((i+j)%2==0) && ((i+j)%4==0))
				{
					sh3.setRGB(i,j,image.getRGB(i,j));
				}
					else
					{
						if(((i+j)%2==0)&&((i+j)%3!=0))
						{
							sh1.setRGB(i,j,image.getRGB(i,j));
						}
							else
								{
									sh2.setRGB(i,j,image.getRGB(i,j));	
								}
					}
			}
			}
			
		}


		ImageIO.write(sh1,"jpg",f1);
		ImageIO.write(sh2,"jpg",f2);
		ImageIO.write(sh3,"jpg",f3);
		ImageIO.write(sh4,"jpg",f4);
	}
	
	public void getImage(String originalImagePath, String shareOnePath, String shareTwoPath, String shareThreePath, String shareFourPath,String shareFivePath)throws Exception
	{
BufferedImage image = ImageIO.read(new File( originalImagePath)); // "C:/Users/Pushkar/workspace/Chromatic1/samp.jpg"
		
		BufferedImage sh1,sh2,sh3,sh4,sh5;
		File f1=new File( shareOnePath);		// "s1.jpg");
		File f2=new File(shareTwoPath); 		// "s2.jpg");
		File f3=new File( shareThreePath);
		File f4=new File( shareFourPath);
		File f5=new File( shareFivePath);
		//		File f3=new File("merge.jpg");
		sh1=null;
		sh2=null;
		sh3=null;
		sh4=null;
		sh5=null;
		width=image.getWidth();
		height=image.getHeight();
		System.out.println("Height = "+height+"\n width="+width);
		sh1=new BufferedImage((width), height, BufferedImage.TYPE_INT_RGB);
		sh2=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh4=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		sh5=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//sh3=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		/*for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				sh1.setRGB(i,j,6777216);
				sh2.setRGB(i,j,6777216);
			}
			}
			*/
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(((i+j)%2)==0&&((i+j)%6==0))
				{
					sh5.setRGB(i,j,image.getRGB(i,j));
				}
				else 
					{
					if(((i+j)%2==0)&&((i+j)%5==0))
				{
					sh4.setRGB(i,j,image.getRGB(i,j));
				}
				else
				{
				if(((i+j)%2==0) && ((i+j)%4==0))
				{
					sh3.setRGB(i,j,image.getRGB(i,j));
				}
					else
					{
						if(((i+j)%2==0)&&((i+j)%3!=0))
						{
							sh1.setRGB(i,j,image.getRGB(i,j));
						}
							else
								{
									sh2.setRGB(i,j,image.getRGB(i,j));	
								}
					}
			}
			}
			}
		}


		ImageIO.write(sh1,"jpg",f1);
		ImageIO.write(sh2,"jpg",f2);
		ImageIO.write(sh3,"jpg",f3);
		ImageIO.write(sh4,"jpg",f4);
		ImageIO.write(sh5,"jpg",f5);
		//ImageIO.write(sh6,"jpg,f6");
	}
	public void caller(int in,String s,String filedir,String filename) throws Exception
	{
	Chromatic c=new Chromatic();
	
	String origPath = s;
	String s1Path = (filedir+"/"+filename+"_share1.jpg");
	String s2Path = (filedir+"/"+filename+"_share2.jpg");
	String s3Path = (filedir+"/"+filename+"_share3.jpg");
	String s4Path = (filedir+"/"+filename+"_share4.jpg");
	String s5Path = (filedir+"/"+filename+"_share5.jpg");
	//String s6Path = "D:/BE PROJECT/Chromatic1/s6.jpg";
	
	switch (in) {
	case 2:
		c.getImage(origPath,s1Path,s2Path);
		break;
	case 3 :
		c.getImage(origPath,s1Path,s2Path,s3Path);
		break;
	case 4 :
		c.getImage(origPath,s1Path,s2Path,s3Path,s4Path);		
		break;
	case 5 :
		c.getImage(origPath,s1Path,s2Path,s3Path,s4Path,s5Path);
		break;
		
	/*case 6 :
		c.getImage(origPath,s1Path,s2Path,s3Path,s4Path,s5Path,s6Path);
		*/
//	case 'e' :
	
	//	break;
	
	default:
		
		break;
	}
	//c.getImage(origPath,s1Path,s2Path);
	//c.getImage(origPath, s1Path, s2Path,s3Path,s4Path,s5Path);
	
	}
	

}

