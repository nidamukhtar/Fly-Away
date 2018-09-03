import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
public class Main {

	
	public JFrame frmFlyAway1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmFlyAway1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frmFlyAway1 = new JFrame();
		frmFlyAway1.setTitle("Fly Away");
		frmFlyAway1.setResizable(false);
		frmFlyAway1.setBounds(100, 100, 873, 528);
		frmFlyAway1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Sound.sound1.play();
		
		JButton btnBookNow = new JButton("Book Now");
		btnBookNow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBookNow.setBounds(60, 90, 107, 32);
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmFlyAway1.setVisible(false); // Main JFrame
				BookAFlight();
				initializeBAF();
				frmFlyAway.setVisible(true); // Book now JFrame
				
				
			}
		});
		frmFlyAway1.getContentPane().setLayout(null);
		frmFlyAway1.getContentPane().add(btnBookNow);
		

		JButton btnDisplayPassengers = new JButton("Flight Lists");
		btnDisplayPassengers.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDisplayPassengers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BAFinit==true){
					initializeDP();
				frmFlyAway2.setVisible(true);
				}
				else{
	System.out.println("There are no flights booked. Cannot display passengers.");
				
				JOptionPane.showMessageDialog(null, "Invalid Option!\nYou haven't booked any flights yet.");
				}
			}
		});
		
		btnDisplayPassengers.setBounds(60, 156, 107, 32);
		frmFlyAway1.getContentPane().add(btnDisplayPassengers);
		
		JButton btnDeleteFlight = new JButton("Delete Flight");
		
		btnDeleteFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(BAFinit==true){
				//	frmFlyAway1.setVisible(false);
				booking.frmFlyAway.setVisible(true);}
				else{
					System.out.println("You haven't booked any flights yet.");
			JOptionPane.showMessageDialog(null, "Invalid Option!\nYou haven't booked any flights yet.");
				}
				
				
			}
		});
		btnDeleteFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDeleteFlight.setBounds(60, 286, 107, 32);
		frmFlyAway1.getContentPane().add(btnDeleteFlight);
		
		JButton btnEditFlight = new JButton("Edit Flight");
		btnEditFlight.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEditFlight.setBounds(60, 224, 107, 32);
		frmFlyAway1.getContentPane().add(btnEditFlight);

		btnEditFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				if(BAFinit==true){
				frmFlyAway1.setVisible(false); 
				frmFlyAway3.setVisible(true);}
				else{
					System.out.println("You haven't booked any flights yet.");
					JOptionPane.showMessageDialog(null, "Invalid Option!\nYou haven't booked any flights yet.");
			}}
		});
	
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEXIT.setBounds(685, 424, 107, 32);
		frmFlyAway1.getContentPane().add(btnEXIT);
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					frmFlyAway1.setVisible(false);
					frmFlyAway1.dispose();
					Sound.sound1.stop();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Desktop\\FLY-AWAY\\img\\10.jpg"));
		lblNewLabel.setBounds(7, -15, 873, 528);
		frmFlyAway1.getContentPane().add(lblNewLabel);
		
		
		
	}
