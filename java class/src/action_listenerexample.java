import javax.swing.*;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
public class action_listenerexample implements ActionListener {
    TextField tf;
    Button b;
    action_listenerexample(){
        Frame f=new Frame();
        tf=new TextField();
        tf.setBounds(50,50,150,20);
        b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Hello World");
    }
    public static void main(String[] args) throws Exception {
        new action_listenerexample();
    }
}
