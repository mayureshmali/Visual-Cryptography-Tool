package com.ui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import steganography.Steganography_Controller;

import java.awt.Color;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.SystemColor; //for custom look and feel theme :)

public class Introduction {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		//JFrame.setDefaultLookAndFeelDecorated(true);
		//SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenSkin");    
		//SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");    
		//SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.EmeraldDuskSkin");   
		
		//SubstanceLookAndFeel.setCurrentTheme ("org.jvnet.substance.theme.SubstanceDarkVioletTheme");
		
		//SubstanceLookAndFeel.setCurrentTheme ("org.jvnet.substance.theme.SubstanceUltraMarineTheme");
		
		//SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBubblesWatermark");
		//SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBinaryWatermark");
	//SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceFabricWatermark");
		//SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
	
		
		//SubstanceLookAndFeel.setCurrentWatermark( new SubstanceImageWatermark("D:/BE PROJECT/WatermarkDemo.jpg"));
		//SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.3));
	
		//For a custom look using the
		try 
		    {
			 //UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());    //BLACK LOOK THEME   
			//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); //METAL LOOK SOLARIS  
			
		    } 
		    catch (Exception e) 
		    {
		      e.printStackTrace();
		    }
		
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introduction window = new Introduction();
					window.frame.setVisible(true);
					//UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());  //For using a theme
					frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Introduction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("VizCrypt Tool");
		frame.setBounds(100, 100, 658, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		JLabel lblVisualCryptographicTool = new JLabel("VISUAL CRYPTOGRAPHIC TOOL");
		lblVisualCryptographicTool.setForeground(new Color(0, 0, 0));
		lblVisualCryptographicTool.setBounds(12, 31, 603, 86);
		lblVisualCryptographicTool.setHorizontalAlignment(SwingConstants.CENTER);
		lblVisualCryptographicTool.setFont(new Font("Trajan Pro", Font.BOLD, 32));
		frame.getContentPane().add(lblVisualCryptographicTool);
		
		JButton btnVisualCryptographySchemes = new JButton("Visual Cryptography Schemes");
		btnVisualCryptographySchemes.setBounds(165, 212, 284, 42);
		btnVisualCryptographySchemes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AlgoSelectUI als=new AlgoSelectUI();
				AlgoSelectUI.caller();
				
			}
		});
		frame.getContentPane().add(btnVisualCryptographySchemes);
		
		JButton btnSteganography = new JButton("Steganography");
		btnSteganography.setBounds(165, 317, 284, 36);
		btnSteganography.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Steganography_Controller sc=new Steganography_Controller();
				
				
				
			}
		});
		frame.getContentPane().add(btnSteganography);
		
		JLabel lblVizcryptToolBy = new JLabel("VizCrypt tool v1.0 By-Gayatri,Mayuresh,Pushkar");
		lblVizcryptToolBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblVizcryptToolBy.setForeground(new Color(51, 102, 153));
		lblVizcryptToolBy.setBounds(312, 432, 328, 27);
		frame.getContentPane().add(lblVizcryptToolBy);
	}
}
