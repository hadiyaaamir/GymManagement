/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Methods {

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    ResultSet rs;

    void updateMember(String type, String value, String id) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "update Member set " + type + " = '" + value + "' where MemberID = '" + id + "';";
            int rs = myStmt.executeUpdate(sql);
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int getAge(String y, String m) {
        
        int agee = 0;
        
        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();
        
        agee = currentYear - Integer.parseInt(y);
        if(currentMonth < Integer.parseInt(m))
            agee--;
        return agee;
    }

    void updatePhysique(String type, String value, String id) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "update Physique set " + type + " = '" + value + "' where PhysiqueID = '" + id + "';";
            int rs = myStmt.executeUpdate(sql);
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void updateBank(String type, String value, String id, String card) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "update BankDetails set " + type + " = '" + value + 
                    "' where PersonID = '" + id + "' and CardNum = '" + card + "';";
            int rs = myStmt.executeUpdate(sql);
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
