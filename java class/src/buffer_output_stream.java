import java.io.*;

public class buffer_output_stream {
    public static void main(String[] args) {
        try{
            String str="Hello World";
            FileOutputStream fos=new FileOutputStream("input.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            byte b[]=str.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            fos.close();
            System.out.println("Contents are written successfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
