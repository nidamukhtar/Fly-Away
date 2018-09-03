import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class PrintInfo extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	
	public int code;
	public String FirstName;
	public String LastName;
	public String NationalID;
	public char MorF;
	public int age;
	public String FlightTime;
	public String ArrivalTime;
	
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public String location;
	public String destination;
	public JTextField textField_10;
	public JTextField textField_11;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintInfo frame = new PrintInfo();
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
	public PrintInfo() {
		setTitle("Fly Away");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJ = new JLabel("");
		lblJ.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Downloads\\stock_people.png"));
		lblJ.setBounds(23, 11, 122, 141);
		contentPane.add(lblJ);
		
		JLabel label = new JLabel("First Name:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label.setBounds(225, 74, 69, 28);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Last Name:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_1.setBounds(534, 74, 81, 28);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Age:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_2.setBounds(534, 134, 69, 28);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("National ID:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_3.setBounds(225, 134, 69, 28);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Sex: ");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_4.setBounds(225, 195, 69, 28);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Personal Information:");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_5.setBounds(206, 35, 161, 28);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Booking Information:");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_6.setBounds(206, 234, 161, 28);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Location:");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_7.setBounds(225, 277, 60, 28);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Destination:");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		label_8.setBounds(534, 277, 69, 28);
		contentPane.add(label_8);
		
		JLabel lblTicketCode = new JLabel("Ticket Code:");
		lblTicketCode.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTicketCode.setBounds(72, 362, 122, 28);
		contentPane.add(lblTicketCode);
		
		textField_2 = new JTextField();		
		textField_2.setEditable(false);
		textField_2.setBackground(SystemColor.control);
		textField_2.setBounds(344, 418, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=new String();
				s="  "+code;
				
				textField_2.setText(s);
				
			}
		});
		
		button.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Downloads\\1906-200.png"));
		button.setBounds(301, 362, 177, 53);
		contentPane.add(button);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(304, 79, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(613, 79, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText((String) null);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.menu);
		textField_5.setBounds(304, 139, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		String agge=new String();
		
		
		textField_6.setText((String) null);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.menu);
		textField_6.setBounds(569, 139, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText((String) null);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.menu);
		textField_7.setBounds(258, 200, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText(location);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.menu);
		textField_8.setBounds(304, 282, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText(destination);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.menu);
		textField_9.setBounds(613, 282, 86, 20);
		contentPane.add(textField_9);
		
		JButton button_1 = new JButton("EXIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				dispose();
				
			}
			
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		button_1.setBounds(671, 395, 88, 43);
		contentPane.add(button_1);
		
		JLabel lblFlightTime = new JLabel("Flight Time:");
		lblFlightTime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFlightTime.setBounds(225, 316, 69, 28);
		contentPane.add(lblFlightTime);
		
		JLabel lblArrivalTime = new JLabel("Arrival Time:");
		lblArrivalTime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblArrivalTime.setBounds(534, 324, 81, 28);
		contentPane.add(lblArrivalTime);
		
		textField_10 = new JTextField();
		textField_10.setText((String) null);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(SystemColor.menu);
		textField_10.setBounds(304, 321, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText((String) null);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.menu);
		textField_11.setBounds(613, 329, 86, 20);
		contentPane.add(textField_11);
		
		
		
		
		
		
		
	
		
		
		
	}
}