// Book A Flight
	public JFrame frmFlyAway;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public int IP;
	String NID;
	public boolean BAFinit=false;
	Booking booking=new Booking();
	PrintInfo PI=new PrintInfo();
	//DisplayPassengers DP=new DisplayPassengers();

	public String LastName;
	public String FirstName;
	public int age;
	public int nID;
	public int NationalID;
	public String Location;
	public String destination;
	public String location;
	public JTextField textField_4;
	 
	public void BookAFlight() {
		BAFinit=true;
		booking.initialize();
		booking.frmFlyAway.setVisible(false);
		initializeEdit();
		initializeChange();
		frmFlyAway3.setVisible(false);
		frmFlyAway4.setVisible(false);
	}

	public void initializeBAF() {
		frmFlyAway = new JFrame();
		frmFlyAway.setResizable(false);
		frmFlyAway.setTitle("Fly Away");
		frmFlyAway.setBounds(100, 100, 873, 528);
		frmFlyAway.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlyAway.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Personal Information:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(24, 226, 161, 28);
		frmFlyAway.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("First Name:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(133, 264, 69, 28);
		frmFlyAway.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Last Name:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_2.setBounds(478, 264, 81, 28);
		frmFlyAway.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FirstName=textField.getText();
				System.out.println("First Name: "+FirstName);	
				String Fn=FirstName;
				PI.textField_3.setText(Fn);

			}
		});
		
		
		textField.setForeground(SystemColor.textHighlight);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(212, 267, 112, 25);
		frmFlyAway.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 LastName=textField_1.getText();
				System.out.println("Last Name: "+LastName);
				
			}
		});
		textField_1.setForeground(SystemColor.textHighlight);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(561, 269, 112, 25);
		frmFlyAway.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("Sex: ");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_3.setBounds(133, 363, 69, 28);
		frmFlyAway.getContentPane().add(label_3);
		
		JRadioButton radioButton = new JRadioButton("Male");
		radioButton.setForeground(Color.BLACK);
		radioButton.setBounds(184, 367, 81, 23);
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				booking.MorF('M');
				PI.textField_7.setText("Male");
			}
		});
		frmFlyAway.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Female");
		
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				booking.MorF('F');
				PI.textField_7.setText("Female");

			}
		});
		radioButton_1.setForeground(Color.BLACK);
		radioButton_1.setBounds(293, 367, 109, 23);
		frmFlyAway.getContentPane().add(radioButton_1);
		
		JLabel label_4 = new JLabel("Age:");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_4.setBounds(478, 317, 69, 28);
		frmFlyAway.getContentPane().add(label_4);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String AGE= textField_2.getText();
				age=Integer.parseInt(AGE); // convert string to int
				booking.Age(age);
				PI.textField_6.setText(AGE);
			}
		});
		textField_2.setForeground(SystemColor.textHighlight);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(518, 322, 48, 25);
		frmFlyAway.getContentPane().add(textField_2);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frmFlyAway.setVisible(false);
				frmFlyAway1.setVisible(true);
				
			}
			
		});
		btnReturn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnReturn.setBounds(32, 422, 88, 43);
		frmFlyAway.getContentPane().add(btnReturn);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PI.validate();
				PI.repaint();
				PI.setVisible(true);	
			
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Downloads\\printer.png"));
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button_1.setBounds(784, 23, 48, 43);
		frmFlyAway.getContentPane().add(button_1);
		
		JLabel label_5 = new JLabel("National ID:");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_5.setBounds(133, 317, 69, 28);
		frmFlyAway.getContentPane().add(label_5);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 NID=textField_3.getText();
			PI.textField_5.setText(NID);
				
				
				
			}
		});
		textField_3.setForeground(SystemColor.textHighlight);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 322, 112, 25);
		frmFlyAway.getContentPane().add(textField_3);
	
		
		JLabel label_6 = new JLabel("Booking Information:");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_6.setBounds(24, 23, 161, 28);
		frmFlyAway.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Location:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(133, 62, 60, 28);
		frmFlyAway.getContentPane().add(label_7);
		

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setForeground(SystemColor.textHighlight);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(561, 131, 81, 23);
		frmFlyAway.getContentPane().add(textField_4);
		
		//Flight time
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String s=(String) comboBox_2.getSelectedItem();
				PI.FlightTime=s;
				
				if(PI.textField_9!=null){
				if(comboBox_2.getSelectedItem()=="7:30 am"){
					     textField_4.setText("11:30 am");
					     PI.textField_10.setText("7:30 am");
					     PI.textField_11.setText("11:30 am");
				}
				else if(comboBox_2.getSelectedItem()=="8:30 pm"){
						     textField_4.setText("10:30 pm");
						     PI.textField_10.setText("8:30 pm");
						     PI.textField_11.setText("10:30 pm");
						     
				}
			}}
		});
		comboBox_2.setBackground(new Color(95, 158, 160));
		comboBox_2.setBounds(216, 126, 81, 20);
		frmFlyAway.getContentPane().add(comboBox_2);
		comboBox_2.addItem("7:30 am");
		comboBox_2.addItem("8:30 pm");
		
		//Destination
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(95, 158, 160));
		comboBox_1.setBounds(561, 67, 81, 20);
		frmFlyAway.getContentPane().add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Selected Destination:"+comboBox_1.getSelectedItem());
				PI.textField_9.setText((String) comboBox_1.getSelectedItem());
				
				

				
			}
		});
		comboBox_1.setBackground(new Color(95, 158, 160));
	
		
		//Location
		final JComboBox comboBox = new JComboBox();
		comboBox.addItem("Riyadh");
		comboBox.addItem("Jeddah");
		comboBox.addItem("Ha'il");
		comboBox.addItem("Dammam");
		comboBox.addItem("Abhaa");
		
		comboBox.setBackground(new Color(95, 158, 160));
		comboBox.setBounds(216, 67, 81, 20);
		frmFlyAway.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				PI.textField_8.setText((String) comboBox.getSelectedItem());
				
				comboBox_1.removeAllItems();
				if(comboBox.getSelectedItem()=="Riyadh")
				{
					comboBox_1.addItem("Jeddah");
					comboBox_1.addItem("Ha'il");
					comboBox_1.addItem("Dammam");
					comboBox_1.addItem("Abhaa");
				}
				else
					comboBox_1.addItem("Riyadh");
				System.out.println("Selected Location:"+comboBox.getSelectedItem());
				

			}
		});
		
		
		
		JLabel label_8 = new JLabel("Destination:");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_8.setBounds(478, 62, 69, 28);
		frmFlyAway.getContentPane().add(label_8);
		
		JLabel lblArrivalTime = new JLabel("Arrival Time:");
		lblArrivalTime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblArrivalTime.setBounds(478, 126, 81, 28);
		frmFlyAway.getContentPane().add(lblArrivalTime);
		
		JLabel lblFlightTime = new JLabel("Flight Time:");
		lblFlightTime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFlightTime.setBounds(133, 121, 81, 28);
		frmFlyAway.getContentPane().add(lblFlightTime);
		
		//SAVE button 		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Everything is saved and submited");
			System.out.println("Location pushed:"+	booking.Location.push((String) comboBox.getSelectedItem()));
			System.out.println("Destination pushed:"+booking.Destination.push((String) comboBox_1.getSelectedItem()));
				booking.FlightTime.push((String) comboBox_2.getSelectedItem());	
				booking.PushFirstName(FirstName);
				booking.PushLastName(LastName);
				booking.PushCode();
				String LN=booking.LastName.peek();
				PI.code=booking.CodeID.peek();
				PI.textField_4.setText(LN);
				booking.PushNationalID(NID);

			}
		});
		
		button_2.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Downloads\\save.png"));
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button_2.setBounds(732, 23, 48, 43);
		frmFlyAway.getContentPane().add(button_2);
		
		//EXIT button
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFlyAway.setVisible(false);
				frmFlyAway.dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnExit.setBounds(732, 422, 88, 43);
		frmFlyAway.getContentPane().add(btnExit);
	
	}
	
	
