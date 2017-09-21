import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/*
 * Please visit http://www.techronnati.com/forums/java-jse-jee-java-frameworks/ for more tools and other projects
 * 
 * 
 */

public class EmployeeDetails implements ActionListener{
	//declare
	private JFrame mainframe;
	private JPanel mainpane;
	private JLabel lblLastName;
	private JLabel lblFirstName;
	private JLabel lblAddress;
	private JLabel lblCity;
	private JLabel lblSSSNumber;
	private JButton btnSearch;
	private JButton btnCancel;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtCity;
	private JTextField txtAddress;
	private JTextField txtSSSNumber;
	private GridBagLayout gbl;
	private GridBagConstraints gbc;
	private JButton btnsave;
	private JTextField txtid;
	private JLabel lblid;
	
	
	
	
	
	public EmployeeDetails(){
		//init
		mainframe = new JFrame("Employee Detail");
		mainpane = new JPanel();
		lblLastName = new JLabel("Last Name:");
		lblFirstName = new JLabel("First Name:");
		lblAddress = new JLabel("Address:");
		lblCity = new JLabel("City:");
		lblSSSNumber = new JLabel("SSS Number");
		btnSearch = new JButton("Search");
		btnCancel = new JButton("Cancel");
		txtLastName = new JTextField(15);
		txtFirstName = new JTextField(15);
		txtCity = new JTextField(15);
		txtAddress = new JTextField(15);
		txtSSSNumber = new JTextField(15);
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		btnsave = new JButton("Save");
		txtid = new JTextField(10);
		lblid = new JLabel ("ID: ");
		//add
		
	
		gbc.insets = new Insets(5,5,5,5);
		gbc.anchor = GridBagConstraints.WEST;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbl.setConstraints(lblid, gbc);
		mainpane.add(lblid);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbl.setConstraints(txtid, gbc);
		mainpane.add(txtid);
		
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbl.setConstraints(lblLastName, gbc);
		mainpane.add(lblLastName);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbl.setConstraints(txtLastName,gbc);
		mainpane.add(txtLastName);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbl.setConstraints(lblFirstName, gbc);
		mainpane.add(lblFirstName);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbl.setConstraints(txtFirstName, gbc);
		mainpane.add(txtFirstName);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbl.setConstraints(lblAddress, gbc);
		mainpane.add(lblAddress);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbl.setConstraints(txtAddress, gbc);
		mainpane.add(txtAddress);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbl.setConstraints(lblCity, gbc);
		mainpane.add(lblCity);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbl.setConstraints(txtCity,gbc);
		mainpane.add(txtCity);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbl.setConstraints(lblSSSNumber, gbc);
		mainpane.add(lblSSSNumber);
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbl.setConstraints(txtSSSNumber, gbc);
		mainpane.add(txtSSSNumber);
		

		gbc.gridx = 1;
		gbc.gridy = 6;
		gbl.setConstraints(btnSearch, gbc);
		mainpane.add(btnSearch);
		btnSearch.addActionListener(this);
		
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbl.setConstraints(btnCancel, gbc);
		mainpane.add(btnCancel);
		btnCancel.addActionListener(this);
		
		
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbl.setConstraints(btnsave, gbc);
		mainpane.add(btnsave);
		
		//add the frame
		mainframe.getContentPane().add(mainpane);
		mainpane.setLayout(gbl);
	
		
		//set the frame
		mainframe.pack();
		mainframe.setResizable(false);
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new EmployeeDetails();
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==btnSearch){
			JOptionPane.showMessageDialog(mainframe, txtLastName.getText() + "\n" +txtFirstName.getText() + "\n" + txtAddress.getText() + "\n" + txtCity.getText() + "\n" + txtSSSNumber.getText(),"TITLE", JOptionPane.INFORMATION_MESSAGE);
		}else if(source==btnCancel){
			System.exit(0);
			
			
			
		}
		
	}
}
