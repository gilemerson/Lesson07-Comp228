import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class FlowFrame extends JFrame {


	/**
	 * Create the frame.
	 */
	public FlowFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(new FlowLayout());
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getContentPane().add(lblNewLabel);
	}

}
