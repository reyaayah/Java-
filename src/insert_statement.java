import java.sql.*;
public class insert_statement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SevenDB?useSSL=false","root" , "1234");
            String sql="Insert into tblstudent(Id,Name,Address) values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,6);
            ps.setString(2,"Krisha");
            ps.setString(3, "Ktm");
            ps.executeUpdate();
            con.close();
            System.out.println("Data Inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
   
    
}
