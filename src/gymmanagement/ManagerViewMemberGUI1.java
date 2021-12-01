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
public class ManagerViewMemberGUI1 extends javax.swing.JFrame {

    public static String sfee;
    public static String Sal;
    public static String cat;
    public static String desc;
    public static String mid;

    boolean ddOpen = false;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public ManagerViewMemberGUI1() {
        initComponents();

        x.setVisible(false);
        
        setValues();
        jLabel2.setVisible(false);
        
    }
    
    
    void setValues() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "SELECT * FROM `member` "
                    + "where `memberID` = '" + ManagerMemberDetailsGUI.Sid + "';";
            
            ResultSet rs = myStmt.executeQuery(sql);
            
            while(rs.next()) {
                
               name.setText(rs.getString("firstname") + " " + rs.getString("lastname"));
               
               String hiredate = rs.getString("SignupDate");
               String y = hiredate.substring(0, 4);
               exp.setText(exp.getText() + " " + y);
               
               email.setText(rs.getString("email"));
               phone.setText(rs.getString("PhoneNum"));
               cnic.setText(rs.getString("cnic"));
               address.setText(rs.getString("address"));
               
               String g = rs.getString("gender");
               if(g.equals("M"))
                   gen.setText("Male");
               else if(g.equals("F"))
                   gen.setText("Female");
               else if(g.equals("O"))
                   gen.setText("Other");
               
               String p = rs.getString("planID");
               if(p.equals("1"))
                   plan.setText("Monthly Plan");
               else if(p.equals("2"))
                   plan.setText("Annual Plan");
               else if(p.equals("3"))
                   plan.setText("Biannual Plan");
               
               String a = rs.getString("Active");
               if(a.equals("1"))
                   active.setSelected(true);
               else
                   active.setSelected(false);
               
            }
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ManagerViewMemberGUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vl = new javax.swing.JLabel();
        vt = new javax.swing.JLabel();
        viewclasses = new javax.swing.JLabel();
        active = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        Plan1 = new javax.swing.JLabel();
        plan = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        gen = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        cnic = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        Plan = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        bmi = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        xBtn1 = new javax.swing.JButton();
        age3 = new javax.swing.JLabel();
        arrowBtn = new javax.swing.JButton();
        vcbtn = new javax.swing.JButton();
        tranBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 780, 2);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 762, 2);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(761, 0, 2, 800);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/logs.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 390, 60, 40);

        vl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/view l.PNG"))); // NOI18N
        getContentPane().add(vl);
        vl.setBounds(580, 430, 200, 50);

        vt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/view t.PNG"))); // NOI18N
        getContentPane().add(vt);
        vt.setBounds(380, 430, 200, 50);

        viewclasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/vc.PNG"))); // NOI18N
        getContentPane().add(viewclasses);
        viewclasses.setBounds(210, 432, 170, 50);

        active.setBackground(new java.awt.Color(255, 255, 255));
        active.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        active.setForeground(new java.awt.Color(56, 85, 98));
        active.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                activeStateChanged(evt);
            }
        });
        active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeActionPerformed(evt);
            }
        });
        getContentPane().add(active);
        active.setBounds(350, 400, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/arrow-30-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 250, 34, 40);

        id2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        id2.setForeground(new java.awt.Color(56, 85, 98));
        id2.setText("next");
        getContentPane().add(id2);
        id2.setBounds(710, 280, 30, 30);

        Plan1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Plan1.setForeground(new java.awt.Color(56, 85, 98));
        Plan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Plan1.setText("Active:");
        getContentPane().add(Plan1);
        Plan1.setBounds(220, 390, 170, 30);

        plan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        plan.setForeground(new java.awt.Color(56, 85, 98));
        plan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        plan.setText("email");
        getContentPane().add(plan);
        plan.setBounds(350, 350, 170, 30);

        gender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(56, 85, 98));
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Gender:");
        getContentPane().add(gender);
        gender.setBounds(220, 310, 170, 30);

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(56, 85, 98));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Firstname Lastname");
        getContentPane().add(name);
        name.setBounds(180, 40, 410, 60);

        gen.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        gen.setForeground(new java.awt.Color(56, 85, 98));
        gen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gen.setText("email");
        getContentPane().add(gen);
        gen.setBounds(350, 310, 170, 30);

        address.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        address.setForeground(new java.awt.Color(56, 85, 98));
        address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        address.setText("email");
        getContentPane().add(address);
        address.setBounds(350, 270, 330, 30);

        cnic.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cnic.setForeground(new java.awt.Color(56, 85, 98));
        cnic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cnic.setText("email");
        getContentPane().add(cnic);
        cnic.setBounds(350, 230, 170, 30);

        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        phone.setForeground(new java.awt.Color(56, 85, 98));
        phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phone.setText("email");
        getContentPane().add(phone);
        phone.setBounds(350, 190, 170, 30);

        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(56, 85, 98));
        email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email.setText("email");
        getContentPane().add(email);
        email.setBounds(350, 150, 170, 30);

        Plan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Plan.setForeground(new java.awt.Color(56, 85, 98));
        Plan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Plan.setText("Plan:");
        getContentPane().add(Plan);
        Plan.setBounds(220, 350, 170, 30);

        add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(56, 85, 98));
        add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add.setText("Address:");
        getContentPane().add(add);
        add.setBounds(220, 270, 170, 30);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

        exp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        exp.setForeground(new java.awt.Color(56, 85, 98));
        exp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exp.setText("Member since");
        getContentPane().add(exp);
        exp.setBounds(170, 100, 430, 30);

        bmi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bmi.setForeground(new java.awt.Color(56, 85, 98));
        bmi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmi.setText("Phone no.:");
        getContentPane().add(bmi);
        bmi.setBounds(220, 190, 170, 30);

        weight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        weight.setForeground(new java.awt.Color(56, 85, 98));
        weight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weight.setText("CNIC:");
        getContentPane().add(weight);
        weight.setBounds(220, 230, 170, 30);

        height.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height.setForeground(new java.awt.Color(56, 85, 98));
        height.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height.setText("Email:");
        getContentPane().add(height);
        height.setBounds(220, 150, 170, 30);

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

        xBtn1.setText("jButton1");
        xBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xBtn1MouseExited(evt);
            }
        });
        xBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(xBtn1);
        xBtn1.setBounds(735, 10, 20, 20);

        age3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        age3.setForeground(new java.awt.Color(56, 85, 98));
        age3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        age3.setText("Address:");
        getContentPane().add(age3);
        age3.setBounds(220, 290, 170, 30);

        arrowBtn.setText("jButton1");
        arrowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(arrowBtn);
        arrowBtn.setBounds(702, 238, 40, 80);

        vcbtn.setText("jButton1");
        vcbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcbtnActionPerformed(evt);
            }
        });
        getContentPane().add(vcbtn);
        vcbtn.setBounds(210, 430, 170, 50);

        tranBtn.setText("jButton1");
        tranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tranBtn);
        tranBtn.setBounds(380, 430, 200, 50);

        logBtn.setText("jButton2");
        logBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logBtnMouseExited(evt);
            }
        });
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logBtn);
        logBtn.setBounds(590, 430, 150, 50);

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
   

    private void xBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtn1MouseEntered

    private void xBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtn1MouseExited

    private void xBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtn1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtn1ActionPerformed

    private void activeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_activeStateChanged

    }//GEN-LAST:event_activeStateChanged

    private void activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeActionPerformed
        Methods m = new Methods();
        
        if(active.isSelected()) {  
            m.updateMember("Active", "1", ManagerMemberDetailsGUI.Sid);
        }
        else {
            m.updateMember("Active", "0", ManagerMemberDetailsGUI.Sid);
        }
