import javax.swing.*;
import java.awt.*;

public class login_using_GBL {
    private JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordtext;
    private JButton loginButton;
    private JButton resetButton;
    login_using_GBL(){
        f=new JFrame();
        f.setTitle("Login Form");
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.insets=new Insets(5, 5, 5, 5);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        userLabel=new JLabel("Username");
        gbc.gridx=0;
        gbc.gridy=0;
        f.add(userLabel,gbc);

        userText=new JTextField();
        gbc.gridx=1;
        gbc.gridy=0;
        f.add(userText,gbc);

        passwordLabel= new JLabel("Password");
        gbc.gridx=0;
        gbc.gridy=1;
        f.add(passwordLabel,gbc);

        passwordtext=new JPasswordField();
        gbc.gridx=1;
        gbc.gridy=1;
        f.add(passwordtext,gbc);

        loginButton= new JButton("Login");
        gbc.gridx=0;
        gbc.gridy=2;
        f.add(loginButton,gbc);

        resetButton=new JButton("Reset");
        gbc.gridx=1;
        gbc.gridy=2;
        f.add(resetButton,gbc);
        f.setSize(300,300);
        f.setVisible(true);
       
      

        }
        public static void main(String[] args) {
            new login_using_GBL();
        }
        

}
