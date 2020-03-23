package com.ui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.ModVisualCrypto.*;
import java.awt.Color;
public class AlgoSelectUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void caller() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					AlgoSelectUI window = new AlgoSelectUI();
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
	public AlgoSelectUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame("Select the algorithm for Visual Cryptography");
		frame.setBounds(100, 100, 653, 493);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(new ImageIcon(getClass().getResource("crypto.png")).getImage());
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectTheAlgorithm = new JLabel("Select the Algorithm");
		lblSelectTheAlgorithm.setForeground(new Color(0, 0, 0));
		lblSelectTheAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTheAlgorithm.setFont(new Font("Trajan Pro", Font.BOLD, 26));
		lblSelectTheAlgorithm.setBounds(109, 26, 407, 74);
		frame.getContentPane().add(lblSelectTheAlgorithm);
		
		JButton btnClassicNaor = new JButton("Classic Naor & Shamir ");
		btnClassicNaor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassicNS csn=new ClassicNS();
				csn.caller();
			}
		});
		btnClassicNaor.setBounds(179, 113, 241, 58);
		frame.getContentPane().add(btnClassicNaor);
		
		JButton btnModifiedNaor = new JButton("Modified Naor & Shamir");
		btnModifiedNaor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualCryptography mvc =new VisualCryptography();
				mvc.caller();
			}
		});
		btnModifiedNaor.setBounds(179, 199, 241, 58);
		frame.getContentPane().add(btnModifiedNaor);
		
		JButton btnChromaticSecretSharing = new JButton("Chromatic Secret Sharing");
		btnChromaticSecretSharing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChromaticUI chui=new ChromaticUI();
				chui.caller();
				
			}
		});
		btnChromaticSecretSharing.setBounds(179, 293, 241, 58);
		frame.getContentPane().add(btnChromaticSecretSharing);
	}

}
