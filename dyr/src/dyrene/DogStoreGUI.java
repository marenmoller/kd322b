package dyrene;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DogStoreGUI extends JFrame {

	private JTextArea info;
	private JTextArea error;
	private JPanel contentPane;
	private JTextField humanname;
	private JTextField dogname;
    Human humans;
    Dog dog;
	
    
    
    /**
	 * Launch the application.
	 */
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DogStoreGUI frame = new DogStoreGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DogStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		humanname = new JTextField();
		humanname.setBounds(29, 33, 134, 28);
		contentPane.add(humanname);
		humanname.setColumns(10);
		
		dogname = new JTextField();
		dogname.setBounds(29, 67, 134, 28);
		contentPane.add(dogname);
		dogname.setColumns(10);
		
		
		//knapper
		
		JButton btnNewHuman = new JButton("New human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (humanname.getText().length()>=3){
					humans = new Human (humanname.getText());
					error.setText("");
					
				}
				
				else{
					error.setText("Invalid name for human");
			
			}
			}
		});
		btnNewHuman.setBounds(179, 34, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humans!=null){
					dog = new Dog(); 
					dog.setName(dogname.getText());
					humans.buyDog(dog); 
					error.setText("");
		      } else {
		    	  error.setText("Dog needs to have a human");
		      }
			}
		});
		btnBuyDog.setBounds(179, 68, 117, 29);
		contentPane.add(btnBuyDog);
		
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setText(humans.getInfo());
			}
		});
		btnPrintInfo.setBounds(179, 101, 117, 29);
		contentPane.add(btnPrintInfo);
		
		 info = new JTextArea();
		info.setBounds(29, 142, 264, 42);
		contentPane.add(info);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(29, 122, 61, 16);
		contentPane.add(lblInfo);
		
		 error = new JTextArea();
		error.setBounds(29, 210, 264, 42);
		contentPane.add(error);
	}

}
