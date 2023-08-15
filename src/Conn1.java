/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varun
 */

  //import java.sql.DriverManager;
  import java.sql.*;

//import com.sun.jdi.connect.spi.Connection;
public class Conn1 {

     
      public static void main(String args[]) throws ClassNotFoundException{
          String mydriver,URL;
          
          mydriver ="com.mysql.cj.jdbc.driver";
          URL= "jdbc:mysql://localhost:3306/banking system";
          try
          {
              Class.forName("com.mysql.cj.jdbc.driver");
              
              System.out.println("Hi");
             Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking system","root","varun");
              
              Statement s=c.createStatement();
              
          }
          catch(SQLException e){
              System.out.println("Exception Occured"+ e.getMessage());
          }
          catch(Exception e){
              System.out.println("Exception");
          }
      }
    
}
