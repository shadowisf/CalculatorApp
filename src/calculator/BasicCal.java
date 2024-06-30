package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class BasicCal implements ActionListener {

	JFrame f;
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;

	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	BasicCal() {
		f = new JFrame();
		t = new JTextField();
		b1 = new JButton("1");
		b1.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b1.setBackground(new Color(168, 208, 243));
		b2 = new JButton("2");
		b2.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b2.setBackground(new Color(168, 208, 243));
		b3 = new JButton("3");
		b3.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b3.setBackground(new Color(168, 208, 243));
		b4 = new JButton("4");
		b4.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b4.setBackground(new Color(168, 208, 243));
		b5 = new JButton("5");
		b5.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b5.setBackground(new Color(168, 208, 243));
		b6 = new JButton("6");
		b6.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b6.setBackground(new Color(168, 208, 243));
		b7 = new JButton("7");
		b7.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b7.setBackground(new Color(168, 208, 243));
		b8 = new JButton("8");
		b8.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b8.setBackground(new Color(168, 208, 243));
		b9 = new JButton("9");
		b9.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b9.setBackground(new Color(168, 208, 243));
		b0 = new JButton("0");
		b0.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		b0.setBackground(new Color(168, 208, 243));
		bdiv = new JButton("/");
		bdiv.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bdiv.setBackground(new Color(168, 208, 243));
		bmul = new JButton("*");
		bmul.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bmul.setBackground(new Color(168, 208, 243));
		bsub = new JButton("-");
		bsub.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bsub.setBackground(new Color(168, 208, 243));
		badd = new JButton("+");
		badd.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		badd.setBackground(new Color(168, 208, 243));
		bdec = new JButton(".");
		bdec.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bdec.setBackground(new Color(168, 208, 243));
		beq = new JButton("=");
		beq.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		beq.setBackground(new Color(168, 208, 243));
		bdel = new JButton("Delete");
		bdel.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bdel.setBackground(new Color(168, 208, 243));
		bclr = new JButton("Clear");
		bclr.setFont(new Font("Pixel Digivolve", Font.PLAIN, 25));
		bclr.setBackground(new Color(168, 208, 243));
		t.setBounds(600, 216, 363, 30);
		b7.setBounds(648, 427, 62, 64);
		b8.setBounds(720, 427, 62, 64);
		b9.setBounds(792, 427, 62, 64);
		bdiv.setBounds(864, 287, 62, 64);
		b4.setBounds(648, 357, 62, 64);
		b5.setBounds(720, 357, 62, 64);
		b6.setBounds(792, 357, 62, 64);
		bmul.setBounds(864, 357, 62, 64);
		b1.setBounds(648, 287, 62, 64);
		b2.setBounds(720, 287, 62, 64);
		b3.setBounds(792, 287, 62, 64);
		bsub.setBounds(864, 427, 62, 64);
		bdec.setBounds(648, 497, 62, 64);
		b0.setBounds(720, 497, 62, 64);
		beq.setBounds(792, 497, 62, 64);
		badd.setBounds(864, 497, 62, 64);
		bdel.setBounds(648, 567, 134, 64);
		bclr.setBounds(792, 567, 134, 64);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBounds(41, 56, 105, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(null);	
			}
		});
		btnNewButton.setFont(new Font("Pixel Digivolve", Font.PLAIN, 19));
		btnNewButton.setBackground(new Color(168, 208, 243));
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(t);
		f.getContentPane().add(b7);
		f.getContentPane().add(b8);
		f.getContentPane().add(b9);
		f.getContentPane().add(bdiv);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);
		f.getContentPane().add(b6);
		f.getContentPane().add(bmul);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(bsub);
		f.getContentPane().add(bdec);
		f.getContentPane().add(b0);
		f.getContentPane().add(beq);
		f.getContentPane().add(badd);
		f.getContentPane().add(bdel);
		f.getContentPane().add(bclr);
		f.getContentPane().setLayout(null);

		f.setVisible(true);
		f.setBounds(100, 100, 1920, 1080);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(BasicCal.class.getResource("/calculator/basic(TITLE).png")));
		lblNewLabel.setBounds(600, 32, 363, 157);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(BasicCal.class.getResource("/calculator/basic(BACKGROUND).png")));
		lblNewLabel_1.setBounds(0, 0, 1540, 845);
		f.getContentPane().add(lblNewLabel_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			t.setText(t.getText().concat("1"));
		if (e.getSource() == b2)
			t.setText(t.getText().concat("2"));
		if (e.getSource() == b3)
			t.setText(t.getText().concat("3"));
		if (e.getSource() == b4)

			t.setText(t.getText().concat("4"));
		if (e.getSource() == b5)
			t.setText(t.getText().concat("5"));
		if (e.getSource() == b6)
			t.setText(t.getText().concat("6"));
		if (e.getSource() == b7)
			t.setText(t.getText().concat("7"));
		if (e.getSource() == b8)
			t.setText(t.getText().concat("8"));
		if (e.getSource() == b9)
			t.setText(t.getText().concat("9"));
		if (e.getSource() == b0)
			t.setText(t.getText().concat("0"));
		if (e.getSource() == bdec)
			t.setText(t.getText().concat("."));
		if (e.getSource() == badd) {
			a = Double.parseDouble(t.getText());
			operator = 1;
			t.setText("");
		}
		if (e.getSource() == bsub) {
			a = Double.parseDouble(t.getText());
			operator = 2;
			t.setText("");
		}
		if (e.getSource() == bmul) {
			a = Double.parseDouble(t.getText());
			operator = 3;
			t.setText("");
		}
		if (e.getSource() == bdiv) {
			a = Double.parseDouble(t.getText());
			operator = 4;
			t.setText("");
		}
		if (e.getSource() == beq) {
			b = Double.parseDouble(t.getText());
			switch (operator) {
			case 1:
				result = a + b;
				break;
			case 2:
				result = a - b;
				break;
			case 3:
				result = a * b;
				break;
			case 4:
				result = a / b;
				break;
			default:
				result = 0;
			}
			t.setText("" + result);
		}
		if (e.getSource() == bclr)
			t.setText("");
		if (e.getSource() == bdel) {
			String s = t.getText();
			t.setText("");
			for (int i = 0; i < s.length() - 1; i++)
				t.setText(t.getText() + s.charAt(i));
		}
	}

	public static void main(String[] args) {
		new BasicCal();
	}
}

