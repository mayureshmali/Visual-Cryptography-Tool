package com.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;

public class InstructionsChrmD {

	private JFrame frame;

	public void caller() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionsChrmD window = new InstructionsChrmD();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InstructionsChrmD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Chromatic Image Decryption Instructions");
		frame.setBounds(100, 100, 656, 528);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		
		JLabel lblChromaticDecryption = new JLabel("Chromatic Decryption Instructions ");
		lblChromaticDecryption.setForeground(new Color(255, 153, 0));
		lblChromaticDecryption.setHorizontalAlignment(SwingConstants.CENTER);
		lblChromaticDecryption.setFont(new Font("Trajan Pro", Font.BOLD, 26));
		lblChromaticDecryption.setBounds(12, 13, 600, 55);
		frame.getContentPane().add(lblChromaticDecryption);
		
		JTextPane txtpnG = new JTextPane();
		txtpnG.setFont(new Font("Palatino Linotype", Font.BOLD, 22));
		txtpnG.setForeground(new Color(0, 0, 51));
		txtpnG.setBackground(new Color(255, 153, 0));
		txtpnG.setText("Step 1. In decryption mode,select one out of the 4 modes ( i.e mode1,mode2,mode3 or mode 4) and then select open shares to load the shares generated in encryption stage one by one.\r\nAfter loading all shares,hit the Decrypt image.\r\n\r\nStep 2.When you hit Decrypt image,you will be presented with the decrypted final image in a new window.\r\n\r\nStep 3. Congratulations Decryption successful :) !!!");
		txtpnG.setBounds(12, 116, 614, 354);
		frame.getContentPane().add(txtpnG);
		
		JLabel lblDecryptionInstructions = new JLabel("Decryption Instructions");
		lblDecryptionInstructions.setFont(new Font("Trajan Pro", Font.BOLD, 18));
		lblDecryptionInstructions.setForeground(new Color(102, 204, 0));
		lblDecryptionInstructions.setBounds(22, 67, 391, 45);
		frame.getContentPane().add(lblDecryptionInstructions);
	}
}
