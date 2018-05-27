package carbon.autos;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

public class ProfileSetting1 extends javax.swing.JFrame {

    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#f0f0f0");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff"); 
    Color r =Color.red;
    
    static String User;
    
    
    
    public void edit(JLabel label,JTextField field,String set){
        
        if(label.getText().equals("edit"))
        {field.setEnabled(true);
        field.setEditable(true);
        label.setText("save");
        field.requestFocus();}
        else if(label.getText().equals("save")){
        label.setText("edit");
        
           try{
            String query = "update Users set "+set+"='"+field.getText()+"' where User_name = '"+User+"'";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
               System.out.println("gud");
           }
           catch(Exception e){e.printStackTrace();}
        field.setEnabled(false);
        field.setEditable(false);
        }}

        String Type;
    
    
    public ProfileSetting1() {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        this.setResizable(false);
    
        User = MainUser.getMainUser();
        System.out.println(User);
        try
        { 
           ArrayList list = DatabaseManager.getUsers();
            for(int i=0; i<list.size(); i++){
                UserBean bean = (UserBean)list.get(i);
                Type = bean.getType();
                String Firstname = bean.getFirst_name();
                String Lastname = bean.getLast_name();
                String Username = bean.getUser_name();
                String Email = bean.getEmail_id();
                String Gender = bean.getGender();
                String City = bean.getCity();
                String Country = bean.getCountry();
                String CNIC = bean.getCNIC();
                String Cardnum = bean.getCard_number();
                String Address = bean.getAddress();
                String CSC = bean.getCSC();
                String Expire = bean.getExpiry();
                String Passowrd = bean.getPassword();
                String State = bean.getState();
                String Cardowner = bean.getCard_owner();
                String Cardtype = bean.getCard_type();
                int Zip = bean.getZip_code();
                String Img = bean.getImg();
                
                 if(Username.equals(User)){
                
                txtUser.setText(Username);
                txtAddress.setText(Address);
                txtCNIC.setText(CNIC);
                txtCSC.setText(CSC);
                txtCardnumber.setText(Cardnum);
                txtCardowner.setText(Cardowner);
                txtCity.setText(City);
                txtCountry.setText(Country);
                txtEmail.setText(Email);
                txtExpire.setText(Expire);
                txtFirstname.setText(Firstname);
                txtLastname.setText(Lastname);
                txtPass.setText(Passowrd);
                txtState.setText(State);
                txtZip.setText(String.valueOf(Zip));
                txtCardtype.setText(Cardtype);
                txtGender.setText(Gender);
                
                
               
                if(!(Img == null)){
        
                int w = labelImg.getWidth();
                int h =labelImg.getHeight();    
                    
                ImageIcon icon = new ImageIcon(""+Img);
                Image imgs = icon.getImage();

                BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

                Graphics g = bi.createGraphics();
                g.drawImage(imgs, 0, 0, w, h, null);
        
               
                labelImg.setIcon(new ImageIcon(bi));
                }
                break;
             
                 }
        
        
            }    
        }
        catch(Exception e){e.printStackTrace();}
    
    }
    
    private static Connection con = null;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblgender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCardowner = new javax.swing.JTextField();
        txtCardnumber = new javax.swing.JTextField();
        txtCSC = new javax.swing.JTextField();
        txtExpire = new javax.swing.JTextField();
        txtCNIC = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtCardtype = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        labelWelcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelWelcome.setText("Welcome User");
        jPanel1.add(labelWelcome);
        labelWelcome.setBounds(230, 70, 210, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/back.png"))); // NOI18N
        jLabel8.setText("back to Search");
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1190, 120, 130, 40);

        labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/WelcomePic.png"))); // NOI18N
        jPanel1.add(labelPic);
        labelPic.setBounds(100, 10, 110, 110);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/up_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Last Name:");

