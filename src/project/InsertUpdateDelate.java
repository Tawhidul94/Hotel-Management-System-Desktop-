/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sohag
 */
public class InsertUpdateDelate {
    public static void setData(String Query,String msg){
         Connection  con=null;
         Statement stm=null;
         try{
            con=ConnectionDemo.getcon();
            stm=con.createStatement();
            stm.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
        try{
            
        }catch(Exception e){
            
        }
    }
    }
    
}
