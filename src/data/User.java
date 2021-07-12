package data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class User {
    public static boolean insertUser (String username , String password,String fname,String lname,String email){
      String sql = "INSERT INTO user (name,password,firstname,lastname,email) VALUES(?,?,?,?,?)";
        try {
              PreparedStatement pst = Connect.conn.prepareStatement(sql) ;
              pst.setString(1, username);
              pst.setString(2, password);
              pst.setString(3, fname);
              pst.setString(4, lname);
              pst.setString(5, email);
              pst.execute();
          } 
        catch (SQLException ex) {
            System.out.print(ex.getMessage());
            return false;
        }       
        return true;
    }
    public static boolean login (String name,String pass){
        String sql="SELECT name FROM user"
                + " where name=? and password=?;";
        try{
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,pass);
            ResultSet rs = pst.executeQuery();
            if (rs.next())     {
                return  true;
                 }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false ;
    }
    public static String get_Name (String name){
        String sql="SELECT firstname,lastname FROM user"
                + " where name=?;";
        try{
            PreparedStatement pst = Connect.conn.prepareStatement(sql) ;
            pst.setString(1,name);
            ResultSet rs =pst.executeQuery();
            String first=rs.getString("firstname");
            String last =rs.getString("lastname");
            return first+" "+last;
            }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
}
}//end of User class 