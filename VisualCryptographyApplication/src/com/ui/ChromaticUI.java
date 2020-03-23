package com.ui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

import com.chromatic.Chromatic;

public class ChromaticUI extends JPanel {
private static final long serialVersionUID = 1;
private BufferedImage image;
public static String fullPath,filedir,filename;

public ChromaticUI() {
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
final JFrame f = new JFrame("Chromatic image encryption");
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
final ChromaticUI t = new ChromaticUI();
final JFileChooser chooser = new JFileChooser();
//JPanel jp=new JPanel();
//f.add(jp);

JMenuBar mb = new JMenuBar();
f.setJMenuBar(mb);
JMenu file=new JMenu("File");
JMenu sm = new JMenu("Select mode");
JMenu help=new JMenu("Help");
JMenu dec=new JMenu("Decrypt");
mb.add(file);
mb.add(sm);
mb.add(dec);
mb.add(help);


JMenuItem op=new JMenuItem("Load/Open Image");
JMenuItem m2 = new JMenuItem("Generate 2 shares");
JMenuItem m3 = new JMenuItem("Generate 3 shares");
JMenuItem m4 = new JMenuItem("Generate 4 shares");
JMenuItem m5 = new JMenuItem("Generate 5 shares");
JMenuItem decr = new JMenuItem("Decrypt Image");
JMenuItem abt = new JMenuItem("About/Instructions");
dec.add(decr);
file.add(op);
sm.add(m2);
sm.add(m3);
sm.add(m4);
sm.add(m5);
help.add(abt);

decr.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		ChromaticDecrypt crd=new ChromaticDecrypt();
		crd.caller();
	}
});



op.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
if (chooser.showOpenDialog(f) ==
JFileChooser.APPROVE_OPTION) {
try
{
BufferedImage bi = ImageIO.read(
chooser.getSelectedFile());
if (bi != null)
{
	File file = chooser.getSelectedFile();
	fullPath = file.getAbsolutePath();
	File f = chooser.getCurrentDirectory(); //This will return the directory
	filedir =f.getAbsolutePath();
	File fn = chooser.getSelectedFile();
	filename=fn.getName();
	System.out.println("path is"+f);
	System.out.println(filedir);
	System.out.println(filename);
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




abt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		AboutChr chr=new AboutChr();
		chr.caller();
	}
});


m2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
		Chromatic c=new Chromatic();
		c.caller(2,fullPath,filedir,filename);
		ShareDisplay2Chromatic sd2=new ShareDisplay2Chromatic();
		sd2.caller(filedir,filename);
		
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});

m3.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
			Chromatic c=new Chromatic();
			c.caller(3,fullPath,filedir,filename);
			ShareDisplay3Chromatic sd3=new ShareDisplay3Chromatic();
			sd3.caller(filedir,filename);
				
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});

m4.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
			Chromatic c=new Chromatic();
			c.caller(4,fullPath,filedir,filename);
			ShareDisplay4Chromatic sd4=new ShareDisplay4Chromatic();
			sd4.caller(filedir,filename);
					
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});

m5.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
		
			Chromatic c=new Chromatic();
			c.caller(5,fullPath,filedir,filename);
			ShareDisplay5Chromatic sd5=new ShareDisplay5Chromatic();
			sd5.caller(filedir,filename);
				
				
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});

f.add(new JScrollPane(t),BorderLayout.CENTER);
f.pack();
f.setVisible(true);
f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());

}
});
}
}