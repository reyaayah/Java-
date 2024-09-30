import java.net.*;
import java.io.*;
public class client {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("localhost",4999);
        PrintWriter pw=new PrintWriter(s.getOutputStream());
        pw.println("Hello World");
        pw.flush();
        s.close();
    }
}