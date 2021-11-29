package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class TrainerOtherDetailsGUI extends javax.swing.JFrame {

    public static String sfee;
    public static String Sal;
    public static String cat;
    public static String desc;
    

    boolean ddOpen = false;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public TrainerOtherDetailsGUI() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        memberhover.setVisible(false);
        xHover.setVisible(false);
        iconHover.setVisible(false);
        penhover.setVisible(false);

        Saved.setVisible(false);
        dropdown.setVisible(false);
        LogDD.setVisible(false);
        logoutDD.setVisible(false);
        salaryDD.setVisible(false);
        ProfileDD.setVisible(false);
        
 
        fillAll.setVisible(false);
        
        setValues();

    }

    
    void setValues() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            
            String sql = "SELECT `sessionfee`, `category`, `salary`, "
                    + "`description` FROM `trainer` "
                    + "where `trainerID` = '" + LoginGUI.trainerid + "';";
            
            ResultSet rs = myStmt.executeQuery(sql);
            
            while(rs.next()) {
               sessionfee.setText(rs.getString("sessionfee"));
               salary.setText(rs.getString("salary"));
               Category.setText(rs.getString("category"));
               description.setText(rs.getString("description"));
               
               id.setText("Trainer ID: " + LoginGUI.trainerid);
               
//               String g = rs.getString("gender");
               
            }
            
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(TrainerOtherDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dropdown = new javax.swing.JLabel();
        salaryDD = new javax.swing.JLabel();
        logoutDD = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        Saved = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        iconHover = new javax.swing.JLabel();
        penhover = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        fillAll = new javax.swing.JLabel();
        description = new javax.swing.JTextArea();
        salary = new javax.swing.JTextField();
        Category = new javax.swing.JTextField();
        sessionfee = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        memberhover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        healthBtn = new javax.swing.JButton();
        OtherBtn = new javax.swing.JButton();
        bankBtn = new javax.swing.JButton();
        personalBtn = new javax.swing.JButton();
        logbookBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        SalaryyBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        MemberBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 430, 220, 50);

        dropdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tdrop.PNG"))); // NOI18N
        getContentPane().add(dropdown);
        dropdown.setBounds(540, 50, 200, 180);

        salaryDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tsaldrop.PNG"))); // NOI18N
        getContentPane().add(salaryDD);
        salaryDD.setBounds(540, 55, 190, 170);

        logoutDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tLoutdrop.PNG"))); // NOI18N
        getContentPane().add(logoutDD);
        logoutDD.setBounds(540, 57, 189, 170);

        ProfileDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tprofdrop.PNG"))); // NOI18N
        getContentPane().add(ProfileDD);
        ProfileDD.setBounds(540, 55, 190, 170);

        LogDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tlogbookdrop.PNG"))); // NOI18N
        getContentPane().add(LogDD);
        LogDD.setBounds(540, 56, 190, 170);

        id1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        id1.setForeground(new java.awt.Color(56, 85, 98));
        id1.setText("Edit");
        getContentPane().add(id1);
        id1.setBounds(650, 150, 150, 30);

        Saved.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Saved.setForeground(new java.awt.Color(56, 85, 98));
        Saved.setText("Saved!");
        getContentPane().add(Saved);
        Saved.setBounds(610, 450, 300, 14);

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
        id.setText("Trainer ID: ");
        getContentPane().add(id);
        id.setBounds(20, 120, 150, 30);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(420, 480, 300, 14);

        description.setEditable(false);
        description.setBackground(new java.awt.Color(56, 85, 98));
        description.setColumns(1);
        description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setLineWrap(true);
        description.setRows(3);
        description.setAutoscrolls(false);
        description.setBorder(null);
        description.setCaretColor(new java.awt.Color(255, 255, 255));
        description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        description.setHighlighter(null);
        description.setPreferredSize(new java.awt.Dimension(300, 370));
        description.setSelectionColor(new java.awt.Color(56, 85, 98));
        getContentPane().add(description);
        description.setBounds(400, 320, 250, 90);

        salary.setEditable(false);
        salary.setBackground(new java.awt.Color(56, 85, 98));
        salary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salary.setForeground(new java.awt.Color(255, 255, 255));
        salary.setBorder(null);
        salary.setCaretColor(new java.awt.Color(255, 255, 255));
        salary.setSelectionColor(new java.awt.Color(56, 85, 98));
        salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryMouseClicked(evt);
            }
        });
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        getContentPane().add(salary);
        salary.setBounds(545, 205, 120, 30);

        Category.setEditable(false);
        Category.setBackground(new java.awt.Color(56, 85, 98));
        Category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.setBorder(null);
        Category.setCaretColor(new java.awt.Color(255, 255, 255));
        Category.setSelectionColor(new java.awt.Color(56, 85, 98));
        Category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryMouseClicked(evt);
            }
        });
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        Category.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CategoryKeyPressed(evt);
            }
        });
        getContentPane().add(Category);
        Category.setBounds(370, 260, 290, 30);

        sessionfee.setEditable(false);
        sessionfee.setBackground(new java.awt.Color(56, 85, 98));
        sessionfee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sessionfee.setForeground(new java.awt.Color(255, 255, 255));
        sessionfee.setBorder(null);
        sessionfee.setCaretColor(new java.awt.Color(255, 255, 255));
        sessionfee.setSelectionColor(new java.awt.Color(56, 85, 98));
        sessionfee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionfeeMouseClicked(evt);
            }
        });
        sessionfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionfeeActionPerformed(evt);
            }
        });
        getContentPane().add(sessionfee);
        sessionfee.setBounds(390, 210, 80, 30);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(235, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(570, 16, 100, 60);

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
        memberhover.setBounds(467, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(355, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/trainerother.PNG"))); // NOI18N
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
        aboutBtn.setBounds(235, 3, 100, 50);

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
        nextBtn.setBounds(350, 428, 240, 50);

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

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

        OtherBtn.setText("jButton1");
        OtherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherBtnActionPerformed(evt);
            }
        });
        getContentPane().add(OtherBtn);
        OtherBtn.setBounds(20, 400, 160, 70);

        bankBtn.setText("jButton1");
        bankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bankBtn);
        bankBtn.setBounds(20, 334, 160, 60);

        personalBtn.setText("jButton1");
        personalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(personalBtn);
        personalBtn.setBounds(10, 190, 180, 60);

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
        classBtn.setBounds(570, 10, 90, 40);

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
        MemberBtn.setBounds(470, 10, 90, 40);

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
        teamBtn.setBounds(355, 10, 100, 40);

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
        sfee = sessionfee.getText();
        Sal = salary.getText();
        cat = Category.getText();
        desc = description.getText();

        boolean isEmpty = cat.equals("") || desc.equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } 
        
        
        else {
            //save into database
            Methods m = new Methods();
            String tid = LoginGUI.trainerid;
            
            m.updateTrainer("SessionFee", sfee, tid);
            m.updateTrainer("Salary", Sal, tid);
            m.updateTrainer("category", cat, tid);
            m.updateTrainer("description", desc, tid);
            
            nextBtn.setVisible(false);
            jPanel1.setVisible(true);
            
            Saved.setVisible(true);
            penhover.setVisible(false);
           
            Category.setEditable(false);
            description.setEditable(false);
            
        }

    }//GEN-LAST:event_nextBtnActionPerformed


    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void sessionfeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessionfeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionfeeMouseClicked

    private void sessionfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionfeeActionPerformed

    private void salaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryMouseClicked

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //dashboard
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void CategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryMouseClicked

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void CategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CategoryKeyPressed
     
    }//GEN-LAST:event_CategoryKeyPressed

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
            salaryDD.setVisible(false);
            ProfileDD.setVisible(false);
            
            ddOpen = false;
        }
            
    }//GEN-LAST:event_iconBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        penhover.setVisible(true);
        sessionfee.setEditable(false);
        salary.setEditable(false);
        Category.setEditable(true);
        description.setEditable(true);
        
        nextBtn.setVisible(true);
        jPanel1.setVisible(false);
        Saved.setVisible(false);
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void healthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthBtnActionPerformed
        new TrainerHealthDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_healthBtnActionPerformed

    private void OtherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherBtnActionPerformed
        new TrainerOtherDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OtherBtnActionPerformed

    private void bankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankBtnActionPerformed
        new TrainerBankDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bankBtnActionPerformed

    private void logbookBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbookBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(true);
            logoutDD.setVisible(false);
            salaryDD.setVisible(false);
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
        if (ddOpen) {
            new TrainerLogBookGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_logbookBtnActionPerformed

    private void profileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            salaryDD.setVisible(false);
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
        if (ddOpen) {
        new TrainerPersonalDetailsGUI().setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_profileBtnActionPerformed

    private void memberhoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseEntered
     
    }//GEN-LAST:event_memberhoverMouseEntered

    private void memberhoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseExited
     
    }//GEN-LAST:event_memberhoverMouseExited

    private void SalaryyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryyBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            salaryDD.setVisible(true);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_SalaryyBtnMouseEntered

    private void SalaryyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryyBtnMouseExited
        salaryDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_SalaryyBtnMouseExited

    private void SalaryyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryyBtnActionPerformed
        if (ddOpen) {
        new TrainerSalaryGUI().setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_SalaryyBtnActionPerformed

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(true);
            salaryDD.setVisible(false);
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

    private void personalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalBtnActionPerformed
        new TrainerPersonalDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_personalBtnActionPerformed

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        new TrainerClassesGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_classBtnActionPerformed

    private void MemberBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberBtnMouseEntered
        memberhover.setVisible(true);
    }//GEN-LAST:event_MemberBtnMouseEntered

    private void MemberBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberBtnMouseExited
        memberhover.setVisible(false);
    }//GEN-LAST:event_MemberBtnMouseExited

    private void MemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBtnActionPerformed
        new TrainerMemberDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MemberBtnActionPerformed

    private void teamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseEntered
        teamHover.setVisible(true);
    }//GEN-LAST:event_teamBtnMouseEntered

    private void teamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseExited
        teamHover.setVisible(false);
    }//GEN-LAST:event_teamBtnMouseExited

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        new TrainerteamDetailsGUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(TrainerOtherDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerOtherDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerOtherDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerOtherDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TrainerOtherDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Category;
    private javax.swing.JLabel LogDD;
    private javax.swing.JButton MemberBtn;
    private javax.swing.JButton OtherBtn;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JButton SalaryyBtn;
    private javax.swing.JLabel Saved;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JLabel background;
    private javax.swing.JButton bankBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    public javax.swing.JTextArea description;
    private javax.swing.JLabel dropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fillAll;
    private javax.swing.JLabel gender;
    private javax.swing.JButton healthBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JLabel memberhover;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel penhover;
    private javax.swing.JButton personalBtn;
    private javax.swing.JButton profileBtn;
    public javax.swing.JTextField salary;
    private javax.swing.JLabel salaryDD;
    public javax.swing.JTextField sessionfee;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
