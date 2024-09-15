import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class event_lab_two extends Frame implements ActionListener {
    JLabel l1,l2;
    JTextField t1, t2;
    JButton b1;
    event_lab_two(){
        l1 = new JLabel("Enter any Number:");
        l1.setBounds(20, 100, 200, 20);
        t1 = new JTextField();  
        t1.setBounds(180, 100, 100, 20);
        b1 = new JButton("Calculate Square");      
        b1.setBounds(40, 150, 180, 20); 
        l2=new JLabel("Square of two number is:");
        l2.setBounds(20,200,180,20);
        t2 = new JTextField();      
        t2.setBounds(180, 200, 100, 20);      
        add(l1);      
        add(t1);       
        add(b1); 
        add(l2);
        add(t2);
        b1.addActionListener(this);
        setSize(400,300);
        setLayout(null);      
        setVisible(true);      
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());    
            int square = num1 * num1;    
            t2.setText(String.valueOf(square));    
       }   
    } 
    public static void main(String[] args) {
        event_lab_two ap=new event_lab_two();
    }
}
