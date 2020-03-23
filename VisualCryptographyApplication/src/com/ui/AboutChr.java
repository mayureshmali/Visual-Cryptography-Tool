package com.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class AboutChr {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void caller() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutChr window = new AboutChr();
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
	public AboutChr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("About-Chromatic secret sharing scheme | Encryption Instructions");
		frame.setBounds(100, 100, 803, 666);
		frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChromaticSecretSharing = new JLabel("Chromatic Secret Sharing ");
		lblChromaticSecretSharing.setHorizontalAlignment(SwingConstants.CENTER);
		lblChromaticSecretSharing.setForeground(new Color(204, 51, 102));
		lblChromaticSecretSharing.setFont(new Font("Trajan Pro", Font.BOLD, 22));
		lblChromaticSecretSharing.setBounds(109, 13, 434, 43);
		frame.getContentPane().add(lblChromaticSecretSharing);
		
		JTextPane txtpnS = new JTextPane();
		txtpnS.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		txtpnS.setForeground(new Color(255, 204, 204));
		txtpnS.setBackground(new Color(153, 0, 153));
		txtpnS.setText("Chromatic Secret sharing\r\n\r\nNaor and Shamir algorithm worked on only 2 images at a time.This can be further extended to the k out of n scheme where a secret message is encrypted into n shares but only k shares are needed for decryption where k=n. If k-1 shares are presented, this will give partial to no information about the secret message. This algorithm is completely hueristic and based on the idea of k out of n scheme mentioned above. However the concept of k out of n is the same but the difference is in the technique of encryption. Here we encrypt the image by splitting each and every pixel on different canvas based on some defined logic thereby generating different shares.This idea of encryption is purely heuristic and not based on any algorithm. Overlapping these shares will reveal us with the original image. ");
		txtpnS.setBounds(12, 55, 761, 209);
		frame.getContentPane().add(txtpnS);
		
		JLabel lblEncryptionInstructions = new JLabel("Encryption Instructions");
		lblEncryptionInstructions.setFont(new Font("Trajan Pro", Font.BOLD, 18));
		lblEncryptionInstructions.setForeground(new Color(204, 0, 0));
		lblEncryptionInstructions.setBounds(12, 272, 388, 43);
		frame.getContentPane().add(lblEncryptionInstructions);
		
		JTextPane txtpnStep = new JTextPane();
		txtpnStep.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		txtpnStep.setBackground(new Color(153, 0, 204));
		txtpnStep.setForeground(new Color(255, 255, 255));
		txtpnStep.setText("Step 1.Select file menu and choose Load/Open image option to open a coloured image to be encrypted.\r\n\r\nStep 2. After a coloured image is loaded select the mode to generate n shares.(where n is between 2 to 5).\r\n\r\nStep 3.According to the number of shares selected to be generated,a window will show the n encrypted image shares.\r\n\r\nStep 4. Congratulations image encrypted succesfully.\r\n\r\nStep 5. Now you can go ahead and select Decrypt to open Decrypt mode and decrypt the image.");
		txtpnStep.setBounds(12, 314, 761, 294);
		frame.getContentPane().add(txtpnStep);
	}

}
