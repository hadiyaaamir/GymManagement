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
public class HealthAndAllergies extends javax.swing.JFrame {

    boolean ddOpen = false;
    boolean editable = false;
    String newPlan = "";
    String oldPlan = "";

    public static String CardNum;
    public static String Def;

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;
    
    String id = "";

    public HealthAndAllergies() {
        initComponents();

        
        x.setVisible(false);
        
        if(!LoginGUI.memberid.equals(""))
            id = LoginGUI.memberid;
        else if(!LoginGUI.trainerid.equals(""))
            id = LoginGUI.trainerid;

        selectError.setVisible(false);
        selectError1.setVisible(false);
        selectError2.setVisible(false);
        selectError3.setVisible(false);
        
        againTime.setVisible(false);
        againTime1.setVisible(false);

        updateTableH();
        updateTableA();
        updateTablePH();
        updateTablePA();

    }

    void updateTableH() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT `ConditionName` "
                    + "FROM `healthconditions`;";
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) healthTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    
                    v2.add(rs.getString("ConditionName"));

                }

                dft.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void updateTablePA() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT Name FROM `allergies` "
                    + "WHERE AllergyID in ( "
                    + "SELECT AllergyID from allergyrecord "
                    + "WHERE PersonID = '"+ id +"');";
            
            ResultSet rs = myStmt.executeQuery(sql);

            DefaultTableModel dft = (DefaultTableModel) myAllergies.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                
                    v2.add(rs.getString("Name"));
                    dft.addRow(v2);
              
            }
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void updateTablePH() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT ConditionName FROM `healthconditions` "
                    + "WHERE HealthID in ( "
                    + "SELECT HealthID from healthrecord "
                    + "WHERE PersonID = '"+ id +"');";
            
            ResultSet rs = myStmt.executeQuery(sql);

            DefaultTableModel dft = (DefaultTableModel) myHealth.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();
                
                    v2.add(rs.getString("ConditionName"));
                    dft.addRow(v2);
              
            }
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    void updateTableA() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT `Name` "
                    + "FROM `allergies`;";
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) allergyTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    
                    v2.add(rs.getString("Name"));

                }

                dft.addRow(v2);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectError3 = new javax.swing.JLabel();
        againTime1 = new javax.swing.JLabel();
        againTime = new javax.swing.JLabel();
        selectError2 = new javax.swing.JLabel();
        selectError1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        selectError = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        myAllergies = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        myHealth = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        allergyTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        healthTable = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        healthAdd = new javax.swing.JButton();
        removeHealth = new javax.swing.JButton();
        allergyRemove = new javax.swing.JButton();
        addAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        selectError3.setForeground(new java.awt.Color(204, 0, 0));
        selectError3.setText("Please select a row");
        getContentPane().add(selectError3);
        selectError3.setBounds(430, 314, 180, 20);

        againTime1.setForeground(new java.awt.Color(204, 0, 0));
        againTime1.setText("Already selected!");
        getContentPane().add(againTime1);
        againTime1.setBounds(645, 52, 180, 20);

        againTime.setForeground(new java.awt.Color(204, 0, 0));
        againTime.setText("Already selected!");
        getContentPane().add(againTime);
        againTime.setBounds(256, 52, 180, 20);

        selectError2.setForeground(new java.awt.Color(204, 0, 0));
        selectError2.setText("Please select a row");
        getContentPane().add(selectError2);
        selectError2.setBounds(430, 50, 180, 20);

        selectError1.setForeground(new java.awt.Color(204, 0, 0));
        selectError1.setText("Please select a row");
        getContentPane().add(selectError1);
        selectError1.setBounds(40, 313, 180, 20);

        jPanel1.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2, 495);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 770, 2);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 775, 2);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(762, 0, 2, 500);

        selectError.setForeground(new java.awt.Color(204, 0, 0));
        selectError.setText("Please select a row");
        getContentPane().add(selectError);
        selectError.setBounds(40, 50, 180, 20);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane4.setOpaque(false);

        myAllergies.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        myAllergies.setForeground(new java.awt.Color(56, 85, 98));
        myAllergies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        myAllergies.setGridColor(new java.awt.Color(255, 255, 255));
        myAllergies.setRequestFocusEnabled(false);
        myAllergies.setRowHeight(20);
        myAllergies.setSelectionBackground(new java.awt.Color(56, 85, 98));
        myAllergies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                myAllergiesKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(myAllergies);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(430, 330, 300, 90);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane3.setOpaque(false);

        myHealth.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        myHealth.setForeground(new java.awt.Color(56, 85, 98));
        myHealth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        myHealth.setGridColor(new java.awt.Color(255, 255, 255));
        myHealth.setRequestFocusEnabled(false);
        myHealth.setRowHeight(20);
        myHealth.setSelectionBackground(new java.awt.Color(56, 85, 98));
        myHealth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                myHealthKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(myHealth);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 330, 300, 90);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane2.setOpaque(false);

        allergyTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        allergyTable.setForeground(new java.awt.Color(56, 85, 98));
        allergyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        allergyTable.setGridColor(new java.awt.Color(255, 255, 255));
        allergyTable.setRequestFocusEnabled(false);
        allergyTable.setRowHeight(20);
        allergyTable.setSelectionBackground(new java.awt.Color(56, 85, 98));
        allergyTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                allergyTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(allergyTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(430, 70, 300, 130);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane1.setOpaque(false);

        healthTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        healthTable.setForeground(new java.awt.Color(56, 85, 98));
        healthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        healthTable.setGridColor(new java.awt.Color(255, 255, 255));
        healthTable.setRequestFocusEnabled(false);
        healthTable.setRowHeight(20);
        healthTable.setSelectionBackground(new java.awt.Color(56, 85, 98));
        healthTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                healthTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(healthTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 300, 130);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/h and a.PNG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 770, 495);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 560, 380);

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

        healthAdd.setText("jButton1");
        healthAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthAddActionPerformed(evt);
            }
        });
        getContentPane().add(healthAdd);
        healthAdd.setBounds(140, 210, 120, 50);

        removeHealth.setText("jButton1");
        removeHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeHealthActionPerformed(evt);
            }
        });
        getContentPane().add(removeHealth);
        removeHealth.setBounds(140, 433, 120, 50);

        allergyRemove.setText("jButton1");
        allergyRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergyRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(allergyRemove);
        allergyRemove.setBounds(520, 430, 130, 50);

        addAll.setText("jButton1");
        addAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAllActionPerformed(evt);
            }
        });
        getContentPane().add(addAll);
        addAll.setBounds(530, 210, 120, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void healthTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_healthTableKeyPressed

    }//GEN-LAST:event_healthTableKeyPressed

    private void allergyTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allergyTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergyTableKeyPressed

    private void myHealthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myHealthKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_myHealthKeyPressed

    private void myAllergiesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myAllergiesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_myAllergiesKeyPressed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtnActionPerformed

    private void healthAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthAddActionPerformed
        
        againTime.setVisible(false);
        againTime1.setVisible(false);
        
        selectError.setVisible(false);
        selectError1.setVisible(false);
        selectError2.setVisible(false);
        selectError3.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) healthTable.getModel();
        int selectedIndex = healthTable.getSelectedRow();

        if (selectedIndex == -1) {
            selectError.setVisible(true);
        }
        
        else {
            
            selectError.setVisible(false);
            String name = model.getValueAt(selectedIndex, 0).toString();
            
            try {
                
                //id from name
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                
                String sql = "SELECT `HealthID` "
                        + "FROM `healthConditions` WHERE ConditionName = '"+ name +"';";
                ResultSet rs = myStmt.executeQuery(sql);
                
                String hid = "";
                
                while(rs.next()) {
                    hid = rs.getString("HealthID");
                }
                
                //name add
                sql = "INSERT INTO `healthrecord`(`PersonID`, `HealthID`) "
                        + "VALUES ('"+ id +"','"+ hid +"');";
                
                int rs2 = myStmt.executeUpdate(sql);
                
                updateTablePH();
                
            } 
            
            catch (SQLIntegrityConstraintViolationException e) {
                againTime.setVisible(true);
            }
            
            catch (SQLException ex) {
                Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_healthAddActionPerformed

    private void removeHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeHealthActionPerformed
        
        againTime.setVisible(false);
        againTime1.setVisible(false);
        
        selectError.setVisible(false);
        selectError1.setVisible(false);
        selectError2.setVisible(false);
        selectError3.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) myHealth.getModel();
        int selectedIndex = myHealth.getSelectedRow();

        if (selectedIndex == -1) {
            selectError1.setVisible(true);
        }
        
        else {
            
            try {
                selectError1.setVisible(false);
                String name = model.getValueAt(selectedIndex, 0).toString();
                
                
                //id from name
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                
                String sql = "SELECT `HealthID` "
                        + "FROM `healthConditions` WHERE ConditionName = '"+ name +"';";
                ResultSet rs = myStmt.executeQuery(sql);
                
                String hid = "";
                
                while(rs.next()) {
                    hid = rs.getString("HealthID");
                }
                
                //name add
                sql = "DELETE from `healthrecord`"
                        + "WHERE HealthID = '"+ hid +"';";
                
                int rs2 = myStmt.executeUpdate(sql);
                
                updateTablePH();
            } 
            
            catch (SQLException ex) {
                Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }    
    }//GEN-LAST:event_removeHealthActionPerformed
    
    
    private void addAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAllActionPerformed
        
        againTime.setVisible(false);
        againTime1.setVisible(false);
        
        selectError.setVisible(false);
        selectError1.setVisible(false);
        selectError2.setVisible(false);
        selectError3.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) allergyTable.getModel();
        int selectedIndex = allergyTable.getSelectedRow();

        if (selectedIndex == -1) {
            selectError2.setVisible(true);
        }
        
        else {
            
            selectError2.setVisible(false);
            String name = model.getValueAt(selectedIndex, 0).toString();
            
            try {
                
                //id from name
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                
                String sql = "SELECT `AllergyID` "
                        + "FROM `allergies` WHERE Name = '"+ name +"';";
                ResultSet rs = myStmt.executeQuery(sql);
                
                String hid = "";
                
                while(rs.next()) {
                    hid = rs.getString("AllergyID");
                }
                
                //name add
                sql = "INSERT INTO `allergyrecord`(`PersonID`, `AllergyID`) "
                        + "VALUES ('"+ id +"','"+ hid +"');";
                
                int rs2 = myStmt.executeUpdate(sql);
                
                updateTablePA();
                
            } 
            
            catch (SQLIntegrityConstraintViolationException e) {
                againTime1.setVisible(true);
            }
            
            catch (SQLException ex) {
                Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_addAllActionPerformed

    private void allergyRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergyRemoveActionPerformed
        
        againTime.setVisible(false);
        againTime1.setVisible(false);
        
        selectError.setVisible(false);
        selectError1.setVisible(false);
        selectError2.setVisible(false);
        selectError3.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) myAllergies.getModel();
        int selectedIndex = myAllergies.getSelectedRow();

        if (selectedIndex == -1) {
            selectError3.setVisible(true);
        }
        
        else {
            
            try {
                selectError3.setVisible(false);
                String name = model.getValueAt(selectedIndex, 0).toString();
                
                
                //id from name
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                
                String sql = "SELECT `AllergyID` "
                        + "FROM `allergies` WHERE Name = '"+ name +"';";
                ResultSet rs = myStmt.executeQuery(sql);
                
                String hid = "";
                
                while(rs.next()) {
                    hid = rs.getString("AllergyID");
                }
                
                //name add
                sql = "DELETE from `allergyrecord`"
                        + "WHERE AllergyID = '"+ hid +"';";
                
                int rs2 = myStmt.executeUpdate(sql);
                
                updateTablePA();
            } 
            
            catch (SQLException ex) {
                Logger.getLogger(HealthAndAllergies.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_allergyRemoveActionPerformed
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberLogBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberLogBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberLogBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberLogBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
   
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthAndAllergies().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAll;
    public static javax.swing.JLabel againTime;
    public static javax.swing.JLabel againTime1;
    private javax.swing.JButton allergyRemove;
    public static javax.swing.JTable allergyTable;
    private javax.swing.JLabel background;
    private javax.swing.JButton healthAdd;
    public static javax.swing.JTable healthTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable myAllergies;
    public static javax.swing.JTable myHealth;
    private javax.swing.JButton removeHealth;
    public static javax.swing.JLabel selectError;
    public static javax.swing.JLabel selectError1;
    public static javax.swing.JLabel selectError2;
    public static javax.swing.JLabel selectError3;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    // End of variables declaration//GEN-END:variables
}
