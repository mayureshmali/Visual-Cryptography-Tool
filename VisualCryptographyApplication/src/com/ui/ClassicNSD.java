package com.ui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class ClassicNSD extends JPanel {
private static final long serialVersionUID = 1L;
private BufferedImage image;
public static String fullPath1,fullPath2,filedirc1,filename;

public ClassicNSD() {
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
final JFrame f = new JFrame("Classical Naor & Shamir Image Decryption");
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
final ClassicNSD t = new ClassicNSD();
final JFileChooser chooser = new JFileChooser();
//JPanel jp=new JPanel();
//f.add(jp);

JMenuBar mb = new JMenuBar();
f.setJMenuBar(mb);
JMenu file = new JMenu("File");
JMenu decrypt=new JMenu("Decrypt");
JMenu help=new JMenu("Help");
mb.add(file);
mb.add(decrypt);
mb.add(help);
JMenuItem s1 = new JMenuItem("Open the share 1");
JMenuItem s2 = new JMenuItem("Open the share 2");
JMenuItem dec = new JMenuItem("Decrypt the Image");
JMenuItem abt = new JMenuItem("About/Instructions");
help.add(abt);
file.add(s1);
file.add(s2);
decrypt.add(dec);

abt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		InstructionsCNSD icnsd=new InstructionsCNSD();
		icnsd.caller();
	}
});

s1.addActionListener(new ActionListener() {
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
	fullPath1 = file.getAbsolutePath();
	File f1=chooser.getCurrentDirectory();
	filedirc1=f1.getAbsolutePath();
	File fn=chooser.getSelectedFile();
	filename=fn.getName();

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



s2.addActionListener(new ActionListener() {
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
	fullPath2 = file.getAbsolutePath();

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

dec.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
		mergeXOR xor=new mergeXOR();
		String s=xor.caller(fullPath1,fullPath2,filedirc1,filename);
		DecryptDisplayCNS dcns=new DecryptDisplayCNS();
		dcns.caller(s);
			
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