package data;
import java.sql.Connection;
import static java.sql.DriverManager.*;
import java.sql.SQLException;

public class Connect {
   public static Connection conn;    
    public static void connect(){
        String s="jdbc:sqlite:TaskDatabase.db";
        try{
            conn = getConnection(s);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }    
    public static void disconnect () {
        try {
            Connect.conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
