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
import javax.swing.JTextField;

public class Area {

	private JFrame frame;
	private JTextField tsq;
	private JTextField sqarea;
	private JTextField tcircle;
	private JTextField areacircle;
	private JTextField tlength;
	private JTextField twidth;
	private JTextField arearect;
	private JTextField theight;
	private JTextField tbase;
	private JTextField areatri;
	private JTextField sqperimeter;
	private JTextField sqvol;
	private JTextField recperi;
	private JTextField recvol;
	private JTextField recheight;
	private JTextField cirperi;
	private JTextField cirvol;
	private JTextField cirheight;
	private JTextField sqheight;
	private JTextField triside;
	private JTextField triperi;
	private JTextField trivol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
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
	public Area() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(frame);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(251, 155, 138));
		btnNewButton.setBounds(41, 56, 110, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Area.class.getResource("/calculator/area(TITLE).png")));
		lblNewLabel.setBounds(620, 56, 340, 163);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SQUARE");
		lblNewLabel_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(369, 218, 115, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CIRCLE");
		lblNewLabel_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(369, 489, 102, 42);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RECTANGLE");
		lblNewLabel_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		lblNewLabel_1_2.setBounds(1099, 218, 158, 42);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TRIANGLE");
		lblNewLabel_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 26));
		lblNewLabel_1_1_1.setBounds(1113, 489, 135, 42);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		tsq = new JTextField();
		tsq.setBounds(374, 280, 151, 19);
		frame.getContentPane().add(tsq);
		tsq.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SIDE:");
		lblNewLabel_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(312, 270, 49, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("AREA:");
		lblNewLabel_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(312, 338, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		sqarea = new JTextField();
		sqarea.setColumns(10);
		sqarea.setBounds(386, 348, 139, 19);
		frame.getContentPane().add(sqarea);
		
		JLabel lblNewLabel_2_2 = new JLabel("RADIUS:");
		lblNewLabel_2_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(312, 569, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		tcircle = new JTextField();
		tcircle.setColumns(10);
		tcircle.setBounds(405, 579, 120, 19);
		frame.getContentPane().add(tcircle);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("AREA:");
		lblNewLabel_2_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(312, 628, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		areacircle = new JTextField();
		areacircle.setColumns(10);
		areacircle.setBounds(386, 638, 139, 19);
		frame.getContentPane().add(areacircle);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = tsq.getText();
					String s1 = sqheight.getText();
					double d = Double.parseDouble(s);
					double d1 = Double.parseDouble(s1);
					
					double area = 6*(d*d);
					double perimeter = 12*d;
					double vol = d*d*d;
					
					sqarea.setText(""+area);
					sqperimeter.setText(""+perimeter);
					sqvol.setText(""+vol);
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"input incomplete.");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1.setBounds(312, 447, 94, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("RESET");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tsq.setText(null);
				sqarea.setText(null);
				sqperimeter.setText(null);
				sqvol.setText(null);
				sqheight.setText(null);
			}
		});
		btnNewButton_1_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_1.setBounds(423, 447, 102, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("CONFIRM");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = tcircle.getText();
					String s1 = cirheight.getText();
				
					
					double d = Double.parseDouble(s);
					double d2 = Double.parseDouble(s1);
					
				
					double area = (2*3.141592653589793238*d2)+(2*3.141592653589793238*d*d);
					double perimeter = (4*d)+(2*d2);
					double vol = 3.141592653589793238*(d*d)*d2;
					
				
					areacircle.setText(""+area);
					cirperi.setText(""+perimeter);
					cirvol.setText(""+vol);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"input incomplete.");
				}
			}
		});
		btnNewButton_1_2.setBackground(new Color(251, 155, 138));
		btnNewButton_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_2.setBounds(312, 732, 115, 21);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tcircle.setText(null);
				areacircle.setText(null);
				cirheight.setText(null);
				cirperi.setText(null);
				cirvol.setText(null);
			}
		});
		btnNewButton_1_1_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_1_1.setBounds(437, 732, 88, 21);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("LENGTH:");
		lblNewLabel_2_3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3.setBounds(1041, 270, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		tlength = new JTextField();
		tlength.setColumns(10);
		tlength.setBounds(1139, 280, 142, 19);
		frame.getContentPane().add(tlength);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("WIDTH:");
		lblNewLabel_2_3_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3_1.setBounds(1041, 301, 73, 31);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		twidth = new JTextField();
		twidth.setColumns(10);
		twidth.setBounds(1124, 311, 157, 19);
		frame.getContentPane().add(twidth);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("AREA:");
		lblNewLabel_2_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(1041, 364, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		arearect = new JTextField();
		arearect.setColumns(10);
		arearect.setBounds(1113, 374, 168, 19);
		frame.getContentPane().add(arearect);
		
		JButton btnNewButton_1_3 = new JButton("CONFIRM");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				
					String len = tlength.getText();
					String wid = twidth.getText();
					String height = recheight.getText();
							
					double d = Double.parseDouble(len);
					double d1 = Double.parseDouble(wid);
					double d2 = Double.parseDouble(height);
								
					double area = 2*(d*d1+d2*d+d2*d1);
					double perimeter = 2*(d+d1);
					double vol = d*d1*d2;
								
								
					arearect.setText(""+area);
					recperi.setText(""+perimeter);
					recvol.setText(""+vol);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"input incomplete.");
				}	
					
				
				
			}
		});
		btnNewButton_1_3.setBackground(new Color(251, 155, 138));
		btnNewButton_1_3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_3.setBounds(1041, 460, 110, 21);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2 = new JButton("RESET");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tlength.setText(null);
				twidth.setText(null);
				arearect.setText(null);
				recheight.setText(null);
				recvol.setText(null);
				recperi.setText(null);
				
			}
		});
		btnNewButton_1_1_2.setBackground(new Color(251, 155, 138));
		btnNewButton_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_1_2.setBounds(1171, 460, 110, 21);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("HEIGHT:");
		lblNewLabel_2_3_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3_2.setBounds(1041, 541, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_3_2);
		
		theight = new JTextField();
		theight.setColumns(10);
		theight.setBounds(1131, 551, 150, 19);
		frame.getContentPane().add(theight);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("BASE:");
		lblNewLabel_2_3_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3_1_1.setBounds(1041, 600, 73, 31);
		frame.getContentPane().add(lblNewLabel_2_3_1_1);
		
		tbase = new JTextField();
		tbase.setColumns(10);
		tbase.setBounds(1139, 610, 142, 19);
		frame.getContentPane().add(tbase);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("AREA:");
		lblNewLabel_2_1_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_2_1.setBounds(1041, 628, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		areatri = new JTextField();
		areatri.setColumns(10);
		areatri.setBounds(1139, 638, 142, 19);
		frame.getContentPane().add(areatri);
		
		JButton btnNewButton_1_3_1 = new JButton("CONFIRM");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = theight.getText();
				String s2 = tbase.getText();
				String s3 = triside.getText();
				
				double d1 = Double.parseDouble(s1);
				double d2 = Double.parseDouble(s2);
				double d3 = Double.parseDouble(s3);
				
				double area = (d1*d2)/2;
				double perimeter = d3+d3+d3;
				double vol = 0.5*d2*d1*d3;
				
				areatri.setText(""+area);
				trivol.setText(""+d3);
				triperi.setText(""+perimeter);
				
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_3_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1_3_1.setBounds(1041, 732, 107, 21);
		frame.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("RESET");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				theight.setText(null);
				tbase.setText(null);
				areatri.setText(null);
				triside.setText(null);
				triperi.setText(null);
				trivol.setText(null);
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 10));
		btnNewButton_1_1_2_1.setBackground(new Color(251, 155, 138));
		btnNewButton_1_1_2_1.setBounds(1171, 732, 110, 21);
		frame.getContentPane().add(btnNewButton_1_1_2_1);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("PERIMETER:");
		lblNewLabel_2_1_3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_3.setBounds(312, 377, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		sqperimeter = new JTextField();
		sqperimeter.setColumns(10);
		sqperimeter.setBounds(386, 387, 139, 19);
		frame.getContentPane().add(sqperimeter);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("VOLUME:");
		lblNewLabel_2_1_3_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_3_1.setBounds(312, 406, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_3_1);
		
		sqvol = new JTextField();
		sqvol.setColumns(10);
		sqvol.setBounds(405, 416, 120, 19);
		frame.getContentPane().add(sqvol);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("PERIMETER:");
		lblNewLabel_2_1_3_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_3_2.setBounds(1041, 393, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_3_2);
		
		recperi = new JTextField();
		recperi.setColumns(10);
		recperi.setBounds(1113, 403, 168, 19);
		frame.getContentPane().add(recperi);
		
		JLabel lblNewLabel_2_1_3_1_1 = new JLabel("VOLUME:");
		lblNewLabel_2_1_3_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_3_1_1.setBounds(1041, 419, 88, 31);
		frame.getContentPane().add(lblNewLabel_2_1_3_1_1);
		
		recvol = new JTextField();
		recvol.setColumns(10);
		recvol.setBounds(1131, 431, 150, 19);
		frame.getContentPane().add(recvol);
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("HEIGHT:");
		lblNewLabel_2_3_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3_1_2.setBounds(1041, 335, 73, 31);
		frame.getContentPane().add(lblNewLabel_2_3_1_2);
		
		recheight = new JTextField();
		recheight.setColumns(10);
		recheight.setBounds(1124, 345, 157, 19);
		frame.getContentPane().add(recheight);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("PERIMETER:");
		lblNewLabel_2_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBounds(312, 661, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		cirperi = new JTextField();
		cirperi.setColumns(10);
		cirperi.setBounds(386, 671, 139, 19);
		frame.getContentPane().add(cirperi);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("VOLUME:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1_1.setBounds(312, 691, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		cirvol = new JTextField();
		cirvol.setColumns(10);
		cirvol.setBounds(386, 703, 139, 19);
		frame.getContentPane().add(cirvol);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("HEIGHT");
		lblNewLabel_2_1_1_2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2.setBounds(312, 600, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_2);
		
		cirheight = new JTextField();
		cirheight.setColumns(10);
		cirheight.setBounds(405, 609, 120, 19);
		frame.getContentPane().add(cirheight);
		
		JLabel lblNewLabel_2_4 = new JLabel("HEIGHT:");
		lblNewLabel_2_4.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_4.setBounds(312, 311, 49, 31);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		sqheight = new JTextField();
		sqheight.setColumns(10);
		sqheight.setBounds(374, 319, 151, 19);
		frame.getContentPane().add(sqheight);
		
		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("LENGTH");
		lblNewLabel_2_3_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_3_1_1_1.setBounds(1041, 569, 73, 31);
		frame.getContentPane().add(lblNewLabel_2_3_1_1_1);
		
		triside = new JTextField();
		triside.setColumns(10);
		triside.setBounds(1131, 579, 150, 19);
		frame.getContentPane().add(triside);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("perimeter:");
		lblNewLabel_2_1_2_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_2_1_1.setBounds(1041, 661, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_1);
		
		triperi = new JTextField();
		triperi.setColumns(10);
		triperi.setBounds(1139, 667, 142, 19);
		frame.getContentPane().add(triperi);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("volume");
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 20));
		lblNewLabel_2_1_2_1_1_1.setBounds(1041, 691, 64, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2_1_1_1);
		
		trivol = new JTextField();
		trivol.setColumns(10);
		trivol.setBounds(1139, 701, 142, 19);
		frame.getContentPane().add(trivol);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Area.class.getResource("/calculator/area(BACKGROUND).png")));
		lblNewLabel_3.setBounds(0, 0, 1540, 845);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
