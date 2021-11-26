/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class PayGUI extends javax.swing.JFrame {

    public static String namee;
    public static int amountt = 0;
    public static String number;
    public static int m;
    public static int y;
    public static String CVV;
    String mid = "";

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public PayGUI() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);

        name.setVisible(false);
        accNum.setVisible(false);

        fillAll.setVisible(false);
        monthError.setVisible(false);
        cvvError.setVisible(false);
        accError.setVisible(false);

        String plan = PaymentPlanGUI.plan;
        if (plan.equals("m")) {
            amountt = 3000;
            amount.setText("Rs 3000");
        } else if (plan.equals("y")) {
            amountt = 30000;
            amount.setText("Rs 30,000");
        } else if (plan.equals("b")) {
            amountt = 16000;
            amount.setText("Rs 16,000");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthError = new javax.swing.JLabel();
        accError = new javax.swing.JLabel();
        cvvError = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        fillAll = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        accNum = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        accBtn = new javax.swing.JButton();
        nameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        monthError.setForeground(new java.awt.Color(192, 0, 0));
        monthError.setText("* Enter valid expiry date *");
        getContentPane().add(monthError);
        monthError.setBounds(200, 360, 300, 14);

        accError.setForeground(new java.awt.Color(192, 0, 0));
        accError.setText("* Enter valid Card Number *");
        getContentPane().add(accError);
        accError.setBounds(200, 300, 300, 14);

        cvvError.setForeground(new java.awt.Color(192, 0, 0));
        cvvError.setText("* Enter valid CVV *");
        getContentPane().add(cvvError);
        cvvError.setBounds(200, 420, 300, 14);

        amount.setBackground(new java.awt.Color(56, 85, 98));
        amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(amount);
        amount.setBounds(480, 388, 70, 20);

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 85, 98));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041" }));
        year.setBorder(null);
        year.setLightWeightPopupEnabled(false);
        year.setMinimumSize(new java.awt.Dimension(170, 35));
        year.setName("Gender"); // NOI18N
        year.setPreferredSize(new java.awt.Dimension(170, 35));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(492, 325, 70, 30);

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
        month.setBounds(310, 325, 60, 30);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(470, 480, 300, 14);

        cvv.setBackground(new java.awt.Color(56, 85, 98));
        cvv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cvv.setForeground(new java.awt.Color(255, 255, 255));
        cvv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cvv.setBorder(null);
        cvv.setCaretColor(new java.awt.Color(255, 255, 255));
        cvv.setSelectionColor(new java.awt.Color(255, 255, 255));
        cvv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvvMouseClicked(evt);
            }
        });
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvvKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cvvKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvvKeyTyped(evt);
            }
        });
        getContentPane().add(cvv);
        cvv.setBounds(278, 383, 70, 30);

        accNum.setBackground(new java.awt.Color(56, 85, 98));
        accNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accNum.setForeground(new java.awt.Color(255, 255, 255));
        accNum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        accNum.setBorder(null);
        accNum.setCaretColor(new java.awt.Color(255, 255, 255));
        accNum.setSelectionColor(new java.awt.Color(255, 255, 255));
        accNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accNumMouseClicked(evt);
            }
        });
        accNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accNumActionPerformed(evt);
            }
        });
        accNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accNumKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accNumKeyTyped(evt);
            }
        });
        getContentPane().add(accNum);
        accNum.setBounds(210, 265, 350, 30);

        name.setBackground(new java.awt.Color(56, 85, 98));
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        name.setSelectionColor(new java.awt.Color(255, 255, 255));
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(208, 210, 350, 30);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pay.PNG"))); // NOI18N
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
        classBtn.setBounds(620, 10, 80, 40);

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

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

        accBtn.setText("jButton1");
        accBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accBtnActionPerformed(evt);
            }
        });
        getContentPane().add(accBtn);
        accBtn.setBounds(200, 260, 370, 40);

        nameBtn.setText("jButton1");
        nameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nameBtn);
        nameBtn.setBounds(200, 200, 370, 40);

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

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamBtnActionPerformed

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classBtnActionPerformed

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

    private void teamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseEntered
        teamHover.setVisible(true);
    }//GEN-LAST:event_teamBtnMouseEntered

    private void teamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseExited
        teamHover.setVisible(false);
    }//GEN-LAST:event_teamBtnMouseExited

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        accError.setVisible(false);
        monthError.setVisible(false);
        cvvError.setVisible(false);
        fillAll.setVisible(false);

        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();

        namee = name.getText();
        number = accNum.getText();
        m = Integer.parseInt(month.getItemAt(month.getSelectedIndex()));
        y = Integer.parseInt(year.getItemAt(year.getSelectedIndex()));
        CVV = cvv.getText();

        boolean isEmpty = namee.equals("") || number.equals("") || cvv.getText().equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } else if (number.length() != 16) {
            accError.setVisible(true);
        } else if (CVV.length() != 3) {
            cvvError.setVisible(true);
        } else if (y <= currentYear) {
            monthError.setVisible(true);
        } else if (y == currentYear && m <= currentMonth) {
            monthError.setVisible(true);
        } else {
//            HomePageGUI.s3.setVisible(true);
            this.setVisible(false);
        }

        createMember();
        LoginGUI.memberid = mid;
        addBankDetails();
        addTransaction();

    }//GEN-LAST:event_nextBtnActionPerformed

    void addBankDetails() {

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql = "INSERT INTO `bankdetails`(`PersonID`, `CardNum`, "
                    + "`CVV`, `ExpiryMonth`, `ExpiryYear`, `CardHoldersName`, `DefaultCard`) "
                    + "VALUES ('" + mid + "','" + number + "','" + CVV + "',"
                    + "'" + m + "','" + y + "','" + namee + "', '1');";
            int rs = myStmt.executeUpdate(sql);
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String transID() {
        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql3 = "select count(*) as row_id from Transactions";
            ResultSet rs3 = myStmt.executeQuery(sql3);

            while (rs3.next()) {
                row_id = rs3.getInt("row_id");
            }

            String t_id = (row_id + 1) + "";
            return t_id;

        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    void addTransaction() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql = "INSERT INTO `transactions`(`TransID`, `PersonID`, "
                    + "`Amount`, `Date`) "
                    + "VALUES ('" + transID() + "','" + mid + "','" + amountt
                    + "', curdate());";
            int rs = myStmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String createPhysique() {

        double w = SignupGUI3.w;
        double h = SignupGUI3.h;
        double BMI = SignupGUI3.BMI;
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

    private void createMember() {

        String fname = SignupGUI1.fname;
        String lname = SignupGUI1.lname;
        String pass = SignupGUI1.pass;
        String cpass = SignupGUI1.cpass;
        String mail = SignupGUI1.mail;

        String cnic = SignupGUI2.cnic;
        String phoneNum = SignupGUI2.phoneNum;
        String add = SignupGUI2.add;
        String gen = SignupGUI2.gen;
        String dob = SignupGUI2.dob;

//        int agee = SignupGUI3.agee;

        String p_id = PaymentPlanGUI.p_id;

        mid = memberID();

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql = "INSERT INTO `member`(`MemberID`, `Firstname`, "
                    + "`Lastname`, `email`, `password`, `CNIC`, "
                    + "`PhoneNum`, `PhysiqueID`, `Address`, `Gender`, `Active`,"
                    + " `CurrentMember`, `PlanID`, `SignupDate`, `DateOfBirth`) "
                    
                    + "VALUES ('" + mid + "','" + fname + "','" + lname + "','"
                    + mail + "','" + pass + "','" + cnic + "','"
                    + phoneNum + "','" + createPhysique() + "','" + add + "','"
                    + gen + "', '1', '1', '" + p_id + "', CURDATE(), '"+ dob +"');";

            int rs = myStmt.executeUpdate(sql);

            System.out.println(memberID() + " " + fname);

        } catch (SQLException ex) {
            Logger.getLogger(PayGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    String memberID() {

        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql2 = "select count(*) as row_id from Member";
            ResultSet rs2 = myStmt.executeQuery(sql2);

            while (rs2.next()) {
                row_id = rs2.getInt("row_id");
            }

            String mem_id = "M" + (row_id + 1);
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

    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nameMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void cvvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvvMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvMouseClicked

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void nameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBtnActionPerformed
        name.setVisible(true);
    }//GEN-LAST:event_nameBtnActionPerformed

    private void accNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accNumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_accNumMouseClicked

    private void accNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accNumActionPerformed
        name.setVisible(true);
    }//GEN-LAST:event_accNumActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new HomePageGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void accNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accNumKeyTyped

    }//GEN-LAST:event_accNumKeyTyped

    private void cvvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyTyped

    }//GEN-LAST:event_cvvKeyTyped

    private void accNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accNumKeyReleased

    }//GEN-LAST:event_accNumKeyReleased

    private void cvvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyReleased
        // TODO add your handling code here:
//        h = Integer.parseInt(height.getText());
//        BMI = (w / (h*h)) * 10000;
//        bmi.setText(BMI+"");
    }//GEN-LAST:event_cvvKeyReleased

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed

    }//GEN-LAST:event_nameKeyPressed

    private void accNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accNumKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8) {
            accNum.setEditable(true);
        } else {
            accNum.setEditable(false);
        }
    }//GEN-LAST:event_accNumKeyPressed

    private void cvvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8) {
            cvv.setEditable(true);
        } else {
            cvv.setEditable(false);
        }
    }//GEN-LAST:event_cvvKeyPressed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void accBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accBtnActionPerformed
        accNum.setVisible(true);
    }//GEN-LAST:event_accBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JButton accBtn;
    private javax.swing.JLabel accError;
    public javax.swing.JTextField accNum;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel background;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    public javax.swing.JTextField cvv;
    private javax.swing.JLabel cvvError;
    private javax.swing.JLabel fillAll;
    private javax.swing.JButton homeBtn;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JLabel monthError;
    public javax.swing.JTextField name;
    private javax.swing.JButton nameBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
