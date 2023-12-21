import java.awt.*;
import java.awt.event.*;  
public class ToolkitExample {
	ToolkitExample(){
  Frame f=new Frame("ToolkitExample");  
    Button b=new Button("beep");  
    b.setBounds(50,100,60,30);  
    f.addWindowListener(this);   
    f.add(b);     
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            Toolkit.getDefaultToolkit().beep();  
        }  
    });       
}
public static void main(String[] args) {  
    new ToolkitExample();
}  
}  