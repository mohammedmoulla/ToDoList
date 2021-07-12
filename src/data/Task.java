package data;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
public class Task {
   public static void  insertTask (String taskname,String details,String date,int important ,boolean state,String name ){
     String sql = "INSERT INTO task (taskname,details,date,important,state,name) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pst= Connect.conn.prepareStatement(sql);
            pst.setString(1, taskname);
            pst.setString(2, details);
            pst.setString(3, date);
            pst.setInt(4, important);
            pst.setBoolean(5, state);
            pst.setString(6, name);
            pst.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
   public static void  update (int taskid,String taskname,String details,String date ,int important,boolean state){
       String sql = "update task set taskname=?,details=?,date=?,important=?,state=? where taskid=?";
        try {
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,taskname);
            pst.setString(2, details);
            pst.setString(3, date);
            pst.setInt(4, important);
            pst.setBoolean(5, state);
            pst.setInt(6, taskid);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
   }
   public static void  delete_task (int taskid){
       String sql = "delete from task where taskid=?";
        try {
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setInt(1, taskid);
            pst.execute();
           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
   }
   public static ResultSet get_all (String user_name) { 
         String sql="SELECT * FROM task"
                 + " where name = ? ;";
        try{
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,user_name);
            ResultSet rs =pst.executeQuery();
            return rs;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
   public static int  get_count (String  user_name) { 
       String sql = "select count(*) from  task"
                    + " where name=?";
        try {
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1, user_name);
            ResultSet r =pst.executeQuery();
            return r.getInt(1);
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return  0;
   } 
   
   public static ResultSet search (String text,String user){
       text="%"+text+"%";
       String sql = "select * from task "
               + "where (taskname like ? "
               + "or details like ? )"
               + "and name =?";
        try {
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1, text);
            pst.setString(2, text);
            pst.setString(3, user);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
   public static ResultSet search_state (String user){
       String sql = "select * from task "
               + "where name =?"
               + "order by state";
        try {
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,user);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
   public static ResultSet search_important_all (String user){
       String sql = "select * from task "
               + "where name =? "
               + "order by important";
        try {
           PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,user);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
   public static ResultSet search_important (String user,int important){
       String sql = "select * from task "
               + "where name =? "
               + " and important=?";
        try {
          PreparedStatement  pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,user);
            pst.setInt(2, important);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
   public static ResultSet search_today (String user){
       String sql = "select * from task "
               + "where date =date('now') "
               + " and name = ?";
        try {
           PreparedStatement pst = Connect.conn.prepareStatement(sql);
            pst.setString(1,user);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
   public static ResultSet search_week (String user){
       String sql2="select strftime('%w','now')";
       
       String sql = "select * from task "
               + "where name =? "
               + "and date >= date('now',?)"
               + "and date <= date('now',?)";
        try {
            Statement  st =Connect.conn.createStatement();
            PreparedStatement pst = Connect.conn.prepareStatement(sql);
            int day = st.executeQuery(sql2).getInt(1);
            String start = "-"+day+" day";
            String end = "+"+(6-day)+" day";
            pst.setString(1,user);
            pst.setString(2,start);
            pst.setString(3,end);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       return null;
   }
}//end of Task class
