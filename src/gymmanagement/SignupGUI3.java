/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class SignupGUI3 extends javax.swing.JFrame {

    public static int agee;
    public static double w = 0;
    public static double h = 0;
    public static double BMI = 0;

    public SignupGUI3() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);
        bmiHover.setVisible(false);

//        age.setVisible(false);
        height.setVisible(false);
        weight.setVisible(false);
        fillAll.setVisible(false);
        
        Methods m = new Methods();
        agee = m.getAge(SignupGUI2.y, SignupGUI2.m);
        age.setText(agee + "");

        bmi.setText(BMI + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bmiHover = new javax.swing.JLabel();
        fillAll = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        height = new javax.swing.JTextField();
        bmi = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        ageBtn = new javax.swing.JButton();
        heightBtn = new javax.swing.JButton();
        weightBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        bmiHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/bmiHover.PNG"))); // NOI18N
        getContentPane().add(bmiHover);
        bmiHover.setBounds(412, 273, 110, 33);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(470, 480, 300, 14);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 430, 170, 50);

        height.setBackground(new java.awt.Color(56, 85, 98));
        height.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        height.setForeground(new java.awt.Color(255, 255, 255));
        height.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        height.setBorder(null);
        height.setCaretColor(new java.awt.Color(255, 255, 255));
        height.setSelectionColor(new java.awt.Color(255, 255, 255));
        height.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heightMouseClicked(evt);
            }
        });
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                heightKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heightKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightKeyTyped(evt);
            }
        });
        getContentPane().add(height);
        height.setBounds(266, 275, 50, 30);

        bmi.setBackground(new java.awt.Color(56, 85, 98));
        bmi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bmi.setForeground(new java.awt.Color(255, 255, 255));
        bmi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(bmi);
        bmi.setBounds(522, 280, 40, 20);

        weight.setBackground(new java.awt.Color(56, 85, 98));
        weight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weight.setForeground(new java.awt.Color(255, 255, 255));
        weight.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        weight.setBorder(null);
        weight.setCaretColor(new java.awt.Color(255, 255, 255));
        weight.setSelectionColor(new java.awt.Color(255, 255, 255));
        weight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightMouseClicked(evt);
            }
        });
        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weightKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightKeyTyped(evt);
            }
        });
        getContentPane().add(weight);
        weight.setBounds(477, 218, 50, 30);

        age.setEditable(false);
        age.setBackground(new java.awt.Color(56, 85, 98));
        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        age.setBorder(null);
        age.setCaretColor(new java.awt.Color(255, 255, 255));
        age.setSelectionColor(new java.awt.Color(255, 255, 255));
        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(250, 218, 50, 30);

        xHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x hover.PNG"))); // NOI18N
        getContentPane().add(xHover);
        xHover.setBounds(726, 0, 34, 40);

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/x.PNG"))); // NOI18N
        getContentPane().add(x);
        x.setBounds(730, -10, 60, 60);

        aboutHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/about us hover.PNG"))); // NOI18N
        getContentPane().add(aboutHover);
        aboutHover.setBounds(377, 16, 100, 60);

        classHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/classes hover.PNG"))); // NOI18N
        getContentPane().add(classHover);
        classHover.setBounds(606, 16, 100, 60);

        teamHover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/our team hover.PNG"))); // NOI18N
        getContentPane().add(teamHover);
        teamHover.setBounds(498, 16, 100, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/signup 3.PNG"))); // NOI18N
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
        aboutBtn.setBounds(390, 13, 90, 40);

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
        nextBtn.setBounds(420, 438, 150, 40);

        ageBtn.setText("jButton1");
        ageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ageBtn);
        ageBtn.setBounds(200, 210, 160, 40);

        heightBtn.setText("jButton1");
        heightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightBtnActionPerformed(evt);
            }
        });
        getContentPane().add(heightBtn);
        heightBtn.setBounds(200, 270, 160, 40);

        weightBtn.setText("jButton1");
        weightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightBtnActionPerformed(evt);
            }
        });
        getContentPane().add(weightBtn);
        weightBtn.setBounds(410, 210, 160, 40);

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

        calculate.setText("jButton1");
        calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateMouseExited(evt);
            }
        });
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate);
        calculate.setBounds(410, 270, 110, 40);

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
        classBtn.setBounds(610, 10, 90, 40);

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
        teamBtn.setBounds(505, 10, 90, 40);

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

        bmi.setText(BMI + "");

        boolean isEmpty = age.getText().equals("") || weight.getText().equals("") || height.getText().equals("");
        boolean isEmpty2 = weight.getText().equals("") || height.getText().equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        } 
        else {

            if (!isEmpty2) {
                agee = Integer.parseInt(age.getText());
                w = Double.parseDouble(weight.getText());
                h = Double.parseDouble(height.getText());
                BMI = (w /(h * h)) * 10000;
            }

            new PaymentPlanGUI().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ageMouseClicked

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void heightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_heightMouseClicked

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void ageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageBtnActionPerformed
        age.setVisible(true);
    }//GEN-LAST:event_ageBtnActionPerformed

    private void heightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightBtnActionPerformed
        height.setVisible(true);
    }//GEN-LAST:event_heightBtnActionPerformed

    private void weightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightBtnActionPerformed
        weight.setVisible(true);
    }//GEN-LAST:event_weightBtnActionPerformed

    private void weightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_weightMouseClicked

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new HomePageGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void weightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyTyped

    }//GEN-LAST:event_weightKeyTyped

    private void heightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyTyped

    }//GEN-LAST:event_heightKeyTyped

    private void weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyReleased

    }//GEN-LAST:event_weightKeyReleased

    private void heightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyReleased
        // TODO add your handling code here:
