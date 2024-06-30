package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 70));
		lblNewLabel.setBounds(523, 196, 520, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Pixel Digivolve", Font.PLAIN, 45));
		lblUsername.setBounds(397, 345, 245, 47);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Pixel Digivolve", Font.PLAIN, 45));
		lblPassword.setBounds(397, 459, 259, 47);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(705, 345, 334, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(705, 459, 338, 47);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				
				if (username.equals("admin") && password.equals("admin")) {
					
					textField.setText(null);
					passwordField.setText(null);
					Menu.main(null);
					frame.dispose();
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username and password");
				}
			}
			
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		btnNewButton.setBounds(523, 592, 171, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		btnReset.setBounds(872, 592, 171, 47);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/calculator/login and menu(BACKGROUND).png")));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
