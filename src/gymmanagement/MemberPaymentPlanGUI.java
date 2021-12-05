package gymmanagement;

import gymmanagement.HomePageGUI.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class MemberPaymentPlanGUI extends javax.swing.JFrame {

    boolean change = false;
    boolean ddOpen = false;
    boolean editable = false;
    String newPlan = "";
    String oldPlan = "";

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public MemberPaymentPlanGUI() {
        initComponents();

        kuchKharab.setVisible(false);
        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);
        iconHover.setVisible(false);

        Saved.setVisible(false);
        dropdown.setVisible(false);
        LogDD.setVisible(false);
        logoutDD.setVisible(false);
        phistoryDD.setVisible(false);
        ProfileDD.setVisible(false);

        nextBtn.setVisible(false);
        done.setVisible(false);

        setValues();

    }

    void setValues() {
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT `PlanID` FROM `member` "
                    + "where `MemberID` = '" + LoginGUI.memberid + "';";

            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next()) {

                id.setText("Member ID: " + LoginGUI.memberid);
                oldPlan = rs.getString("PlanID");

            }

            if (oldPlan.equals("1")) {
                monthHover.setVisible(true);
                annHover.setVisible(false);
                biannHover.setVisible(false);
            } else if (oldPlan.equals("2")) {
                monthHover.setVisible(false);
                annHover.setVisible(true);
                biannHover.setVisible(false);
            } else if (oldPlan.equals("3")) {
                monthHover.setVisible(false);
                annHover.setVisible(false);
                biannHover.setVisible(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MemberPaymentPlanGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutDD = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        phistoryDD = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        annHover = new javax.swing.JLabel();
        monthHover = new javax.swing.JLabel();
        biannHover = new javax.swing.JLabel();
        done = new javax.swing.JLabel();
        Saved = new javax.swing.JLabel();
        iconHover = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        kuchKharab = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        healthBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        bankBtn = new javax.swing.JButton();
        personalBtn = new javax.swing.JButton();
        monthlyBtn = new javax.swing.JButton();
        biannualBtn = new javax.swing.JButton();
        annualBtn = new javax.swing.JButton();
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

        logoutDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown logout hover.PNG"))); // NOI18N
        getContentPane().add(logoutDD);
        logoutDD.setBounds(540, 50, 200, 180);

        dropdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown.PNG"))); // NOI18N
        getContentPane().add(dropdown);
        dropdown.setBounds(540, 50, 200, 180);

        phistoryDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown payment hover.PNG"))); // NOI18N
        getContentPane().add(phistoryDD);
        phistoryDD.setBounds(540, 50, 200, 180);

        LogDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown logbook hover.PNG"))); // NOI18N
        getContentPane().add(LogDD);
        LogDD.setBounds(540, 50, 200, 180);

        ProfileDD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/dropdown profile hover.PNG"))); // NOI18N
        getContentPane().add(ProfileDD);
        ProfileDD.setBounds(540, 50, 200, 180);

        annHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pp annual hover.PNG"))); // NOI18N
        getContentPane().add(annHover);
        annHover.setBounds(573, 199, 190, 220);

        monthHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pp monthly hover.PNG"))); // NOI18N
        getContentPane().add(monthHover);
        monthHover.setBounds(199, 199, 190, 220);

        biannHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/pp bianual hover.PNG"))); // NOI18N
        getContentPane().add(biannHover);
        biannHover.setBounds(387, 198, 190, 220);

        done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/paybtn.png"))); // NOI18N
        getContentPane().add(done);
        done.setBounds(380, 430, 204, 60);

        Saved.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Saved.setForeground(new java.awt.Color(56, 85, 98));
        Saved.setText("Paid!");
        getContentPane().add(Saved);
        Saved.setBounds(600, 450, 300, 14);

        iconHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/icon hover.PNG"))); // NOI18N
        getContentPane().add(iconHover);
        iconHover.setBounds(676, 8, 50, 40);

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(56, 85, 98));
        id.setText("Member ID: ");
        getContentPane().add(id);
        id.setBounds(20, 120, 150, 30);

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

        kuchKharab.setForeground(new java.awt.Color(192, 0, 0));
        kuchKharab.setText("* Please wait for your current plan to expire *");
        getContentPane().add(kuchKharab);
        kuchKharab.setBounds(375, 415, 300, 14);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(472, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/payment plan member.PNG"))); // NOI18N
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
        editBtn.setBounds(380, 438, 200, 40);

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
        nextBtn.setBounds(380, 438, 200, 40);

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
        personalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(personalBtn);
        personalBtn.setBounds(10, 190, 180, 60);

        monthlyBtn.setText("jButton1");
        monthlyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(monthlyBtn);
        monthlyBtn.setBounds(200, 200, 180, 210);

        biannualBtn.setText("jButton1");
        biannualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biannualBtnActionPerformed(evt);
            }
        });
        getContentPane().add(biannualBtn);
        biannualBtn.setBounds(390, 200, 180, 210);

        annualBtn.setText("jButton1");
        annualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualBtnActionPerformed(evt);
            }
        });
        getContentPane().add(annualBtn);
        annualBtn.setBounds(580, 210, 170, 200);

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
        new AboutUsMemberGUI().setVisible(true);
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

        //save into database
        Methods m = new Methods();
        String mid = LoginGUI.memberid;

        m.updateMember("PlanID", newPlan, mid);
        addTransaction();

        Saved.setVisible(true);
        nextBtn.setVisible(false);
        done.setVisible(false);
        editBtn.setVisible(true);
        editable = false;

    }//GEN-LAST:event_nextBtnActionPerformed


    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void iconBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBtnMouseEntered
        // iconHover.setVisible(true);
    }//GEN-LAST:event_iconBtnMouseEntered

    private void iconBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBtnMouseExited
        //iconHover.setVisible(false);
    }//GEN-LAST:event_iconBtnMouseExited

    private void iconBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconBtnActionPerformed
        if (!ddOpen) {
            iconHover.setVisible(true);
            dropdown.setVisible(true);
            ddOpen = true;
        } else {
            iconHover.setVisible(false);
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(false);
            phistoryDD.setVisible(false);
            ProfileDD.setVisible(false);

            ddOpen = false;
        }

    }//GEN-LAST:event_iconBtnActionPerformed

    private void healthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthBtnActionPerformed
        new MemberHealthDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_healthBtnActionPerformed

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnMouseExited

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        kuchKharab.setVisible(false);
        //classes will be paid for + added as soon as they are bought
        //pay for new plan  
        try {

            String date = "";
            String m = "";
            String y = "";

            //find out last month salary paid
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT max(Date) as maxdate, `Type` "
                    + "FROM `transactions`"
                    + "WHERE PersonID = '" + LoginGUI.memberid + "' "
                    + "and type in('Monthly Plan','Annual Plan','Bi-annual Plan');";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next()) {
                date = rs.getString("maxdate");
            }

            Methods meth = new Methods();

            String newdate = meth.paymentdatecheck(date, Integer.parseInt(oldPlan));

            int ncurrentMonth = Integer.parseInt(newdate.substring(5, 7));
            int ncurrentYear = Integer.parseInt(newdate.substring(0, 4));
            int ncurrentDate = Integer.parseInt(newdate.substring(8));
            LocalDate currentdate = LocalDate.now();
            int currentMonth = currentdate.getMonthValue();
            int currentYear = currentdate.getYear();
            int currentDate = currentdate.getDayOfMonth();

            if (currentYear > ncurrentYear) {
                change = true;
            } else if (currentYear == ncurrentYear && currentMonth > ncurrentMonth) {
                change = true;
            } else if (currentYear == ncurrentYear && currentMonth == ncurrentMonth && currentDate > ncurrentDate) {
                change = true;
            } else {
                change = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(TrainerSalaryGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (!change) {
            kuchKharab.setVisible(true);
        } else {
            kuchKharab.setVisible(false);
            nextBtn.setVisible(true);
            done.setVisible(true);

            editBtn.setVisible(false);
            editable = true;
            Saved.setVisible(false);
        }
    }//GEN-LAST:event_editBtnActionPerformed
    void addTransaction() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();
            int amountt = 0;
            String type = "";
            String plan = newPlan;
            
            if (plan.equals("1")) {
                amountt = 3000;
                type = "Monthly Plan";
            } 
            else if (plan.equals("2")) {
                amountt = 30000;
                type = "Annual Plan";
            }
            else if (plan.equals("3")) {
                amountt = 16000;
                type = "Bi-annual Plan";
            }
            
            String sql = "INSERT INTO `transactions`(`TransID`, `PersonID`, "
                    + "`Amount`, `Date`, `type`) "
                    + "VALUES ('" + transID() + "','" + LoginGUI.memberid + "','" + amountt
                    + "', curdate(), '" + type + "');";
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

    private void monthlyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyBtnActionPerformed
        if (editable) {
            newPlan = "1";
            monthHover.setVisible(true);
            biannHover.setVisible(false);
            annHover.setVisible(false);
        }
    }//GEN-LAST:event_monthlyBtnActionPerformed

    private void biannualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biannualBtnActionPerformed
        if (editable) {
            newPlan = "3";
            monthHover.setVisible(false);
            biannHover.setVisible(true);
            annHover.setVisible(false);
        }
    }//GEN-LAST:event_biannualBtnActionPerformed

    private void annualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualBtnActionPerformed
        if (editable) {
            newPlan = "2";
            monthHover.setVisible(false);
            biannHover.setVisible(false);
            annHover.setVisible(true);
        }
    }//GEN-LAST:event_annualBtnActionPerformed

    private void personalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalBtnActionPerformed
        new MemberPersonalDetailsGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_personalBtnActionPerformed

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
        if (ddOpen) {
            new MemberpayhistoryGUI().setVisible(true);
            this.setVisible(false);
        }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogDD;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JLabel Saved;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JLabel annHover;
    private javax.swing.JButton annualBtn;
    private javax.swing.JLabel background;
    private javax.swing.JButton bankBtn;
    private javax.swing.JLabel biannHover;
    private javax.swing.JButton biannualBtn;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JLabel done;
    private javax.swing.JLabel dropdown;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton healthBtn;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id;
    private javax.swing.JLabel kuchKharab;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JLabel monthHover;
    private javax.swing.JButton monthlyBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JButton personalBtn;
    private javax.swing.JButton phistoryBtn;
    private javax.swing.JLabel phistoryDD;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
