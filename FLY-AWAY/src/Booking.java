import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Booking {


	public int psngr_num = 0; // number of passengers

	//personal information:
    Stack <Integer> CodeID= new Stack(); //Ticket code
    Stack <Integer> CodeID_temp= new Stack(); 
	Object[][] dd=null;
	
	Stack<String> NationalID=new Stack();
	Stack<String> NationalID_temp=new Stack();

	
	Stack <String> FirstName=new Stack();
	Stack <String> FirstName_temp=new Stack();


	Stack <String> LastName=new Stack();
	Stack <String> LastName_temp=new Stack();

	
	char MorF[]=new char[psngr_num+5];	// SEX
	int[] Age=new int[psngr_num+5]; //AGE
	int n=0;//variable for random number generator
	public int IP; //for print info window
	
	//booking information:
	Stack<String> Location=new Stack();
	Stack<String> Location_temp=new Stack();

	Stack<String> Destination=new Stack();
	Stack<String> Destination_temp=new Stack();

	Stack<String> FlightTime=new Stack();
	Stack<String> FlightTime_temp=new Stack();

	

	public void PushCode(){  //Necessary to push codeID
		Random rand = new Random();
		psngr_num++; //increase number of passengers each time Code is generated
		n = rand.nextInt(23450) + 1;	//create random code for ID.. from 1 to 23450
		
		System.out.println("Passenger num: "+psngr_num+" Code: "+n);
		CodeID.push(n);
		IP=CodeID.peek(); // for Print info window
		System.out.println("peek code ID: "+IP);
		
	}

	public int popcode(){ // class of CodeID can be popped without this method.
		if(CodeID.isEmpty()==false){
		System.out.println("pop last element: "+CodeID.peek());
		return CodeID.pop();
		}
		else
			return 0;
	}
	public void PushNationalID(String ID){
		
	NationalID_temp.push(ID);
	NationalID_temp.push(ID);
		System.out.println("National ID has been pushed= "+NationalID.push(ID));	
	}
	
	
	public void PopNationalID(){
		System.out.println("Pop National ID num: "+NationalID.pop());
	}
	public void PushFirstName(String name){
		
		FirstName.push(name);


		System.out.println("push first name: "+name);
		
	}
	public void PushLastName(String name){
		
		LastName.push(name); 

		System.out.println("push last name: "+name);
		
	}
	public void PopFirstName(){
		System.out.println("first name pop:"+FirstName.pop());
		
	}
		
	public void PopLastName(){
		System.out.println("last name pop:"+LastName.pop());
	}
	
	public void MorF(char s){

		MorF[psngr_num]=s;
		System.out.println("Passenger num: "+psngr_num+" Sex: "+MorF[psngr_num]);
		
	}

	public void Age(int age){
	
		Age[psngr_num]=age;
		System.out.println("Passenger num: "+psngr_num+" Age: "+age);
		
	}


	public JFrame frmFlyAway;
	public JTextField txtEnterYourId;
	private JTextPane textPane;
	private JTextPane txtpnNationlId;
	private JEditorPane dtrpnEnterYourNationl;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	public JButton btnNewButton_1;
	public int item;
	public String index;
	public JButton button;
	public JButton button_1;

	public void initialize() {
		frmFlyAway = new JFrame();
		frmFlyAway.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFlyAway.setTitle("Fly Away");
		frmFlyAway.setBounds(100, 100, 873, 528);
		frmFlyAway.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFlyAway.getContentPane().setLayout(null);
		
		
		
		txtEnterYourId = new JTextField();
		txtEnterYourId.setToolTipText("");
		txtEnterYourId.setBounds(349, 177, 138, 33);
		frmFlyAway.getContentPane().add(txtEnterYourId);
		txtEnterYourId.setColumns(10);
	
		btnNewButton_1=new JButton("Delete");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(373, 250, 89, 44);
		frmFlyAway.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String INDEX= txtEnterYourId.getText();
				System.out.println("National ID to be deleted:"+INDEX);
			    Delete_National(INDEX);
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Enter The National ID To Delete the Flight");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(235, 22, 500, 100);
		frmFlyAway.getContentPane().add(lblNewLabel_1);
		
		
		button = new JButton("Return");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmFlyAway.setVisible(false);
				
			}
		});
		button.setBounds(25, 420, 88, 43);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmFlyAway.getContentPane().add(button);
		
		button_1 = new JButton("EXIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmFlyAway.setVisible(false);
				frmFlyAway.dispose();
			}
		});
		button_1.setBounds(748, 420, 88, 43);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmFlyAway.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nida Muk\\Desktop\\FLY-AWAY\\img\\white_airplane-wallpaper-1280x800.jpg"));
		lblNewLabel.setBounds(-38, -15, 895, 504);
		frmFlyAway.getContentPane().add(lblNewLabel);
		
	}
	
	
	public void Delete_National(String index) {
		
		//take the height and apply it on all information. 
			int height=NationalID.search(index); //find position of national ID
			
			if(height ==-1)
			{
				System.out.println("Invalid National ID. Not found.");
				JOptionPane.showMessageDialog(null, "Invalid National ID!\n  ID not found.");
			}
			else	{
				for(int i=1;i<=height;i++)
			{
				if(i!=height)
				NationalID_temp.push(NationalID.pop());
				else{ // if height located.. delete remaining info
					
				System.out.println("National ID removed:"+	NationalID.pop());
				
				}
			}
				Delete_FirstName(height);
				Delete_LastName(height);
				Delete_Location(height);
				Delete_Destination(height);
				Delete_FlightTime(height);
				Delete_age(height);
				Delete_sex(height);
		System.out.println("Original stack after deletion");
			for(int i=1;i<height;i++)
		System.out.println(NationalID.push(NationalID_temp.pop()));
		}
			
			}
	
	public void Delete_FirstName(int height) {
		
		if(height ==-1)
		{
			System.out.println("Invalid First Name. Not found.");
		}
		else
		{
		for(int i=1;i<=height;i++)
		{
			if(i!=height)
				FirstName_temp.push(FirstName.pop());
			else
			{
				System.out.println("First Name removed:"+FirstName.pop());
				}	
		}
		
	System.out.println("Original stack after deletion");
		for(int i=1;i<height;i++)
	System.out.println(FirstName.push(FirstName_temp.pop()));
		}	
	}
	public void Delete_LastName(int height) {
		 
		if(height ==-1)
			
		{
			System.out.println("Invalid Last Name. Not found.");
		}
		else{
			
		
		for(int i=1;i<=height;i++)
		{
			if(i!=height)
				LastName_temp.push(LastName.pop());
			else
			{
				System.out.println("Last Name removed:"+LastName.pop());
				}		
		}
		System.out.println("Original stack after deletion");
		for(int i=1;i<height;i++)
	   System.out.println(LastName.push(LastName_temp.pop()));
		}
	
		
	}
	
	public void Delete_Location(int height){
		
         if(height ==-1)
			
		{
			System.out.println("Invalid Location. Not found.");
		}
		else{
			
		
		for(int i=1;i<=height;i++)
		{
			if(i!=height)
				Location_temp.push(Location.pop());
			else
			{
				System.out.println("Location removed:"+Location.pop());
				}		
		}
		System.out.println("Original stack after deletion");
		for(int i=1;i<height;i++)
	   System.out.println(Location.push(Location_temp.pop()));
		}
		
	}
	
	public void Delete_Destination(int height){
		
        if(height ==-1)
			
		{
			System.out.println("Invalid Destination. Not found.");
		}
		else{
			
		
		for(int i=1;i<=height;i++)
		{
			if(i!=height)
				Destination_temp.push(Destination.pop());
			else
			{
				System.out.println("Destination removed:"+Destination.pop());
				}		
		}
		System.out.println("Original stack after deletion");
		for(int i=1;i<height;i++)
	   System.out.println(Destination.push(Destination_temp.pop()));
		}
		
	}
public void Delete_FlightTime(int height){
		
        if(height ==-1)
			
		{
			System.out.println("Invalid Flight Time. Not found.");
		}
		else{
			
		
		for(int i=1;i<=height;i++)
		{
			if(i!=height)
				FlightTime_temp.push(FlightTime.pop());
			else
			{
				System.out.println("Flight Time removed:"+FlightTime.pop());
				}		
		}
		System.out.println("Original stack after deletion");
		for(int i=1;i<height;i++)
	   System.out.println(FlightTime.push(FlightTime_temp.pop()));
		}
		
	}

	public void Delete_age(int height){
		
		for(int i=0 ; i < Age.length; i++){
			
			if(i==height){
				
				Age[i]=Age[i+1];
		System.out.println("Age removed:"+Age[height]);
				
			}
			
				
		}
		
		
	}
	public void Delete_sex(int height){
		
		
for(int i=0 ; i < MorF.length; i++){
			
			if(i==height){
				
				MorF[i]=MorF[i+1];
		System.out.println("Sex removed:"+MorF[height]);
				
			}
			
				
		}
		
		
	}
	
	
	
	
	

}
	

