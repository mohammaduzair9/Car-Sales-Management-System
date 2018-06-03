package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class SearchCarnew extends javax.swing.JFrame {

    public SearchCarnew(String sMake,String sModel,String sBodytype,String sColor,String sCylinder,String sDoor,String sDrivetype,String sEnginesize,String sYearfrom,String sYearto,String sFueltype,String sKmfrom, String sKmto,String sPricemax,String sPricemin,String sSeats,String sTransmission) {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
       
        this.setResizable(true);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        
        String[][]row={{" "," "," " }};
        String []col = {"Car Id","Make","Model","Year","Km Travelled","Body type","Fuel type","Drive type","Color","Price(Rs)","Img"};
        
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
        // String nPricemax = "Your input";
         Matcher m = p.matcher(sPricemin);
         Matcher mm = p.matcher(sPricemax);
         sPricemin = m.replaceAll("");
         sPricemax = mm.replaceAll("");
         
         
         
         
         if (!(sCylinder.equals("Any Cylinders"))){ nCylinder = Integer.parseInt(sCylinder); }
         if (!(sDoor.equals("Any Doors"))){ nDoor = Integer.parseInt(sDoor); }
         if (!(sEnginesize.equals("Any Engine Size"))){ nEnginesize = Integer.parseInt(sEnginesize); }
         if (!(sKmfrom.equals("From"))){  nKmfrom = Integer.parseInt(sKmfrom); }
         if (!(sPricemax.equals("Max Price"))){ nPricemax = Integer.parseInt(sPricemax); }
         if (!(sPricemin.equals("Min Price"))){ nPricemin = Integer.parseInt(sPricemin); }
         if (!(sSeats.equals("Any Seating"))){  nSeats = Integer.parseInt(sSeats); }
         if (!(sYearfrom.equals("From"))){  nYearfrom = Integer.parseInt(sYearfrom); }
         if (!(sYearto.equals("To"))){  nYearto = Integer.parseInt(sYearto); }
         if (!(sKmto.equals("To"))){  nKmto = Integer.parseInt(sKmto); }
         
         
         
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
                 ((nYearfrom<=Year) || sYearfrom.equals("From")) &&
                 ((nYearto>=Year) || sYearto.equals("To")) &&
                 ((nKmfrom<=Km) || sKmfrom.equals("From")) &&
                 ((nKmto>=Km) || sKmto.equals("To"))     
                      
                  )  {  
                  ImageIcon icon = new ImageIcon(""+Img);
                Image img = icon.getImage();

                BufferedImage bi = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);

                Graphics g = bi.createGraphics();
                g.drawImage(img, 0, 0, 150, 150, null);

                ImageIcon image = new ImageIcon(bi);
                 
                 
              model.addRow(new Object[]{CarId,Make,Model,Year,Km,Bodytype,Fueltype,Drivetype,Color,Price,image});
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
        jLabel7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        tblsearch = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JLabel();
        btninsert = new javax.swing.JLabel();
        btndelete = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 0, 150, 150);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        panel.setLayout(null);

        tblResults.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        tblResults.setRowHeight(150);
        tblsearch.setViewportView(tblResults);

        panel.add(tblsearch);
        tblsearch.setBounds(40, 70, 1200, 370);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Search Results:");
        panel.add(jLabel5);
        jLabel5.setBounds(40, 30, 150, 30);

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

    private void btninsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseClicked
        AddCar ac = new AddCar();
        this.dispose();
    }//GEN-LAST:event_btninsertMouseClicked

    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        int selectedrow = tblResults.getSelectedRow();
        System.out.println(selectedrow);
        int selectedcol = tblResults.getSelectedColumn();
        System.out.println(selectedcol);
        String colname = tblResults.getColumnName(selectedcol);
        int newint;
        String newval;
        String cname = "";
        
      
        if(selectedrow==-1 || selectedcol==-1){
        
            JOptionPane.showMessageDialog(this, "Select a cell to update");
        }
        
        
        else if(selectedcol == 0){
             
            JOptionPane.showMessageDialog(this, "Car id cannot be changed");
            
        }
        
        else if(selectedcol==10){
        int Carid= Integer.parseInt(tblResults.getValueAt(selectedrow,0).toString());
        
            cname= "Img";
        
        int a=jFileChooser1.showOpenDialog(this);
         
        if(a==JFileChooser.APPROVE_OPTION){
        File f= jFileChooser1.getSelectedFile();
        
        try {
            
                String query = "update Cars set "+cname+"='"+f+"' where Id="+Carid ;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
                
            tblResults.getModel().setValueAt(f, selectedrow, selectedcol);
            JOptionPane.showMessageDialog(this, "Value Updated");
           
           }
        catch(Exception e){e.printStackTrace();}
                
                
        }}
        
        else if(selectedcol==1||selectedcol==2||selectedcol==5||selectedcol==6||selectedcol==7||selectedcol==8){
            int Carid= Integer.parseInt(tblResults.getValueAt(selectedrow,0).toString());
        
         newval = JOptionPane.showInputDialog(this, "Enter the new value");
            try {
                
                if(selectedcol==1){cname="Make";}
                if(selectedcol==2){cname="Model";}
                if(selectedcol==5){cname="Body_type";}
                if(selectedcol==6){cname="Fuel_type";}
                if(selectedcol==7){cname="Drive_type";}
                if(selectedcol==8){cname="Color";}
                
                String query = "update Cars set "+cname+"='"+newval+"' where Id="+Carid ;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
       
            tblResults.getModel().setValueAt(newval, selectedrow, selectedcol);    
            JOptionPane.showMessageDialog(this, "Value Updated");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}
        }
        
        else if(selectedcol==3||selectedcol==4||selectedcol==9){
           int Carid= Integer.parseInt(tblResults.getValueAt(selectedrow,0).toString());
         
                if(selectedcol==3){cname="Year";}
                if(selectedcol==4){cname="Km";}
                if(selectedcol==9){cname="Price";}
            
            
         newint = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the new value"));
            try {
            
                String query = "update Cars set "+cname+"="+newint+" where Id="+Carid ;
                Statement st = DatabaseManager.con.createStatement();
                st.executeUpdate(query);
       
            tblResults.getModel().setValueAt(newint, selectedrow, selectedcol);    
            JOptionPane.showMessageDialog(this, "Value Updated");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}
        }
        
    }//GEN-LAST:event_btnupdateMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        int selectedrow = tblResults.getSelectedRow();
        System.out.println(selectedrow);

        
        if(selectedrow==-1){
        
            JOptionPane.showMessageDialog(this, "Select a row to be deleted");
        }
        else{
        try{
            
            int CarId = Integer.parseInt(tblResults.getModel().getValueAt(selectedrow, 0).toString());
            
            String query = "Delete from Cars where Id="+CarId;
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
            ((DefaultTableModel) tblResults.getModel()).removeRow(selectedrow);
            
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
            
        }
        catch(Exception e){e.printStackTrace();}
        
        
        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btninsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseEntered
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btninsert hover.png")));
    }//GEN-LAST:event_btninsertMouseEntered

    private void btninsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninsertMouseExited
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btninsert.png")));
    }//GEN-LAST:event_btninsertMouseExited

    private void btnupdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseEntered
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnupdate hover.png")));
    }//GEN-LAST:event_btnupdateMouseEntered

    private void btnupdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseExited
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnupdate.png")));
    }//GEN-LAST:event_btnupdateMouseExited

    private void btndeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseEntered
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndelete hover.png")));
    }//GEN-LAST:event_btndeleteMouseEntered

    private void btndeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseExited
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndelete.png")));
    }//GEN-LAST:event_btndeleteMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         SearchCar sc = new SearchCar();
            this.dispose();
           
            sc.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel41MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btndelete;
    private javax.swing.JLabel btninsert;
    private javax.swing.JLabel btnupdate;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblResults;
    private javax.swing.JScrollPane tblsearch;
    // End of variables declaration//GEN-END:variables

}
