import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;

public class jframe_RSA extends JFrame {

	private JPanel contentPane;

	int p, q, n, l, e, d, plain, cipher, x;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe_RSA frame = new jframe_RSA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jframe_RSA() {
		setTitle("RSA-201810841 \uC9C4\uD61C\uB9B0");

		this.setBounds(100, 100, 553, 569);
		getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("P : ");
		lblNewLabel_2.setBounds(30, 73, 57, 15);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Q :");
		lblNewLabel_3.setBounds(288, 70, 57, 21);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(139, 71, 117, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(404, 71, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("\uD0A4 \uC0DD\uC131");
		btnNewButton.setBounds(30, 21, 97, 28);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC554\uD638\uD654");
		btnNewButton_1.setBounds(139, 331, 97, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uBCF5\uD638\uD654");
		btnNewButton_2.setBounds(30, 437, 97, 23);
		getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("N(P * Q) :");
		lblNewLabel.setBounds(30, 115, 97, 15);
		getContentPane().add(lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 112, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("L(lcm(P-1, Q-1)) :");
		lblNewLabel_1.setBounds(288, 115, 130, 15);
		getContentPane().add(lblNewLabel_1);

		textField_3 = new JTextField();
		textField_3.setBounds(404, 112, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(140, 156, 116, 21);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("E(gcd(E, L) = 1) :");
		lblNewLabel_4.setBounds(31, 159, 122, 15);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("D(E * D % L = 1) :");
		lblNewLabel_5.setBounds(288, 159, 108, 15);
		getContentPane().add(lblNewLabel_5);

		textField_5 = new JTextField();
		textField_5.setBounds(404, 156, 116, 21);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\uACF5\uAC1C\uD0A4 : ");
		lblNewLabel_6.setBounds(30, 235, 57, 15);
		getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("\uAC1C\uC778\uD0A4 : ");
		lblNewLabel_7.setBounds(30, 276, 57, 15);
		getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("E");
		lblNewLabel_8.setBounds(114, 235, 29, 15);
		getContentPane().add(lblNewLabel_8);

		textField_6 = new JTextField();
		textField_6.setBounds(140, 232, 116, 21);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("N");
		lblNewLabel_9.setBounds(288, 235, 29, 15);
		getContentPane().add(lblNewLabel_9);

		textField_7 = new JTextField();
		textField_7.setBounds(319, 232, 116, 21);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("D");
		lblNewLabel_10.setBounds(114, 276, 29, 15);
		getContentPane().add(lblNewLabel_10);

		textField_8 = new JTextField();
		textField_8.setBounds(139, 273, 116, 21);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("N");
		lblNewLabel_11.setBounds(288, 276, 29, 15);
		getContentPane().add(lblNewLabel_11);

		textField_9 = new JTextField();
		textField_9.setBounds(319, 273, 116, 21);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("\uD3C9\uBB38 : ");
		lblNewLabel_12.setBounds(30, 381, 57, 15);
		getContentPane().add(lblNewLabel_12);

		textField_10 = new JTextField();
		textField_10.setBounds(102, 378, 116, 21);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("\uC554\uD638\uBB38 :");
		lblNewLabel_13.setBounds(250, 381, 57, 15);
		getContentPane().add(lblNewLabel_13);

		textField_11 = new JTextField();
		textField_11.setBounds(319, 378, 116, 21);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("\uC554\uD638\uBB38 :");
		lblNewLabel_14.setBounds(30, 486, 57, 15);
		getContentPane().add(lblNewLabel_14);

		textField_12 = new JTextField();
		textField_12.setBounds(102, 483, 116, 21);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("\uD3C9\uBB38 :");
		lblNewLabel_15.setBounds(250, 486, 57, 15);
		getContentPane().add(lblNewLabel_15);

		textField_13 = new JTextField();
		textField_13.setBounds(319, 483, 116, 21);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);

		JButton btnNewButton_3 = new JButton("\uBD88\uB7EC\uC624\uAE30");

		btnNewButton_3.setBounds(30, 331, 97, 23);
		getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("\uC800\uC7A5\uD558\uAE30");
		btnNewButton_4.setBounds(139, 437, 97, 23);
		getContentPane().add(btnNewButton_4);

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {

				do {
					List<Integer> li = new ArrayList<Integer>();
					li = RandPrime.getRandPrime();

					p = li.get(0);
					q = li.get(1);
					n = p * q;
					l = LcmGcd.getLcm(p - 1, q - 1);
					e = LcmGcd.getE(l);
					d = LcmGcd.getD(e, l);

				} while (Rsa.EncDec(12, e, n) == 12);

				textField.setText(Integer.toString(p));
				textField_1.setText(Integer.toString(q));
				textField_2.setText(Integer.toString(n));
				textField_3.setText(Integer.toString(l));
				textField_4.setText(Integer.toString(e));
				textField_5.setText(Integer.toString(d));
				textField_6.setText(Integer.toString(e));
				textField_7.setText(Integer.toString(n));
				textField_8.setText(Integer.toString(d));
				textField_9.setText(Integer.toString(n));
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() { // 아모와

			public void actionPerformed(ActionEvent a) {

				if (textField_10.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "암호문을 불러오세요", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					plain = Integer.parseInt(textField_10.getText());
					cipher = Rsa.EncDec(plain, Integer.parseInt(textField_6.getText()),
							Integer.parseInt(textField_7.getText()));

					textField_11.setText(Integer.toString(cipher));
					textField_12.setText(Integer.toString(cipher));
				}

			}
		});

		btnNewButton_2.addActionListener(new ActionListener() { // 보코화

			public void actionPerformed(ActionEvent a) {

				cipher = Integer.parseInt(textField_12.getText());
				x = Rsa.EncDec(cipher, Integer.parseInt(textField_8.getText()),
						Integer.parseInt(textField_9.getText()));

				textField_13.setText(Integer.toString(x));
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() { // 불러옥이
			public void actionPerformed(ActionEvent e) {

				JFrame window = new JFrame();
				JFileChooser fileChooser = new JFileChooser();

				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("txt 파일", "txt");
				fileChooser.addChoosableFileFilter(filter);

				int result = fileChooser.showOpenDialog(window);

				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();

					System.out.println(selectedFile);

					try {
						BufferedReader in;
						in = new BufferedReader(new FileReader(selectedFile));
						String line = in.readLine();
						while (line != null) {
							textField_10.setText(line);
							line = in.readLine();
						
						in.close();
						}
					} catch (FileNotFoundException ex) {
						Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
					} catch (IOException ex) {
						Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
					}

				}
				
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
			}
		});

		btnNewButton_4.addActionListener(new ActionListener() { // 저장학이

			public void actionPerformed(ActionEvent a) {

				JFileChooser chooser = new JFileChooser();

				chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.showSaveDialog(null);

				String path = chooser.getSelectedFile().getAbsolutePath();

				try {
					PrintWriter ku = new PrintWriter(new File(path, "공개키.txt"));
					PrintWriter kr = new PrintWriter(new File(path, "개인키.txt"));

					ku.write("공개키\n" + "E : " + e + "\nN : " + n + " \r\n");
					kr.write("개인키\n" + "D : " + d + "\nN : " + n + " \r\n");
					ku.close();
					kr.close();
				} catch (FileNotFoundException ex) {
					Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});

	}
}