//        updateTable();
    }//GEN-LAST:event_activeActionPerformed

    private void arrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowBtnActionPerformed
        new ManagerViewMemberGUI2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_arrowBtnActionPerformed

    private void vcbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcbtnActionPerformed
          new ManagerClassesGUI().setVisible(true);
        
    }//GEN-LAST:event_vcbtnActionPerformed

    private void logBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logBtnMouseEntered
        jLabel2.setVisible(true);
    }//GEN-LAST:event_logBtnMouseEntered

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        new ManagerViewLogGUI().setVisible(true);
    }//GEN-LAST:event_logBtnActionPerformed

    private void logBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logBtnMouseExited
        jLabel2.setVisible(false);
    }//GEN-LAST:event_logBtnMouseExited

    private void tranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranBtnActionPerformed
        new ManagerViewTranGUI().setVisible(true);
    }//GEN-LAST:event_tranBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Plan;
    private javax.swing.JLabel Plan1;
    public static javax.swing.JCheckBox active;
    private javax.swing.JLabel add;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age3;
    private javax.swing.JButton arrowBtn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bmi;
    private javax.swing.JLabel cnic;
    private javax.swing.JLabel email;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel gen;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel height;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logBtn;
    private javax.swing.JLabel name;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel plan;
    private javax.swing.JButton tranBtn;
    private javax.swing.JButton vcbtn;
    private javax.swing.JLabel viewclasses;
    private javax.swing.JLabel vl;
    private javax.swing.JLabel vt;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    private javax.swing.JButton xBtn1;
    // End of variables declaration//GEN-END:variables
}
