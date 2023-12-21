import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

class Passenger
{
private String name,source,destination;
private int id;
private int flightno;
Passenger(String n,String s,String d,int i,int f)
{
name = n;
source = s;
destination = d;
id = i;
flightno = f;
}
public String getName()
{
return name;
}
public String getSource()
{
return source;
}
public String getDestination()
{
return destination;
}
public int getId()
{
return id;
}
public int getFlightno()
{
return flightno;
}
};

class AirlineManagement implements ActionListener
{
JFrame jf;
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2,b3;
AirlineManagement()
{
jf = new JFrame("Teepak-Airlines");
l1 = new JLabel("Passenger_Name:");
t1 = new JTextField();
l1.setBounds(0,0,150,30);
t1.setBounds(0,30,150,30);

l2 = new JLabel("Passenger_ID:");
t2 = new JTextField();
l2.setBounds(0,60,150,30);
t2.setBounds(0,90,150,30);
l3 = new JLabel("Flight_Number:");
t3 = new JTextField();
l3.setBounds(0,120,150,30);
t3.setBounds(0,150,150,30);
l4 = new JLabel("Source:");
t4 = new JTextField();
l4.setBounds(0,180,150,30);
t4.setBounds(0,210,150,30);
l5 = new JLabel("Destination:");
t5 = new JTextField();
l5.setBounds(0,240,150,30);
t5.setBounds(0,270,150,30);
b1 = new JButton("Add Passenger");
b2 = new JButton("Search Passenger");
b3 = new JButton("Display Passenger");
b1.setBounds(0,330,150,30);
b2.setBounds(170,330,150,30);
b3.setBounds(340,330,150,30);
jf.add(l1);jf.add(t1);
jf.add(l2);jf.add(t2);
jf.add(l3);jf.add(t3);
jf.add(l4);jf.add(t4);
jf.add(l5);jf.add(t5);
jf.add(b1);jf.add(b2);jf.add(b3);
jf.setSize(500,500);
jf.setLayout(null);
jf.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
}

}

class Mainair
{
public static void main(String args[])
{
AirlineManagement air=new AirlineManagement();
}
}