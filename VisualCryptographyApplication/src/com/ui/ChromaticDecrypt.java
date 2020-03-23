package com.ui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class ChromaticDecrypt extends JPanel {
private static final long serialVersionUID = 1L;
private BufferedImage image;
public static String filename1,filename2,filename3,filename4,filedir1,filedir2,filedir3,filedir4,fullPath11,fullPath12,fullPath21,fullPath22,fullPath23,fullPath31,fullPath32,fullPath33,fullPath34,fullPath41,fullPath42,fullPath43,fullPath44,fullPath45,fullPath51,fullPath52,fullPath53,fullPath54,fullPath55,fullPath56;

public ChromaticDecrypt() {
setPreferredSize(new Dimension(400,300));
}

public void setImage(BufferedImage bi) {
image = bi;
setPreferredSize(new Dimension(bi.getWidth(),bi.getHeight()));
revalidate(); // tells the JScrollPane the size has changed
repaint(); // redraws the new image
}

public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawImage(image,0,0,null);
}

public void caller() {
EventQueue.invokeLater(new Runnable() {
public void run() {
final JFrame f = new JFrame("Chromatic image decryption");
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
final ChromaticDecrypt t = new ChromaticDecrypt();
final JFileChooser chooser = new JFileChooser();
//JPanel jp=new JPanel();
//f.add(jp);

JMenuBar mb = new JMenuBar();
f.setJMenuBar(mb);
JMenu m1 = new JMenu("Mode 1");
JMenu m2 = new JMenu("Mode 2");
JMenu m3 = new JMenu("Mode 3");
JMenu m4 = new JMenu("Mode 4");
JMenu help=new JMenu("Help");
mb.add(m1);
mb.add(m2);
mb.add(m3);
mb.add(m4);
mb.add(help);
JMenuItem s11 = new JMenuItem("OPEN SHARE 1");
JMenuItem s12 = new JMenuItem("OPEN SHARE 2");
JMenuItem dec1 = new JMenuItem("Decrypt this Image");


JMenuItem s21 = new JMenuItem("OPEN SHARE 1");
JMenuItem s22 = new JMenuItem("OPEN SHARE 2");
JMenuItem s23 = new JMenuItem("OPEN SHARE 3");
JMenuItem dec2 = new JMenuItem("Decrypt this Image");

JMenuItem s31 = new JMenuItem("OPEN SHARE 1");
JMenuItem s32 = new JMenuItem("OPEN SHARE 2");
JMenuItem s33 = new JMenuItem("OPEN SHARE 3");
JMenuItem s34 = new JMenuItem("OPEN SHARE 4");
JMenuItem dec3 = new JMenuItem("Decrypt this Image");

JMenuItem s41 = new JMenuItem("OPEN SHARE 1");
JMenuItem s42 = new JMenuItem("OPEN SHARE 2");
JMenuItem s43 = new JMenuItem("OPEN SHARE 3");
JMenuItem s44 = new JMenuItem("OPEN SHARE 4");
JMenuItem s45 = new JMenuItem("OPEN SHARE 5");
JMenuItem dec4 = new JMenuItem("Decrypt this Image");

JMenuItem abt = new JMenuItem("About/Instructions");
m1.add(s11);
m1.add(s12);
m1.add(dec1);

m2.add(s21);
m2.add(s22);
m2.add(s23);
m2.add(dec2);

m3.add(s31);
m3.add(s32);
m3.add(s33);
m3.add(s34);
m3.add(dec3);

m4.add(s41);
m4.add(s42);
m4.add(s43);
m4.add(s44);
m4.add(s45);
m4.add(dec4);

help.add(abt);

abt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		InstructionsChrmD chrmd=new InstructionsChrmD();
		chrmd.caller();
	}
});

dec1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		ChromaticXOR chrXOR=new ChromaticXOR();
		try {

		
			ChromaticXOR.caller(fullPath11, fullPath12,filedir1,filename1);
			String path=ChromaticXOR.caller(fullPath11, fullPath12,filedir1, filename1);
			DecryptDisplayChrm ddc=new DecryptDisplayChrm();
			ddc.caller(path);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});

dec2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		try {
			ChromaticXOR.caller(fullPath21, fullPath22,fullPath23,filedir2,filename2);
			String path=ChromaticXOR.caller(fullPath21, fullPath22, fullPath23, filedir2, filename2);
			DecryptDisplayChrm ddc=new DecryptDisplayChrm();
			ddc.caller(path);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
});

