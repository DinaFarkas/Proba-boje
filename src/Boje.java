import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boje {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boje window = new Boje();
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
	public Boje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Change Background");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Color initialcolor = Color.RED;
				Color color = JColorChooser.showDialog(frame,"select a color", initialcolor);
				frame.getContentPane().setBackground(color);
			}
		});
		btnNewButton.setBounds(33, 79, 169, 82);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Change button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Color initialcolor = Color.red;
				Color color = JColorChooser.showDialog(btnNewButton_1, "select a color", initialcolor);
				btnNewButton_1.setBackground(color);
			}
		});
		btnNewButton_1.setBounds(219, 76, 189, 89);
		frame.getContentPane().add(btnNewButton_1);
	}
}
