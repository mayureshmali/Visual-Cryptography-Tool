package com.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class InstructionsCNSD {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void caller() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructionsCNSD window = new InstructionsCNSD();
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
	public InstructionsCNSD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 505);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblClassicalNaor = new JLabel("Classical Naor & Shamir Decryption");
		lblClassicalNaor.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassicalNaor.setForeground(new Color(0, 153, 204));
		lblClassicalNaor.setFont(new Font("Trajan Pro", Font.BOLD, 26));
		lblClassicalNaor.setBounds(12, 13, 587, 66);
		frame.getContentPane().add(lblClassicalNaor);
		
		JLabel lblInstructions = new JLabel("Instructions");
		lblInstructions.setForeground(new Color(0, 102, 153));
		lblInstructions.setFont(new Font("Trajan Pro", Font.BOLD, 18));
		lblInstructions.setBounds(22, 86, 186, 31);
		frame.getContentPane().add(lblInstructions);
		
		JTextPane txtpnS = new JTextPane();
		txtpnS.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		txtpnS.setForeground(new Color(102, 204, 255));
		txtpnS.setBackground(new Color(51, 102, 153));
		txtpnS.setText("Step 1. Select File menu and select to open the two shares  ( share 1 and share 2)  generated from the encryption stage ; from the open dialog box.\r\n\r\nStep 2. After the two shares are opened,select Decrypt menu and select Decrypt Image.\r\n\r\nStep 3. You will be presented with the final decrypted image.\r\n \t\tEnjoy  :) !!!\r\n");
		txtpnS.setBounds(12, 125, 587, 322);
		frame.getContentPane().add(txtpnS);
	}
}
