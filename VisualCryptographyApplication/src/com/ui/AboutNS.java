package com.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class AboutNS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void caller() {
		frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutNS window = new AboutNS();
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
	public AboutNS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("About-Classic Naor & Shamir algorithm | Encryption instructions");
		frame.setBounds(100, 100, 809, 629);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblClassicialNaor = new JLabel("Classicial Naor & Shamir Visual Cryptography scheme");
		lblClassicialNaor.setBounds(12, 13, 769, 33);
		lblClassicialNaor.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassicialNaor.setFont(new Font("Trajan Pro", Font.BOLD, 22));
		lblClassicialNaor.setForeground(new Color(255, 0, 102));
		frame.getContentPane().add(lblClassicialNaor);
		
		JLabel lblEncryptionInstructions = new JLabel("Encryption Instructions");
		lblEncryptionInstructions.setBounds(12, 267, 351, 18);
		lblEncryptionInstructions.setForeground(new Color(255, 0, 0));
		lblEncryptionInstructions.setFont(new Font("Trajan Pro", Font.BOLD, 20));
		frame.getContentPane().add(lblEncryptionInstructions);
		
		JTextPane txtpnMyNameIs = new JTextPane();
		txtpnMyNameIs.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		txtpnMyNameIs.setForeground(new Color(204, 51, 0));
		txtpnMyNameIs.setBackground(new Color(255, 255, 204));
		txtpnMyNameIs.setText("Step 1. Hit File menu and select open to open an image ( only black & white/monochromatic images on either of the formats \".bmp\",\".png\",\".jpg\" or\",\".gif\" are allowed to be loaded).\r\n\r\nStep 2. Load the image from the open dialog box.\r\n\r\nStep 3. Click on Encrypt menu and select Encrypt Image.\r\n\r\nStep 4. You will be presented with the shares generated on encryption of the image in a new window.\r\n\r\nStep 5. Encryption of image is successfully done. :)\r\n\r\nStep 6. Hit the close button on the window that displays shares.\r\n\r\nStep 7. Now you can go ahead and select Decrypt Image menu to open up the Decrypt mode.");
		txtpnMyNameIs.setBounds(12, 287, 769, 289);
		frame.getContentPane().add(txtpnMyNameIs);
		
		JTextPane txtpnAbout = new JTextPane();
		txtpnAbout.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		txtpnAbout.setForeground(new Color(204, 51, 0));
		txtpnAbout.setBackground(new Color(255, 255, 204));
		txtpnAbout.setText("Naor and Shamir Visual Cryptography algorithm\r\n\r\nNaor and Shamir introduced this visual cryptographic algorithm in 1995. It is a new cryptographic scheme where the ciphertext is decoded by the human visual system. Hence, there is no need to any complex cryptographic computation for decryption. The idea is to hide a secret message (text, handwriting, picture, etc\u2026) in different images called shares or cover images. When the shares (transparencies) are stacked together in order to align the subpixels, the secret message can be recovered. The simplest case is the 2 out of 2 scheme where the secret message is hidden in 2 shares, both needed for a successful decryption. This algorithm purely works on only monochromatic images i.e black and white images. Thus this algorithm is the basic scheme for visual cryptography. ");
		txtpnAbout.setBounds(12, 59, 769, 195);
		frame.getContentPane().add(txtpnAbout);
	}
}
