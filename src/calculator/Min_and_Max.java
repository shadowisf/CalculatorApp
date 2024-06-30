package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Min_and_Max {

	private JFrame frame;
	private JTextField n1max;
	private JTextField n2max;
	private JTextField n3max;
	private JTextField maxresult;
	private JTextField n1min;
	private JTextField n2min;
	private JTextField n3min;
	private JTextField minresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Min_and_Max window = new Min_and_Max();
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
	public Min_and_Max() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(232, 203, 195));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Min_and_Max.class.getResource("/calculator/minNmax(TITLE).png")));
		lblNewLabel.setBounds(244, 56, 1072, 165);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(244, 479, 1072, 21);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER FIRST NUMBER:");
		lblNewLabel_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(244, 276, 176, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		n1max = new JTextField();
		n1max.setForeground(new Color(0, 0, 0));
		n1max.setBounds(430, 284, 157, 24);
		frame.getContentPane().add(n1max);
		n1max.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER SECOND NUMBER:");
		lblNewLabel_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(597, 276, 186, 34);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		n2max = new JTextField();
		n2max.setColumns(10);
		n2max.setBounds(782, 284, 157, 24);
		frame.getContentPane().add(n2max);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THIRD NUMBER:");
		lblNewLabel_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(949, 276, 186, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		n3max = new JTextField();
		n3max.setColumns(10);
		n3max.setBounds(1145, 284, 157, 24);
		frame.getContentPane().add(n3max);
		
		JLabel lblNewLabel_2 = new JLabel("MAXIMUM RESULT:");
		lblNewLabel_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(737, 401, 235, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		maxresult = new JTextField();
		maxresult.setColumns(10);
		maxresult.setBounds(982, 401, 244, 50);
		frame.getContentPane().add(maxresult);
		
		JLabel lblNewLabel_1_2 = new JLabel("ENTER FIRST NUMBER:");
		lblNewLabel_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(244, 566, 176, 34);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		n1min = new JTextField();
		n1min.setColumns(10);
		n1min.setBounds(430, 574, 157, 24);
		frame.getContentPane().add(n1min);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ENTER SECOND NUMBER:");
		lblNewLabel_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(597, 566, 186, 34);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		n2min = new JTextField();
		n2min.setColumns(10);
		n2min.setBounds(782, 574, 157, 24);
		frame.getContentPane().add(n2min);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("ENTER THIRD NUMBER:");
		lblNewLabel_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(949, 566, 186, 34);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		n3min = new JTextField();
		n3min.setColumns(10);
		n3min.setBounds(1145, 574, 157, 24);
		frame.getContentPane().add(n3min);
		
		JLabel lblNewLabel_2_1 = new JLabel("MINIMUM RESULT:");
		lblNewLabel_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(737, 695, 235, 50);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		minresult = new JTextField();
		minresult.setColumns(10);
		minresult.setBounds(982, 695, 244, 50);
		frame.getContentPane().add(minresult);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setBackground(new Color(232, 203, 195));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = n1max.getText();
				String number2 = n2max.getText();
				String number3 = n3max.getText();
				long num1 = Long.parseLong(number);
				long num2 = Long.parseLong(number2);
				long num3 = Long.parseLong(number3);
				
				if(num1>num2&&num1>num2) {
					maxresult.setText("the Maximum number is "+num1);
				}
				else if(num2>num1&&num2>num3) {
					maxresult.setText("the Maximum number is "+num2);
				}
				else {
					maxresult.setText("the Maximum number is "+num3);
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		btnNewButton_1.setBounds(342, 418, 174, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("RESET");
		btnNewButton_1_1.setBackground(new Color(232, 203, 195));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1min.setText(null);
				n2min.setText(null);
				n3min.setText(null);
				minresult.setText(null);
			}
		});
		btnNewButton_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(531, 712, 174, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("RESET");
		btnNewButton_1_2.setBackground(new Color(232, 203, 195));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1max.setText(null);
				n2max.setText(null);
				n3max.setText(null);
				maxresult.setText(null);
			}
		});
		btnNewButton_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		btnNewButton_1_2.setBounds(531, 418, 174, 21);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("CONFIRM");
		btnNewButton_1_1_1.setBackground(new Color(232, 203, 195));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = n1min.getText();
				String number2 = n2min.getText();
				String number3 = n3min.getText();
				long num1 = Long.parseLong(number);
				long num2 = Long.parseLong(number2);
				long num3 = Long.parseLong(number3);
				
				if(num1<num2&&num1<num2) {
					minresult.setText("the Minimum number is "+num1);
				}
				else if(num2<num1&&num2<num3) {
					minresult.setText("the Minimum number is "+num2);
				}
				else {
					minresult.setText("the Minimum number is "+num3);
				}
				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(342, 712, 174, 21);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Min_and_Max.class.getResource("/calculator/minNmax(BACKFROUND).png")));
		lblNewLabel_3.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
