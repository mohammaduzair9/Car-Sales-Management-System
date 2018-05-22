package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicComboPopup;

public class AddUser extends javax.swing.JFrame {
    
    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff"); 
    Color r =Color.red;

    public AddUser() {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
        
        this.setResizable(false);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        Male.setActionCommand("Male");
        Female.setActionCommand("Female");
        
        
        txtAddress.setBorder(a);
        txtCNIC.setBorder(a);
        txtCSC.setBorder(a);
        txtCardnumber.setBorder(a);
        txtCardowner.setBorder(a);
        cmbCardtype.setBorder(a);
        txtCity.setBorder(a);
        txtCountry.setBorder(a);
        txtEmail.setBorder(a);
        txtExpire.setBorder(a);
        txtFirstname.setBorder(a);
        txtLastname.setBorder(a);
        txtPass.setBorder(a);
        txtState.setBorder(a);
        txtUser.setBorder(a);
        txtZip.setBorder(a);
        
        
        txtAddress.setBackground(b);
        txtCNIC.setBackground(b);
        txtCSC.setBackground(b);
        txtCardnumber.setBackground(b);
        txtCardowner.setBackground(b);
        cmbCardtype.setBackground(b);
        txtCity.setBackground(b);
        txtCountry.setBackground(b);
        txtEmail.setBackground(b);
        txtExpire.setBackground(b);
        txtFirstname.setBackground(b);
        txtLastname.setBackground(b);
        txtPass.setBackground(b);
        txtState.setBackground(b);
        txtUser.setBackground(b);
        txtZip.setBackground(b);
        Male.setBackground(b);
        Female.setBackground(b);
        
        
        Object childb = cmbCardtype.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupb = (BasicComboPopup)childb;
        JList listb = popupb.getList();
        listb.setSelectionBackground(b);
        
        
        txtAddress.setForeground(f);
        txtCNIC.setForeground(f);
        txtCSC.setForeground(f);
        txtCardnumber.setForeground(f);
        txtCardowner.setForeground(f);
        cmbCardtype.setForeground(f);
        txtCity.setForeground(f);
        txtCountry.setForeground(f);
        txtEmail.setForeground(f);
        txtExpire.setForeground(f);
        txtFirstname.setForeground(f);
        txtLastname.setForeground(f);
        txtPass.setForeground(f);
        txtState.setForeground(f);
        txtUser.setForeground(f);
        txtZip.setForeground(f);
        
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        panel.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        
        
        jPanel2.setBackground(Color.decode("#ffffff"));
        jPanel5.setBackground(Color.decode("#ffffff"));
        jPanel4.setBackground(Color.decode("#ffffff"));
        panel.setBackground(Color.decode("#ffffff"));
    
        
        labelImg.setOpaque(true);
        labelImg.setBackground(Color.decode("#cceffc"));
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radGender = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCardowner = new javax.swing.JTextField();
        cmbCardtype = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtCardnumber = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtExpire = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCSC = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCNIC = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(50, 0, 150, 150);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/home.png"))); // NOI18N
        jLabel41.setText("jLabel3");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel41);
        jLabel41.setBounds(1210, 60, 110, 50);

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

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(30, 70, 80, 40);

        radGender.add(Female);
        Female.setText("Female");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("User Details :");

