/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

/**
 *
 * @author PC
 */
public class SignupGUI2 extends javax.swing.JFrame {

    public static String cnic;
    public static String phoneNum;
    public static String add;
    public static String gen;
    public static String dob;
    
    public static String y;
    public static String m;

    public SignupGUI2() {
        initComponents();

        classHover.setVisible(false);
        teamHover.setVisible(false);
        aboutHover.setVisible(false);
        xHover.setVisible(false);

        CNIC.setVisible(false);
        phone.setVisible(false);
        address.setVisible(false);

        phoneError.setVisible(false);
        CNICerror.setVisible(false);
        fillAll.setVisible(false);
        ageError.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ageError = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        fillAll = new javax.swing.JLabel();
        phoneError = new javax.swing.JLabel();
        CNICerror = new javax.swing.JLabel();
        address = new javax.swing.JTextArea();
        gender = new javax.swing.JComboBox<>();
        phone = new javax.swing.JTextField();
        CNIC = new javax.swing.JTextField();
        xHover = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        aboutHover = new javax.swing.JLabel();
        classHover = new javax.swing.JLabel();
        teamHover = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        aboutBtn = new javax.swing.JButton();
        xBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        cnicBtn = new javax.swing.JButton();
        phoneBtn = new javax.swing.JButton();
        addressBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        classBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(764, 493));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 430, 170, 50);

        ageError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ageError.setForeground(new java.awt.Color(192, 0, 0));
        ageError.setText("* Must be atleast 18 years old *");
        getContentPane().add(ageError);
        ageError.setBounds(200, 350, 300, 13);

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
        year.setBounds(470, 317, 70, 30);

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
        month.setBounds(395, 317, 60, 30);

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
        day.setBounds(320, 317, 60, 30);

        fillAll.setForeground(new java.awt.Color(192, 0, 0));
        fillAll.setText("* Please fill all fields *");
        getContentPane().add(fillAll);
        fillAll.setBounds(470, 480, 300, 14);

        phoneError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        phoneError.setForeground(new java.awt.Color(192, 0, 0));
        phoneError.setText("* Phone number length is incorrect *");
        getContentPane().add(phoneError);
        phoneError.setBounds(200, 299, 300, 13);

        CNICerror.setForeground(new java.awt.Color(192, 0, 0));
        CNICerror.setText("* CNIC length is incorrect *");
        getContentPane().add(CNICerror);
        CNICerror.setBounds(200, 244, 200, 14);

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
        address.setSelectionColor(new java.awt.Color(56, 85, 98));
        getContentPane().add(address);
        address.setBounds(207, 366, 350, 50);
        address.getAccessibleContext().setAccessibleDescription("");

        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(56, 85, 98));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.setBorder(null);
        gender.setLightWeightPopupEnabled(false);
        gender.setMinimumSize(new java.awt.Dimension(150, 35));
        gender.setName("Gender"); // NOI18N
        gender.setPreferredSize(new java.awt.Dimension(150, 35));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender);
        gender.setBounds(480, 265, 80, 30);

        phone.setBackground(new java.awt.Color(56, 85, 98));
        phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setBorder(null);
        phone.setCaretColor(new java.awt.Color(255, 255, 255));
        phone.setSelectionColor(new java.awt.Color(255, 255, 255));
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
        });
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(206, 264, 230, 30);

        CNIC.setBackground(new java.awt.Color(56, 85, 98));
        CNIC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CNIC.setForeground(new java.awt.Color(255, 255, 255));
        CNIC.setBorder(null);
        CNIC.setCaretColor(new java.awt.Color(255, 255, 255));
        CNIC.setSelectionColor(new java.awt.Color(255, 255, 255));
        CNIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CNICMouseClicked(evt);
            }
        });
        CNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNICActionPerformed(evt);
            }
        });
        CNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CNICKeyPressed(evt);
            }
        });
        getContentPane().add(CNIC);
        CNIC.setBounds(207, 210, 350, 30);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymmanagement/signup 2.PNG"))); // NOI18N
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

        cnicBtn.setText("jButton1");
        cnicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cnicBtn);
        cnicBtn.setBounds(200, 200, 360, 40);

        phoneBtn.setText("jButton1");
        phoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(phoneBtn);
        phoneBtn.setBounds(200, 260, 240, 40);

        addressBtn.setText("jButton1");
        addressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addressBtn);
        addressBtn.setBounds(200, 360, 360, 60);

        homeBtn.setText("jButton2");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(40, 0, 180, 60);

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
        phoneError.setVisible(false);
        CNICerror.setVisible(false);
        fillAll.setVisible(false);

        cnic = CNIC.getText();
        phoneNum = phone.getText();
        add = address.getText();
        gen = gender.getItemAt(gender.getSelectedIndex());
        
        String d = day.getItemAt(day.getSelectedIndex());
        m = month.getItemAt(month.getSelectedIndex());
        y = year.getItemAt(year.getSelectedIndex());
        dob = y + "-" + m + "-" + d;
        
        if(gen.toLowerCase().equals("male"))
            gen = "M";
        else if(gen.toLowerCase().equals("female"))
            gen = "F";
        else if(gen.toLowerCase().equals("other"))
            gen = "O";
        
        boolean isEmpty = cnic.equals("") || phoneNum.equals("") || gen.equals("")|| add.equals("");

        if (isEmpty) {
            fillAll.setVisible(true);
        }
        else if (cnic.length() != 13) {
            CNICerror.setVisible(true);
        } 
        else if (phoneNum.length() != 11) {
            phoneError.setVisible(true);
        }
        else {
            new SignupGUI3().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_nextBtnActionPerformed
    
    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered

    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited

    }//GEN-LAST:event_nextBtnMouseExited

    private void CNICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CNICMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CNICMouseClicked

    private void CNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNICActionPerformed

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneMouseClicked

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void cnicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicBtnActionPerformed
        CNIC.setVisible(true);
    }//GEN-LAST:event_cnicBtnActionPerformed

    private void phoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneBtnActionPerformed
        phone.setVisible(true);
    }//GEN-LAST:event_phoneBtnActionPerformed

    private void addressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressBtnActionPerformed
        address.setVisible(true);
    }//GEN-LAST:event_addressBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new HomePageGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void CNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNICKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            CNIC.setEditable(true);
        }
        else
            CNIC.setEditable(false);
    }//GEN-LAST:event_CNICKeyPressed

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == 8) {
            phone.setEditable(true);
        }
        else
            phone.setEditable(false);
    }//GEN-LAST:event_phoneKeyPressed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CNIC;
    private javax.swing.JLabel CNICerror;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JLabel aboutHover;
    public javax.swing.JTextArea address;
    private javax.swing.JButton addressBtn;
    private javax.swing.JLabel ageError;
    private javax.swing.JLabel background;
    private javax.swing.JButton classBtn;
    private javax.swing.JLabel classHover;
    private javax.swing.JButton cnicBtn;
    public javax.swing.JComboBox<String> day;
    private javax.swing.JLabel fillAll;
    public javax.swing.JComboBox<String> gender;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> month;
    private javax.swing.JButton nextBtn;
    public javax.swing.JTextField phone;
    private javax.swing.JButton phoneBtn;
    private javax.swing.JLabel phoneError;
    private javax.swing.JButton teamBtn;
    private javax.swing.JLabel teamHover;
    private javax.swing.JLabel x;
    private javax.swing.JButton xBtn;
    private javax.swing.JLabel xHover;
    public javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
