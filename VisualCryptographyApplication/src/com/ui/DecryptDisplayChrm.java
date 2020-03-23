package com.ui;
import java.awt.Color;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class DecryptDisplayChrm {
	
public void caller(String path)
{
JFrame f=new JFrame("Display Decrypted Image...");
f.setExtendedState(Frame.MAXIMIZED_BOTH); 
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
ImageIcon pic1 = new ImageIcon (path);
 //declare my jlabels...........
JLabel label1;
// Set up first subpanel
JPanel subPanel1 = new JPanel();
//subPanel1.setPreferredSize (new Dimension(2,2));
subPanel1.setBackground (Color.orange);
JScrollPane scrollBar=new JScrollPane(subPanel1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
label1 = new JLabel ("Decrypted Image", pic1, SwingConstants.CENTER);
//label1.setMinimumSize(new Dimension(200, 200));
subPanel1.add (label1);
f.setSize(500,500);
// f.add(subPanel1);
f.add(scrollBar);
f.setVisible(true);
f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());

System.out.println("Success.....Yes Ho gaya!!!");
}
}