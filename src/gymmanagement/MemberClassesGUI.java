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
public class MemberClassesGUI extends javax.swing.JFrame {

    boolean ddOpen = false;
    boolean editable = false;
    

    public static String Fee;
    public static String Sid;
    public static String trid;

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public MemberClassesGUI() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);
        iconHover.setVisible(false);
        
        bookedError.setVisible(false);
        selectError.setVisible(false);

        dropdown.setVisible(false);
        LogDD.setVisible(false);
        logoutDD.setVisible(false);
        phistoryDD.setVisible(false);
        ProfileDD.setVisible(false);

        setValues();
        updateTable();

    }

    void updateTable() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql;
            if(MyClasses.isSelected()) {
                sql = "SELECT `SessionID`, `Date`, `StartTime`, "
                        + "`Firstname`, `Lastname`, Category, SessionFee "
                        + "FROM `session` NATURAL JOIN trainer "
                        + "WHERE MemberID = '"+ LoginGUI.memberid +"' "
                        + "and TrainerID is not null;";
            }
            
            else if(Available.isSelected()) {
                sql = "SELECT `SessionID`, `Date`, `StartTime`, "
                        + "`Firstname`, `Lastname`, Category, SessionFee "
                        + "FROM `session` NATURAL JOIN trainer "
                        + "WHERE MemberID is null "
                        + "and TrainerID is not null;";
            }
            
            else {
                sql = "SELECT `SessionID`, `Date`, `StartTime`, "
                        + "`Firstname`, `Lastname`, Category, SessionFee "
                        + "FROM `session` NATURAL JOIN trainer "
                        + "WHERE TrainerID is not null;";
            }
            
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) classTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("SessionID"));
                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("Starttime"));
                    v2.add(rs.getString("Firstname") + " " + rs.getString("Lastname"));
                    v2.add(rs.getString("Category"));
                    v2.add(rs.getString("SessionFee"));
                }

                dft.addRow(v2);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(MemberClassesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setValues() {
        id.setText("Member ID: " + LoginGUI.memberid);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectError = new javax.swing.JLabel();
        Available = new javax.swing.JCheckBox();
        buttons = new javax.swing.JLabel();
        bookedError = new javax.swing.JLabel();
        logoutDD = new javax.swing.JLabel();
        phistoryDD = new javax.swing.JLabel();
        LogDD = new javax.swing.JLabel();
        ProfileDD = new javax.swing.JLabel();
        dropdown = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        iconHover = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        MyClasses = new javax.swing.JCheckBox();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();
        iconBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        phistoryBtn = new javax.swing.JButton();
        logbookBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        selectError.setForeground(new java.awt.Color(204, 0, 0));
        selectError.setText("Please select a row");
        getContentPane().add(selectError);
        selectError.setBounds(70, 400, 180, 20);

        Available.setBackground(new java.awt.Color(255, 255, 255));
        Available.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Available.setForeground(new java.awt.Color(56, 85, 98));
        Available.setText("Available Sessions");
        Available.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AvailableStateChanged(evt);
            }
        });
        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });
        getContentPane().add(Available);
        Available.setBounds(200, 175, 170, 20);

        buttons.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttons.setForeground(new java.awt.Color(56, 85, 98));
        buttons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/book.PNG"))); // NOI18N
        getContentPane().add(buttons);
        buttons.setBounds(320, 420, 160, 50);

        bookedError.setForeground(new java.awt.Color(204, 0, 0));
        bookedError.setText("Cannot book an already booked session");
        getContentPane().add(bookedError);
        bookedError.setBounds(510, 400, 250, 20);

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

        header.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        header.setForeground(new java.awt.Color(56, 85, 98));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/class header.PNG"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(70, 200, 640, 30);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane2.setOpaque(false);

        classTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        classTable.setForeground(new java.awt.Color(56, 85, 98));
        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Time", "Trainer", "Category", "Fee"
            }
        ));
        classTable.setGridColor(new java.awt.Color(255, 255, 255));
        classTable.setRequestFocusEnabled(false);
        classTable.setRowHeight(20);
        classTable.setSelectionBackground(new java.awt.Color(56, 85, 98));
        classTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                classTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(classTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 200, 640, 200);

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

        MyClasses.setBackground(new java.awt.Color(255, 255, 255));
        MyClasses.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        MyClasses.setForeground(new java.awt.Color(56, 85, 98));
        MyClasses.setText("My Classes");
        MyClasses.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MyClassesStateChanged(evt);
            }
        });
        MyClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyClassesActionPerformed(evt);
            }
        });
        getContentPane().add(MyClasses);
        MyClasses.setBounds(70, 175, 130, 20);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(581, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(472, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/member classes.PNG"))); // NOI18N
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

        bookBtn.setText("jButton2");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookBtn);
        bookBtn.setBounds(320, 420, 130, 50);

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

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed

        System.out.println("button works");
        
        bookedError.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) classTable.getModel();
        int selectedIndex = classTable.getSelectedRow();

        if (selectedIndex == -1) {
            selectError.setVisible(true);
        }

        else {
            
            selectError.setVisible(false);
            
            Sid = model.getValueAt(selectedIndex, 0).toString();
            String mid = null;
            
            //getting member id
            try {
                conn = DriverManager.getConnection(url, user, password);
                myStmt = conn.createStatement();

                String sql = "Select MemberID, TrainerID from session "
                        + "WHERE SessionID = '" + Sid + "';";
                ResultSet rs = myStmt.executeQuery(sql);
                
                while(rs.next()) {
                    mid = rs.getString("MemberID");
                    trid = rs.getString("TrainerID");
                    System.out.println(mid + " " + trid);
                }
                    

            } 
            catch (SQLException ex) {
                Logger.getLogger(MemberClassesGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            Fee = model.getValueAt(selectedIndex, 5).toString();            
            System.out.println(mid + " " + trid);
            if(mid != null) {
                bookedError.setVisible(true);
            }
            else {
                bookedError.setVisible(false);
                new BookPopup().setVisible(true);
                updateTable();
                
            }
        }
    }//GEN-LAST:event_bookBtnActionPerformed

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

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        if (ddOpen) {
            LoginGUI.type = "";
            this.setVisible(false);
            new HomePageGUI().setVisible(true);
        }

    }//GEN-LAST:event_logoutBtnActionPerformed

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutDD.setVisible(false);
        if (ddOpen) {
            dropdown.setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        if (ddOpen) {
            dropdown.setVisible(false);
            LogDD.setVisible(false);
            logoutDD.setVisible(true);
            phistoryDD.setVisible(false);
            ProfileDD.setVisible(false);
        }
    }//GEN-LAST:event_logoutBtnMouseEntered

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

    private void classTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_classTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTableKeyPressed

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        MyClasses.setSelected(false);
        updateTable();
    }//GEN-LAST:event_AvailableActionPerformed

    private void MyClassesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MyClassesStateChanged
        
    }//GEN-LAST:event_MyClassesStateChanged

    private void MyClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyClassesActionPerformed
        Available.setSelected(false);
        updateTable();
    }//GEN-LAST:event_MyClassesActionPerformed

    private void AvailableStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AvailableStateChanged
        
    }//GEN-LAST:event_AvailableStateChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox Available;
    private javax.swing.JLabel LogDD;
    public static javax.swing.JCheckBox MyClasses;
    private javax.swing.JLabel ProfileDD;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    private javax.swing.JLabel background;
    private javax.swing.JButton bookBtn;
    public static javax.swing.JLabel bookedError;
    private javax.swing.JLabel buttons;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    public static javax.swing.JTable classTable;
    private javax.swing.JLabel dropdown;
    private javax.swing.JLabel header;
    private javax.swing.JButton iconBtn;
    private javax.swing.JLabel iconHover;
    private javax.swing.JLabel id;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logbookBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutDD;
    private javax.swing.JButton phistoryBtn;
    private javax.swing.JLabel phistoryDD;
    private javax.swing.JButton profileBtn;
    public static javax.swing.JLabel selectError;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
