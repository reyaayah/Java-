import javax.swing.*;
import java.awt.event.*;
public class lab_listener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JFrame f=new JFrame("New key Listener");
    lab_listener(){
        l1=new JLabel("Enter first no:");
        l1.setBounds(10,10,200,20);
        t1=new JTextField();
        t1.setBounds(200,10,200,20);
        l2=new JLabel("Enter second no:");
        l2.setBounds(10,50,200,20);
        t2=new JTextField();
        t2.setBounds(200,50,200,20);
        l3=new JLabel("Press any key");
        l3.setBounds(10,100,200,20);
        t3=new JTextField();
        t3.setBounds(200,100,200,20);
        t3.addKeyListener(new checkkey());
        f.add(l1); f.add(t1); f.add(l2); f.add(t2); f.add(l3); f.add(t3);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    class checkkey implements KeyListener{
        public void keyPressed(KeyEvent e){
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int sum=num1+num2;
            t3.setText(String.valueOf(sum));
        }
        public void keyReleased(KeyEvent e){
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int difference=num1-num2;
            t3.setText(String.valueOf(difference));
        }
        public void keyTyped(KeyEvent e){

        }
    }
    public static void main(String[] args) {
        new lab_listener();
    }
}