//        h = Integer.parseInt(height.getText());
//        BMI = (w / (h*h)) * 10000;
//        bmi.setText(BMI+"");
    }//GEN-LAST:event_heightKeyReleased

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed

        boolean isEmpty = weight.getText().equals("") || height.getText().equals("");

        if (!isEmpty) {

            w = Double.parseDouble(weight.getText());
            h = Double.parseDouble(height.getText());

            BMI = (w / (h * h)) * 10000;
            DecimalFormat df = new DecimalFormat("#.#");
            bmi.setText(df.format(BMI) + "");

        } else {
            bmi.setText(0.0 + "");
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void calculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseEntered
        bmiHover.setVisible(true);
    }//GEN-LAST:event_calculateMouseEntered

    private void calculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateMouseExited
        bmiHover.setVisible(false);
    }//GEN-LAST:event_calculateMouseExited

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
//        char c = evt.getKeyChar();
//        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
//            age.setEditable(true);
//        }
//        else
//            age.setEditable(false);
    }//GEN-LAST:event_ageKeyPressed

    private void weightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.' || evt.getKeyCode() == 8) {
            weight.setEditable(true);
        }
        else
            weight.setEditable(false);
    }//GEN-LAST:event_weightKeyPressed

    private void heightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == '.' || evt.getKeyCode() == 8) {
            height.setEditable(true);
        }
        else
            height.setEditable(false);
    }//GEN-LAST:event_heightKeyPressed

    private void classBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseEntered
        classHover.setVisible(true);
    }//GEN-LAST:event_classBtnMouseEntered

    private void classBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classBtnMouseExited
        classHover.setVisible(false);
    }//GEN-LAST:event_classBtnMouseExited

    private void classBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classBtnActionPerformed
        new ClassesGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_classBtnActionPerformed

    private void teamBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseEntered
        teamHover.setVisible(true);
    }//GEN-LAST:event_teamBtnMouseEntered

    private void teamBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamBtnMouseExited
        teamHover.setVisible(false);
    }//GEN-LAST:event_teamBtnMouseExited

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        new TeamGUI().setVisible(true);
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
            java.util.logging.Logger.getLogger(SignupGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupGUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupGUI3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    public javax.swing.JTextField age;
    private javax.swing.JButton ageBtn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bmi;
    private javax.swing.JLabel bmiHover;
    private javax.swing.JButton calculate;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JLabel fillAll;
    public javax.swing.JTextField height;
    private javax.swing.JButton heightBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    public javax.swing.JTextField weight;
    private javax.swing.JButton weightBtn;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    // End of variables declaration//GEN-END:variables
}
