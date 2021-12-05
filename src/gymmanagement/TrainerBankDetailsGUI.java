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
public class TrainerBankDetailsGUI extends javax.swing.JFrame {

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

    public TrainerBankDetailsGUI() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);
        memberhover.setVisible(false);
        iconHover.setVisible(false);

        added.setVisible(false);
        def.setVisible(false);
        delete.setVisible(false);
        selectError.setVisible(false);

        dropdown.setVisible(false);
        LogDD.setVisible(false);
        logoutDD.setVisible(false);
        salaryDD.setVisible(false);
        ProfileDD.setVisible(false);

        bankTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        bankTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        bankTable.getColumnModel().getColumn(2).setPreferredWidth(100);

        setValues();
        updateTable();

    }

    void updateTable() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql = "SELECT `Name`, `IBAN`, `DefaultAcc` FROM `trainerbank` "
                    + "WHERE TrainerID = '" + LoginGUI.trainerid + "';";
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) bankTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("IBAN"));
                    v2.add(rs.getString("Name"));

                    if (rs.getInt("DefaultAcc") == 1) {
                        v2.add("Default");
                    } else {
                        v2.add("");
                    }
                }

                dft.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setValues() {
       
        id.setText("Trainer ID: " + LoginGUI.trainerid);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectError = new javax.swing.JLabel();
        xHover = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        salaryDD = new javax.swing.JLabel();
        logoutDD = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        buttons = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        def = new javax.swing.JLabel();
        added = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bankTable = new javax.swing.JTable();
        iconHover = new javax.swing.JLabel();
        memberhover = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        healthBtn = new javax.swing.JButton();
        OtherBtn = new javax.swing.JButton();
        bankBtn = new javax.swing.JButton();
        personalBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        defBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        logbookBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        MemberBtn = new javax.swing.JButton();
        SalaryyBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        selectError.setForeground(new java.awt.Color(204, 0, 0));
        selectError.setText("Please select a row");
        getContentPane().add(selectError);
        selectError.setBounds(280, 169, 180, 20);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

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

        buttons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttons.setForeground(new java.awt.Color(56, 85, 98));
        buttons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/bank buttons.PNG"))); // NOI18N
        getContentPane().add(buttons);
        buttons.setBounds(295, 420, 422, 40);

        delete.setForeground(new java.awt.Color(204, 0, 0));
        delete.setText("Default card cannot be deleted");
        getContentPane().add(delete);
        delete.setBounds(575, 460, 180, 20);

        def.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        def.setForeground(new java.awt.Color(56, 85, 98));
        def.setText("Set as Default!");
        getContentPane().add(def);
        def.setBounds(462, 460, 110, 20);

        added.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        added.setForeground(new java.awt.Color(56, 85, 98));
        added.setText("Added!");
        getContentPane().add(added);
        added.setBounds(340, 460, 60, 20);

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(56, 85, 98));
        id.setText("Trainer ID: ");
        getContentPane().add(id);
        id.setBounds(20, 120, 150, 30);

        header.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        header.setForeground(new java.awt.Color(56, 85, 98));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/trainer bank header.PNG"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(277, 174, 460, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane1.setOpaque(false);

        bankTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bankTable.setForeground(new java.awt.Color(56, 85, 98));
        bankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Account Number", "Account Name", ""
            }
        ));
        bankTable.setGridColor(new java.awt.Color(255, 255, 255));
        bankTable.setRequestFocusEnabled(false);
        bankTable.setRowHeight(20);
        bankTable.setSelectionBackground(new java.awt.Color(56, 85, 98));
        bankTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bankTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(bankTable);
        if (bankTable.getColumnModel().getColumnCount() > 0) {
            bankTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            bankTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            bankTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(282, 190, 452, 210);

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
        memberhover.setBounds(467, 16, 100, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(235, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(355, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(570, 16, 100, 60);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/trainer bank.PNG"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 770, 495);

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

        addBtn.setText("jButton1");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(300, 420, 130, 40);

        defBtn.setText("jButton2");
        defBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defBtnActionPerformed(evt);
            }
        });
        getContentPane().add(defBtn);
        defBtn.setBounds(440, 420, 130, 40);

        deleteBtn.setText("jButton3");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(590, 420, 120, 40);

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

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_xBtnActionPerformed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        xHover.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        xHover.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited


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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new TrainerAccountDetailsGUI().setVisible(true);
        delete.setVisible(false);
        def.setVisible(false);
        selectError.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed

    private void defBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defBtnActionPerformed

        delete.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) bankTable.getModel();
        int selectedIndex = bankTable.getSelectedRow();

        if (selectedIndex == -1) {
            selectError.setVisible(true);
        }

        else {
            selectError.setVisible(false);
            CardNum = model.getValueAt(selectedIndex, 0).toString();

            // remove old default 
            try {
                conn = DriverManager.getConnection(url, user, password);
                myStmt = conn.createStatement();

                String sql = "Update `trainerbank` set DefaultAcc = '0' "
                        + "WHERE DefaultAcc = '" + 1 + "' and TrainerID = '" + LoginGUI.trainerid + "';";
                int rs = myStmt.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            // set new default
            Methods m = new Methods();
            m.updateBankT("DefaultAcc", "1", LoginGUI.trainerid, CardNum);

            updateTable();
            //Methods m = m.updateMember(url, url, url)

            added.setVisible(false);
            def.setVisible(true);
            delete.setVisible(false);
        }
    }//GEN-LAST:event_defBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        def.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) bankTable.getModel();
        int selectedIndex = bankTable.getSelectedRow();

        if (selectedIndex == -1) {
            selectError.setVisible(true);
        }
        
        else {
            selectError.setVisible(false);
            CardNum = model.getValueAt(selectedIndex, 0).toString();
            Def = model.getValueAt(selectedIndex, 2).toString();

            delete.setVisible(false);

            if (Def.equals("")) {
                new DeletePopupTrainer().setVisible(true);
            } else {
                delete.setVisible(true);
            }

            updateTable();
        }


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void bankTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bankTableKeyPressed

    }//GEN-LAST:event_bankTableKeyPressed

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
        if(ddOpen) {
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
        if(ddOpen) {
            new TrainerPersonalDetailsGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_profileBtnActionPerformed

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

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked

    }//GEN-LAST:event_aboutBtnMouseClicked

    private void aboutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseEntered
        aboutHover.setVisible(true);
    }//GEN-LAST:event_aboutBtnMouseEntered

    private void aboutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseExited
        aboutHover.setVisible(false);
    }//GEN-LAST:event_aboutBtnMouseExited

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new AboutUsTrainerGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutBtnActionPerformed

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

    private void memberhoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseEntered
        memberhover.setVisible(true);
    }//GEN-LAST:event_memberhoverMouseEntered

    private void memberhoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberhoverMouseExited
        memberhover.setVisible(false);
    }//GEN-LAST:event_memberhoverMouseExited

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
        if(ddOpen) {
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
            java.util.logging.Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerBankDetailsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerBankDetailsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogDD;
    private javax.swing.JButton MemberBtn;
    private javax.swing.JButton OtherBtn;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JButton SalaryyBtn;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel added;
    private javax.swing.JLabel background;
    private javax.swing.JButton bankBtn;
    public static javax.swing.JTable bankTable;
    private javax.swing.JLabel buttons;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JLabel def;
    private javax.swing.JButton defBtn;
    public static javax.swing.JLabel delete;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel dropdown;
    private javax.swing.JLabel header;
    private javax.swing.JButton healthBtn;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JLabel memberhover;
    private javax.swing.JButton personalBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel salaryDD;
    public static javax.swing.JLabel selectError;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
