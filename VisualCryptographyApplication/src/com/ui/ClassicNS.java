package com.ui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class ClassicNS extends JPanel {
private BufferedImage image;
public static String fullPath,filedirc,filename;

public ClassicNS() {
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
final JFrame f = new JFrame("Classical Naor & Shamir Image Encryption");
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
final ClassicNS t = new ClassicNS();
final JFileChooser chooser = new JFileChooser();
//JPanel jp=new JPanel();
//f.add(jp);

JMenuBar mb = new JMenuBar();
f.setJMenuBar(mb);
JMenu file = new JMenu("File");
JMenu encrypt=new JMenu("Encrypt");
JMenu decrypt=new JMenu("Decrypt");
JMenu help=new JMenu("Help");
mb.add(file);
mb.add(encrypt);
mb.add(decrypt);
mb.add(help);
JMenuItem mi = new JMenuItem("Open");
JMenuItem enc = new JMenuItem("Encrypt the Image");
JMenuItem dec = new JMenuItem("Decrypt the Image");
JMenuItem abt = new JMenuItem("About/Instructions");
help.add(abt);
file.add(mi);
encrypt.add(enc);
decrypt.add(dec);

abt.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e) 
	{
		AboutNS ans=new AboutNS();
		ans.caller();
	}
});


dec.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
		try {
		
			ClassicNSD decrypt= new ClassicNSD();
			decrypt.caller();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});





enc.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		VisCrypt vc=new VisCrypt();
		shareDisplayCNS CNS=new shareDisplayCNS();
		
		try {
		
			vc.getImage(fullPath,filedirc,filename);
			CNS.caller(filedirc,filename);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
});

mi.addActionListener(new ActionListener() {
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
	File f=chooser.getCurrentDirectory();
	filedirc=f.getAbsolutePath();
	System.out.println(filedirc);
	File fn=chooser.getSelectedFile();
	filename =fn.getName();

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
f.add(new JScrollPane(t),BorderLayout.CENTER);
f.pack();
f.setVisible(true);
f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());

}
});
}
}