        txtLastname.setEditable(false);
        txtLastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });

        txtFirstname.setEditable(false);
        txtFirstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Username:");

        txtUser.setEditable(false);
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Email id:");

        txtEmail.setEditable(false);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Password:");

        txtPass.setEditable(false);
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
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

        lblgender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblgender.setText("Gender:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Country:");

        txtCountry.setEditable(false);
        txtCountry.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCountryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCountryFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("City:");

        txtCity.setEditable(false);
        txtCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("State:");

        txtState.setEditable(false);
        txtState.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtState.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStateFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Zip code:");

        txtZip.setEditable(false);
        txtZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Street Address:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Credit Card Type:");

        txtCardowner.setEditable(false);
        txtCardowner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCardowner.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardownerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardownerFocusLost(evt);
            }
        });

        txtCardnumber.setEditable(false);
        txtCardnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCardnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardnumberFocusLost(evt);
            }
        });

        txtCSC.setEditable(false);
        txtCSC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCSC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCSCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCSCFocusLost(evt);
            }
        });
        txtCSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCSCActionPerformed(evt);
            }
        });

        txtExpire.setEditable(false);
        txtExpire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtExpire.setEnabled(false);
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

        txtCNIC.setEditable(false);
        txtCNIC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
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

        txtAddress.setEditable(false);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText(" Profile Picture:");

        labelImg.setBackground(new java.awt.Color(255, 255, 255));
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/userimg default.png"))); // NOI18N
        labelImg.setText("                150 x 150");
        labelImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/editimgs.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("CNIC Number:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Expiration date:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Security Code ( CSC ):");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Credit Card Number:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Credit Card Owner:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Account Details:");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 50));
        jLabel1.setText("edit");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 50));
        jLabel4.setText("edit");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 50));
        jLabel5.setText("edit");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 50));
        jLabel14.setText("edit");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 50));
        jLabel21.setText("edit");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 50));
        jLabel28.setText("edit");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 50));
        jLabel29.setText("edit");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 50));
        jLabel30.setText("edit");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(51, 51, 51));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 50));
        jLabel31.setText("edit");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 50));
        jLabel32.setText("edit");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 50));
        jLabel33.setText("edit");
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 50));
        jLabel34.setText("edit");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 50));
        jLabel35.setText("edit");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 50));
        jLabel36.setText("edit");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 50));
        jLabel37.setText("edit");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(51, 51, 51));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 50));
        jLabel38.setText("edit");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(51, 51, 51));
        jLabel39.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 50));
        jLabel39.setText("edit");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        txtGender.setEditable(false);
        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGenderFocusLost(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
        });

        txtCardtype.setEditable(false);
        txtCardtype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        txtCardtype.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCardtypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCardtypeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(57, 57, 57)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(txtExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCardowner, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblgender)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addComponent(txtCardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCardowner, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(txtCSC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 160, 1280, 520);

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

    private void txtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusGained
        txtLastname.setBackground(Color.decode("#cceffc"));
        txtLastname.setBorder(a);
    }//GEN-LAST:event_txtLastnameFocusGained

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        txtLastname.setBackground(b);
    }//GEN-LAST:event_txtLastnameFocusLost

    private void txtFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusGained
        txtFirstname.setBackground(Color.decode("#cceffc"));
        txtFirstname.setBorder(a);
    }//GEN-LAST:event_txtFirstnameFocusGained

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
        txtFirstname.setBackground(b);
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        txtUser.setBackground(Color.decode("#cceffc"));
        txtUser.setBorder(a);
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        txtUser.setBackground(b);
        
    }//GEN-LAST:event_txtUserFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBackground(Color.decode("#cceffc"));
        txtEmail.setBorder(a);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBackground(b);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setBackground(Color.decode("#cceffc"));
        txtPass.setBorder(a);
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        txtPass.setBackground(b);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

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

    private void txtZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtZip.setEditable(true);
        } else {
            txtZip.setEditable(false);
        }
    }//GEN-LAST:event_txtZipKeyPressed

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

    private void txtExpireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpireKeyTyped
        String exp = txtExpire.getText();
        int count = txtExpire.getText().length();

        if(count==4||count==7||count==11){txtExpire.setText(exp+"-");}
    }//GEN-LAST:event_txtExpireKeyTyped

    private void txtCNICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusGained
        txtCNIC.setBackground(Color.decode("#cceffc"));
        txtCNIC.setBorder(a);
    }//GEN-LAST:event_txtCNICFocusGained

    private void txtCNICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCNICFocusLost
        txtCNIC.setBackground(b);
    }//GEN-LAST:event_txtCNICFocusLost

    private void txtCNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCNICKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            txtCNIC.setEditable(true);
        } else {
            txtCNIC.setEditable(false);}
    }//GEN-LAST:event_txtCNICKeyPressed

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        txtAddress.setBackground(Color.decode("#cceffc"));
        txtAddress.setBorder(a);
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        txtAddress.setBackground(b);
    }//GEN-LAST:event_txtAddressFocusLost

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
            
            try{
            String query = "update Users set Img='"+f+"' where User_name='"+User+"'";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Update successful");
           }
           catch(Exception e){e.printStackTrace();}
            
        }

        else {
            File f = null;
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/editimgs hover.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/editimgs.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCSCActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        edit(jLabel1, txtUser, "User_name");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        edit(jLabel4, txtFirstname, "First_name");
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        edit(jLabel5, txtLastname, "Last_name");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        if(txtEmail.getText().matches(EMAIL_REGEX)== false && jLabel14.getText().equals("save") )
        {
        JOptionPane.showMessageDialog(this, "Invalid Email Address");
        }
        else{
        edit(jLabel14, txtEmail, "Email_id");}
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        edit(jLabel21, txtPass, "Password");
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        edit(jLabel28, txtCity, "City");
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        edit(jLabel29, txtCountry, "Country");
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        edit(jLabel30, txtState, "State");
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        edit(jLabel31, txtCNIC, "CNIC");
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        if(!(txtGender.getText().equals("Male") || txtGender.getText().equals("Female")) && jLabel32.getText().equals("save") )
        {
        JOptionPane.showMessageDialog(this, "Invalid Gender");
        }
        else{
        edit(jLabel32, txtGender, "Gender");}
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        edit(jLabel33, txtAddress, "Address");
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        edit(jLabel34, txtZip, "Zip_code");
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        if(!(txtCardtype.getText().equals("Visa Card") || txtCardtype.getText().equals("Master Card") || txtCardtype.getText().equals("AMX")) && jLabel14.getText().equals("save") )
        {
        JOptionPane.showMessageDialog(this, "Invalid Cardtype");
        }
        else{
        edit(jLabel35, txtCardtype, "Card_type");}
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        edit(jLabel36, txtCardowner, "Card_owner");
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        edit(jLabel37, txtCardnumber, "Card_number");
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        edit(jLabel38, txtExpire, "Expiry");
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        edit(jLabel39, txtCSC, "CSC");
    }//GEN-LAST:event_jLabel39MouseClicked

    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusGained
        txtGender.setBackground(Color.decode("#cceffc"));
        txtGender.setBorder(a);
    }//GEN-LAST:event_txtGenderFocusGained

    private void txtGenderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusLost
        txtGender.setBackground(b);
        
    }//GEN-LAST:event_txtGenderFocusLost

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtCardtypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardtypeFocusGained
        txtCardtype.setBackground(Color.decode("#cceffc"));
        txtCardtype.setBorder(a);
    }//GEN-LAST:event_txtCardtypeFocusGained

    private void txtCardtypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCardtypeFocusLost
        txtCardtype.setBackground(b);
        
    }//GEN-LAST:event_txtCardtypeFocusLost

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        UserPanel up =  new UserPanel();
        this.dispose();
        up.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelPic;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel lblgender;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCNIC;
    private javax.swing.JTextField txtCSC;
    private javax.swing.JTextField txtCardnumber;
    private javax.swing.JTextField txtCardowner;
    private javax.swing.JTextField txtCardtype;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExpire;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
