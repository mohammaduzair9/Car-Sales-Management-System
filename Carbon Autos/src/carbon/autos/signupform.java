package carbon.autos;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;


public class signupform extends javax.swing.JFrame {
  
   public signupform() {
        initComponents();
        
        setSize(755,555);
           
        setTitle("Carbon Autos");
        
        setVisible(true);
              
        txtPass.setEchoChar((char) 0);
        txtRepass.setEchoChar((char) 0);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
   
        head.requestFocusInWindow();
   
   }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        linebg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSignup = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtRepass = new javax.swing.JPasswordField();
        txtPass = new javax.swing.JPasswordField();
        wrUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        wrPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Accountlog = new javax.swing.JLabel();
        bluebg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(null);

        head.setFont(new java.awt.Font("Brush Script Std", 0, 48)); // NOI18N
        head.setForeground(new java.awt.Color(51, 51, 51));
        head.setText("Sign up");
        jPanel.add(head);
        head.setBounds(500, 10, 280, 80);

        linebg.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        linebg.setForeground(new java.awt.Color(255, 255, 255));
        linebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/line.png"))); // NOI18N
        linebg.setText("jLabel2");
        jPanel.add(linebg);
        linebg.setBounds(240, 10, 160, 460);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/rr.png"))); // NOI18N
        jLabel2.setText("  Sign in");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel.add(jLabel2);
        jLabel2.setBounds(330, 470, 190, 40);