dec3.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
	try {
		ChromaticXOR.caller(fullPath31, fullPath32,fullPath33,fullPath34,filedir3,filename3);
		String path=ChromaticXOR.caller(fullPath31,fullPath32, fullPath33, fullPath34, filedir3, filename3);
		DecryptDisplayChrm ddc=new DecryptDisplayChrm();
		ddc.caller(path);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}}
});

dec4.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		try {
			ChromaticXOR.caller(fullPath41, fullPath42,fullPath43,fullPath44,fullPath45,filedir4,filename4);
			String path=ChromaticXOR.caller(fullPath41,fullPath42, fullPath43, fullPath44, fullPath45,filedir4, filename4);
			DecryptDisplayChrm ddc=new DecryptDisplayChrm();
			ddc.caller(path);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});

s11.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath11 = file.getAbsolutePath();
					File f1=chooser.getCurrentDirectory();
					filedir1=f1.getAbsolutePath();
					File fn=chooser.getSelectedFile();
					filename1=fn.getName();
					System.out.println(filename1);

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s12.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath12 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s21.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath21 = file.getAbsolutePath();
					File f2=chooser.getCurrentDirectory();
					filedir2=f2.getAbsolutePath();
					File fn=chooser.getSelectedFile();
					filename2=fn.getName();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s22.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath22 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s23.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath23 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s31.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath31 = file.getAbsolutePath();
					File f3=chooser.getCurrentDirectory();
					filedir3=f3.getAbsolutePath();
					File fn=chooser.getSelectedFile();
					filename3=fn.getName();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s32.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath32 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s33.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath33 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s34.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath34 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s41.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
	if (chooser.showOpenDialog(f) ==
			JFileChooser.APPROVE_OPTION) {
		try
		{
		BufferedImage bi = ImageIO.read(
		chooser.getSelectedFile());
		if (bi != null)
		{
			File file = chooser.getSelectedFile();
			fullPath41 = file.getAbsolutePath();
			File f4=chooser.getCurrentDirectory();
			filedir4=f4.getAbsolutePath();
			File fn=chooser.getSelectedFile();
			filename4=fn.getName();

			//System.out.println(fullPath);
		t.setImage(bi);
		}
		else
		JOptionPane.showMessageDialog(f,
		"File is not an image!");
		} catch (IOException ioe) {
		JOptionPane.showMessageDialog(f,
		"Error Reading File!");


		}
		}	
	}
});

s42.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath42 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s43.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{if (chooser.showOpenDialog(f) ==
	JFileChooser.APPROVE_OPTION) {
		try
		{
		BufferedImage bi = ImageIO.read(
		chooser.getSelectedFile());
		if (bi != null)
		{
			File file = chooser.getSelectedFile();
			fullPath43 = file.getAbsolutePath();

			//System.out.println(fullPath);
		t.setImage(bi);
		}
		else
		JOptionPane.showMessageDialog(f,
		"File is not an image!");
		} catch (IOException ioe) {
		JOptionPane.showMessageDialog(f,
		"Error Reading File!");


		}
		}}
});

s44.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		if (chooser.showOpenDialog(f) ==
				JFileChooser.APPROVE_OPTION) {
				try
				{
				BufferedImage bi = ImageIO.read(
				chooser.getSelectedFile());
				if (bi != null)
				{
					File file = chooser.getSelectedFile();
					fullPath44 = file.getAbsolutePath();

					//System.out.println(fullPath);
				t.setImage(bi);
				}
				else
				JOptionPane.showMessageDialog(f,
				"File is not an image!");
				} catch (IOException ioe) {
				JOptionPane.showMessageDialog(f,
				"Error Reading File!");


				}
				}
	}
});

s45.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{if (chooser.showOpenDialog(f) ==
	JFileChooser.APPROVE_OPTION) {
		try
		{
		BufferedImage bi = ImageIO.read(
		chooser.getSelectedFile());
		if (bi != null)
		{
			File file = chooser.getSelectedFile();
			fullPath45 = file.getAbsolutePath();

			//System.out.println(fullPath);
		t.setImage(bi);
		}
		else
		JOptionPane.showMessageDialog(f,
		"File is not an image!");
		} catch (IOException ioe) {
		JOptionPane.showMessageDialog(f,
		"Error Reading File!");


		}
		}}
});
f.add(new JScrollPane(t),BorderLayout.CENTER);
f.pack();
f.setVisible(true);
f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());

}
});
}
}