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
import javax.swing.JTextField;

public class Avg {

	private JFrame frame;
	private JTextField avg;
	private JTextField avgres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avg window = new Avg();
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
	public Avg() {
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
		btnNewButton.setBackground(new Color(255, 203, 164));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Avg.class.getResource("/calculator/avg(TITLE).png")));
		lblNewLabel.setBounds(511, 92, 537, 150);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER LIST OF GRADES");
		lblNewLabel_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(591, 268, 377, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		avg = new JTextField();
		avg.setColumns(10);
		avg.setBounds(591, 348, 377, 36);
		frame.getContentPane().add(avg);
		
		JButton btnNewButton_1_1 = new JButton("CONFIRM");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String numlist = avg.getText();
					
					String[] numlistArray = numlist.split(" ");
					
					double sum = 0;
					for (String numString : numlistArray) {
						double num = Double.parseDouble(numString);
						sum = sum + num;
					}
					
					double avg = sum / numlistArray.length;
					avgres.setText(""+avg);
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"invalid input.");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		btnNewButton_1_1.setBackground(new Color(255, 203, 163));
		btnNewButton_1_1.setBounds(591, 415, 153, 36);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("AVERAGE:");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(591, 572, 119, 36);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		avgres = new JTextField();
		avgres.setColumns(10);
		avgres.setBounds(720, 572, 248, 36);
		frame.getContentPane().add(avgres);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(511, 486, 537, 2);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avg.setText(null);
				avgres.setText(null);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBackground(new Color(255, 203, 163));
		btnNewButton_1_1_1.setBounds(822, 416, 146, 34);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Avg.class.getResource("/calculator/avg(BACKGROUND).png")));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
