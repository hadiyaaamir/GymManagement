package gymmanagement;

import gymmanagement.HomePageGUI.*;
import static gymmanagement.ManagerAllClassesGUI.classTable;
import static gymmanagement.MemberBankDetailsGUI.bankTable;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class AddClassPopup extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public AddClassPopup() {
        initComponents();
        
        monthError.setVisible(false);
        timeError.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeError = new javax.swing.JLabel();
        monthError = new javax.swing.JLabel();
        bmi = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        time = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(493, 272));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        timeError.setForeground(new java.awt.Color(192, 0, 0));
        timeError.setText("* Enter a valid time *");
        getContentPane().add(timeError);
        timeError.setBounds(200, 70, 300, 40);

        monthError.setForeground(new java.awt.Color(192, 0, 0));
        monthError.setText("* Enter a valid date *");
        getContentPane().add(monthError);
        monthError.setBounds(200, 70, 300, 40);

        bmi.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        bmi.setForeground(new java.awt.Color(56, 85, 98));
        bmi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmi.setText("h");
        getContentPane().add(bmi);
        bmi.setBounds(250, 150, 170, 30);

        day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        day.setForeground(new java.awt.Color(56, 85, 98));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setBorder(null);
        day.setLightWeightPopupEnabled(false);
        day.setMinimumSize(new java.awt.Dimension(150, 35));
        day.setName("Gender"); // NOI18N
        day.setPreferredSize(new java.awt.Dimension(150, 35));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day);
        day.setBounds(180, 110, 60, 30);

        time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(56, 85, 98));
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        time.setBorder(null);
        time.setLightWeightPopupEnabled(false);
        time.setMinimumSize(new java.awt.Dimension(150, 35));
        time.setName("Gender"); // NOI18N
        time.setPreferredSize(new java.awt.Dimension(150, 35));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time);
        time.setBounds(180, 150, 60, 30);

        month.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        month.setForeground(new java.awt.Color(56, 85, 98));
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        month.setBorder(null);
        month.setLightWeightPopupEnabled(false);
        month.setMinimumSize(new java.awt.Dimension(150, 35));
        month.setName("Gender"); // NOI18N
        month.setPreferredSize(new java.awt.Dimension(150, 35));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        getContentPane().add(month);
        month.setBounds(260, 110, 60, 30);

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 85, 98));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024" }));
        year.setBorder(null);
        year.setLightWeightPopupEnabled(false);
        year.setMinimumSize(new java.awt.Dimension(150, 35));
        year.setName("Gender"); // NOI18N
        year.setPreferredSize(new java.awt.Dimension(150, 35));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(340, 110, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/add session.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 270);

        deleteBtn.setText("jButton1");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(180, 190, 140, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String SessionID() {

        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql2 = "select count(*) as row_id from Session";
            ResultSet rs2 = myStmt.executeQuery(sql2);

            while (rs2.next()) {
                row_id = rs2.getInt("row_id");
            }

            String mem_id = "S" + (row_id + 1);
            return mem_id;

        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    void updateTable() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = null;

            sql = "SELECT  s.Date, s.StartTime, "
                    + "m.Firstname, m.Lastname,t.Firstname, t.Lastname, t.Category, t.SessionFee "
                    + "FROM session s "
                    + "left JOIN member m on m.MemberID = s.MemberID "
                    + "left JOIN trainer t on t.TrainerID = s.TrainerID"
                    + ";";

            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) classTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {

                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("Starttime"));
                    v2.add(rs.getString("m.Firstname") + " " + rs.getString("m.Lastname"));
                    v2.add(rs.getString("t.Firstname") + " " + rs.getString("t.Lastname"));
                    v2.add(rs.getString("Category"));
                    v2.add(rs.getString("SessionFee"));
                }

                dft.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerAllClassesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        monthError.setVisible(false);
        timeError.setVisible(false);
        
        int d = Integer.parseInt(day.getItemAt(day.getSelectedIndex()));
        int m = Integer.parseInt(month.getItemAt(month.getSelectedIndex()));
        int y = Integer.parseInt(year.getItemAt(year.getSelectedIndex()));
        String dob = y + "-" + m + "-" + d;

        String hrs = time.getItemAt(time.getSelectedIndex());
        String start = hrs + ":00:00";

        int endtime = Integer.parseInt(hrs);
        endtime++;

        if (endtime == 24) {
            endtime = 00;
        }

        String end = endtime + ":00:00";
        
        //date
        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();
        int currentDate = currentdate.getDayOfMonth();

        //time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");  
        LocalDateTime now = LocalDateTime.now();  
        String currentTime = dtf.format(now);
        
        if(y == currentYear && m < currentMonth)
            monthError.setVisible(true);
        
        else if(y == currentYear && m == currentMonth && d < currentDate)
            monthError.setVisible(true);
        
        else if(y == currentYear && m == currentMonth && d == currentDate 
                && Integer.parseInt(hrs) < Integer.parseInt(currentTime))
            timeError.setVisible(true);
            

        else {
            try {
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();

                String sql = "INSERT INTO `session`(`SessionID`, `Date`,"
                        + " `StartTime`, `Endtime` ) VALUES ('" + SessionID() + "',"
                        + "'" + dob + "','"+ start +"','"+ end +"');";
                myStmt.executeUpdate(sql);

                updateTable();

                this.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(MemberBankDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmi;
    public javax.swing.JComboBox<String> day;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JLabel monthError;
    public javax.swing.JComboBox<String> time;
    private javax.swing.JLabel timeError;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
