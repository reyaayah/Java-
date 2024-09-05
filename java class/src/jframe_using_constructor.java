import javax.swing.JButton;
import javax.swing.JFrame;

public class jframe_using_constructor extends JFrame{
    jframe_using_constructor(){
        JButton b=new JButton("click");
        b.setBounds(130,100,100,40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new jframe_using_constructor();
    }
}
