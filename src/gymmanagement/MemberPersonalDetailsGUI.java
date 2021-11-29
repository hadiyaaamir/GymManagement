package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class MemberPersonalDetailsGUI extends javax.swing.JFrame {

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

    public MemberPersonalDetailsGUI() {
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
        phistoryDD.setVisible(false);
        ProfileDD.setVisible(false);
        
        phoneError.setVisible(false);
        fillAll.setVisible(false);
        
        setValues();

    }

    
    void setValues() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "SELECT `Firstname`, `Lastname`, `email`, "
                    + "`CNIC`, `PhoneNum`, `Address`, `Gender` FROM `member` "
                    + "where `MemberID` = '" + LoginGUI.memberid + "';";
            
            ResultSet rs = myStmt.executeQuery(sql);
            
            while(rs.next()) {
               firstName.setText(rs.getString("Firstname"));
               lastName.setText(rs.getString("Lastname"));
               email.setText(rs.getString("email"));
               cnic.setText(rs.getString("cnic"));
               phoneNum.setText(rs.getString("PhoneNum"));
               address.setText(rs.getString("Address"));
               
               id.setText("Member ID: " + LoginGUI.memberid);
               
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
            Logger.getLogger(MemberPersonalDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutDD = new javax.swing.JLabel();
        phistoryDD = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        Saved = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        iconHover = new javax.swing.JLabel();
        penhover = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        cnic = new javax.swing.JLabel();
        fillAll = new javax.swing.JLabel();
        address = new javax.swing.JTextArea();
        lastName = new javax.swing.JTextField();
        phoneNum = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        chPassBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        healthBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        bankBtn = new javax.swing.JButton();
        personalBtn = new javax.swing.JButton();
        phistoryBtn = new javax.swing.JButton();
        logbookBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(510, 431, 170, 50);

        logoutDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown logout hover.PNG"))); // NOI18N
        getContentPane().add(logoutDD);
        logoutDD.setBounds(540, 50, 200, 180);

        phistoryDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown payment hover.PNG"))); // NOI18N
        getContentPane().add(phistoryDD);
        phistoryDD.setBounds(540, 50, 200, 180);

        LogDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown logbook hover.PNG"))); // NOI18N
        getContentPane().add(LogDD);
        LogDD.setBounds(540, 50, 200, 180);

        ProfileDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown profile hover.PNG"))); // NOI18N
        getContentPane().add(ProfileDD);
        ProfileDD.setBounds(540, 50, 200, 180);

        dropdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown.PNG"))); // NOI18N
        getContentPane().add(dropdown);
        dropdown.setBounds(540, 50, 200, 180);

        phoneError.setForeground(new java.awt.Color(192, 0, 0));
        phoneError.setText("* Phone number length is incorrect *");
        getContentPane().add(phoneError);
        phoneError.setBounds(480, 290, 300, 16);

        id1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        id1.setForeground(new java.awt.Color(56, 85, 98));
        id1.setText("Edit");
        getContentPane().add(id1);
        id1.setBounds(650, 150, 150, 30);

        Saved.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Saved.setForeground(new java.awt.Color(56, 85, 98));
        Saved.setText("Saved!");
        getContentPane().add(Saved);
        Saved.setBounds(690, 450, 300, 14);

        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gender);
        gender.setBounds(650, 310, 70, 30);

        iconHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/icon hover.PNG"))); // NOI18N
        getContentPane().add(iconHover);
        iconHover.setBounds(676, 8, 50, 40);

        penhover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pen hover.PNG"))); // NOI18N
        getContentPane().add(penhover);
        penhover.setBounds(627, 115, 70, 50);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email);
        email.setBounds(280, 311, 260, 30);

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(56, 85, 98));
        id.setText("Member ID: ");
        getContentPane().add(id);
        id.setBounds(20, 120, 150, 30);

        cnic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnic.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cnic);
        cnic.setBounds(280, 256, 170, 30);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(580, 480, 300, 16);

        address.setEditable(false);
        address.setBackground(new java.awt.Color(56, 85, 98));
        address.setColumns(1);
        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setLineWrap(true);
        address.setRows(3);
        address.setAutoscrolls(false);
        address.setBorder(null);
        address.setCaretColor(new java.awt.Color(255, 255, 255));
        address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address.setHighlighter(null);
        address.setPreferredSize(new java.awt.Dimension(300, 370));
        address.setSelectionColor(new java.awt.Color(56, 85, 98));
        getContentPane().add(address);
        address.setBounds(300, 370, 410, 50);

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
        lastName.setBounds(578, 202, 140, 30);

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
        phoneNum.setBounds(580, 257, 140, 30);

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
        firstName.setBounds(320, 203, 130, 30);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(351, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(581, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(472, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/personal details member.PNG"))); // NOI18N
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
        aboutBtn.setBounds(350, 3, 100, 50);

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
        teamBtn.setBounds(475, 10, 90, 40);

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
        nextBtn.setBounds(530, 438, 150, 40);

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

        chPassBtn.setText("jButton1");
        chPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chPassBtn);
        chPassBtn.setBounds(250, 440, 250, 40);

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
        editBtn.setBounds(630, 120, 50, 50);

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

        healthBtn.setText("jButton1");
        healthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthBtnActionPerformed(evt);
            }
        });
        getContentPane().add(healthBtn);
        healthBtn.setBounds(20, 260, 160, 60);

        paymentBtn.setText("jButton1");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(paymentBtn);
        paymentBtn.setBounds(20, 330, 160, 70);

        bankBtn.setText("jButton1");
        bankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bankBtn);
        bankBtn.setBounds(20, 410, 160, 60);

        personalBtn.setText("jButton1");
        getContentPane().add(personalBtn);
        personalBtn.setBounds(10, 190, 180, 60);

        phistoryBtn.setText("jButton1");
        phistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                phistoryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phistoryBtnMouseExited(evt);
            }
        });
        phistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phistoryBtnActionPerformed(evt);
            }
        });
        getContentPane().add(phistoryBtn);
        phistoryBtn.setBounds(540, 140, 190, 40);

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
        classBtn.setBounds(590, 10, 70, 40);

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
        this.setVisible(false);
        new MembersTeamGUI().setVisible(true);
            
    }//GEN-LAST:event_teamBtnActionPerformed

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
   
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

        fillAll.setVisible(false);
        phoneError.setVisible(false);

        fname = firstName.getText();
        lname = lastName.getText();
        phone = phoneNum.getText();
        add = address.getText();

        boolean isEmpty = fname.equals("") || lname.equals("") || phone.equals("")|| address.equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } 
        
        else if (phone.length() != 11) {
            phoneError.setVisible(true);
        } 
        
        else {
            //save into database
            Methods m = new Methods();
            String mid = LoginGUI.memberid;
            
            m.updateMember("Firstname", fname, mid);
            m.updateMember("Lastname", lname, mid);
            m.updateMember("PhoneNum", phone, mid);
            m.updateMember("Address", add, mid);
            
            nextBtn.setVisible(false);
            jPanel1.setVisible(true);
            
            Saved.setVisible(true);
            penhover.setVisible(false);
            firstName.setEditable(false);
            lastName.setEditable(false);
            phoneNum.setEditable(false);
            address.setEditable(false);
            
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

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //dashboard
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

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
            phistoryDD.setVisible(false);
            ProfileDD.setVisible(false);
            
            ddOpen = false;
        }
            
    }//GEN-LAST:event_iconBtnActionPerformed

    private void chPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPassBtnActionPerformed
        new MemberChangePasswordGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chPassBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        penhover.setVisible(true);
        firstName.setEditable(true);
        lastName.setEditable(true);
        phoneNum.setEditable(true);
        address.setEditable(true);
        
        nextBtn.setVisible(true);
        jPanel1.setVisible(false);
        Saved.setVisible(false);
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void healthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthBtnActionPerformed
        new MemberHealthDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_healthBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        new MemberPaymentPlanGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void bankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankBtnActionPerformed
        new MemberBankDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bankBtnActionPerformed

    private void phistoryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phistoryBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            phistoryDD.setVisible(true);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_phistoryBtnMouseEntered

    private void phistoryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phistoryBtnMouseExited
        phistoryDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_phistoryBtnMouseExited

    private void phistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phistoryBtnActionPerformed
        new MemberpayhistoryGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_phistoryBtnActionPerformed

    private void logbookBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbookBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(true);
            logoutDD.setVisible(false);
            phistoryDD.setVisible(false);
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
        new MemberLogBookGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logbookBtnActionPerformed

    private void profileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            phistoryDD.setVisible(false);
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
        new MemberPersonalDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(true);
            phistoryDD.setVisible(false);
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

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MemberClassesGUI().setVisible(true);
    }//GEN-LAST:event_classBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MemberPersonalDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberPersonalDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberPersonalDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberPersonalDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberPersonalDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogDD;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JLabel Saved;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    public javax.swing.JTextArea address;
    private javax.swing.JLabel background;
    private javax.swing.JButton bankBtn;
    private javax.swing.JButton chPassBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JLabel cnic;
    private javax.swing.JLabel dropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fillAll;
    public javax.swing.JTextField firstName;
    private javax.swing.JLabel gender;
    private javax.swing.JButton healthBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lastName;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JLabel penhover;
    private javax.swing.JButton personalBtn;
    private javax.swing.JButton phistoryBtn;
    private javax.swing.JLabel phistoryDD;
    private javax.swing.JLabel phoneError;
    public javax.swing.JTextField phoneNum;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
