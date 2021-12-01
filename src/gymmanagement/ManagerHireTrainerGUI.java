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
public class ManagerHireTrainerGUI extends javax.swing.JFrame {
    
    public static String id;
    public static String fname;
    public static String lname;
    public static String e;
    public static String pass;
    
    public static String CNIC;
    public static String phoneNum;
    public static String pid;
    
    public static String gen;
    public static String sal;
    public static String bio;
    public static String sfee;
    
    public static String category;
    public static String addr;

    boolean ddOpen = false;
    
    String url = "jdbc:mysql://localhost:3306/gym_db";

    String user = "root";
    String password = "";

    Connection conn;
    Statement myStmt;

    public ManagerHireTrainerGUI() {
        initComponents();

        x.setVisible(false);
        fillError.setVisible(false);
        emailError.setVisible(false);
        phoneError.setVisible(false);
        cnicError.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salary = new javax.swing.JTextField();
        cnicError = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        gender2 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        fillError = new javax.swing.JLabel();
        other = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        male = new javax.swing.JCheckBox();
        address = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        descrip = new javax.swing.JTextField();
        categ = new javax.swing.JTextField();
        namee1 = new javax.swing.JTextField();
        namee = new javax.swing.JTextField();
        height3 = new javax.swing.JLabel();
        height2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        height1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        bmi = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        xBtn = new javax.swing.JButton();
        xBtn1 = new javax.swing.JButton();
        arrowBtn = new javax.swing.JButton();
        phone1 = new javax.swing.JTextField();
        cnic1 = new javax.swing.JTextField();

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

        salary.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        salary.setForeground(new java.awt.Color(56, 85, 98));
        salary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salaryKeyPressed(evt);
            }
        });
        getContentPane().add(salary);
        salary.setBounds(340, 360, 100, 25);

        cnicError.setForeground(new java.awt.Color(204, 0, 0));
        cnicError.setText("* Please enter a valid cnic *");
        getContentPane().add(cnicError);
        cnicError.setBounds(330, 70, 250, 20);

        phoneError.setForeground(new java.awt.Color(204, 0, 0));
        phoneError.setText("* Please enter a valid phone number*");
        getContentPane().add(phoneError);
        phoneError.setBounds(310, 70, 270, 20);

        fee.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        fee.setForeground(new java.awt.Color(56, 85, 98));
        fee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                feeKeyPressed(evt);
            }
        });
        getContentPane().add(fee);
        fee.setBounds(340, 390, 100, 25);

        gender2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender2.setForeground(new java.awt.Color(56, 85, 98));
        gender2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender2.setText("Session Fee:");
        getContentPane().add(gender2);
        gender2.setBounds(220, 390, 170, 30);

        gender1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender1.setForeground(new java.awt.Color(56, 85, 98));
        gender1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender1.setText("Salary:");
        getContentPane().add(gender1);
        gender1.setBounds(220, 360, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/arrow-30-24.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(710, 250, 34, 40);

        emailError.setForeground(new java.awt.Color(204, 0, 0));
        emailError.setText("* Please enter a valid email *");
        getContentPane().add(emailError);
        emailError.setBounds(330, 70, 140, 20);

        fillError.setForeground(new java.awt.Color(204, 0, 0));
        fillError.setText("* Please fill all fields *");
        getContentPane().add(fillError);
        fillError.setBounds(350, 70, 250, 20);

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

        address.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        address.setForeground(new java.awt.Color(56, 85, 98));
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(address);
        address.setBounds(340, 285, 240, 25);

        cnic.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cnic.setForeground(new java.awt.Color(56, 85, 98));
        cnic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        cnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnicKeyPressed(evt);
            }
        });
        getContentPane().add(cnic);
        cnic.setBounds(340, 255, 240, 25);

        phone.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        phone.setForeground(new java.awt.Color(56, 85, 98));
        phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(340, 225, 240, 25);

        mail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        mail.setForeground(new java.awt.Color(56, 85, 98));
        mail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(mail);
        mail.setBounds(340, 195, 240, 25);

        descrip.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        descrip.setForeground(new java.awt.Color(56, 85, 98));
        descrip.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(descrip);
        descrip.setBounds(340, 165, 240, 25);

        categ.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        categ.setForeground(new java.awt.Color(56, 85, 98));
        categ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(categ);
        categ.setBounds(340, 135, 240, 25);

        namee1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        namee1.setForeground(new java.awt.Color(56, 85, 98));
        namee1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(namee1);
        namee1.setBounds(465, 105, 115, 25);

        namee.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        namee.setForeground(new java.awt.Color(56, 85, 98));
        namee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 85, 98), 2, true));
        getContentPane().add(namee);
        namee.setBounds(340, 105, 115, 25);

        height3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height3.setForeground(new java.awt.Color(56, 85, 98));
        height3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height3.setText("Name:");
        getContentPane().add(height3);
        height3.setBounds(220, 100, 170, 30);

        height2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height2.setForeground(new java.awt.Color(56, 85, 98));
        height2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height2.setText("Category:");
        getContentPane().add(height2);
        height2.setBounds(220, 130, 170, 30);

        id2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        id2.setForeground(new java.awt.Color(56, 85, 98));
        id2.setText("next");
        getContentPane().add(id2);
        id2.setBounds(710, 280, 30, 30);

        gender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(56, 85, 98));
        gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gender.setText("Gender:");
        getContentPane().add(gender);
        gender.setBounds(220, 320, 170, 30);

        height1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height1.setForeground(new java.awt.Color(56, 85, 98));
        height1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height1.setText("Description:");
        getContentPane().add(height1);
        height1.setBounds(220, 160, 170, 30);

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        name.setForeground(new java.awt.Color(56, 85, 98));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Add Trainer");
        getContentPane().add(name);
        name.setBounds(190, 20, 410, 60);

        add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(56, 85, 98));
        add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add.setText("Address:");
        getContentPane().add(add);
        add.setBounds(220, 280, 170, 30);

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
        bmi.setBounds(220, 220, 170, 30);

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
        weight.setBounds(220, 250, 170, 30);

        height.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        height.setForeground(new java.awt.Color(56, 85, 98));
        height.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        height.setText("Email:");
        getContentPane().add(height);
        height.setBounds(220, 190, 170, 30);

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

        arrowBtn.setText("jButton1");
        arrowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(arrowBtn);
        arrowBtn.setBounds(702, 238, 40, 80);

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
   

    private void xBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseEntered
        x.setVisible(true);
    }//GEN-LAST:event_xBtn1MouseEntered

    private void xBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xBtn1MouseExited
        x.setVisible(false);
    }//GEN-LAST:event_xBtn1MouseExited

    private void xBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xBtn1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_xBtn1ActionPerformed

    private void arrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowBtnActionPerformed
        fillError.setVisible(false);
        
        id = trainerID();;
        fname = namee.getText();
        lname = namee1.getText();
        e = mail.getText();;
        pass = fname + id;
    
        CNIC = cnic.getText();
        phoneNum = phone.getText();
        pid = physiqueID();
    
        if(male.isSelected())
            gen = "M";
        else if (female.isSelected())
            gen = "F";
        else if (other.isSelected())
            gen = "O";
        
        sal = salary.getText();
        bio = descrip.getText();
        sfee = fee.getText();
    
        category = categ.getText();
        addr = address.getText();
        
        boolean isEmpty =id.equals("") || fname.equals("") || lname.equals("") 
                        || e.equals("") || CNIC.equals("") || phoneNum.equals("")
                        || sal.equals("") || bio.equals("") || sfee.equals("") 
                        || category.equals("") || addr.equals("") || 
                        (!male.isSelected() && !female.isSelected() && !other.isSelected());
        
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
            new ManagerHireTrainerGUI2().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_arrowBtnActionPerformed

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

    private void salaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            salary.setEditable(true);
        }
        else
            salary.setEditable(false);
    }//GEN-LAST:event_salaryKeyPressed

    private void feeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feeKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            fee.setEditable(true);
        }
        else
            fee.setEditable(false);
    }//GEN-LAST:event_feeKeyPressed

    private void phone1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1KeyPressed

    private void cnic1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnic1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnic1KeyPressed

    private void weightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_weightFocusGained

    String trainerID() {

        int row_id = 0;

        try {
            conn = DriverManager.getConnection(url, user, password);
            myStmt = conn.createStatement();

            String sql2 = "select count(*) as row_id from Trainer";
            ResultSet rs2 = myStmt.executeQuery(sql2);

            while (rs2.next()) {
                row_id = rs2.getInt("row_id");
            }

            String mem_id = "T" + (row_id + 1);
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
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JTextField address;
    private javax.swing.JButton arrowBtn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bmi;
    private javax.swing.JTextField categ;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField cnic1;
    public static javax.swing.JLabel cnicError;
    private javax.swing.JTextField descrip;
    public static javax.swing.JLabel emailError;
    private javax.swing.JTextField fee;
    public static javax.swing.JCheckBox female;
    public static javax.swing.JLabel fillError;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel gender2;
    private javax.swing.JLabel height;
    private javax.swing.JLabel height1;
    private javax.swing.JLabel height2;
    private javax.swing.JLabel height3;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField mail;
    public static javax.swing.JCheckBox male;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namee;
    private javax.swing.JTextField namee1;
    public static javax.swing.JCheckBox other;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    public static javax.swing.JLabel phoneError;
    private javax.swing.JTextField salary;
    private javax.swing.JLabel weight;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    private javax.swing.JButton xBtn;
    private javax.swing.JButton xBtn1;
    // End of variables declaration//GEN-END:variables
}
