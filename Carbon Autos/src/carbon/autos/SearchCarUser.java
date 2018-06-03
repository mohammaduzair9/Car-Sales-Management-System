package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;



public class SearchCarUser extends javax.swing.JFrame {

    static String User;
    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff");
    int Card_number =0;
    
    
    public SearchCarUser(String sMake,String sModel,String sBodytype,String sColor,String sCylinder,String sDoor,String sDrivetype,String sEnginesize,String sYearfrom,String sYearto,String sFueltype,String sKmfrom, String sKmto,String sPricemax,String sPricemin,String sSeats,String sTransmission,String allow) {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
       
        this.setResizable(true);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        User = MainUser.getMainUser();
        labelWelcome.setText("Welcome "+User);

        
        
        try
        { 
           ArrayList list = DatabaseManager.getUsers();
            for(int i=0; i<list.size(); i++){
                UserBean bean = (UserBean)list.get(i);
                String Img = bean.getImg();
                String User_name = bean.getUser_name();
                
                if(User_name.equals(User)){
                    System.out.println("sda");
                    if(!(Img == null)){
                        int w = labelPic.getWidth();
                        int h =labelPic.getHeight();    
                    
                        ImageIcon icon = new ImageIcon(""+Img);
                        Image imgs = icon.getImage();
                        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
                        Graphics g = bi.createGraphics();
                        g.drawImage(imgs, 0, 0, w, h, null);
        
                        labelPic.setIcon(new ImageIcon(bi));
                        break;
                    }
                  
                }
            }
        }
        catch(Exception e){e.printStackTrace();}
        
        
        String[][]row={{" "," "," " }};
        String []col = {"Car Id","Make","Model","Year","Km Travelled","Body type","Fuel type","Drive type","Color","Price (Rs)","Img"};
        
        panel.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        panel.setBackground(Color.decode("#ffffff"));
        
      

        DefaultTableModel model =new DefaultTableModel(row,col){
            @Override
        public boolean isCellEditable(int row, int column) {       
        return false;
        }};
        tblResults.setModel(model);
        tblResults.getTableHeader().setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 13));
        tblResults.setRowSelectionAllowed(true);
        tblResults.getTableHeader().setForeground(Color.decode("#333333"));
        tblResults.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblResults.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblResults.getColumnModel().getColumn(9).setPreferredWidth(70);
        tblResults.getColumnModel().getColumn(10).setPreferredWidth(150);
        tblResults.setRowMargin(5);
       
               
        
         while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                } 
         int nCylinder=0;
         int nDoor=0;
         int nEnginesize=0;
         int nKmfrom=0;
         int nKmto=0;
         int nPricemax=0;
         int nPricemin=0;
         int nSeats=0;
         int nYearfrom=0;
         int nYearto=0;
         
         String regex = "(?<=[\\d])(,)(?=[\\d])";
         Pattern p = Pattern.compile(regex);
      
         Matcher m = p.matcher(sPricemin);
         Matcher mm = p.matcher(sPricemax);
         sPricemin = m.replaceAll("");
         sPricemax = mm.replaceAll("");
         
         
         
         
         if (!(sCylinder.equals("Any Cylinders"))){ nCylinder = Integer.parseInt(sCylinder); }
         if (!(sDoor.equals("Any Doors"))){ nDoor = Integer.parseInt(sDoor); }
         if (!(sEnginesize.equals("Any Engine Size"))){ nEnginesize = Integer.parseInt(sEnginesize); }
         if (!(sKmfrom.equals("Km From"))){  nKmfrom = Integer.parseInt(sKmfrom); }
         if (!(sPricemax.equals("Max Price"))){ nPricemax = Integer.parseInt(sPricemax); }
         if (!(sPricemin.equals("Min Price"))){ nPricemin = Integer.parseInt(sPricemin); }
         if (!(sSeats.equals("Any Seating"))){  nSeats = Integer.parseInt(sSeats); }
         if (!(sYearfrom.equals("Year From"))){  nYearfrom = Integer.parseInt(sYearfrom); }
         if (!(sYearto.equals("Year To"))){  nYearto = Integer.parseInt(sYearto); }
         if (!(sKmto.equals("Km To"))){  nKmto = Integer.parseInt(sKmto); }
         
         
        
        try
        { 
           ArrayList list = DatabaseManager.getCars();
                       
            for(int i=0; i<list.size(); i++){
               
                CarBean bean = (CarBean)list.get(i);
                int CarId = bean.getId();
                String Make = bean.getMake();
                String Model = bean.getModel();
                int Year = bean.getYear();
                int Km = bean.getKm();
                String Color = bean.getColors();
                int Price= bean.getPrice();
                String Img = bean.getImg();
               
                String Bodytype = bean.getBodeytype();
                int Cylinder = bean.getCylinder();
                int Doors = bean.getDoors();
                String Drivetype = bean.getDrivetype();
                int Enginesize = bean.getEnginesize();
                String Fueltype = bean.getFueltype();
                int Seats = bean.getSeats();
                String Transmission = bean.getTrans();
                 
              if(
                 (
                    (sBodytype.equals(Bodytype)|| sBodytype.equals("Any Body Type") )&&
                    (sColor.equals(Color) || sColor.equals("Any Color")) &&
                    (nCylinder==Cylinder || sCylinder.equals("Any Cylinders") )&&
                    (nDoor==Doors || sDoor.equals("Any Doors")) &&
                    (sDrivetype.equals(Drivetype) || sDrivetype.equals("Any Wheel Drive")) &&
                    (nEnginesize==Enginesize || sEnginesize.equals("Any Engine Size")) &&
                    (sFueltype.equals(Fueltype) || sFueltype.equals("Any Fuel")) &&
                    (sMake.equals(Make) || sMake.equals("Any Make")) &&
                    (sModel.equals(Model) || sModel.equals("Any Model")) &&
                    (nSeats==Seats || sSeats.equals("Any Seating")) &&
                    (sTransmission.equals(Transmission) || sTransmission.equals("Any Transmission")) &&
                    ((nPricemin<=Price) || sPricemin.equals("Min Price")) &&
                    ((nPricemax>=Price) || sPricemax.equals("Max Price")) &&
                    ((nYearfrom<=Year) || sYearfrom.equals("Year From")) &&
                    ((nYearto>=Year) || sYearto.equals("Year To")) &&
                    ((nKmfrom<=Km) || sKmfrom.equals("Km From")) &&
                    ((nKmto>=Km) || sKmto.equals("Km To"))  
               ) || (
                     allow.equals("yes")&&(sMake.equals(Make)) 
                    )
                 || (
                     allow.equals("yes")&&(sFueltype.equals(Fueltype)) 
                    )
                 || (
                     allow.equals("yes")&&(sBodytype.equals(Bodytype)) 
                    )
               )
                         
                      
                   {    
                      
                   ImageIcon icon = new ImageIcon(Img);
                         
              model.addRow(new Object[]{CarId,Make,Model,Year,Km,Bodytype,Fueltype,Drivetype,Color,Price,Img});
             
               }}}
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        defaults.put("Table.alternateRowColor", Color.decode("#EFFBFB"));
        
         if(model.getRowCount()<1){JOptionPane.showMessageDialog(this, "No Records Found");}
     
        
        
       
        
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        tblsearch = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        btnBuy = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

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

        labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/WelcomePic.png"))); // NOI18N
        jPanel1.add(labelPic);
        labelPic.setBounds(100, 10, 110, 110);

        labelWelcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelWelcome.setText("Welcome User");
        jPanel1.add(labelWelcome);
        labelWelcome.setBounds(230, 70, 210, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/SearchCars.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 120, 310, 90);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1140, 60, 190, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/back.png"))); // NOI18N
        jLabel3.setText("back to Search");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1189, 120, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/up_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 190, 239), 3));
        panel.setLayout(null);

        tblResults.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        tblResults.setRowHeight(150);
        tblsearch.setViewportView(tblResults);

        panel.add(tblsearch);
        tblsearch.setBounds(50, 100, 1190, 370);

        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Buycar.png"))); // NOI18N
        btnBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuyMouseExited(evt);
            }
        });
        panel.add(btnBuy);
        btnBuy.setBounds(1050, 20, 193, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/view.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        panel.add(jLabel5);
        jLabel5.setBounds(830, 20, 200, 50);

        jPanel1.add(panel);
        panel.setBounds(50, 160, 1270, 500);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
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

    private void btnBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseClicked
        int selectedrow = tblResults.getSelectedRow();
        
        if(selectedrow==-1){
            JOptionPane.showMessageDialog(this, "Select a Car to buy");
        }
        else{
            
          int Car_id = Integer.parseInt(tblResults.getValueAt(selectedrow, 0).toString());
    System.out.println("1"); 
            try{ 
                ArrayList list = DatabaseManager.getUsers();
    
                for(int i=0; i<list.size(); i++){
                UserBean bean = (UserBean)list.get(i);
                int User_id = bean.getId();
                String User_name = bean.getUser_name();
                String Card_num = bean.getCard_number();
              
                    if(User_name.equals(User)){
    
                        if(Card_num.equals("")){
                            JOptionPane.showMessageDialog(this, "Please provide a valid Credit Card Number in your Profile to Buy a car!");
                        }
                        else{
                            try{ 
     
            String query = "insert into Sales (Date,User_id,Car_id) values (GETDATE(),"+User_id+","+Car_id+")";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(this, "Car booked Successfully!");
                                }
                            catch(Exception e){e.printStackTrace();}
                        }
                    }
                  
                }
            }
        
        catch(Exception e){e.printStackTrace();}
        }    
        
    }//GEN-LAST:event_btnBuyMouseClicked

    private void btnBuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseEntered
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Buycar hover.png")));
    }//GEN-LAST:event_btnBuyMouseEntered

    private void btnBuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseExited
        btnBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Buycar.png")));
    }//GEN-LAST:event_btnBuyMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         UserPanel up =  new UserPanel();
         this.dispose();
         up.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ProfileSetting pro = new ProfileSetting();
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile hover.png")));

    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int selectedrow = tblResults.getSelectedRow();
        if(selectedrow==-1){
        JOptionPane.showMessageDialog(this, "Select a car to view");
        }
        else{
        int Id = Integer.parseInt(tblResults.getValueAt(selectedrow, 0).toString());
        OneCar one = new OneCar(Id);
        this.dispose();}
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/view hover.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/view.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuy;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPic;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblResults;
    private javax.swing.JScrollPane tblsearch;
    // End of variables declaration//GEN-END:variables

}
