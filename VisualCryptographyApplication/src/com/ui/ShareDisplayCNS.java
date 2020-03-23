package com.ui;
    import java.awt.Color;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
    
    class shareDisplayCNS
    {
    public void caller(String filedirc,String filename)
    {
    JFrame f=new JFrame("Display Shares of CLASSIC NAOR & SHAMIR SCHEME...");
    f.setExtendedState(Frame.MAXIMIZED_BOTH); 
    ImageIcon pic1 = new ImageIcon (filedirc+"/"+filename+"_share1.png");
    ImageIcon pic2 = new ImageIcon (filedirc+"/"+filename+"_share2.png");
     //declare my jlabels...........
    JLabel label1,label2;
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