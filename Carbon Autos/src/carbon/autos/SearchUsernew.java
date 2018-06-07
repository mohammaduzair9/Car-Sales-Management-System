package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class SearchUsernew extends javax.swing.JFrame {
    
   public SearchUsernew(String sFirstname,String sLastname,String sUsername,String sEmailid,String sGender,String sCountry,String sCity,String sState,String sCardnumber,String sCNIC) {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        
              
        setVisible(true);
        
        this.setResizable(false);
        
        panel.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        panel.setBackground(Color.decode("#ffffff"));
        
        tblResults.getTableHeader().setForeground(Color.decode("#333333"));
        
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        String[][]row={{" "," "," " }};
        String []col = {"User Id","Firstname","Lastname","Username","Email","Gender","City","State","Country","CNIC","Cardnumber","Image"};
        
        DefaultTableModel model =new DefaultTableModel(row,col){
        

   @Override
   public boolean isCellEditable(int row, int column) {       
       return false;
   }
};
        
        tblResults.setModel(model);
        tblResults.getTableHeader().setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 13));
        
        tblResults.setRowSelectionAllowed(true);
        
        tblResults.setSize(500, 500);
        
       //  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblResults.getColumnModel().getColumn(0).setPreferredWidth(35);
        tblResults.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblResults.getColumnModel().getColumn(5).setPreferredWidth(35);
        tblResults.getColumnModel().getColumn(6).setPreferredWidth(60);
        tblResults.getColumnModel().getColumn(7).setPreferredWidth(60);
        tblResults.getColumnModel().getColumn(8).setPreferredWidth(60);
        
        
        tblResults.setRowMargin(3);
                
        while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                }
        
         
        try
        { 
           ArrayList list = DatabaseManager.getUsers();
           
           
           
            for(int i=0; i<list.size(); i++){
                UserBean bean = (UserBean)list.get(i);
                int Userid = bean.getId();
                String Firstname = bean.getFirst_name();
                String Lastname = bean.getLast_name();
                String Username = bean.getUser_name();
                String Email = bean.getEmail_id();
                String Gender = bean.getGender();
                String City = bean.getCity();
                String State =  bean.getState();
                String Country = bean.getCountry();
                String CNIC = bean.getCNIC();
                String Cardnum = bean.getCard_number(); 
                String Img = bean.getImg();
                
              if(
                 (sFirstname.equals(Firstname)|| sFirstname.equals("") )&&
                 (sLastname.equals(Lastname)|| sLastname.equals("") )&&   
                 (sUsername.equals(Username)|| sUsername.equals("") )&&
                 (sEmailid.equals(Email)|| sEmailid.equals("") )&&
                 (sGender.equals(Gender)|| sGender.equals("Any") )&&  
                 (sCity.equals(City)|| sCity.equals("") )&&
                 (sCountry.equals(Country)|| sCountry.equals("") )&&
                 (sState.equals(State)|| sState.equals("") )&&     
                 (sCardnumber.equals(Cardnum)|| sCardnumber.equals("")) &&     
                 (sCNIC.equals(CNIC) || sCNIC.equals(""))  
                )    
                      
                {
                    
                     

                ImageIcon icon = new ImageIcon(""+Img);
                Image img = icon.getImage();

                BufferedImage bi = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);

                Graphics g = bi.createGraphics();
                g.drawImage(img, 0, 0, 150, 150, null);

                ImageIcon image = new ImageIcon(bi);
                
               

                             
              model.addRow(new Object[]{Userid,Firstname,Lastname,Username,Email,Gender,City,State,Country,CNIC,Cardnum,image});
              }
            
            
            }
        
           
            
        
        }
        
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
        jLabel42 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        tblsearch = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btndelete = new javax.swing.JLabel();
        btninsert = new javax.swing.JLabel();
        btnupdate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

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

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/back.png"))); // NOI18N
        jLabel4.setText("back to Search");
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1170, 120, 130, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 0, 150, 150);

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

        panel.setLayout(null);

        tblResults.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        tblResults.setRowHeight(150);
        tblsearch.setViewportView(tblResults);

        panel.add(tblsearch);
        tblsearch.setBounds(49, 91, 1190, 350);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Search Results:");
        panel.add(jLabel5);
        jLabel5.setBounds(50, 20, 150, 30);

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndelete.png"))); // NOI18N
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndeleteMouseExited(evt);
            }
        });
        panel.add(btndelete);
        btndelete.setBounds(1100, 20, 140, 40);

        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btninsert.png"))); // NOI18N
        btninsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninsertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btninsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btninsertMouseExited(evt);
            }
        });
        panel.add(btninsert);
        btninsert.setBounds(780, 20, 140, 40);

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnupdate.png"))); // NOI18N
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnupdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnupdateMouseExited(evt);
            }
        });
        panel.add(btnupdate);
        btnupdate.setBounds(940, 20, 140, 40);

        jPanel1.add(panel);
        panel.setBounds(40, 170, 1280, 470);

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         SearchUser su = new SearchUser();
            this.dispose();
           
            su.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        int selectedrow = tblResults.getSelectedRow();
        System.out.println(selectedrow);

        if(selectedrow==-1){

            JOptionPane.showMessageDialog(this, "Select a row to be deleted");
        }
        else{
            try{

                int UserId = Integer.parseInt(tblResults.getModel().getValueAt(selectedrow, 0).toString());

                String query = "Delete from Users where Id="+UserId;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
                ((DefaultTableModel) tblResults.getModel()).removeRow(selectedrow);

                JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");

            }
            catch(Exception e){e.printStackTrace();}

        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btndeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseEntered
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndelete hover.png")));
    }//GEN-LAST:event_btndeleteMouseEntered

    private void btndeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseExited
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndelete.png")));
    }//GEN-LAST:event_btndeleteMouseExited

    private void btninsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseClicked
        AddUser au = new AddUser();
        this.dispose();
    }//GEN-LAST:event_btninsertMouseClicked

    private void btninsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseEntered
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btninsert hover.png")));
    }//GEN-LAST:event_btninsertMouseEntered

    private void btninsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseExited
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btninsert.png")));
    }//GEN-LAST:event_btninsertMouseExited

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        int selectedrow = tblResults.getSelectedRow();
        System.out.println(selectedrow);
        int selectedcol = tblResults.getSelectedColumn();
        System.out.println(selectedcol);
        String colname = tblResults.getColumnName(selectedcol);
        String newval;
        String cname = "";
        
      
        if(selectedrow==-1 || selectedcol==-1){
        
            JOptionPane.showMessageDialog(this, "Select a cell to update");
        }
        
        
        else if(selectedcol == 0){
             
            JOptionPane.showMessageDialog(this, "User id cannot be changed");
            
        }
        
        else if(selectedcol==11){
        int Userid= Integer.parseInt(tblResults.getValueAt(selectedrow,0).toString());
        
            cname= "Img";
        
        int a=jFileChooser1.showOpenDialog(this);
         
        if(a==JFileChooser.APPROVE_OPTION){
        File f= jFileChooser1.getSelectedFile();
        
        try {
            
                String query = "update Users set "+cname+"='"+f+"' where Id="+Userid ;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
                
            tblResults.getModel().setValueAt(f, selectedrow, selectedcol);
            JOptionPane.showMessageDialog(this, "Value Updated");
           
           }
        catch(Exception e){e.printStackTrace();}
                
                
        }}
        
        
        else if((selectedcol>0) && (selectedcol<11)){
           int Carid= Integer.parseInt(tblResults.getValueAt(selectedrow,0).toString());
         
                if(selectedcol==1){cname="First_name";}
                if(selectedcol==2){cname="Last_name";}
                if(selectedcol==3){cname="User_name";}
                if(selectedcol==4){cname="Email_id";}
                if(selectedcol==5){cname="Gender";}
                if(selectedcol==6){cname="City";}
                if(selectedcol==7){cname="State";}
                if(selectedcol==8){cname="Country";}
                if(selectedcol==9){cname="CNIC";}
                if(selectedcol==9){cname="Card_number";}
            
            
         newval = JOptionPane.showInputDialog(this, "Enter the new value");
         String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
         
         if(!((selectedcol==4 && !newval.matches(EMAIL_REGEX)) || (selectedcol==5 && !(newval.equals("Male")||newval.equals("Female"))))){
             System.out.println("s");
             
             try {
            
                String query = "update Users set "+cname+"='"+newval+"' where Id="+Carid ;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
       
            tblResults.getModel().setValueAt(newval, selectedrow, selectedcol);    
            JOptionPane.showMessageDialog(this, "Value Updated");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}
        }
        else{JOptionPane.showMessageDialog(this, "Invalid data");}
        }
        
    }//GEN-LAST:event_btnupdateMouseClicked

    private void btnupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseEntered
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnupdate hover.png")));
    }//GEN-LAST:event_btnupdateMouseEntered

    private void btnupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseExited
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnupdate.png")));
    }//GEN-LAST:event_btnupdateMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btndelete;
    private javax.swing.JLabel btninsert;
    private javax.swing.JLabel btnupdate;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblResults;
    private javax.swing.JScrollPane tblsearch;
    // End of variables declaration//GEN-END:variables
}
