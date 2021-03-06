package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC
 */
public class SignupGUI1 extends javax.swing.JFrame {
    
    public static String fname;
    public static String lname;
    public static String pass;
    public static String cpass;
    public static String mail;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public SignupGUI1() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);

        firstName.setVisible(false);
        lastName.setVisible(false);
        email.setVisible(false);
        passw.setVisible(false);
        confirm.setVisible(false);

        passError.setVisible(false);
        mismatchError.setVisible(false);
        fillAll.setVisible(false);
        emailKharab.setVisible(false);
        existsError.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailKharab = new javax.swing.JLabel();
        fillAll = new javax.swing.JLabel();
        existsError = new javax.swing.JLabel();
        passError = new javax.swing.JLabel();
        mismatchError = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        confirm = new javax.swing.JPasswordField();
        passw = new javax.swing.JPasswordField();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        fnameBtn = new javax.swing.JButton();
        lnameBtn = new javax.swing.JButton();
        emailBtn = new javax.swing.JButton();
        passBtn = new javax.swing.JButton();
        cpassBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        emailKharab.setForeground(new java.awt.Color(192, 0, 0));
        emailKharab.setText("*Email already exists*");
        getContentPane().add(emailKharab);
        emailKharab.setBounds(200, 300, 300, 14);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(470, 480, 300, 14);

        existsError.setForeground(new java.awt.Color(192, 0, 0));
        existsError.setText("* Please enter a valid email address *");
        getContentPane().add(existsError);
        existsError.setBounds(200, 300, 300, 14);

        passError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/mismatchError.PNG"))); // NOI18N
        getContentPane().add(passError);
        passError.setBounds(200, 415, 170, 14);

        mismatchError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/passError.PNG"))); // NOI18N
        getContentPane().add(mismatchError);
        mismatchError.setBounds(200, 357, 270, 14);

        email.setBackground(new java.awt.Color(56, 85, 98));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(null);
        email.setCaretColor(new java.awt.Color(255, 255, 255));
        email.setSelectionColor(new java.awt.Color(56, 85, 98));
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(208, 265, 350, 30);

        confirm.setBackground(new java.awt.Color(56, 85, 98));
        confirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setBorder(null);
        confirm.setSelectionColor(new java.awt.Color(56, 85, 98));
        getContentPane().add(confirm);
        confirm.setBounds(208, 378, 360, 30);

        passw.setBackground(new java.awt.Color(56, 85, 98));
        passw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passw.setForeground(new java.awt.Color(255, 255, 255));
        passw.setBorder(null);
        passw.setSelectionColor(new java.awt.Color(56, 85, 98));
        getContentPane().add(passw);
        passw.setBounds(208, 320, 360, 30);

        lastName.setBackground(new java.awt.Color(56, 85, 98));
        lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(255, 255, 255));
        lastName.setBorder(null);
        lastName.setCaretColor(new java.awt.Color(255, 255, 255));
        lastName.setSelectionColor(new java.awt.Color(56, 85, 98));
        lastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameMouseClicked(evt);
            }
        });
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        getContentPane().add(lastName);
        lastName.setBounds(406, 210, 160, 30);

        firstName.setBackground(new java.awt.Color(56, 85, 98));
        firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(255, 255, 255));
        firstName.setBorder(null);
        firstName.setCaretColor(new java.awt.Color(255, 255, 255));
        firstName.setSelectionColor(new java.awt.Color(56, 85, 98));
        firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameMouseClicked(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        getContentPane().add(firstName);
        firstName.setBounds(208, 210, 160, 30);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(377, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(606, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(498, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/signup 1.PNG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 770, 495);

        aboutBtn.setText("jButton1");
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutBtnMouseExited(evt);
            }
        });
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(390, 13, 90, 40);

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

        nextBtn.setText("jButton1");
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextBtnMouseExited(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(420, 438, 150, 40);

        fnameBtn.setText("jButton1");
        fnameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fnameBtn);
        fnameBtn.setBounds(200, 200, 170, 40);

        lnameBtn.setText("jButton1");
        lnameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lnameBtn);
        lnameBtn.setBounds(400, 202, 170, 40);

        emailBtn.setText("jButton1");
        emailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBtnActionPerformed(evt);
            }
        });
        getContentPane().add(emailBtn);
        emailBtn.setBounds(200, 260, 370, 40);

        passBtn.setText("jButton1");
        passBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBtnActionPerformed(evt);
            }
        });
        getContentPane().add(passBtn);
        passBtn.setBounds(200, 320, 370, 40);

        cpassBtn.setText("jButton1");
        cpassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cpassBtn);
        cpassBtn.setBounds(200, 370, 370, 40);

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

        classBtn.setText("jButton1");
        classBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classBtnMouseExited(evt);
            }
        });
        classBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classBtnActionPerformed(evt);
            }
        });
        getContentPane().add(classBtn);
        classBtn.setBounds(610, 10, 90, 40);

        teamBtn.setText("jButton1");
        teamBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teamBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teamBtnMouseExited(evt);
            }
        });
        teamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamBtnActionPerformed(evt);
            }
        });
        getContentPane().add(teamBtn);
        teamBtn.setBounds(505, 10, 90, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new AboutUsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_xBtnActionPerformed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        xHover.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        xHover.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked

    }//GEN-LAST:event_aboutBtnMouseClicked

    private void aboutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseEntered
        aboutHover.setVisible(true);
    }//GEN-LAST:event_aboutBtnMouseEntered

    private void aboutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseExited
        aboutHover.setVisible(false);
    }//GEN-LAST:event_aboutBtnMouseExited

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        fillAll.setVisible(false);
        mismatchError.setVisible(false);
        passError.setVisible(false);
        emailKharab.setVisible(false);
        existsError.setVisible(false);

        fname = firstName.getText();
        lname = lastName.getText();
        pass = new String(passw.getPassword());
        cpass = new String(confirm.getPassword());
        mail = email.getText();
        
        boolean isEmpty = fname.equals("") || lname.equals("") || pass.equals("")|| cpass.equals("")|| mail.equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } 
        else if(emailExists()) {
            emailKharab.setVisible(true);
        }
        else if (!mail.contains("@")) {
            existsError.setVisible(true);
        }
        else if (pass.length() < 6) {
            mismatchError.setVisible(true);
        } 
        else if (!pass.equals(cpass)) {
            passError.setVisible(true);
        } 
        
        else {
            new SignupGUI2().setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_nextBtnActionPerformed

    private boolean emailExists() {  
            
        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();
            
            String sql = "select email from Member where email = '" + mail + "';";
            ResultSet rs = myStmt.executeQuery(sql);


                //member
                while (rs.next()) {
                    String s = rs.getString("email");
                    if (mail.equals(s)) {
                        return true;
                    }
                }
                return false;
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(SignupGUI1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void firstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameMouseClicked

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameMouseClicked

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cpassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassBtnActionPerformed
        confirm.setVisible(true);
    }//GEN-LAST:event_cpassBtnActionPerformed

    private void fnameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameBtnActionPerformed
        firstName.setVisible(true);
    }//GEN-LAST:event_fnameBtnActionPerformed

    private void lnameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameBtnActionPerformed
        lastName.setVisible(true);
    }//GEN-LAST:event_lnameBtnActionPerformed

    private void emailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBtnActionPerformed
        email.setVisible(true);
    }//GEN-LAST:event_emailBtnActionPerformed

    private void passBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBtnActionPerformed
        passw.setVisible(true);
    }//GEN-LAST:event_passBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new HomePageGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        new ClassesGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_classBtnActionPerformed

    private void teamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseEntered
        teamHover.setVisible(true);
    }//GEN-LAST:event_teamBtnMouseEntered

    private void teamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseExited
        teamHover.setVisible(false);
    }//GEN-LAST:event_teamBtnMouseExited

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        new TeamGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_teamBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SignupGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupGUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupGUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JLabel background;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    public javax.swing.JPasswordField confirm;
    private javax.swing.JButton cpassBtn;
    public javax.swing.JTextField email;
    private javax.swing.JButton emailBtn;
    private javax.swing.JLabel emailKharab;
    private javax.swing.JLabel existsError;
    private javax.swing.JLabel fillAll;
    public javax.swing.JTextField firstName;
    private javax.swing.JButton fnameBtn;
    private javax.swing.JButton homeBtn;
    public javax.swing.JTextField lastName;
    private javax.swing.JButton lnameBtn;
    private javax.swing.JLabel mismatchError;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton passBtn;
    private javax.swing.JLabel passError;
    public javax.swing.JPasswordField passw;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
