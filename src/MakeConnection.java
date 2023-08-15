
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varun
 */
public class MakeConnection {


     Connection c;
      Statement s;
     PreparedStatement ps;
      public void closeit() throws SQLException{
          s.close();
          c.close();
      }
       public MakeConnection(String sqlQuery){
      
           String mydriver,URL;
          
          URL= "jdbc:mysql://localhost:3306/varun";
          try
          {
               Class.forName("com.mysql.cj.jdbc.Driver");
              
              System.out.println("Hi");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","varun");
              
                 s=c.createStatement(   );
               ps =c.prepareStatement(sqlQuery);
               
          }
          catch(SQLException e){
              System.out.println("Exception Occured"+ e.getMessage());
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
     
           
         }
       public MakeConnection(String Query,int a) {

                    String mydriver,URL;
          
          URL= "jdbc:mysql://localhost:3306/varun";
          try
          {
               Class.forName("com.mysql.cj.jdbc.Driver");
              
              System.out.println("Hi");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","varun");
              
                 s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
               ps =c.prepareStatement(Query);
               
          }
          catch(SQLException e){
              System.out.println("Exception Occured"+ e.getMessage());
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
     
           
           
       }      
}
