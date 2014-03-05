package animal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		
	    ArrayList <Animal> myanimals = new ArrayList <Animal>();
	    
	    myanimals.add(new Dog("Ulf", 8, "pinner")); 
	    myanimals.add(new Dog("Uffe", 6, "liker ikke pinner")); 
	    myanimals.add(new Cat("Spliff", 10, "purrer")); 
	    myanimals.add(new Dog("Snibbe", 4, "purrer ikke")); 
	    myanimals.add(new Snake("Ulfan", "veldig giftig")); 
	    myanimals.add(new Snake("Ulfani", "ikke giftig")); 
	    
	    
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(236, 116, 1, 16);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(105, 129, 1, 16);
		contentPane.add(textArea_1);
		
		JTextArea animaltext = new JTextArea();
		animaltext.setBounds(44, 39, 348, 182);
		contentPane.add(animaltext);
		
		String text = "";
		for (int i =0; i <myanimals.size(); i++){
			Animal currentanimal = myanimals.get(i);
   		text += currentanimal.getInfo() + "\n";
			
		}
		animaltext.setText(text);
	}
}
