package gym_maren;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ny_medlem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ny_medlem window = new ny_medlem();
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
	public ny_medlem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(10, 25, 86, 14);
		frame.getContentPane().add(lblNamn);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setBounds(10, 65, 86, 14);
		frame.getContentPane().add(lblPersonnummer);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 111, 86, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setBounds(10, 156, 86, 14);
		frame.getContentPane().add(lblTelefonnummer);
		
		JLabel lblEpost = new JLabel("E-post");
		lblEpost.setBounds(10, 201, 86, 14);
		frame.getContentPane().add(lblEpost);
		
		textField = new JTextField();
		textField.setBounds(10, 38, 177, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 80, 177, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 125, 177, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 170, 177, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 215, 177, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAvbryt = new JButton("Avbryt");
		btnAvbryt.setBounds(300, 222, 89, 23);
		frame.getContentPane().add(btnAvbryt);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(211, 222, 89, 23);
		frame.getContentPane().add(btnSpara);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ny_medlem.class.getResource("/img/userMaren2.jpg")));
		label.setBounds(219, 36, 170, 174);
		frame.getContentPane().add(label);
	}
}
