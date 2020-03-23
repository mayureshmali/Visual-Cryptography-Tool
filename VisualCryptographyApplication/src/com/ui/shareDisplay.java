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
    
    class shareDisplay
    {
    public static void main(String args[])
    {
    JFrame f=new JFrame("Display Shares...");
    f.setExtendedState(f.MAXIMIZED_BOTH); 
    ImageIcon pic1 = new ImageIcon ("D:/BE PROJECT/test1.jpg");
    ImageIcon pic2 = new ImageIcon ("D:/test.jpg");
    ImageIcon pic3 = new ImageIcon ("D:/test.jpg");
    ImageIcon pic4 = new ImageIcon ("D:/test.jpg");
    ImageIcon pic5 = new ImageIcon ("D:/test.jpg");
    ImageIcon pic6 = new ImageIcon ("D:/BE PROJECT/test1.jpg");
     //declare my jlabels...........
    JLabel label1, label2, label3, label4,label6, label5;
    // Set up first subpanel
    JPanel subPanel1 = new JPanel();
    //subPanel1.setPreferredSize (new Dimension(2,2));
    subPanel1.setBackground (Color.orange);
    JScrollPane scrollBar=new JScrollPane(subPanel1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
    label1 = new JLabel ("SHARE 1", pic1, SwingConstants.CENTER);
    label2 = new JLabel ("SHARE 2",pic2, SwingConstants.LEFT);
    label3 = new JLabel ("SHARE 3", pic3, SwingConstants.CENTER);
    label4 = new JLabel ("SHARE 4", pic4, SwingConstants.LEFT);
    label5 = new JLabel ("SHARE 5", pic5, SwingConstants.CENTER);
    label6 = new JLabel ("SHARE 6", pic6, SwingConstants.LEFT);
    //label1.setMinimumSize(new Dimension(200, 200));
    subPanel1.add (label1);
    subPanel1.add (label2);
    subPanel1.add (label3);
    subPanel1.add (label4);
    subPanel1.add (label5);
    subPanel1.add (label6);
    f.setSize(500,500);
   // f.add(subPanel1);
    f.add(scrollBar);
    f.setVisible(true);
    //f.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
    System.out.println("Success.....Yes Ho gaya!!!");
    }
    }