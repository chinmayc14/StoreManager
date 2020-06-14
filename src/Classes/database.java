
import java.sql.*;
import java.util.*;

public class database {
    public static void main(String[] args){
        try{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String ss = s.nextLine();
        String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/webinar?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root",""); 
            String userr = "insert into tabel1(name) values(?)";
            PreparedStatement st = con.prepareStatement(userr);
             st.setString(1, ss);
             st.execute();
             String us = "select name from tabel1 where name='"+ss+"'";
            PreparedStatement ust = con.prepareStatement(us);
             ResultSet rs = ust.executeQuery();
             while(rs.next()){
                 System.out.println("Your name is: " +rs.getString("name"));
             }
            
        }
        catch(Exception e){
            System.out.println("exception"+e);
        }
    }
    
    
}
