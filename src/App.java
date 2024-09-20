import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SevenDB?useSSL=false","root" , "1234");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from tblstudent");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
                
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
