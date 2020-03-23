package com.ui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

class ShareDisplay2Chromatic
{
public void caller(String filedir,String filename)
{
JFrame f=new JFrame("Display Encrypted chromatic Shares...");
f.setExtendedState(f.MAXIMIZED_BOTH); 
ImageIcon pic1 = new ImageIcon (filedir+"/"+filename+"_share1.jpg");
ImageIcon pic2 = new ImageIcon (filedir+"/"+filename+"_share2.jpg");
 //declare my jlabels...........
JLabel label1, label2;
// Set up first subpanel
JPanel subPanel1 = new JPanel();
//subPanel1.setPreferredSize (new Dimension(2,2));
subPanel1.setBackground (Color.orange);
JScrollPane scrollBar=new JScrollPane(subPanel1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
label1 = new JLabel ("SHARE 1", pic1, SwingConstants.CENTER);
label2 = new JLabel ("SHARE 2",pic2, SwingConstants.LEFT);
//label1.setMinimumSize(new Dimension(200, 200));
subPanel1.add (label1);
subPanel1.add (label2);
f.setSize(500,500);
// f.add(subPanel1);
f.add(scrollBar);
f.setVisible(true);
f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
System.out.println("Success.....Yes Ho gaya!!!");
}
}