/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
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
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void updateTrainer(String type, String value, String id) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "update Trainer set " + type + " = '" + value + "' where TrainerID = '" + id + "';";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void updateManager(String type, String value, String id) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "update Manager set " + type + " = '" + value + "' where ManagerID = '" + id + "';";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int getAge(String y, String m) {

        int agee = 0;

        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();

        agee = currentYear - Integer.parseInt(y);
        if (currentMonth < Integer.parseInt(m)) {
            agee--;
        }
        return agee;

    }

    int getNumMonths(String y, String m) {

        int Y = Integer.parseInt(y);
        int M = Integer.parseInt(m);

        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();

        if (Y == currentYear) {
            return currentMonth - M;
        }

        //remaining months of Y + months of current year + 12*years in between
        return (12 - M) + currentMonth + (12 * (currentYear - Y + 1));

    }

    String paymentdatecheck(String dt, int num) {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            date = (java.util.Date) formatter.parse(dt);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Calendar now = Calendar.getInstance();
        now.setTime(date);

//        System.out.println("Current date : " + now.get(Calendar.DATE)+ "-" +(now.get(Calendar.MONTH) + 1) + "-"
//             + now.get(Calendar.YEAR));
        now.add(Calendar.MONTH, num);

        System.out.println("date after 6 months : " + now.get(Calendar.DATE) + "-" + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.YEAR));
        String newdate = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE);
        return newdate;

    }

    void updatePhysique(String type, String value, String id) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "update Physique set " + type + " = '" + value + "' where PhysiqueID = '" + id + "';";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void updateBank(String type, String value, String id, String card) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "update BankDetails set " + type + " = '" + value
                    + "' where PersonID = '" + id + "' and CardNum = '" + card + "';";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void updateBankT(String type, String value, String id, String iban) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "update TrainerBank set " + type + " = '" + value
                    + "' where TrainerID = '" + id + "' and IBAN = '" + iban + "';";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
