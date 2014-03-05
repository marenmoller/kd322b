package sykkle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BikeStoreGUI extends JFrame {
	

    
    
private JTextArea textArea;
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private BikeStore bikeStore;
private JButton btnAddBike;



/**

* Launch the application.

*/

public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
public void run() {
	try {
		BikeStoreGUI frame = new BikeStoreGUI();
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

public BikeStoreGUI() {
	bikeStore = new BikeStore();
	bikeStore.addBike("red", 10, 2500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

// text Area
textArea = new JTextArea();
textArea.setBounds(19, 29, 248, 184);
contentPane.add(textArea);
textArea.setText(bikeStore.getAllBikes());

// textField
textField = new JTextField();
textField.setBounds(333, 144, 99, 28);
contentPane.add(textField);
textField.setColumns(10);
textArea.append(bikeStore.getAllBikes());

// textfield 1
textField_1 = new JTextField();
textField_1.setBounds(333, 104, 99, 28);
contentPane.add(textField_1);
textField_1.setColumns(10);

// Button for adding bike
JButton btnAddBike = new JButton("Add bike");
btnAddBike.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
bikeStore.addBike(textField_2.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField.getText()));
textArea.setText(bikeStore.getAllBikes());
}
});
btnAddBike.setBounds(333, 184, 99, 29);
contentPane.add(btnAddBike);

// textField
textField_2 = new JTextField();
textField_2.setBounds(333, 64, 99, 28);
contentPane.add(textField_2);
textField_2.setColumns(10);

// lable for color
JLabel lblColor = new JLabel("Color");
lblColor.setBounds(287, 70, 34, 16);
contentPane.add(lblColor);

// lable for size
JLabel lblSize = new JLabel("Size");
lblSize.setBounds(287, 110, 34, 16);
contentPane.add(lblSize);

// lable for price
JLabel lblPrice = new JLabel("Price");
lblPrice.setBounds(286, 150, 61, 16);
contentPane.add(lblPrice);
}

}