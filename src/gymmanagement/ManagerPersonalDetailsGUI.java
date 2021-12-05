package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ManagerPersonalDetailsGUI extends javax.swing.JFrame {

    public static String fname;
    public static String lname;
    public static String mail;
    public static String CNIC;
    public static String phone;
    public static String gen;
    public static String add;

    boolean ddOpen = false;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public ManagerPersonalDetailsGUI() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);
        iconHover.setVisible(false);
        penhover.setVisible(false);

        Saved.setVisible(false);
        dropdown.setVisible(false);
        LogDD.setVisible(false);
        logoutDD.setVisible(false);
        transDD.setVisible(false);
        ProfileDD.setVisible(false);
        
        phoneError.setVisible(false);
        fillAll.setVisible(false);
        
        setValues();

    }

    
    void setValues() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "SELECT * FROM `manager` "
                    + "where `ManagerID` = '" + LoginGUI.managerid + "';";
            
            ResultSet rs = myStmt.executeQuery(sql);
            
            while(rs.next()) {
                
               firstName.setText(rs.getString("Firstname"));
               lastName.setText(rs.getString("Lastname"));
               email.setText(rs.getString("email"));
               cnic.setText(rs.getString("cnic"));
               phoneNum.setText(rs.getString("PhoneNum"));
               dob.setText(rs.getString("DateOfBirth"));
               
               String g = rs.getString("gender");
               
               if(g.toLowerCase().equals("m"))
                   gender.setText("Male");
               else if(g.toLowerCase().equals("f"))
                   gender.setText("Female");
               else
                   gender.setText("Other");
            }
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(ManagerPersonalDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        transDD = new javax.swing.JLabel();
        logoutDD = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        doneBtn = new javax.swing.JLabel();
        iconHover = new javax.swing.JLabel();
        memberhover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        Saved = new javax.swing.JLabel();
        penhover = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cnic = new javax.swing.JLabel();
        fillAll = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        phoneNum = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        chPassBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        chManBtn = new javax.swing.JButton();
        MemberBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logbookBtn = new javax.swing.JButton();
        SalaryyBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(490, 350, 170, 50);

        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gender);
        gender.setBounds(578, 306, 70, 30);

        ProfileDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dd profile manager.PNG"))); // NOI18N
        getContentPane().add(ProfileDD);
        ProfileDD.setBounds(540, 55, 190, 170);

        dropdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dd manager.PNG"))); // NOI18N
        getContentPane().add(dropdown);
        dropdown.setBounds(540, 50, 200, 180);

        LogDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dd logbook manager.PNG"))); // NOI18N
        getContentPane().add(LogDD);
        LogDD.setBounds(540, 56, 190, 170);

        transDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dd trans manager.PNG"))); // NOI18N
        getContentPane().add(transDD);
        transDD.setBounds(540, 55, 190, 170);

        logoutDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dd logout manager.PNG"))); // NOI18N
        getContentPane().add(logoutDD);
        logoutDD.setBounds(540, 57, 193, 170);

        phoneError.setForeground(new java.awt.Color(192, 0, 0));
        phoneError.setText("* Phone number length is incorrect *");
        getContentPane().add(phoneError);
        phoneError.setBounds(480, 287, 300, 14);

        doneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/done button.PNG"))); // NOI18N
        getContentPane().add(doneBtn);
        doneBtn.setBounds(494, 343, 162, 60);

        iconHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/icon hover.PNG"))); // NOI18N
        getContentPane().add(iconHover);
        iconHover.setBounds(676, 8, 50, 40);

        memberhover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        memberhover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberhoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberhoverMouseExited(evt);
            }
        });
        getContentPane().add(memberhover);
        memberhover.setBounds(474, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(370, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(576, 16, 100, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(262, 16, 100, 60);

        id1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        id1.setForeground(new java.awt.Color(56, 85, 98));
        id1.setText("Edit");
        getContentPane().add(id1);
        id1.setBounds(620, 155, 150, 30);

        Saved.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Saved.setForeground(new java.awt.Color(56, 85, 98));
        Saved.setText("Saved!");
        getContentPane().add(Saved);
        Saved.setBounds(660, 370, 300, 14);

        penhover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pen hover.PNG"))); // NOI18N
        getContentPane().add(penhover);
        penhover.setBounds(600, 115, 70, 50);

        dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dob.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dob);
        dob.setBounds(260, 357, 210, 30);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email);
        email.setBounds(210, 307, 260, 30);

        cnic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnic.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cnic);
        cnic.setBounds(200, 251, 180, 30);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(580, 480, 300, 14);

        lastName.setEditable(false);
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
        lastName.setBounds(503, 198, 140, 30);

        phoneNum.setEditable(false);
        phoneNum.setBackground(new java.awt.Color(56, 85, 98));
        phoneNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNum.setForeground(new java.awt.Color(255, 255, 255));
        phoneNum.setBorder(null);
        phoneNum.setCaretColor(new java.awt.Color(255, 255, 255));
        phoneNum.setSelectionColor(new java.awt.Color(56, 85, 98));
        phoneNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNumMouseClicked(evt);
            }
        });
        phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumActionPerformed(evt);
            }
        });
        phoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNumKeyPressed(evt);
            }
        });
        getContentPane().add(phoneNum);
        phoneNum.setBounds(502, 250, 140, 30);

        firstName.setEditable(false);
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
        firstName.setBounds(240, 198, 130, 30);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/manager profile.PNG"))); // NOI18N
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
        nextBtn.setBounds(500, 348, 150, 50);

        chPassBtn.setText("jButton1");
        chPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chPassBtn);
        chPassBtn.setBounds(130, 420, 260, 50);

        editBtn.setText("jButton1");
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn);
        editBtn.setBounds(610, 120, 40, 60);

        iconBtn.setText("jButton1");
        iconBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconBtnMouseExited(evt);
            }
        });
        iconBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconBtnActionPerformed(evt);
            }
        });
        getContentPane().add(iconBtn);
        iconBtn.setBounds(680, 0, 40, 50);

        chManBtn.setText("jButton1");
        chManBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chManBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chManBtn);
        chManBtn.setBounds(400, 420, 260, 50);

        MemberBtn.setText("jButton1");
        MemberBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MemberBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MemberBtnMouseExited(evt);
            }
        });
        MemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MemberBtn);
        MemberBtn.setBounds(470, 10, 100, 40);

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
        aboutBtn.setBounds(255, 3, 110, 50);

        logoutBtn.setText("jButton1");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn);
        logoutBtn.setBounds(540, 180, 190, 40);

        profileBtn.setText("jButton1");
        profileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileBtnMouseExited(evt);
            }
        });
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        getContentPane().add(profileBtn);
        profileBtn.setBounds(540, 50, 190, 50);

        logbookBtn.setText("jButton1");
        logbookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logbookBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logbookBtnMouseExited(evt);
            }
        });
        logbookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logbookBtn);
        logbookBtn.setBounds(540, 100, 190, 40);

        SalaryyBtn.setText("jButton1");
        SalaryyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalaryyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalaryyBtnMouseExited(evt);
            }
        });
        SalaryyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SalaryyBtn);
        SalaryyBtn.setBounds(540, 140, 190, 40);

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
        classBtn.setBounds(570, 10, 90, 40);

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
        teamBtn.setBounds(365, 10, 110, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_xBtnActionPerformed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        xHover.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        xHover.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited
   
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        fillAll.setVisible(false);
        phoneError.setVisible(false);

        fname = firstName.getText();
        lname = lastName.getText();
        phone = phoneNum.getText();

        boolean isEmpty = fname.equals("") || lname.equals("") || phone.equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } 
        
        else if (phone.length() != 11) {
            phoneError.setVisible(true);
        } 
        
        else {
            //save into database
            Methods m = new Methods();
            String mid = LoginGUI.managerid;
            
            m.updateManager("Firstname", fname, mid);
            m.updateManager("Lastname", lname, mid);
            m.updateManager("PhoneNum", phone, mid);
            
            nextBtn.setVisible(false);
            jPanel2.setVisible(true);
            
            Saved.setVisible(true);
            penhover.setVisible(false);
            firstName.setEditable(false);
            lastName.setEditable(false);
            phoneNum.setEditable(false);
            
        }

    }//GEN-LAST:event_nextBtnActionPerformed


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

    private void phoneNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumMouseClicked

    private void phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumActionPerformed

    private void phoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8) {
            phoneNum.setEditable(true);
        } else {
            phoneNum.setEditable(false);
        }
    }//GEN-LAST:event_phoneNumKeyPressed

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered

    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        //penhover.setVisible(false);
    }//GEN-LAST:event_editBtnMouseExited

    private void iconBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBtnMouseEntered
       // iconHover.setVisible(true);
    }//GEN-LAST:event_iconBtnMouseEntered

    private void iconBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBtnMouseExited
        //iconHover.setVisible(false);
    }//GEN-LAST:event_iconBtnMouseExited

    private void iconBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconBtnActionPerformed
        if(!ddOpen) {
            iconHover.setVisible(true);
            dropdown.setVisible(true);
            ddOpen = true;
        }
        
        else {
            iconHover.setVisible(false);
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            transDD.setVisible(false);
            ProfileDD.setVisible(false);
            
            ddOpen = false;
        }
            
    }//GEN-LAST:event_iconBtnActionPerformed

    private void chPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPassBtnActionPerformed
        new ManagerChangePasswordGUI().setVisible(true);

    }//GEN-LAST:event_chPassBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        penhover.setVisible(true);
        firstName.setEditable(true);
        lastName.setEditable(true);
        phoneNum.setEditable(true);
        
        nextBtn.setVisible(true);
        jPanel2.setVisible(false);
        Saved.setVisible(false);
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void memberhoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseEntered

    }//GEN-LAST:event_memberhoverMouseEntered

    private void memberhoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseExited

    }//GEN-LAST:event_memberhoverMouseExited

    private void chManBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chManBtnActionPerformed
        new ManagerChangeGUI().setVisible(true);
    }//GEN-LAST:event_chManBtnActionPerformed

    private void MemberBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberBtnMouseEntered
        memberhover.setVisible(true);
    }//GEN-LAST:event_MemberBtnMouseEntered

    private void MemberBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberBtnMouseExited
        memberhover.setVisible(false);
    }//GEN-LAST:event_MemberBtnMouseExited

    private void MemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBtnActionPerformed
        new ManagerMemberDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MemberBtnActionPerformed

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked

    }//GEN-LAST:event_aboutBtnMouseClicked

    private void aboutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseEntered
        aboutHover.setVisible(true);
    }//GEN-LAST:event_aboutBtnMouseEntered

    private void aboutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseExited
        aboutHover.setVisible(false);
    }//GEN-LAST:event_aboutBtnMouseExited

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new AboutUsManagerGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(true);
            transDD.setVisible(false);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnMouseExited

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        if (ddOpen) {
            LoginGUI.type = "";
            this.setVisible(false);
            new HomePageGUI().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void profileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            transDD.setVisible(false);
            ProfileDD.setVisible(true);
        }
    }//GEN-LAST:event_profileBtnMouseEntered

    private void profileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseExited
        ProfileDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_profileBtnMouseExited

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        if(ddOpen) {
            new ManagerPersonalDetailsGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logbookBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbookBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(true);
            logoutDD.setVisible(false);
            transDD.setVisible(false);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_logbookBtnMouseEntered

    private void logbookBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbookBtnMouseExited
        LogDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_logbookBtnMouseExited

    private void logbookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbookBtnActionPerformed
        if(ddOpen) {
            new ManagerLogbookGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_logbookBtnActionPerformed

    private void SalaryyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryyBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            transDD.setVisible(true);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_SalaryyBtnMouseEntered

    private void SalaryyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryyBtnMouseExited
        transDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_SalaryyBtnMouseExited

    private void SalaryyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryyBtnActionPerformed
        if(ddOpen) {
            new ManagerTranGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_SalaryyBtnActionPerformed

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        new ManagerAllClassesGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_classBtnActionPerformed

    private void teamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseEntered
        teamHover.setVisible(true);
    }//GEN-LAST:event_teamBtnMouseEntered

    private void teamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseExited
        teamHover.setVisible(false);
    }//GEN-LAST:event_teamBtnMouseExited

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        new ManagerTrainerDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_teamBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogDD;
    private javax.swing.JButton MemberBtn;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JButton SalaryyBtn;
    private javax.swing.JLabel Saved;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JLabel background;
    private javax.swing.JButton chManBtn;
    private javax.swing.JButton chPassBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JLabel cnic;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel doneBtn;
    private javax.swing.JLabel dropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fillAll;
    public javax.swing.JTextField firstName;
    private javax.swing.JLabel gender;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lastName;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JLabel memberhover;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel penhover;
    private javax.swing.JLabel phoneError;
    public javax.swing.JTextField phoneNum;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel transDD;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
