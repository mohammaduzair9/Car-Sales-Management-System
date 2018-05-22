package carbon.autos;

import java.awt.*;
import java.util.*;
import javax.swing.*;



public class LoginFrame extends javax.swing.JFrame {
    
    
    
   public LoginFrame() {
       
        initComponents();
        setSize(755,545);
        setTitle("Carbon Autos");
        
        this.setResizable(false);
        
        txtPass.setEchoChar((char) 0);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
       
       
        
        
        
    }
   
   

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        cmbType = new javax.swing.JComboBox();
        head = new javax.swing.JLabel();
        linebg = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        create1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wrUser = new javax.swing.JLabel();
        wrPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Accountlog = new javax.swing.JLabel();
        bluebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(null);

        txtPass.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setText("Password"); // NOI18N
        txtPass.setBorder(null);
        txtPass.setEchoChar((char) 0);
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
        jPanel.add(txtPass);
        txtPass.setBounds(480, 200, 200, 40);

        cmbType.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        cmbType.setBorder(null);
        cmbType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });
        jPanel.add(cmbType);
        cmbType.setBounds(430, 270, 250, 40);

        head.setFont(new java.awt.Font("Brush Script Std", 0, 48)); // NOI18N
        head.setForeground(new java.awt.Color(51, 51, 51));
        head.setText("Account login");
        jPanel.add(head);
        head.setBounds(420, 50, 280, 80);

        linebg.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        linebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/line.png"))); // NOI18N
        linebg.setText("jLabel2");
        jPanel.add(linebg);
        linebg.setBounds(240, 10, 160, 460);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/login button.png"))); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        jPanel.add(btnLogin);
        btnLogin.setBounds(470, 330, 180, 60);

        create1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        create1.setForeground(new java.awt.Color(255, 255, 255));
        create1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/rr.png"))); // NOI18N
        create1.setText("  Create an Account  ");
        create1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create1MouseClicked(evt);
            }
        });
        jPanel.add(create1);
        create1.setBounds(310, 460, 190, 40);

        txtUser.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setText("Username");
        txtUser.setToolTipText("");
        txtUser.setAlignmentX(2.0F);
        txtUser.setAutoscrolls(false);
        txtUser.setBorder(null);
        txtUser.setMargin(new java.awt.Insets(30, 30, 30, 30));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel.add(txtUser);
        txtUser.setBounds(480, 130, 200, 40);
        txtUser.getAccessibleContext().setAccessibleName("");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/passicon.jpg"))); // NOI18N
        jLabel5.setText("jLabel3");
        jPanel.add(jLabel5);
        jLabel5.setBounds(430, 200, 50, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/usericon.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel.add(jLabel3);
        jLabel3.setBounds(430, 130, 50, 40);
        jPanel.add(wrUser);
        wrUser.setBounds(670, 130, 40, 40);
        jPanel.add(wrPass);
        wrPass.setBounds(670, 200, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/createbg.jpg"))); // NOI18N
        jPanel.add(jLabel1);
        jLabel1.setBounds(0, 440, 750, 80);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/logo.png"))); // NOI18N
        jPanel.add(logo);
        logo.setBounds(30, 70, 340, 330);
        jPanel.add(Accountlog);
        Accountlog.setBounds(440, 60, 230, 50);

        bluebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/login background.jpg"))); // NOI18N
        bluebg.setText("BgImg");
        jPanel.add(bluebg);
        bluebg.setBounds(0, -10, 750, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

    }//GEN-LAST:event_txtPassActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
     
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setForeground(Color.black);
        
        if("Username".equals(txtUser.getText())){
        txtUser.setText("");
        
        }
        
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if("".equals(txtUser.getText())){
       
         txtUser.setText("Username");
         txtUser.setForeground(Color.gray);
       
       }
        
       
            
                
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
       
        if("Password".equals(txtPass.getText())){
        txtPass.setText("");
        
        }
        
        txtPass.setForeground(Color.black);
        txtPass.setEchoChar('*');
       
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        
       if("".equals(txtPass.getText())){
       
         txtPass.setText("Password");
         txtPass.setEchoChar((char) 0);
         txtPass.setForeground(Color.gray);
       
       } 
               
    }//GEN-LAST:event_txtPassFocusLost

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/login hover.png")));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
            try{
            ArrayList list = DatabaseManager.getUsers();
              
            String Username="";
            String Password="";
            String Type="";
            
            for(int i=0; i<list.size(); i++){
                UserBean bean = (UserBean)list.get(i);
                Username = bean.getUser_name();
                Password = bean.getPassword();
                Type = bean.getType();
                                           
                if(txtUser.getText().equals(Username)&&txtPass.getText().equals(Password)&&cmbType.getSelectedItem().equals(Type)){
                    MainUser main = new MainUser();
                    main.setMainUser(Username);
                
                    if(Type.equals("Admin")){
                        AdminPanel log = new AdminPanel();
                        this.dispose();
                        break;
                    }
                    else{
                        UserPanel UPanel = new UserPanel();
                        this.dispose();
                        break;
                    }
                }
            
                
            }
                if(!(txtUser.getText().equals(Username)&&txtPass.getText().equals(Password)&&cmbType.getSelectedItem().equals(Type))){
                    JOptionPane.showMessageDialog(this, "Incorrect Username or Password");
            
            }       
        }
            catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/login button.png")));
    }//GEN-LAST:event_btnLoginMouseExited

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed

    }//GEN-LAST:event_cmbTypeActionPerformed

    private void create1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create1MouseClicked
        signupform sign = new signupform();
        
        this.dispose();
        sign.setVisible(true);
    }//GEN-LAST:event_create1MouseClicked

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accountlog;
    private javax.swing.JLabel bluebg;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel create1;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel linebg;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel wrPass;
    private javax.swing.JLabel wrUser;
    // End of variables declaration//GEN-END:variables
}
