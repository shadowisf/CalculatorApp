package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loading {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading window = new Loading();
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
	public Loading() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Loading.class.getResource("/calculator/Cal(GIF).gif")));
		lblNewLabel.setBounds(63, 160, 603, 487);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("FUN");
		lblNewLabel_2.setForeground(new Color(156, 124, 154));
		lblNewLabel_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 99));
		lblNewLabel_2.setBounds(793, 119, 194, 86);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(156, 124, 154));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 45));
		btnNewButton.setBounds(894, 351, 334, 77);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("EXIT");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Login",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(156, 124, 154));
		btnExit.setFont(new Font("Pixel Digivolve", Font.PLAIN, 45));
		btnExit.setBounds(894, 493, 334, 77);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_2_1 = new JLabel("CULATOR");
		lblNewLabel_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 80));
		lblNewLabel_2_1.setBounds(986, 126, 425, 86);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("by: JAMES CEDIRC BAISUS,LES PAUL RANALAN,MARK ANDREW,ANVIN tom\r\n     ");
		lblNewLabel_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(793, 238, 573, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Loading.class.getResource("/calculator/FINAL loading background.png")));
		lblNewLabel_3.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
