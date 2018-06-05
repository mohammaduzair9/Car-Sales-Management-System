package carbon.autos;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboPopup;

public class SearchUser extends javax.swing.JFrame {

     Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff");
    
    public SearchUser() {
        initComponents();
                   
        setTitle("Carbon Autos");
             
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        this.setResizable(false);
        
        txtCNIC.setForeground(f);
        txtCNIC.setBorder(a);      
        txtCNIC.setBackground(b);
        
        txtCardnumber.setForeground(f);
        txtCardnumber.setBorder(a);      
        txtCardnumber.setBackground(b);
        
        txtCity.setForeground(f);
        txtCity.setBorder(a);      
        txtCity.setBackground(b);
        
        txtCountry.setForeground(f);
        txtCountry.setBorder(a);      
        txtCountry.setBackground(b);
        
        txtEmail.setForeground(f);
        txtEmail.setBorder(a);      
        txtEmail.setBackground(b);
        
        txtFirstname.setForeground(f);
        txtFirstname.setBorder(a);      
        txtFirstname.setBackground(b);
        
        txtLastname.setForeground(f);
        txtLastname.setBorder(a);      
        txtLastname.setBackground(b);
        
        txtState.setForeground(f);
        txtState.setBorder(a);      
        txtState.setBackground(b);
        
        txtUser.setForeground(f);
        txtUser.setBorder(a);      
        txtUser.setBackground(b);
        
        cmbGender.setForeground(f);
        cmbGender.setBorder(a);      
        cmbGender.setBackground(b);
        
        Object childb = cmbGender.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupb = (BasicComboPopup)childb;
        JList listb = popupb.getList();
        listb.setSelectionBackground(b);
        
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel2.setBackground(Color.decode("#ffffff"));
       
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCNIC = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCardnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 0, 150, 150);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/home.png"))); // NOI18N
        jLabel42.setText("jLabel3");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel42);
        jLabel42.setBounds(1210, 60, 110, 50);

        jLabel12.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1210, 20, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("User Details :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(106, 26, 218, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(106, 72, 250, 17);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Username:");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(809, 72, 250, 17);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Email id:");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(106, 156, 250, 17);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Last Name:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(456, 72, 253, 17);

        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });
        jPanel2.add(txtFirstname);
        txtFirstname.setBounds(106, 95, 250, 35);

        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });
        jPanel2.add(txtLastname);
        txtLastname.setBounds(456, 95, 253, 35);

        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel2.add(txtUser);
        txtUser.setBounds(809, 95, 250, 35);

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel2.add(txtEmail);
        txtEmail.setBounds(106, 179, 250, 35);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Gender:");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(456, 156, 253, 17);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "Male", "Female" }));
        cmbGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbGenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbGenderFocusLost(evt);
            }
        });
        jPanel2.add(cmbGender);
        cmbGender.setBounds(456, 179, 253, 35);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Country");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(809, 156, 250, 17);

        txtCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountryFocusLost(evt);
            }
        });
        jPanel2.add(txtCountry);
        txtCountry.setBounds(809, 179, 250, 35);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("City:");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(106, 241, 250, 17);

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        jPanel2.add(txtCity);
        txtCity.setBounds(106, 264, 250, 35);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("State:");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(456, 241, 250, 17);

        txtState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStateFocusLost(evt);
            }
        });
        jPanel2.add(txtState);
        txtState.setBounds(456, 264, 250, 35);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("CNIC Number:");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(456, 326, 250, 17);

        txtCNIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCNICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCNICFocusLost(evt);
            }
        });
        txtCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCNICKeyPressed(evt);
            }
        });
        jPanel2.add(txtCNIC);
        txtCNIC.setBounds(456, 349, 250, 35);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Credit Card Number:");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(106, 326, 250, 17);

        txtCardnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusLost(evt);
            }
        });
        jPanel2.add(txtCardnumber);
        txtCardnumber.setBounds(106, 349, 250, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/finduser.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(810, 270, 250, 120);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 1260, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -130, 1920, 980);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Air Conditioning");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(0, 0, 95, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        LoginFrame logfrm = new LoginFrame();

        this.dispose();
        logfrm.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout hover.png")));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout.png")));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/finduser hover.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/finduser.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
        String sFirstname = txtFirstname.getText();
        String sLastname = txtLastname.getText();
        String sCNIC = txtCNIC.getText();
        String sCardnumber = txtCardnumber.getText();
        String sCity = txtCity.getText();
        String sCountry = txtCountry.getText();
        String sEmailid = txtEmail.getText();
        String sState = txtState.getText();
        String sUsername = txtUser.getText();
        String sGender = cmbGender.getSelectedItem().toString();
        
        SearchUsernew sun = new SearchUsernew(sFirstname,sLastname,sUsername,sEmailid,sGender,sCountry,sCity,sState,sCardnumber,sCNIC);
        
        this.dispose();
        sun.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusGained
        txtFirstname.setBackground(Color.decode("#cceffc"));
        txtFirstname.setBorder(a);
    }//GEN-LAST:event_txtFirstnameFocusGained

    private void txtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusGained
        txtLastname.setBackground(Color.decode("#cceffc"));
        txtLastname.setBorder(a);
    }//GEN-LAST:event_txtLastnameFocusGained

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setBackground(Color.decode("#cceffc"));
        txtUser.setBorder(a);
    }//GEN-LAST:event_txtUserFocusGained

    private void txtCountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusGained
        txtCountry.setBackground(Color.decode("#cceffc"));
        txtCountry.setBorder(a);
    }//GEN-LAST:event_txtCountryFocusGained

    private void cmbGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbGenderFocusGained
        cmbGender.setBackground(Color.decode("#cceffc"));
        cmbGender.setBorder(a);
    }//GEN-LAST:event_cmbGenderFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBackground(Color.decode("#cceffc"));
        txtEmail.setBorder(a);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusGained
        txtCity.setBackground(Color.decode("#cceffc"));
        txtCity.setBorder(a);
    }//GEN-LAST:event_txtCityFocusGained

    private void txtStateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStateFocusGained
        txtState.setBackground(Color.decode("#cceffc"));
        txtState.setBorder(a);
    }//GEN-LAST:event_txtStateFocusGained

    private void txtCNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusGained
        txtCNIC.setBackground(Color.decode("#cceffc"));
        txtCNIC.setBorder(a);
    }//GEN-LAST:event_txtCNICFocusGained

    private void txtCardnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardnumberFocusGained
        txtCardnumber.setBackground(Color.decode("#cceffc"));
        txtCardnumber.setBorder(a);
    }//GEN-LAST:event_txtCardnumberFocusGained

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
        txtFirstname.setBackground(b);
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBackground(b);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        txtCity.setBackground(b);
    }//GEN-LAST:event_txtCityFocusLost

    private void txtCardnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardnumberFocusLost
        txtCardnumber.setBackground(b);
    }//GEN-LAST:event_txtCardnumberFocusLost

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        txtLastname.setBackground(b);
    }//GEN-LAST:event_txtLastnameFocusLost

    private void cmbGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbGenderFocusLost
        cmbGender.setBackground(b);
    }//GEN-LAST:event_cmbGenderFocusLost

    private void txtStateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStateFocusLost
        txtState.setBackground(b);
    }//GEN-LAST:event_txtStateFocusLost

    private void txtCNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusLost
        txtCNIC.setBackground(b);
    }//GEN-LAST:event_txtCNICFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        txtUser.setBackground(b);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusLost
        txtCountry.setBackground(b);
    }//GEN-LAST:event_txtCountryFocusLost

    private void txtCNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNICKeyPressed
          if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtCNIC.setEditable(true);
        } else {
        txtCNIC.setEditable(false);}
    }//GEN-LAST:event_txtCNICKeyPressed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbGender;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtCardnumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
