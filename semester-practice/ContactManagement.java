import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NameComparator implements Comparator<Contact>{
public int compare(Contact C1,Contact C2){
		return C1.getna().compareTo(C2.getna());
}
}

class ContactNotFoundException extends Exception{
	public ContactNotFoundException(String s){
		super(s);
	}
}

class Contact
{
	private String name,phno,type;
	
	Contact(Contact C){
		this.name=C.name;
		this.phno=C.phno;
		this.type=C.type;
	}

	Contact(String name, String ph, String ty){
		this.name=name;
		this.phno=ph;
		this.type=ty;
	}
	
	String getph(){
		return phno;
	}
	String getna(){
		return name;
	}
	String getty(){
		return type;
	}
}

public class ContactManagement{
	ArrayList<Contact> contacts=new ArrayList<Contact>();
	ContactManagement(){
	JFrame f=new JFrame("Contacts");

	JLabel l0=new JLabel("Contact Management");
	JLabel l1=new JLabel("Name: ");
	JLabel l2=new JLabel("Ph. No: ");
	JLabel l3=new JLabel("Type: ");
	l0.setBounds(20,10,200,40);
	l1.setBounds(30,60,100,40);
	l2.setBounds(30,110,100,40);
	l3.setBounds(30,160,100,40);
	f.add(l0);f.add(l1);f.add(l2);f.add(l3);

	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	t1.setBounds(150,65,150,30);
	t2.setBounds(150,115,150,30);
	f.add(t1);f.add(t2);

	JRadioButton rb1=new JRadioButton("Family");
	JRadioButton rb2=new JRadioButton("Official");
	rb1.setBounds(150,160,80,40);
	rb2.setBounds(250,160,80,40);
	ButtonGroup bg=new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);
	f.add(rb1);
	f.add(rb2);

	JTextArea ta=new JTextArea();
	ta.setEditable(false);
	ta.setBounds(360,0,440,400);
	f.add(ta);

	JButton b1= new JButton("Add Contact");
	JButton b2= new JButton("Search Contact");
	JButton b3= new JButton("Display Contact");

	b1.setBounds(10,220,100,40);
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try
			{
			String name,num,ty;
			name=t1.getText();
			num=t2.getText();
			if (name.isEmpty() || num.isEmpty()) {
                ta.setText("Name and phone number cannot be empty");
                return;
			}
			if(rb1.isSelected()){
				ty="Family";
			}
			else if(rb2.isSelected()){
				ty="Official";
			}
			else{
				ta.setText("Invalid Input (or) Error");
				t1.setText("");
				t2.setText("");
				return;
			}
			Contact c=new Contact(name,num,ty);
			addToList(c);
			ta.setText("Contact Saved!");
			t1.setText("");
			t2.setText("");
			bg.clearSelection();
			}
			catch(Exception exc){
				ta.setText("Invalid Input (or) Error");
				t1.setText("");
				t2.setText("");
				bg.clearSelection();
			}
		}
	}
	);
	

	b2.setBounds(120,220,100,40);
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
				try{
				String num=t2.getText();
				Contact C=searchContact(num);
				String Out="Name: "+C.getna()+"\nPh.No: "+ C.getph()+"\nType: "+ C.getty() +"\n";
				ta.setText(Out);
				t1.setText("");
				t2.setText("");
				bg.clearSelection();
				}
				catch(Exception erro){
				ta.setText("Contact Not Found!");
				t1.setText("");
				t2.setText("");
				bg.clearSelection();
			}
		}
	}
	);


	b3.setBounds(230,220,100,40);
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Display();
			Iterator<Contact> itr=contacts.iterator();
			Contact C=null;
			String out="";
			while(itr.hasNext()){
				C=itr.next();
				out+="Name: "+C.getna()+" Ph.No: "+ C.getph()+" Type: "+ C.getty() +"\n";
			}
			ta.setText(out);
			t1.setText("");
			t2.setText("");
			bg.clearSelection();
		}
	}
	);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	

	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setSize(800,400);
	f.setLayout(null);
	f.setVisible(true);
	}
	
public void addToList(Contact C){
	contacts.add(C);
}

public Contact searchContact(String num) throws ContactNotFoundException{
	Iterator<Contact> itr=contacts.iterator();
	int flag=1;
	Contact C=null;
	while(itr.hasNext()){
		C=itr.next();
		if(C.getph().equals(num)){
			flag=0;
			break;
		}
	}
	if(flag==0){
		return C;
	}
	else{
		throw new ContactNotFoundException("Contact Not Found!");
	}
	
}

public void Display(){
	Collections.sort(contacts,new NameComparator());
	return;

}

public static void main(String[]args){
 new ContactManagement();
}
}