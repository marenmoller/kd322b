package HousePackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class HouseGUIs extends JFrame {

	House[] houseAdress;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUIs frame = new HouseGUIs();
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
	public HouseGUIs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		House [] houseAdress = new House [10];{
			houseAdress[1] = new House(1984,120);
			houseAdress[2] = new House(1920,100);
			houseAdress[3] = new House(1862,50);
			houseAdress[4] = new House(1993,240);
			
			for(int i = 0; i < houseAdress.length ; i++){
				if(houseAdress[i]!= null){
					textArea.append("Det byggdes ett hus år: " + houseAdress[i].getYear() + " som er " + houseAdress[i].getSize() + " kvadrat meter stort\n");
				}else {
					System.out.println("no adress");
				}
			} textArea.append("Det finns " + House.getNbrOfHouses() + " hus.");
			}
		
	}

}