        radGender.add(Male);
        Male.setSelected(true);
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });

        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Username:");

        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Password:");

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Email id:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Last Name:");

        lblgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblgender.setText("Gender:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblgender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtFirstname))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtLastname)))
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Female, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Male, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblgender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Male)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Female)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 150, 300, 490);

        labelImg.setBackground(new java.awt.Color(255, 255, 255));
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/userimg default.png"))); // NOI18N
        labelImg.setText("                150 x 150");
        labelImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Profile Picture:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimgs.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(1020, 150, 300, 310);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/adduser.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel1.add(jLabel27);
        jLabel27.setBounds(1010, 490, 320, 150);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Payment Method:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Credit/Debit Card Information:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Credit Card Type:");

        txtCardowner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardownerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardownerFocusLost(evt);
            }
        });

        cmbCardtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Visa Card", "Master Card", "AMX" }));
        cmbCardtype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCardtypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCardtypeFocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Credit Card Owner:");

        txtCardnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Credit Card Number:");

        txtExpire.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtExpireFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExpireFocusLost(evt);
            }
        });
        txtExpire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExpireKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Security Code ( CSC ):");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Expiration date (YYYY-MM-DD):");

        txtCSC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCSCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCSCFocusLost(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("CNIC Number:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCardowner, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCardowner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(720, 150, 260, 490);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Profile Information:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Country:");

        txtCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountryFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("City:");

        txtState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStateFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("State:");

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Zip code:");

        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Street Address:");

        txtZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtZipFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtZipFocusLost(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCountry)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1.add(panel);
        panel.setBounds(380, 150, 300, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -130, 1920, 980);

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

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/homehover.png")));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/home.png")));
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
            AdminPanel ap = new AdminPanel();
        
            this.dispose();
            ap.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed
    
    
    private void txtZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyPressed
         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtZip.setEditable(true);
        } else {
        txtZip.setEditable(false);
         }
    }//GEN-LAST:event_txtZipKeyPressed

    private void txtCNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNICKeyPressed
         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtCNIC.setEditable(true);
        } else {
        txtCNIC.setEditable(false);}
    }//GEN-LAST:event_txtCNICKeyPressed

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

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBackground(Color.decode("#cceffc"));
        txtEmail.setBorder(a);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setBackground(Color.decode("#cceffc"));
        txtPass.setBorder(a);
    }//GEN-LAST:event_txtPassFocusGained

    private void txtExpireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpireKeyTyped
        String exp = txtExpire.getText();
        int count = txtExpire.getText().length();
        
        if(count==4||count==7||count==11){txtExpire.setText(exp+"-");}
    }//GEN-LAST:event_txtExpireKeyTyped

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

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
        txtFirstname.setBackground(b);
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        txtLastname.setBackground(b);
    }//GEN-LAST:event_txtLastnameFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        txtUser.setBackground(b);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBackground(b);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        txtPass.setBackground(b);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtCountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusGained
        txtCountry.setBackground(Color.decode("#cceffc"));
        txtCountry.setBorder(a);
    }//GEN-LAST:event_txtCountryFocusGained

    private void txtCountryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCountryFocusLost
        txtCountry.setBackground(b);
    }//GEN-LAST:event_txtCountryFocusLost

    private void txtCityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusGained
        txtCity.setBackground(Color.decode("#cceffc"));
        txtCity.setBorder(a);
    }//GEN-LAST:event_txtCityFocusGained

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        txtCity.setBackground(b);
    }//GEN-LAST:event_txtCityFocusLost

    private void txtStateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStateFocusGained
        txtState.setBackground(Color.decode("#cceffc"));
        txtState.setBorder(a);
    }//GEN-LAST:event_txtStateFocusGained

    private void txtStateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStateFocusLost
        txtState.setBackground(b);
    }//GEN-LAST:event_txtStateFocusLost

    private void txtZipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtZipFocusGained
        txtZip.setBackground(Color.decode("#cceffc"));
        txtZip.setBorder(a);
    }//GEN-LAST:event_txtZipFocusGained

    private void txtZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtZipFocusLost
        txtZip.setBackground(b);
    }//GEN-LAST:event_txtZipFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        txtAddress.setBackground(Color.decode("#cceffc"));
        txtAddress.setBorder(a);
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        txtAddress.setBackground(b);
    }//GEN-LAST:event_txtAddressFocusLost

    private void cmbCardtypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCardtypeFocusGained
        cmbCardtype.setBackground(Color.decode("#cceffc"));
        cmbCardtype.setBorder(a);
    }//GEN-LAST:event_cmbCardtypeFocusGained

    private void cmbCardtypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCardtypeFocusLost
        cmbCardtype.setBackground(b);
    }//GEN-LAST:event_cmbCardtypeFocusLost

    private void txtCardownerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardownerFocusGained
        txtCardowner.setBackground(Color.decode("#cceffc"));
        txtCardowner.setBorder(a);
    }//GEN-LAST:event_txtCardownerFocusGained

    private void txtCardownerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardownerFocusLost
        txtCardowner.setBackground(b);
    }//GEN-LAST:event_txtCardownerFocusLost

    private void txtCardnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardnumberFocusGained
        txtCardnumber.setBackground(Color.decode("#cceffc"));
        txtCardnumber.setBorder(a);
    }//GEN-LAST:event_txtCardnumberFocusGained

    private void txtCardnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardnumberFocusLost
        txtCardnumber.setBackground(b);
    }//GEN-LAST:event_txtCardnumberFocusLost

    private void txtCSCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCSCFocusGained
        txtCSC.setBackground(Color.decode("#cceffc"));
        txtCSC.setBorder(a);
    }//GEN-LAST:event_txtCSCFocusGained

    private void txtCSCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCSCFocusLost
        txtCSC.setBackground(b);
    }//GEN-LAST:event_txtCSCFocusLost

    private void txtExpireFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExpireFocusGained
        txtExpire.setBackground(Color.decode("#cceffc"));
        txtExpire.setBorder(a);
    }//GEN-LAST:event_txtExpireFocusGained

    private void txtExpireFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExpireFocusLost
        txtExpire.setBackground(b);
    }//GEN-LAST:event_txtExpireFocusLost

    private void txtCNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusGained
        txtCNIC.setBackground(Color.decode("#cceffc"));
        txtCNIC.setBorder(a);
    }//GEN-LAST:event_txtCNICFocusGained

    private void txtCNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusLost
        txtCNIC.setBackground(b);
    }//GEN-LAST:event_txtCNICFocusLost

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int w = labelImg.getWidth();
        int h =labelImg.getHeight();
        
        
        int a=jFileChooser1.showOpenDialog(this);
         
        if(a==JFileChooser.APPROVE_OPTION){
        File f= jFileChooser1.getSelectedFile();
        
        ImageIcon icon = new ImageIcon(""+f);
        Image img = icon.getImage();

        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics g = bi.createGraphics();
        g.drawImage(img, 0, 0, w, h, null);
        
               
            labelImg.setIcon(new ImageIcon(bi));
            labelImg.setText("");
            }
        
        else {
                File f = null;
             }
            
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimgs hover.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimgs.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
       
        
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        if(
                
                txtFirstname.getText().equals("") ||
                txtLastname.getText().equals("") ||
                txtUser.getText().equals("") ||
                txtEmail.getText().equals("") ||
                txtPass.getText().equals("") ||
                txtEmail.getText().matches(EMAIL_REGEX)== false
            ){
            
            if(txtFirstname.getText().equals("")){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtFirstname.setBorder(border);
            
            }
        
            if(txtLastname.getText().equals("")){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtLastname.setBorder(border);
            
            }
            
            if(txtUser.getText().equals("")){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtUser.setBorder(border);
            
            }
            
            if(txtPass.getText().equals("")){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtPass.setBorder(border);
                        
            }
            
            if(txtEmail.getText().equals("")){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtEmail.setBorder(border);
            
            }
            
            else if(txtEmail.getText().matches(EMAIL_REGEX)== false){
            
            Border border = BorderFactory.createLineBorder(Color.RED, 1);
            txtEmail.setBorder(border);
            
            }
                
        }
        
        else{
        
        String Firstname = txtFirstname.getText();
        String Lastname = txtLastname.getText();
        String Username = txtUser.getText();
        String Emailid = txtEmail.getText();
        String Password = txtPass.getText();
        String Gender = radGender.getSelection().getActionCommand();
        String Country = txtCountry.getText();
        String City = txtCity.getText();
        String State = txtState.getText();
        int Zipcode = 0;
        if(!(txtZip.getText().equals(""))){Zipcode=Integer.parseInt(txtZip.getText());}
            
        String Address = txtAddress.getText();
        String Cardtype = cmbCardtype.getSelectedItem().toString();
        String Cardowner = txtCardowner.getText();
        String Cardnumber = txtCardnumber.getText();
        String CSC = txtCSC.getText();
        String Expire = txtExpire.getText();
        String CNIC = txtCNIC.getText();
        String img;
       
        String take = labelImg.getIcon().toString();
        String chk = take.substring(take.length()-21);
                
        if(chk.equals("userimg%20default.png")){
            img = " ";
        }
        
        else {
        
        img = jFileChooser1.getSelectedFile().toString();
            
        }
        
        try {

            
            String query = "insert into Users (Type,First_name,Last_name,User_name,Email_id,Password,Gender,Country,City,State,Zip_code,Address,Card_type,Card_owner,Card_number,CSC,Expiry,CNIC,Img)values( 'User','"+Firstname+"','"+Lastname+"','"+Username+"','"+Emailid+"','"+Password+"','"+Gender+"','"+Country+"','"+City+"','"+State+"',"+Zipcode+",'"+Address+"','"+Cardtype+"','"+Cardowner+"','"+Cardnumber+"','"+CSC+"','"+Expire+"','"+CNIC+"','"+img+"')";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);

        txtFirstname.setText("");
        txtLastname.setText("");
        txtUser.setText("");
        txtEmail.setText("");
        txtPass.setText("");
        txtCountry.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtAddress.setText("");
        txtCardnumber.setText("");
        txtCardowner.setText("");
        txtCSC.setText("");
        txtCNIC.setText("");
        txtExpire.setText("");
        txtZip.setText("");
        cmbCardtype.setSelectedItem("- Select -");
        Male.setSelected(true);
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/userimg default.png")));
        
    
        
            
         JOptionPane.showMessageDialog(this, "User Added Successfully!");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}
           }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/adduser hover.png")));
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/adduser.png")));
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JComboBox cmbCardtype;
    private javax.swing.JLabel home;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel lblgender;
    private javax.swing.JPanel panel;
    private javax.swing.ButtonGroup radGender;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtCSC;
    private javax.swing.JTextField txtCardnumber;
    private javax.swing.JTextField txtCardowner;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExpire;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
