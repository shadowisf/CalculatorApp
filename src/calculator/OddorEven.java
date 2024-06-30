package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OddorEven {

	private JFrame frame;
	private JTextField txtnumber;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OddorEven window = new OddorEven();
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
	public OddorEven() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, -37, 1920, 1080);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(164, 236, 212));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ENTER A NUMBER ");
		lblNewLabel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		lblNewLabel.setBounds(602, 301, 366, 109);
		frame.getContentPane().add(lblNewLabel);
		
		txtnumber = new JTextField();
		txtnumber.setBounds(579, 426, 132, 32);
		frame.getContentPane().add(txtnumber);
		txtnumber.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setBackground(new Color(164, 236, 212));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				String num1 = "EVEN NUMBER";
				String num2 = "ODD NUMBER";
				int num = Integer.parseInt(txtnumber.getText());
				if (num%2==0) {
					textField.setText(num1);
				}
				if(num%2!=0) {
					textField.setText(num2);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1.setBounds(459, 522, 263, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("RESET");
		btnNewButton_1_1.setBackground(new Color(164, 236, 212));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtnumber.setText(null);
				textField.setText(null);
			}
		});
		btnNewButton_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 40));
		btnNewButton_1_1.setBounds(803, 522, 263, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(OddorEven.class.getResource("/calculator/odd or even(TITLE).png")));
		lblNewLabel_1.setBounds(395, 92, 771, 150);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER NUMBER:\r\n");
		lblNewLabel_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(410, 420, 170, 35);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("RESULT:");
		lblNewLabel_2_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(721, 420, 89, 35);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(817, 426, 202, 32);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(OddorEven.class.getResource("/calculator/odd or even(BACKGROUND).png")));
		lblNewLabel_2.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
