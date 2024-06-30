package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
		frame.setLocationRelativeTo(null);
	
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 90));
		lblNewLabel.setBounds(650, 0, 272, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BASIC CALCULATOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BasicCal.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton.setBackground(new Color(168, 208, 243));
		btnNewButton.setBounds(550, 120, 461, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOddOrEven = new JButton("ODD OR EVEN");
		btnOddOrEven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OddorEven.main(null);
				frame.dispose();
					
			}
		});
		btnOddOrEven.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnOddOrEven.setBackground(new Color(164, 236, 212));
		btnOddOrEven.setBounds(550, 191, 461, 61);
		frame.getContentPane().add(btnOddOrEven);
		
		JButton btnNewButton_1_1 = new JButton("AVERAGE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avg.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1.setBackground(new Color(255, 203, 164));
		btnNewButton_1_1.setBounds(550, 262, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("FACTORIAL");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Factorial.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1_1.setBackground(new Color(255, 182, 191));
		btnNewButton_1_1_1.setBounds(550, 333, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("SHAPES");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Area.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1_1_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1_1_1_1.setBounds(550, 404, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("FIBONACCI");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fibonacci.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1_1_1_1.setBackground(new Color(252, 237, 138));
		btnNewButton_1_1_1_1_1.setBounds(550, 475, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("CONVERSION");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conversion.main(null);
				frame.dispose();
				
			}
		});
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1_1_1_1_1.setBackground(new Color(177, 153, 219));
		btnNewButton_1_1_1_1_1_1.setBounds(550, 546, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(470, 105, 648, 2);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("MIN AND MAX");
		btnNewButton_1_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Min_and_Max.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1_1_1_1_1_1.setBackground(new Color(232, 203, 195));
		btnNewButton_1_1_1_1_1_1_1.setBounds(550, 617, 461, 61);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1 = new JButton("LOGOUT");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.dispose();
			};
		});
		btnNewButton_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1.setBounds(733, 724, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/calculator/login and menu(BACKGROUND).png")));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