// Display Passengers
	public JFrame frmFlyAway2; //Display Passengers;
	public JTable table;
	public String s;

	
	String[] columnNames = {"First Name",
            "Last Name",
            "Ticket Code",
            "Location",
            "Destination","Flight Time"};
	

	public void DisplayPassengers() {
		initializeDP();
	}

	public void initializeDP() {
		frmFlyAway2 = new JFrame();
		frmFlyAway2.setTitle("Fly Away");
		frmFlyAway2.setResizable(false);

		frmFlyAway2.setBounds(100, 100, 873, 528);
		frmFlyAway2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlyAway2.getContentPane().setLayout(null);
		
		JLabel lblFlightLists = new JLabel("Flight Lists:");
		lblFlightLists.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblFlightLists.setBounds(31, 11, 161, 28);
		frmFlyAway2.getContentPane().add(lblFlightLists);
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 837, 381);
		frmFlyAway2.getContentPane().add(scrollPane);
		
		
		 final Object[][] data1 = {
				 {"Mary", "MUK",24545, "Jeddah", "Riyadh","7:30am"}, 
				 {"Nida", "MUK",1124, "Jeddah", "Riyadh","7:30am"},
				 {"Amal", "MUK",10004, "Riyadh", "Abhaa","7:30am"},
				 {"Hind", "HM",11190, "Riyadh", "Jeddah","8:30pm"},
	        };
	
		JButton button = new JButton("Return");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size=booking.FirstName_temp.size();
				System.out.println("size in retutn of temp1:"+size);
				for (int j=0;j<size;j++){
					booking.FirstName.push(booking.FirstName_temp.pop());
				
					booking.LastName.push(booking.LastName_temp.pop());
				
					booking.CodeID.push(booking.CodeID_temp.pop());
				
					booking.Location.push(booking.Location_temp.pop());
				
					booking.Destination.push(booking.Destination_temp.pop());
				
					booking.FlightTime.push(booking.FlightTime_temp.pop());
				}
				frmFlyAway2.setVisible(false);
				frmFlyAway1.setVisible(true);
				
	System.out.println("size of temp in return of DP:"+booking.FirstName_temp.size());
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button.setBounds(20, 435, 88, 43);
		frmFlyAway2.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("Display All Passengers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Display all psngrs button");
				int size=booking.FirstName.size();
				System.out.println("SIZE:"+size);
				initTableData(size);
				scrollPane.setViewportView(table);
				
				
			}

			
		});
		btnNewButton.setBounds(104, 10, 161, 34);
		frmFlyAway2.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmFlyAway2.setVisible(false);
				frmFlyAway2.dispose();
				
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnExit.setBounds(745, 435, 88, 43);
		frmFlyAway2.getContentPane().add(btnExit);
	}

	public void initTableData(int size) {
		final Object[][] data= new Object[size][6];
		String s;
		int a;
		
		System.out.println("size of firstname:"+size);		
		for(int i=0;i<size;i++){
			for(int j=0;j<6;j++){
				if(j==0)//First name
				{
					s=booking.FirstName.pop();
					booking.FirstName_temp.push(s);
					data[i][0]=s;
				System.out.println("data[i][0]:"+data[i][0]+"i=:"+i);
				}
				else if(j==1)//Last name
				{
					s=booking.LastName.pop();
					booking.LastName_temp.push(s);
					data[i][1]=s;
					System.out.println("data[i][1]:"+data[i][1]);

				}
				else if(j==2)//ticket code
				{
					a=booking.CodeID.pop();
					booking.CodeID_temp.push(a);
					data[i][2]=a;
				}
				else if(j==3)//Location
				{
					s=booking.Location.pop();
					booking.Location_temp.push(s);
					data[i][3]=s;
				}
				else if(j==4)//Destination
					{
					s=booking.Destination.pop();
					booking.Destination_temp.push(s);
					data[i][4]=s;
				}
			else if(j==5)//Flight time
			{
				s=booking.FlightTime.pop();
				booking.FlightTime_temp.push(s);
				data[i][5]=s;
			}
			}
				
			}
		System.out.println("size of temp in DP:"+booking.FirstName_temp.size());
		System.out.println(booking.FirstName.isEmpty());
		table = new JTable(data, columnNames);
		table.setEnabled(false);
		
	}
	
	//CHANGE
		String INDEX;
		
		public JFrame frmFlyAway3;
		public JTextField txtEnterYourId3;
		private JTextPane textPane3;
		private JTextPane txtpnNationlId3;
		private JEditorPane dtrpnEnterYourNational3;
		private JPasswordField passwordField3;
		private JButton btnNewButton3;
		public JButton btnNewButton_13;
		public int item3;
		public String index3;
		public JButton button3;
		public JButton button_13;
		
		public void initializeEdit() {
			frmFlyAway3 = new JFrame();
			frmFlyAway3.setFont(new Font("Dialog", Font.BOLD, 12));
			frmFlyAway3.setTitle("Fly Away");
			frmFlyAway3.setBounds(100, 100, 873, 528);
			frmFlyAway3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmFlyAway3.getContentPane().setLayout(null);
			
			
			
			
			txtEnterYourId3 = new JTextField();
			txtEnterYourId3.setToolTipText("");
			txtEnterYourId3.setBounds(349, 177, 138, 33);
			frmFlyAway3.getContentPane().add(txtEnterYourId3);
			txtEnterYourId3.setColumns(10);
		
			btnNewButton_13=new JButton("Next");
			btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_13.setBounds(373, 250, 89, 44);
			frmFlyAway3.getContentPane().add(btnNewButton_13);
			btnNewButton_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					INDEX= txtEnterYourId3.getText();
					System.out.println("National ID to change:"+INDEX);	
					
					if(booking.NationalID.search(INDEX)==-1){
						JOptionPane.showMessageDialog(null, "Invalid National ID\n   Try Again.");
					}
					else
					{
						frmFlyAway4.setVisible(true);
						frmFlyAway3.setVisible(false);

					}
				}
			});
			
			JLabel lblNewLabel_13 = new JLabel("Enter National ID To Edit The Flight:");
			lblNewLabel_13.setForeground(new Color(0, 0, 0));
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_13.setBounds(255, 22, 500, 100);
			frmFlyAway3.getContentPane().add(lblNewLabel_13);
			
			
			button3 = new JButton("Return");
			frmFlyAway3.getContentPane().add(button3);
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					frmFlyAway3.setVisible(false);
					frmFlyAway1.setVisible(true);
					
				}
			});
			button3.setBounds(25, 420, 88, 43);
			button3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			frmFlyAway3.getContentPane().add(button3);
			
			button_13 = new JButton("EXIT");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frmFlyAway3.setVisible(false);
					frmFlyAway3.dispose();
				}
			});
			button_13.setBounds(748, 420, 88, 43);
			button_13.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			frmFlyAway3.getContentPane().add(button_13);
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Desktop\\FLY-AWAY\\img\\white_airplane-wallpaper-1280x800.jpg"));
			lblNewLabel.setBounds(-38, -15, 895, 504);
			frmFlyAway3.getContentPane().add(lblNewLabel);
			
		}

		String A;
		String B;
		
		public JFrame frmFlyAway4;
		public JTextField txtEnterYourId4;
		private JTextPane textPane4;
		private JTextPane txtpnNationlId4;
		private JEditorPane dtrpnEnterYourNationl4;
		private JPasswordField passwordField4;
		private JButton btnNewButton4;
		public JButton btnNewButton_14;
		public int item4;
		public String index4;
		public JButton button4;
		public JButton button_14;
		public JButton btnReturn;
		public JLabel label_8;
		public JLabel label_0;

		public void initializeChange() {
			frmFlyAway4 = new JFrame();
			frmFlyAway4.setFont(new Font("Dialog", Font.BOLD, 12));
			frmFlyAway4.setTitle("Fly Away");
			frmFlyAway4.setBounds(100, 100, 873, 528);
			frmFlyAway4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmFlyAway4.getContentPane().setLayout(null);
			
			JLabel lblNewLabel_14 = new JLabel("Pick Location and Destination:");
			lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_14.setBounds(285, 22, 293, 54);
			frmFlyAway4.getContentPane().add(lblNewLabel_14);
			
			JLabel label_8 = new JLabel("Location");
			label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label_8.setBounds(209, 76, 115, 54);
			frmFlyAway4.getContentPane().add(label_8);
			
			JLabel label_0 = new JLabel("Destination");
			label_0.setFont(new Font("Tahoma", Font.PLAIN, 16));
			label_0.setBounds(580, 76, 115, 54);
			frmFlyAway4.getContentPane().add(label_0);
			
			button4 = new JButton("Return");
			frmFlyAway4.getContentPane().add(button4);
			button4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					frmFlyAway4.setVisible(false);
					frmFlyAway1.setVisible(true);
					
				}
			});
			button4.setBounds(25, 420, 88, 43);
			button4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			frmFlyAway4.getContentPane().add(button4);
			
			button_14 = new JButton("EXIT");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frmFlyAway4.setVisible(false);
					frmFlyAway4.dispose();
				}
			});
			button_14.setBounds(748, 420, 88, 43);
			button_14.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			frmFlyAway4.getContentPane().add(button_14);
			
			
			//Destination
			final JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBackground(new Color(95, 158, 160));
			comboBox_1.setBounds(570, 141, 100, 20);
			frmFlyAway4.getContentPane().add(comboBox_1);
			comboBox_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("Selected Destination:"+comboBox_1.getSelectedItem());
					A = ((String) comboBox_1.getSelectedItem());		
					Change_Flight(INDEX);
				}
			});
			comboBox_1.setBackground(new Color(95, 158, 160));
					
			//Location
			final JComboBox comboBox = new JComboBox();
			comboBox.addItem("Riyadh");
			comboBox.addItem("Jeddah");
			comboBox.addItem("Ha'il");
			comboBox.addItem("Dammam");
			comboBox.addItem("Abhaa");
			
			comboBox.setBackground(new Color(95, 158, 160));
			comboBox.setBounds(190, 141, 100, 20);
			frmFlyAway4.getContentPane().add(comboBox);
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					B = ((String) comboBox.getSelectedItem());
				
					comboBox_1.removeAllItems();
					if(comboBox.getSelectedItem()=="Riyadh")
					{
						comboBox_1.addItem("Jeddah");
						comboBox_1.addItem("Ha'il");
						comboBox_1.addItem("Dammam");
						comboBox_1.addItem("Abhaa");
					}
					else
						comboBox_1.addItem("Riyadh");
					System.out.println("Selected Location:"+comboBox.getSelectedItem());
				}
			});	
			
			
		}	
		
			public void Change_Flight(String index){
				
				
					int height=booking.NationalID.search(INDEX); //find position of national ID
					
					if(height ==-1)
					{
				System.out.println("Invalid National ID. Not found.");
				JOptionPane.showMessageDialog(null, "Invalid National ID.");
						
					}
					
					else	{
						for(int i=1;i<=height;i++)
					{
						if(i!=height){
						booking.Destination_temp.push(booking.Destination.pop());
						booking.Location_temp.push(booking.Location.pop());}
						else{
						booking.Destination.pop();
						booking.Location.pop();
						System.out.println("Location pushed:"+	booking.Location.push(B));
						System.out.println("Destination pushed:"+ booking.Destination.push(A));
						}
							}
					}
			

			
	}
}