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
public class ManagerClassesGUI extends javax.swing.JFrame {

    boolean ddOpen = false;
    boolean editable = false;


    public static String CardNum;
    public static String Def;
    
    public static String mid;
    public static String trid;
    public static String Fee;

    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public ManagerClassesGUI() {
        initComponents();

        x.setVisible(false);
        updateTable();

    }

    void updateTable() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();

            String sql=null;
            String sid = ManagerMemberDetailsGUI.Sid;
            
            
            if(sid.charAt(0)=='M'){
                
                sql = "SELECT  s.Date, s.StartTime, "
                        + "m.Firstname, m.Lastname,t.Firstname, t.Lastname, t.Category, t.SessionFee "
                        + "FROM session s "
                        + " JOIN member m on m.MemberID = s.MemberID "
                        + "JOIN trainer t on t.TrainerID = s.TrainerID"
                        + " where s.MemberID = '"+ sid+"' ;";
            }
            
            else if(sid.charAt(0)=='T'){
                
                sql = "SELECT  s.Date, s.StartTime, "
                        + "m.Firstname  , m.Lastname ,t.Firstname, t.Lastname, t.Category, t.SessionFee "
                        + "FROM session s "
                        + " JOIN member m on m.MemberID = s.MemberID "
                        + "JOIN trainer t on t.TrainerID = s.TrainerID"
                        + " where t.trainerID = '"+ sid+"' ;";
            }
    
            
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) classTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
             
                    v2.add(rs.getString("Date"));
                    v2.add(rs.getString("Starttime"));
                    v2.add(rs.getString("m.Firstname")+" "+rs.getString("m.Lastname"));
                    v2.add(rs.getString("t.Firstname")+" "+rs.getString("t.Lastname"));
                    v2.add(rs.getString("Category"));
                    v2.add(rs.getString("SessionFee"));
                }

                dft.addRow(v2);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ManagerClassesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        header.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        header.setForeground(new java.awt.Color(56, 85, 98));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/ch.PNG"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(70, 130, 640, 30);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 767, 2);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 769, 2);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(765, 0, 2, 490);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

        jPanel1.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2, 500);

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
                "Date", "Time", "Member", "Trainer", "Category", "Fee"
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
        jScrollPane2.setBounds(70, 130, 640, 310);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes popup.PNG"))); // NOI18N
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

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 560, 380);

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


    private void classTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_classTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_classTableKeyPressed

    private void xBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtn1MouseEntered

    private void xBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtn1MouseExited

    private void xBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtn1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public static javax.swing.JTable classTable;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    private javax.swing.JButton xBtn1;
    // End of variables declaration//GEN-END:variables
}
