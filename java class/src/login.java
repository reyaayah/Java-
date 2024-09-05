import javax.swing.*;
import javax.swing.border.Border;
public class login {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel j=new JPanel();
        j.setLayout(null);
        Border border = BorderFactory.createTitledBorder("Login");
        j.setBorder(border);
        j.setBounds(20,20,300,200);
        f.add(j);

        JLabel l2 = new JLabel("Username:");
        JTextField username = new JTextField();
        l2.setBounds(20, 50, 80, 30);
        username.setBounds(100, 50, 100, 30);
        j.add(l2);
        j.add(username);

        JPasswordField value = new JPasswordField();   
        JLabel l1=new JLabel("Password:"); 
        l1.setBounds(20,100,80,30);      
        value.setBounds(100,100,100,30);    
        j.add(value); 
        j.add(l1);  
        f.setSize(300,300);    
        f.setLayout(null);    
        f.setVisible(true); 

        JButton b=new JButton("Login");
        b.setBounds(100,150,80,30);
        j.add(b);

        JButton b1=new JButton("Cancel");
        b1.setBounds(190,150,80,30);
        j.add(b1);
    }
            

}
