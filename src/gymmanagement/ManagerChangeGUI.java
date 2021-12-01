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
public class ManagerChangeGUI extends javax.swing.JFrame {
    
    public static String id;
    public static String fname;
    public static String lname;
    public static String e;
    public static String pass;
    
    public static String CNIC;
    public static String phoneNum;
    
    public static String gen;
    public static String dob;

    boolean done = false;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public ManagerChangeGUI() {
        initComponents();

        x.setVisible(false);
        fillError.setVisible(false);
        emailError.setVisible(false);
        phoneError.setVisible(false);
        cnicError.setVisible(false);
        added.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        added = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        cnicError = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        fillError = new javax.swing.JLabel();
        other = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        male = new javax.swing.JCheckBox();
        cnic = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        namee1 = new javax.swing.JTextField();
        namee = new javax.swing.JTextField();
        height3 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        bmi = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        phone1 = new javax.swing.JTextField();
        cnic1 = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 491, 780, 2);

        jPanel4.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 762, 2);

        jPanel2.setBackground(new java.awt.Color(56, 85, 98));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(761, 0, 2, 800);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/done btnn.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(327, 408, 150, 50);

        added.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        added.setForeground(new java.awt.Color(56, 85, 98));
        added.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        added.setText("Manager changed! Password is");
        getContentPane().add(added);
        added.setBounds(230, 455, 350, 30);

        day.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        day.setForeground(new java.awt.Color(56, 85, 98));
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setBorder(null);
        day.setLightWeightPopupEnabled(false);
        day.setMinimumSize(new java.awt.Dimension(150, 35));
        day.setName("Gender"); // NOI18N
        day.setPreferredSize(new java.awt.Dimension(150, 35));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day);
        day.setBounds(340, 360, 60, 30);

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
        month.setBounds(425, 360, 60, 30);

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 85, 98));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932" }));
        year.setBorder(null);
        year.setLightWeightPopupEnabled(false);
        year.setMinimumSize(new java.awt.Dimension(150, 35));
        year.setName("Gender"); // NOI18N
        year.setPreferredSize(new java.awt.Dimension(150, 35));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(510, 360, 70, 30);

        cnicError.setForeground(new java.awt.Color(204, 0, 0));
        cnicError.setText("* Please enter a valid cnic *");
        getContentPane().add(cnicError);
        cnicError.setBounds(330, 100, 250, 20);

        gender1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender1.setForeground(new java.awt.Color(56, 85, 98));
        gender1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender1.setText("Date of Birth:");
        getContentPane().add(gender1);
        gender1.setBounds(220, 360, 170, 30);

        phoneError.setForeground(new java.awt.Color(204, 0, 0));
        phoneError.setText("* Please enter a valid phone number*");
        getContentPane().add(phoneError);
        phoneError.setBounds(310, 100, 270, 20);

        emailError.setForeground(new java.awt.Color(204, 0, 0));
        emailError.setText("* Please enter a valid email *");
        getContentPane().add(emailError);
        emailError.setBounds(330, 100, 140, 20);

        fillError.setForeground(new java.awt.Color(204, 0, 0));
        fillError.setText("* Please fill all fields *");
        getContentPane().add(fillError);
        fillError.setBounds(350, 100, 250, 20);

        other.setBackground(new java.awt.Color(255, 255, 255));
        other.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        other.setForeground(new java.awt.Color(56, 85, 98));
        other.setText("Other");
        other.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                otherStateChanged(evt);
            }
        });
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        getContentPane().add(other);
        other.setBounds(520, 325, 70, 20);

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(56, 85, 98));
        female.setText("Female");
        female.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                femaleStateChanged(evt);
            }
        });
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(424, 325, 70, 20);

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(56, 85, 98));
        male.setText("Male");
        male.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maleStateChanged(evt);
            }
        });
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(337, 325, 70, 20);

        cnic.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cnic.setForeground(new java.awt.Color(56, 85, 98));
        cnic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        cnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnicKeyPressed(evt);
            }
        });
        getContentPane().add(cnic);
        cnic.setBounds(340, 285, 240, 25);

        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        phone.setForeground(new java.awt.Color(56, 85, 98));
        phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(340, 245, 240, 25);

        mail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        mail.setForeground(new java.awt.Color(56, 85, 98));
        mail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(mail);
        mail.setBounds(340, 205, 240, 25);

        namee1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        namee1.setForeground(new java.awt.Color(56, 85, 98));
        namee1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(namee1);
        namee1.setBounds(463, 165, 115, 25);

        namee.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        namee.setForeground(new java.awt.Color(56, 85, 98));
        namee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(namee);
        namee.setBounds(340, 165, 115, 25);

        height3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height3.setForeground(new java.awt.Color(56, 85, 98));
        height3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height3.setText("Name:");
        getContentPane().add(height3);
        height3.setBounds(220, 160, 170, 30);

        gender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(56, 85, 98));
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Gender:");
        getContentPane().add(gender);
        gender.setBounds(220, 320, 170, 30);

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(56, 85, 98));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Change Manager");
        getContentPane().add(name);
        name.setBounds(190, 40, 410, 60);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/xwhite.PNG"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(712, 0, 60, 40);

        bmi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bmi.setForeground(new java.awt.Color(56, 85, 98));
        bmi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bmi.setText("Phone no.:");
        getContentPane().add(bmi);
        bmi.setBounds(220, 240, 170, 30);

        weight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        weight.setForeground(new java.awt.Color(56, 85, 98));
        weight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        weight.setText("CNIC:");
        weight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                weightFocusGained(evt);
            }
        });
        getContentPane().add(weight);
        weight.setBounds(220, 280, 170, 30);

        height.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height.setForeground(new java.awt.Color(56, 85, 98));
        height.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height.setText("Email:");
        getContentPane().add(height);
        height.setBounds(220, 200, 170, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/empty.PNG"))); // NOI18N
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

        phone1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        phone1.setForeground(new java.awt.Color(56, 85, 98));
        phone1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        phone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phone1KeyPressed(evt);
            }
        });
        getContentPane().add(phone1);
        phone1.setBounds(340, 225, 240, 25);

        cnic1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cnic1.setForeground(new java.awt.Color(56, 85, 98));
        cnic1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        cnic1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnic1KeyPressed(evt);
            }
        });
        getContentPane().add(cnic1);
        cnic1.setBounds(340, 255, 240, 25);

        addBtn.setText("jButton1");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(330, 410, 140, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtnActionPerformed
        if(done)
            new HomePageGUI().setVisible(true);
        else
            this.setVisible(false);
    }//GEN-LAST:event_xBtnActionPerformed

    private void xBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtnMouseEntered

    private void xBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtnMouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtnMouseExited
   

    private void maleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maleStateChanged

    }//GEN-LAST:event_maleStateChanged

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        other.setSelected(false);
        
    }//GEN-LAST:event_maleActionPerformed

    private void femaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_femaleStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleStateChanged

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        other.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void otherStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_otherStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_otherStateChanged

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        male.setSelected(false);
        female.setSelected(false);
    }//GEN-LAST:event_otherActionPerformed

    private void cnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            cnic.setEditable(true);
        }
        else
            cnic.setEditable(false);
    }//GEN-LAST:event_cnicKeyPressed

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            phone.setEditable(true);
        }
        else
            phone.setEditable(false);
    }//GEN-LAST:event_phoneKeyPressed

    private void phone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1KeyPressed

    private void cnic1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnic1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnic1KeyPressed

    private void weightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFocusGained

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        fillError.setVisible(false);
        
        id = "1";
        fname = namee.getText();
        lname = namee1.getText();
        e = mail.getText();
        pass = fname + lname.charAt(0);
    
        CNIC = cnic.getText();
        phoneNum = phone.getText();
        
        if(male.isSelected())
            gen = "M";
        else if (female.isSelected())
            gen = "F";
        else if (other.isSelected())
            gen = "O";
        
        String d = day.getItemAt(day.getSelectedIndex());
        String m = month.getItemAt(month.getSelectedIndex());
        String y = year.getItemAt(year.getSelectedIndex());
        dob = y + "-" + m + "-" + d;
        
        boolean isEmpty =id.equals("") || fname.equals("") || lname.equals("") 
                        || e.equals("") || CNIC.equals("") || phoneNum.equals("")
                        || (!male.isSelected() && !female.isSelected() && !other.isSelected());
        
        if(isEmpty) {
            fillError.setVisible(true);
        }
        else if (!e.contains("@")) {
            emailError.setVisible(true);
        }
        else if (phoneNum.length() != 11) {
            phoneError.setVisible(true);
        }
        else if (CNIC.length() != 13) {
            cnicError.setVisible(true);
        } 
        else {
            fillError.setVisible(false);
            
            Methods meth = new Methods();
            
            meth.updateManager("Firstname", fname, id);
            meth.updateManager("Lastname", lname, id);
            meth.updateManager("Firstname", fname, id);
            meth.updateManager("email", e, id);
            meth.updateManager("cnic", CNIC, id);
            
            meth.updateManager("password", pass, id);
            meth.updateManager("gender", gen, id);
            meth.updateManager("DateOfBirth", dob, id);
            
            done = true;
            added.setVisible(true);
            added.setText(added.getText() + " " + pass);
            
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel added;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bmi;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField cnic1;
    public static javax.swing.JLabel cnicError;
    public javax.swing.JComboBox<String> day;
    public static javax.swing.JLabel emailError;
    public static javax.swing.JCheckBox female;
    public static javax.swing.JLabel fillError;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel height;
    private javax.swing.JLabel height3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField mail;
    public static javax.swing.JCheckBox male;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namee;
    private javax.swing.JTextField namee1;
    public static javax.swing.JCheckBox other;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    public static javax.swing.JLabel phoneError;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
