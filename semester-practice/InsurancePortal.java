import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PolicyAlreadyExistException extends Exception{
	public PolicyAlreadyExistException(String s){
		super(s);
	}
}


class Insurance
{
	private int policyNumber;
	private String policyName,policyHolderName,policytype;
	private double premium;
	
	Insurance(Insurance I)
	{
		this.policyNumber=I.policyNumber;
		this.policyName=I.policyName;
		this.policyHolderName=I.policyHolderName;
		this.policytype=I.policytype;
		this.premium=I.premium;
	}
	
	Insurance(int pn,String name,String holder,double prime, String typ)
	{
		policyNumber=pn;
		policyName=name;
		policyHolderName=holder;
		policytype=typ;
		premium=prime;
	}
	
	public int getNum()
	{
		return policyNumber;
	}
	public String getName()
	{
		return policyName;
	}
	public String getHolder()
	{
		return policyHolderName;
	}
	public double getPre()
	{
		return premium;
	}
	public String getTyp()
	{
		return policytype;
	}

}

public class InsurancePortal
{
	ArrayList<Insurance> policies=new ArrayList<Insurance>();
	InsurancePortal()
	{
		JFrame f=new JFrame("Insurance Portal");
		
		JLabel l0=new JLabel("Welcome to Online Policy Booking Portal");
		l0.setBounds(25,5,245,50);
		f.add(l0);
		
		JLabel l1=new JLabel("Policy Number: ");
		JLabel l2=new JLabel("Policy Name: ");
		JLabel l3=new JLabel("Policy Holder: ");
		JLabel l4=new JLabel("Premium: ");
		JLabel l5=new JLabel("Policy type: ");
		l1.setBounds(5,60,140,30);
		l2.setBounds(5,100,110,30);
		l3.setBounds(5,140,110,30);
		l4.setBounds(5,180,110,30);
		l5.setBounds(5,230,110,30);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);

		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		JRadioButton rb1=new JRadioButton("Vehicle Insurance");
		JRadioButton rb2=new JRadioButton("Personal Insurance");
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		t1.setBounds(130,60,140,30);
		t2.setBounds(130,100,140,30);
		t3.setBounds(130,140,140,30);
		t4.setBounds(130,180,140,30);
		rb1.setBounds(130,230,140,15);
		rb2.setBounds(130,248,140,15);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(rb1);
		f.add(rb2);
		
		
		JTextArea ta=new JTextArea();
		ta.setEditable(false);
		ta.setBounds(300,0,690,320);
		f.add(ta);

		JButton b=new JButton("Submit");
		b.setBounds(40,290,100,30);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				try{
				String name,holder,typ;
				int num;
				double premium;
				num=Integer.parseInt(t1.getText());
				name=t2.getText();
				holder=t3.getText();
				premium=Double.parseDouble(t4.getText());
				if(t1.getText().isEmpty() || name.isEmpty() || holder.isEmpty() || t4.getText().isEmpty()){
					ta.setText("Enter All Details!");
					return;
				}
				if(rb1.isSelected()){
					typ="Vehicle Insurance";
				}
				else if(rb2.isSelected()){
					typ="Personal Insurance";
				}
				else{
					ta.setText("Enter All Details!");
					return;
				}
				try
				{
					addPolicy(num,name,holder,premium,typ);
				}
				catch(PolicyAlreadyExistException paee){
					ta.setText("Policy number already Used!");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					bg.clearSelection();
					return;
				}
				ta.setText("Policy Added Successfully!");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				bg.clearSelection();
			
			}catch(Exception E){
					ta.setText("Error: Enter all Details!");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					bg.clearSelection();
					return;
			}
		}
		});


		JButton b1=new JButton("Display");
		b1.setBounds(160,290,100,30);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Insurance Ins=null;
				Iterator <Insurance> itr=policies.iterator();
				String out="";
				while(itr.hasNext()){
					Ins=itr.next();
					out+="policyNumber: "+String.valueOf(Ins.getNum())+" ";
					out+=" policyName: "+Ins.getName()+"  ";
					out+=" policyHolder: "+Ins.getHolder()+"  ";
					out+=" Premium: "+String.valueOf(Ins.getPre())+"  ";
					out+=" Type: "+Ins.getTyp()+"\n";
				}
				ta.setText(out);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				bg.clearSelection();
				return;
			}
		});


		f.add(b);
		f.add(b1);

		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(1000,370);
		f.setLayout(null);
		f.setVisible(true);	
	}

	public void addPolicy(int id, String name, String holder, double pri, String typ) throws PolicyAlreadyExistException
	{	
		Insurance Ins=null;
		Iterator <Insurance> itr=policies.iterator();
		while(itr.hasNext()){
			Ins=itr.next();
			if(Ins.getNum()==id){
				throw new PolicyAlreadyExistException("Policy number already Used");
			}
		}
		Ins=new Insurance(id,name,holder,pri,typ);
		policies.add(Ins);
		return;
	}
	
	public static void main(String [] args)
	{
		new InsurancePortal();
	}
}