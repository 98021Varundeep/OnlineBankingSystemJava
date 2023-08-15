/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varun
 */
import java.sql.*;
public class NewClass {

   public static void main(String args[]){
       
   
long millis=System.currentTimeMillis();
java.sql.Date date=new java.sql.Date(millis);    
System.out.println(date);


long time = date.getTime();
java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(time);
System.out.println(currentTimestamp);
}
}