        txtFirstname.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtFirstname.setForeground(new java.awt.Color(102, 102, 102));
        txtFirstname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFirstname.setText(" First Name");
        txtFirstname.setBorder(null);
        txtFirstname.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });
        jPanel.add(txtFirstname);
        txtFirstname.setBounds(440, 100, 130, 40);

        txtLastname.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtLastname.setForeground(new java.awt.Color(102, 102, 102));
        txtLastname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLastname.setText(" Last Name");
        txtLastname.setBorder(null);
        txtLastname.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });
        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });
        jPanel.add(txtLastname);
        txtLastname.setBounds(580, 100, 130, 40);

        txtEmail.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setText(" Email id");
        txtEmail.setBorder(null);
        txtEmail.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel.add(txtEmail);
        txtEmail.setBounds(440, 150, 270, 40);

        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signup button.png"))); // NOI18N
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignupMouseExited(evt);
            }
        });
        jPanel.add(btnSignup);
        btnSignup.setBounds(480, 350, 180, 60);

        txtUser.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setText(" Username");
        txtUser.setBorder(null);
        txtUser.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        jPanel.add(txtUser);
        txtUser.setBounds(440, 200, 270, 40);

        txtRepass.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtRepass.setForeground(new java.awt.Color(102, 102, 102));
        txtRepass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRepass.setText(" Retype Password");
        txtRepass.setBorder(null);
        txtRepass.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtRepass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRepassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepassFocusLost(evt);
            }
        });
        jPanel.add(txtRepass);
        txtRepass.setBounds(440, 300, 270, 40);

        txtPass.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.setText(" Create Password");
        txtPass.setBorder(null);
        txtPass.setMargin(new java.awt.Insets(2, 2, 2, 20));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        jPanel.add(txtPass);
        txtPass.setBounds(440, 250, 270, 40);
        jPanel.add(wrUser);
        wrUser.setBounds(670, 130, 40, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Already have an Account?");
        jPanel.add(jLabel4);
        jLabel4.setBounds(310, 450, 190, 17);
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

        jLabel3.setText("jLabel3");
        jPanel.add(jLabel3);
        jLabel3.setBounds(330, 450, 34, 14);

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

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked

                String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
           
        if(txtUser.getText().equals("")||txtUser.getText().equals(" Username")||
           txtFirstname.getText().equals("")||txtFirstname.getText().equals(" First Name")||
           txtLastname.getText().equals("")||txtLastname.getText().equals(" Last Name")||
           txtEmail.getText().equals("")||txtEmail.getText().equals(" Email id")||
           txtEmail.getText().matches(EMAIL_REGEX)== false ||     
           txtPass.getText().equals("")||txtPass.getText().equals(" Create Password")||
           txtRepass.getText().equals("")||txtRepass.getText().equals(" Retype Password")){
        
            if(txtUser.getText().equals("")||txtUser.getText().equals(" Username")){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtUser.setBorder(border);
            
            }
            
            if(txtFirstname.getText().equals("")||txtFirstname.getText().equals(" First Name")){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtFirstname.setBorder(border);
            
            }
            
            if(txtLastname.getText().equals("")||txtLastname.getText().equals(" Last Name")){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtLastname.setBorder(border);
            
            }
            
            if(txtEmail.getText().equals("")||txtEmail.getText().equals(" Email id")||txtEmail.getText().matches(EMAIL_REGEX)== false){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtEmail.setBorder(border);
            
            }
            
            if(txtPass.getText().equals("")||txtPass.getText().equals(" Create Password")){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtPass.setBorder(border);
            
            }
            
            if(txtRepass.getText().equals("")||txtRepass.getText().equals(" Retype Password")){
            
               Border border = BorderFactory.createLineBorder(Color.RED, 3);
               txtRepass.setBorder(border);
            
            }
        
        }
        
        else{
        
        if (txtPass.getText().equals(txtRepass.getText()))
        {
        
        
        String Firstname = txtFirstname.getText();
        String Lastname = txtLastname.getText();
        String Username = txtUser.getText();
        String Emailid = txtEmail.getText();
        String Password = txtPass.getText();
       
             
      
        
        try {
            
            ArrayList list = DatabaseManager.getUsers();
            
            String query = "insert into Users (Type,First_name,Last_name,User_name,Email_id,Password) values( 'User','"+Firstname+"','"+Lastname+"','"+Username+"','"+Emailid+"','"+Password+"')";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
            
            
            txtUser.setText(" Username");
            txtFirstname.setText(" First Name");
            txtEmail.setText(" Email id");
            txtLastname.setText(" Last Name");
            txtPass.setText(" Create Password");
            txtRepass.setText(" Retype Password");
            txtPass.setEchoChar((char) 0);
            txtRepass.setEchoChar((char) 0);
            txtLastname.setForeground(Color.gray);
            txtEmail.setForeground(Color.gray);
            txtFirstname.setForeground(Color.gray);
            txtPass.setForeground(Color.gray);
            txtRepass.setForeground(Color.gray);
            txtUser.setForeground(Color.gray);
            
            
            JOptionPane.showMessageDialog(this, "     Congradulations!!\n   SignUp Successfull");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}}
        
        else{
            Border border = BorderFactory.createLineBorder(Color.RED, 3);
            txtRepass.setBorder(border);
        
        }
        
        }
        
    }//GEN-LAST:event_btnSignupMouseClicked

    private void btnSignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseEntered
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signup hover.png")));
    }//GEN-LAST:event_btnSignupMouseEntered

    private void btnSignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseExited
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signup button.png")));
    }//GEN-LAST:event_btnSignupMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        LoginFrame logfrm = new LoginFrame();
        
        this.dispose();
        logfrm.setVisible(true);
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusGained
 
        
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtFirstname.setBorder(border);
        
        txtFirstname.setForeground(Color.black);
        
        if(" First Name".equals(txtFirstname.getText())){
        txtFirstname.setText("");

        }
        
        
    }//GEN-LAST:event_txtFirstnameFocusGained

    private void txtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusGained
        
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtLastname.setBorder(border);
        
        txtLastname.setForeground(Color.black);
        
        if(" Last Name".equals(txtLastname.getText())){
        txtLastname.setText("");

        }
    }//GEN-LAST:event_txtLastnameFocusGained

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtEmail.setBorder(border);
        
        txtEmail.setForeground(Color.black);
        
        if(" Email id".equals(txtEmail.getText())){
        txtEmail.setText("");

        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
         
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtUser.setBorder(border);
        
        txtUser.setForeground(Color.black);
        
        if(" Username".equals(txtUser.getText())){
        txtUser.setText("");

        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
       
        txtFirstname.setBorder(null);
        
        if("".equals(txtFirstname.getText())){
       
         txtFirstname.setText(" First Name");
         txtFirstname.setForeground(Color.gray);
       
       }
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        
         txtLastname.setBorder(null);
        
        if("".equals(txtLastname.getText())){
       
         txtLastname.setText(" Last Name");
         txtLastname.setForeground(Color.gray);
       
       }
    }//GEN-LAST:event_txtLastnameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        
         txtEmail.setBorder(null);
        
        if("".equals(txtEmail.getText())){
       
         txtEmail.setText(" Email id");
         txtEmail.setForeground(Color.gray);
       
       }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        
         txtUser.setBorder(null);
        
        if("".equals(txtUser.getText())){
       
         txtUser.setText(" Username");
         txtUser.setForeground(Color.gray);
       
       }    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtPass.setBorder(border);
        
        if(" Create Password".equals(txtPass.getText())){
        txtPass.setText("");
        
        }
        
        txtPass.setForeground(Color.black);
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
       
         txtPass.setBorder(null);
        
        if("".equals(txtPass.getText())){
       
         txtPass.setText(" Create Password");
         txtPass.setEchoChar((char) 0);
         txtPass.setForeground(Color.gray);
       
       } 
    }//GEN-LAST:event_txtPassFocusLost

    private void txtRepassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepassFocusGained
        
        Border border = BorderFactory.createLineBorder(Color.decode("#0095cd"), 3);
        txtRepass.setBorder(border);
        
        if(" Retype Password".equals(txtRepass.getText())){
        txtRepass.setText("");
        
        }
        
        txtRepass.setForeground(Color.black);
        txtRepass.setEchoChar('*');
    }//GEN-LAST:event_txtRepassFocusGained

    private void txtRepassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepassFocusLost
        
         txtRepass.setBorder(null);
        
        if("".equals(txtRepass.getText())){
       
         txtRepass.setText(" Retype Password");
         txtRepass.setEchoChar((char) 0);
         txtRepass.setForeground(Color.gray);
       
       } 
    }//GEN-LAST:event_txtRepassFocusLost

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accountlog;
    private javax.swing.JLabel bluebg;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel linebg;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRepass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel wrPass;
    private javax.swing.JLabel wrUser;
    // End of variables declaration//GEN-END:variables
}
