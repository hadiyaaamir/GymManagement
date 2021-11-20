package gymmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

/**
 *
 * @author PC
 */
public class Proj {

    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/gym_db";

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
        }

    }

}
