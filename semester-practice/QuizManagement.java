import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class NullFieldException extends Exception
{
	public NullFieldException(String s)
	{
		super(s);
	}
}



class Student
{
	private String name;
	private String regno;
	private int score;
	private int noofQ;
	private	double avg;

	Student(String n, String r, int s,int q,double avg){
		this.name=n;
		this.regno=r;
		this.score=s;
		this.noofQ=q;
		this.avg=avg;
	}

	Student(Student s){
		this.name=s.name;
		this.regno=s.regno;
		this.score=s.score;
		this.noofQ=s.noofQ;
		this.avg=s.avg;
	}

	String getName(){
		return name;
	}
	String getReg(){
		return regno;
	}
	int getScore(){
		return score;
	}
	int getQ(){
		return noofQ;
	}
	double getAvg(){
		return avg;
	}
}

class QuizManagement
{
	ArrayList<Student> arr=new ArrayList<Student>();
	ListIterator<Student> itr= arr.listIterator();
	Student stud=null;
	QuizManagement(){
		JFrame  f=new JFrame("Quiz Management");
		
		JLabel l0=new JLabel("Enter the Details");
		JLabel l1=new JLabel("Name: ");
		JLabel l2=new JLabel("Reg.No: ");
		JLabel l3=new JLabel("Total Score: ");
		JLabel l4=new JLabel("No.Of.Quizzes: ");
		l0.setBounds(100,10,200,15);
		l1.setBounds(50,40,150,30);
		l2.setBounds(50,90,150,30);
		l3.setBounds(50,140,150,30);
		l4.setBounds(50,190,150,30);
		f.add(l0);
		f.add(l1);f.add(l2);f.add(l3);f.add(l4);


		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		t1.setBounds(200,40,150,30);
		t2.setBounds(200,90,150,30);
		t3.setBounds(200,140,150,30);
		t4.setBounds(200,190,150,30);
		f.add(t1);f.add(t2);f.add(t3);f.add(t4);
		
		JTextArea ta=new JTextArea();
		ta.setEditable(false);
		ta.setBounds(420,15,550,425);
		f.add(ta);
		
		JButton b1=new JButton("Add");
		JButton b2=new JButton("Search");
		JButton b3=new JButton("Display");
		b1.setBounds(30,290,100,40);
		b2.setBounds(150,290,100,40);
		b3.setBounds(270,290,100,40);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
				String n,reg;
				int t, q;
				n=t1.getText();
				reg=t2.getText();
				t=Integer.parseInt(t3.getText());
				q=Integer.parseInt(t4.getText());
				try{
					addData(n,reg,t,q);
					ta.setText("Student Detail Added!...");
				}catch (Exception ex){
					ta.setText("Enter all Details!...");
				}
				}
				catch(Exception ex){
					ta.setText("Enter all Details!...");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String reg,out;
				reg=t2.getText();
				Student s=search(reg);
				if(s!=null){
				out="Name: "+s.getName()+"\nReg.No: "+s.getReg()+"\nTotal Score: "+String.valueOf(s.getScore())+"\nNo.Of.Ques: "+String.valueOf(s.getQ())+"\nAverage: "+String.valueOf(s.getAvg());
				ta.setText(out);
				}
				else{
				ta.setText("Error: Student NotFound!..");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			/*	Iterator<Student> itrD= arr.iterator();
				Student s=null;
				String out="";
				while(itrD.hasNext())
				{
					s=itrD.next();
					out+="Name: "+s.getName()+"  Reg.No: "+s.getReg()+"  Total Score: "+String.valueOf(s.getScore())+"  No.Of.Ques: "+String.valueOf(s.getQ())+"  Average: "+String.valueOf(s.getAvg())+"\n";
				}
				ta.setText(out);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			*/
			try{
			FileReader fr=new FileReader("Student.txt");
			String out="";
			int i;
			while((i=fr.read())!=-1){
				out+=(char)i;
			}
				ta.setText(out);
			}catch (Exception ex){
				ta.setText("No record Found");
			}
			}
		});
		


		f.add(b1);f.add(b2);f.add(b3);

		JButton b4=new JButton("|<<");
		JButton b5=new JButton("|<");
		JButton b6=new JButton(">|");
		JButton b7=new JButton(">>|");
		b4.setBounds(30,360,70,30);
		b5.setBounds(120,360,70,30);
		b6.setBounds(210,360,70,30);
		b7.setBounds(300,360,70,30);
		f.add(b4);f.add(b5);f.add(b6);f.add(b7);
		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
				itr= arr.listIterator();
				if(itr.hasNext()){
					stud=itr.next();
				}
				String out="Name: "+stud.getName()+"\nReg.No: "+stud.getReg()+"\nTotal Score: "+String.valueOf(stud.getScore())+"\nNo.Of.Ques: "+String.valueOf(stud.getQ())+"\nAverage: "+String.valueOf(stud.getAvg());
				ta.setText(out);
				itr= arr.listIterator();
					stud=itr.next();
			}catch(Exception ex){
				ta.setText("No Data Found!...");
			}
			}
		});	

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(itr.hasPrevious()){
					stud=itr.previous();
					String out="Name: "+stud.getName()+"\nReg.No: "+stud.getReg()+"\nTotal Score: "+String.valueOf(stud.getScore())+"\nNo.Of.Ques: "+String.valueOf(stud.getQ())+"\nAverage: "+String.valueOf(stud.getAvg());
					ta.setText(out);
			}
			else{
				ta.setText("No Data Found!...");
			}
			}
		});	

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					if(itr.hasNext()){
					stud=itr.next();
					String out="Name: "+stud.getName()+"\nReg.No: "+stud.getReg()+"\nTotal Score: "+String.valueOf(stud.getScore())+"\nNo.Of.Ques: "+String.valueOf(stud.getQ())+"\nAverage: "+String.valueOf(stud.getAvg());
					ta.setText(out);

			}
			else{
				ta.setText("No Data Found!...");
			}
			
			}
		});	


		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
				itr= arr.listIterator(arr.size());
				if(itr.hasPrevious()){
					stud=itr.previous();
				}
				String out="Name: "+stud.getName()+"\nReg.No: "+stud.getReg()+"\nTotal Score: "+String.valueOf(stud.getScore())+"\nNo.Of.Ques: "+String.valueOf(stud.getQ())+"\nAverage: "+String.valueOf(stud.getAvg());
				ta.setText(out);
				itr= arr.listIterator(arr.size());
					stud=itr.previous();

			}catch(Exception ex){
				ta.setText("No Data Found!...");
			
			}
			}
		});	


		f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	public void addData(String n,String reg,int t,int q) throws NullFieldException{
		if(n.isEmpty() || reg.isEmpty()){
			throw new NullFieldException("Enter All Details!");
		}
		try{
		String out="";
		FileWriter fw=new FileWriter("Student.txt",true);
		Student s=new Student(n,reg,t,q,((double)t)/((double)q));
		out="Name: "+s.getName()+"  Reg.No: "+s.getReg()+"  Total Score: "+String.valueOf(s.getScore())+"  No.Of.Ques: "+String.valueOf(s.getQ())+"  Average: "+String.valueOf(s.getAvg())+"\n";
		fw.write(out);
		fw.close();
		arr.add(s);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public Student search(String reg)
	{
		Iterator<Student> itrs= arr.iterator();
		Student s=null;
		while(itrs.hasNext()){
			s=itrs.next();
			if(s.getReg().equals(reg)){
				return s;
			}
		}
		return null;
	}	

	public static void main(String [] args){
		new QuizManagement();
	}
}
