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
public class ManagerViewTranGUI extends javax.swing.JFrame {

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

    public ManagerViewTranGUI() {
        initComponents();

        
        
        updateTable();
    }

     void updateTable() {

        int c;

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
             
            String sid = ManagerMemberDetailsGUI.Sid;
            
            String sql = "SELECT `Date`, `Amount`, `Type`, PersonID "
                    + "FROM `transactions` where PersonID = '"+ sid +"';";
            
            ResultSet rs = myStmt.executeQuery(sql);

            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel) teamTable.getModel();
            dft.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("Date"));
                    
                    String a = rs.getString("Amount");
                    String id = rs.getString("PersonID");
                    
                    if(id.charAt(0) == 'M')
                        a = "+" + a;
                    else if(id.charAt(0) == 'T')
                        a = "-" + a;
                    
                    v2.add(a);
                    v2.add(rs.getString("Type"));
                }

                dft.addRow(v2);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(MembersTeamGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamTable = new javax.swing.JTable();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(765, 0, 2, 500);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 769, 2);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 767, 2);

        jPanel1.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/tr.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 430, 76);

        header.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        header.setForeground(new java.awt.Color(56, 85, 98));
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/log table header.PNG"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(170, 150, 460, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jScrollPane1.setOpaque(false);

        teamTable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        teamTable.setForeground(new java.awt.Color(56, 85, 98));
        teamTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Date", "Check-in", "Check-out"
            }
        ));
        teamTable.setGridColor(new java.awt.Color(255, 255, 255));
        teamTable.setRequestFocusEnabled(false);
        teamTable.setRowHeight(20);
        teamTable.setSelectionBackground(new java.awt.Color(56, 85, 98));
        teamTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teamTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(teamTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 150, 452, 250);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   

    private void teamTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teamTableKeyPressed

    }//GEN-LAST:event_teamTableKeyPressed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable teamTable;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    // End of variables declaration//GEN-END:variables
}
