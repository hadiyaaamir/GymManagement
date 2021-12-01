package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class ManagerHireTrainerGUI2 extends javax.swing.JFrame {

    boolean ddOpen = false;

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    double we;
    double he;

    public ManagerHireTrainerGUI2() {
        initComponents();

        x.setVisible(false);
        fillError.setVisible(false);
        added.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        added = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fillError = new javax.swing.JLabel();
        h = new javax.swing.JTextField();
        w = new javax.swing.JTextField();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        age = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        bmi = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(56, 85, 98));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Add Trainer");
        getContentPane().add(name);
        name.setBounds(190, 80, 410, 60);

        added.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        added.setForeground(new java.awt.Color(56, 85, 98));
        added.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        added.setText("Trainer Added! Password is");
        getContentPane().add(added);
        added.setBounds(230, 440, 350, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/add bttn.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 380, 150, 50);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 780, 2);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 762, 2);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(761, 0, 2, 800);

        fillError.setForeground(new java.awt.Color(204, 0, 0));
        fillError.setText("* Please fill all fields *");
        getContentPane().add(fillError);
        fillError.setBounds(340, 140, 250, 20);

        h.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        h.setForeground(new java.awt.Color(56, 85, 98));
        h.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hKeyPressed(evt);
            }
        });
        getContentPane().add(h);
        h.setBounds(370, 205, 100, 25);

        w.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        w.setForeground(new java.awt.Color(56, 85, 98));
        w.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        w.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wKeyPressed(evt);
            }
        });
        getContentPane().add(w);
        w.setBounds(370, 252, 100, 25);

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
        day.setBounds(340, 300, 60, 30);

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
        month.setBounds(425, 300, 60, 30);

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 85, 98));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932" }));
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
        year.setBounds(510, 300, 70, 30);

        age.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(56, 85, 98));
        age.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age.setText("Date of Birth:");
        getContentPane().add(age);
        age.setBounds(220, 300, 120, 30);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

        exp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        exp.setForeground(new java.awt.Color(56, 85, 98));
        exp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(exp);
        exp.setBounds(170, 100, 430, 30);

        bmi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bmi.setForeground(new java.awt.Color(56, 85, 98));
        bmi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(bmi);
        bmi.setBounds(220, 320, 170, 30);

        weight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        weight.setForeground(new java.awt.Color(56, 85, 98));
        weight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weight.setText("Weight (in kg) :");
        getContentPane().add(weight);
        weight.setBounds(220, 250, 140, 30);

        height.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height.setForeground(new java.awt.Color(56, 85, 98));
        height.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height.setText("Height (in cm) :");
        getContentPane().add(height);
        height.setBounds(220, 200, 150, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/empty.PNG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 770, 495);

        xBtn.setText("jButton1");
        xBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xBtnMouseExited(evt);
            }
        });
        xBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xBtnActionPerformed(evt);
            }
        });
        getContentPane().add(xBtn);
        xBtn.setBounds(735, 10, 20, 20);

        addBtn.setText("jButton1");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(330, 380, 140, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtnActionPerformed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited


    String trainerID() {

        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql2 = "select count(*) as row_id from Trainer";
            ResultSet rs2 = myStmt.executeQuery(sql2);

            while (rs2.next()) {
                row_id = rs2.getInt("row_id");
            }

            String mem_id = "T" + (row_id + 1);
            return mem_id;

        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    String physiqueID() {

        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql3 = "select count(*) as row_id from Physique";
            ResultSet rs3 = myStmt.executeQuery(sql3);

            while (rs3.next()) {
                row_id = rs3.getInt("row_id");
            }

            String p_id = row_id + 1 + "";
            return p_id;

        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    String createPhysique() {

        double w = we;
        double h = he;
        double BMI = (we / (he * he)) * 10000;
        String p_id = physiqueID();

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql = "INSERT INTO `physique`"
                    + "(`PhysiqueID`, `Height`, `Weight`, `BMI`) "
                    + "VALUES ('" + p_id + "','" + h + "','" + w + "','" + BMI + "');";

            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p_id;
    }


    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        fillError.setVisible(false);

        String id = ManagerHireTrainerGUI.id;
        String fname = ManagerHireTrainerGUI.fname;
        String lname = ManagerHireTrainerGUI.lname;
        String e = ManagerHireTrainerGUI.e;
        String pass = ManagerHireTrainerGUI.pass;

        String CNIC = ManagerHireTrainerGUI.CNIC;
        String phoneNum = ManagerHireTrainerGUI.phoneNum;
        String pid = ManagerHireTrainerGUI.pid;

        String gen = ManagerHireTrainerGUI.gen;
        String sal = ManagerHireTrainerGUI.sal;
        String bio = ManagerHireTrainerGUI.bio;
        String sfee = ManagerHireTrainerGUI.sfee;

        String category = ManagerHireTrainerGUI.category;
        String addr = ManagerHireTrainerGUI.addr;

        String d = day.getItemAt(day.getSelectedIndex());
        String m = month.getItemAt(month.getSelectedIndex());
        String y = year.getItemAt(year.getSelectedIndex());
        String dob = y + "-" + m + "-" + d;

        boolean isEmpty = w.getText().equals("") || h.getText().equals("");

        if (isEmpty) {
            fillError.setVisible(true);
        } 
        
        else {
        
            fillError.setVisible(false);
            
            we = Double.parseDouble(w.getText());
            he = Double.parseDouble(h.getText());
            
            try {
                conn = DriverManager.getConnection(url, user, password);
                myStmt = conn.createStatement();

                String sql = "INSERT INTO `trainer`(`TrainerID`, `Firstname`, "
                        + "`Lastname`, `email`, `password`, `CNIC`, `PhoneNum`, "
                        + "`PhysiqueID`, `Gender`, `Salary`, `Description`, `Active`, "
                        + "`CurrentTrainer`, `SessionFee`, `Category`, `DateOfBirth`, "
                        + "`Address`, `hiredate`) "
                        + "VALUES ('" + id + "','" + fname + "','" + lname + "','" + e + "',"
                        + "'" + pass + "','" + CNIC + "','" + phoneNum + "','" + createPhysique() + "',"
                        + "'" + gen + "','" + sal + "','" + bio + "','1',"
                        + "'1','" + sfee + "','" + category + "','" + dob + "',"
                        + "'" + addr + "', CURDATE());";

                int rs = myStmt.executeUpdate(sql);
                
                added.setText(added.getText() + " " + pass);

            } 
            
            catch (SQLException ex) {
                Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_addBtnActionPerformed


    private void hKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8 || c == '.') {
            h.setEditable(true);
        } else {
            h.setEditable(false);
        }
    }//GEN-LAST:event_hKeyPressed

    private void wKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8 || c == '.') {
            w.setEditable(true);
        } else {
            w.setEditable(false);
        }
    }//GEN-LAST:event_wKeyPressed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel added;
    private javax.swing.JLabel age;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bmi;
    public javax.swing.JComboBox<String> day;
    private javax.swing.JLabel exp;
    public static javax.swing.JLabel fillError;
    private javax.swing.JTextField h;
    private javax.swing.JLabel height;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JLabel name;
    private javax.swing.JTextField w;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
