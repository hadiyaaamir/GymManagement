package gymmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;  
/**
 *
 * @author PC
 */
public class Proj {

    public static void main(String[] args) {
        
//        Date d=new Date("26-Nov-2021");  
//        int year=d.getYear();  

        /*String url = "jdbc:mysql://localhost:3306/gym_db";

        String user = "root";
        String password = "";
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "insert into Manager values ('1', 'Muneeb', 'R', 'm.r@gmail', 'thisworksyay', 123, )";
            int rs = myStmt.executeUpdate(sql);

//            while (rs.next())                 
                System.out.println(rs);
            //{
//                System.out.println(rs.getString("first_name"));
            //}

        } catch (SQLException e) {
            e.printStackTrace();
        }*/
//        for (int i = 2021; i > (2021-90); i--) {
//            System.out.println(i);
//        }

        String[] datasets = {"australia", "ds"};
        String[] groups = {"J", "O"};
        
        System.out.println(datasets[1]);
        for (int i = 0; i < 5; i++) {
            int r = (int)(Math.random()*2);
            System.out.println(groups[r]);
        }
        
        System.out.println(datasets[0]);
        for (int i = 0; i < 5; i++) {
            int r = (int)(Math.random()*2);
            System.out.println(groups[r]);
        }

    }

}
