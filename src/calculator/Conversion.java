package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Conversion {

	private JFrame frame;
	private JTextField num;
	private JTextField num4;
	private JTextField result4;
	private JTextField num2;
	private JTextField result2;
	private JTextField num3;
	private JTextField result3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversion window = new Conversion();
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
	public Conversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(177, 153, 219));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Conversion.class.getResource("/calculator/Conversion(TITLE).png")));
		lblNewLabel.setBounds(433, 72, 726, 162);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER:");
		lblNewLabel_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(48, 382, 90, 42);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.WHITE);
		separator_2.setBounds(433, 244, 11, 509);
		frame.getContentPane().add(separator_2);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(169, 388, 254, 42);
		frame.getContentPane().add(num);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RESULT:");
		lblNewLabel_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1.setBounds(48, 450, 103, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		final JTextField result = new JTextField();
		result.setColumns(10);
		result.setBounds(166, 456, 257, 42);
		frame.getContentPane().add(result);
		
		JButton octalButt = new JButton("octal");
		octalButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = num.getText();
				int i = Integer.parseInt(s);
				String s1 = Integer.toOctalString(i);
				result.setText(s1);
			}
		});
		octalButt.setBackground(new Color(177, 153, 219));
		octalButt.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		octalButt.setBounds(48, 626, 160, 35);
		frame.getContentPane().add(octalButt);
		
		JButton hexButt = new JButton("hexadecimal\r\n");
		hexButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = num.getText();
				int i = Integer.parseInt(s);
				String s1 = Integer.toHexString(i);
				result.setText(s1);
			}
		});
		hexButt.setBackground(new Color(177, 153, 219));
		hexButt.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		hexButt.setBounds(197, 560, 226, 35);
		frame.getContentPane().add(hexButt);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" CONVERT TO:");
		lblNewLabel_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_1.setBounds(41, 502, 173, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(null);
				result.setText(null);
			}
		});
		btnReset.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnReset.setBackground(new Color(177, 153, 219));
		btnReset.setBounds(246, 626, 177, 35);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("BINARY");
		lblNewLabel_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblNewLabel_1_1_2.setBounds(140, 270, 120, 42);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.WHITE);
		separator_2_1.setBounds(1135, 244, 11, 509);
		frame.getContentPane().add(separator_2_1);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setOrientation(SwingConstants.VERTICAL);
		separator_2_2.setForeground(Color.BLACK);
		separator_2_2.setBackground(Color.WHITE);
		separator_2_2.setBounds(796, 252, 11, 509);
		frame.getContentPane().add(separator_2_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("hex SYSTEM");
		lblNewLabel_1_1_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblNewLabel_1_1_2_1.setBounds(1233, 270, 214, 42);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("ENTER:");
		lblNewLabel_1_1_3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_3.setBounds(1156, 382, 198, 42);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		num4 = new JTextField();
		num4.setColumns(10);
		num4.setBounds(1249, 382, 254, 42);
		frame.getContentPane().add(num4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("RESULT:");
		lblNewLabel_1_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_2.setBounds(1156, 456, 103, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		result4 = new JTextField();
		result4.setColumns(10);
		result4.setBounds(1259, 456, 244, 42);
		frame.getContentPane().add(result4);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(" CONVERT TO:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_1_1.setBounds(1156, 508, 173, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JButton binaryButt_1 = new JButton("BINARY");
		binaryButt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String hex = num4.getText();
					int decimal = Integer.parseInt(hex,16);
					String decimal_hexadecimal = Integer.toBinaryString(decimal);
					result4.setText(""+decimal_hexadecimal);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not hexadecimal number.");
				}
			}
		});
		binaryButt_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		binaryButt_1.setBackground(new Color(177, 153, 219));
		binaryButt_1.setBounds(1156, 569, 177, 35);
		frame.getContentPane().add(binaryButt_1);
		
		JButton btnDecimalSystem = new JButton("DECIMAL");
		btnDecimalSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String hex = num4.getText();
					int hexdecimal = Integer.parseInt(hex, 16);
					result4.setText(""+hexdecimal);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not hexadecimal number.");
				}
				
			}
		});
		btnDecimalSystem.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnDecimalSystem.setBackground(new Color(177, 153, 219));
		btnDecimalSystem.setBounds(1156, 626, 187, 35);
		frame.getContentPane().add(btnDecimalSystem);
		
		JButton octalButt_1 = new JButton("OCTAL");
		octalButt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String hex = num4.getText();
					int decimal = Integer.parseInt(hex,16);
					String decimal_octal = Integer.toOctalString(decimal);
					result4.setText(""+decimal_octal);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not hexadecimal number.");
				}
			}
		});
		octalButt_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		octalButt_1.setBackground(new Color(177, 153, 219));
		octalButt_1.setBounds(1343, 569, 160, 35);
		frame.getContentPane().add(octalButt_1);
		
		JButton btnReset_1 = new JButton("RESET");
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num4.setText(null);
				result4.setText(null);
			}
		});
		btnReset_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnReset_1.setBackground(new Color(177, 153, 219));
		btnReset_1.setBounds(1373, 626, 130, 35);
		frame.getContentPane().add(btnReset_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("DECIMAL");
		lblNewLabel_1_1_2_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblNewLabel_1_1_2_2.setBounds(556, 270, 137, 42);
		frame.getContentPane().add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_2_1 = new JLabel("OCTAL SYSTEM");
		lblNewLabel_1_1_2_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblNewLabel_1_1_2_2_1.setBounds(844, 270, 244, 42);
		frame.getContentPane().add(lblNewLabel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("ENTER:");
		lblNewLabel_1_1_4.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_4.setBounds(454, 382, 80, 42);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(544, 382, 218, 42);
		frame.getContentPane().add(num2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("RESULT:");
		lblNewLabel_1_1_1_3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_3.setBounds(454, 456, 103, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		result2 = new JTextField();
		result2.setColumns(10);
		result2.setBounds(567, 456, 195, 42);
		frame.getContentPane().add(result);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel(" CONVERT TO:");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_1_2.setBounds(454, 508, 173, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JButton btnDecimalSystem_1 = new JButton("DECIMAL ");
		btnDecimalSystem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String binary = num.getText();
					int decimal = Integer.parseInt(binary, 2);
					result.setText(""+decimal);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not a binary number.");
				}
			}
		});
		btnDecimalSystem_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnDecimalSystem_1.setBackground(new Color(177, 153, 219));
		btnDecimalSystem_1.setBounds(51, 560, 132, 35);
		frame.getContentPane().add(btnDecimalSystem_1);
		
		JButton btnHexadecimal = new JButton("HEXADECIMAL");
		btnHexadecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = num2.getText();
					int i = Integer.parseInt(s);
					String s1 = Integer.toHexString(i);
					textField.setText(s1);
				} catch(Exception e1){
					JOptionPane.showMessageDialog(null,"input is not a decimal number.");
				}
			}
		});
		btnHexadecimal.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnHexadecimal.setBackground(new Color(177, 153, 219));
		btnHexadecimal.setBounds(613, 560, 149, 35);
		frame.getContentPane().add(btnHexadecimal);
		
		JButton btnOctal = new JButton("OCTAL ");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = num2.getText();
					int i = Integer.parseInt(s);
					String s1 = Integer.toOctalString(i);
					textField.setText(s1);
				} catch(Exception e1){
					JOptionPane.showMessageDialog(null,"input is not a decimal number.");
				}
			}
		});
		btnOctal.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnOctal.setBackground(new Color(177, 153, 219));
		btnOctal.setBounds(454, 626, 137, 35);
		frame.getContentPane().add(btnOctal);
		
		JButton btnReset_2 = new JButton("RESET");
		btnReset_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2.setText(null);
				textField.setText(null);
			}
		});
		btnReset_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnReset_2.setBackground(new Color(177, 153, 219));
		btnReset_2.setBounds(613, 626, 149, 35);
		frame.getContentPane().add(btnReset_2);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("ENTER:");
		lblNewLabel_1_1_4_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_4_1.setBounds(812, 382, 80, 42);
		frame.getContentPane().add(lblNewLabel_1_1_4_1);
		
		num3 = new JTextField();
		num3.setColumns(10);
		num3.setBounds(902, 382, 218, 42);
		frame.getContentPane().add(num3);
		
		JLabel lblNewLabel_1_1_1_3_1 = new JLabel("RESULT:");
		lblNewLabel_1_1_1_3_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_3_1.setBounds(812, 456, 103, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_3_1);
		
		result3 = new JTextField();
		result3.setColumns(10);
		result3.setBounds(925, 456, 195, 42);
		frame.getContentPane().add(result3);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel(" CONVERT TO:");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 23));
		lblNewLabel_1_1_1_1_2_1.setBounds(796, 508, 173, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2_1);
		
		JButton btnDecimalSystem_1_1 = new JButton("HEXADECIMAL");
		btnDecimalSystem_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String octal = num3.getText();
					int decimal = Integer.parseInt(octal, 8);
					String s1 = Integer.toHexString(decimal);
					
					result3.setText(""+s1);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not an octal number.");
				}
			}
		});
		btnDecimalSystem_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnDecimalSystem_1_1.setBackground(new Color(177, 153, 219));
		btnDecimalSystem_1_1.setBounds(806, 560, 149, 35);
		frame.getContentPane().add(btnDecimalSystem_1_1);
		
		JButton hexButt_1_1 = new JButton("DECIMAL");
		hexButt_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String octal = num3.getText();
					int decimal = Integer.parseInt(octal, 8);
					result3.setText(""+decimal);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not an octal number.");
				}
			}
		});
		hexButt_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		hexButt_1_1.setBackground(new Color(177, 153, 219));
		hexButt_1_1.setBounds(965, 560, 149, 35);
		frame.getContentPane().add(hexButt_1_1);
		
		JButton octalButt_2_1 = new JButton("Binary\r\n");
		octalButt_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String octal = num3.getText();
					int i = Integer.parseInt(octal,8);
					String s1 = Integer.toBinaryString(i);
					result3.setText(""+s1);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"input is not an octal number.");
				}
				
			}
		});
		octalButt_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		octalButt_2_1.setBackground(new Color(177, 153, 219));
		octalButt_2_1.setBounds(807, 626, 137, 35);
		frame.getContentPane().add(octalButt_2_1);
		
		JButton btnReset_2_1 = new JButton("RESET");
		btnReset_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num3.setText(null);
				result3.setText(null);
			}
		});
		btnReset_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnReset_2_1.setBackground(new Color(177, 153, 219));
		btnReset_2_1.setBounds(965, 626, 149, 35);
		frame.getContentPane().add(btnReset_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(556, 456, 206, 42);
		frame.getContentPane().add(textField);
		
		JButton btnReset_2_2 = new JButton("BINARY");
		btnReset_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = num2.getText();
					int i = Integer.parseInt(s);
					String s1 = Integer.toBinaryString(i);
					textField.setText(s1);
				} catch(Exception e1){
					JOptionPane.showMessageDialog(null,"input is not a decimal number.");
				}
			}
		});
		btnReset_2_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 16));
		btnReset_2_2.setBackground(new Color(177, 153, 219));
		btnReset_2_2.setBounds(454, 560, 149, 35);
		frame.getContentPane().add(btnReset_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Conversion.class.getResource("/calculator/FINAL loading background.png")));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
