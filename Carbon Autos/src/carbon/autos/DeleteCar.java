package carbon.autos;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DeleteCar extends javax.swing.JFrame{

    public DeleteCar() {
        initComponents();
        setTitle("Carbon Autos");
        setVisible(true);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        this.setResizable(false);
        
        jLabel14.setEnabled(false);
        
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel2.setBackground(Color.decode("#ffffff"));
        
        cmbModel.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 1));
        cmbMake.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 1));
        cmbYearfrom.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 1));
        
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel5.setBackground(Color.decode("#ffffff"));
        
        tblResults.setModel(model);
         
    }
       
   
         String[][]row={{"","","","","","",""}};
         String []col = {"Make","Model","Year","Km Travelled","Color","Price","Img"};
            
        DefaultTableModel model =new DefaultTableModel(row,col);


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox37 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbMake = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbModel = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbYearfrom = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jCheckBox37.setText("jCheckBox37");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 0, 150, 150);

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Make:");

        cmbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "AUDI", "BMW", "CHEVROLET", "FORD", "HONDA", "HYUNDAI", "KIA", "MAZDA", "NISSAN", "SUZUKI", "TOYOTA", " " }));
        cmbMake.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMakeItemStateChanged(evt);
            }
        });
        cmbMake.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbMakeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbMakeFocusLost(evt);
            }
        });
        cmbMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMakeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Year Made:");

        cmbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -" }));
        cmbModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbModelFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Model:");

        cmbYearfrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997" }));
        cmbYearfrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbYearfromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbYearfromFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Search the car you want to delete");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("AND");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("AND");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnsrch.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cmbModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbYearfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbYearfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 1280, 200);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Search Result:");

        tblResults.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        tblResults.setRowHeight(110);
        jScrollPane2.setViewportView(tblResults);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndel.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE))
                .addGap(72, 72, 72))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 380, 1280, 260);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -130, 1920, 980);

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Air Conditioning");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(0, 0, 95, 17);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1100, 380, 150, 40);

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

    private void cmbMakeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMakeItemStateChanged
       
    }//GEN-LAST:event_cmbMakeItemStateChanged

    private void cmbMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMakeActionPerformed
      cmbModel.removeAllItems();
      cmbModel.addItem("-Select -");
      
        
        String choose = cmbMake.getSelectedItem().toString();
        
        try
        { 
           ArrayList list = DatabaseManager.getCars();
           for(int i=0; i<list.size(); i++){
               
                CarBean bean = (CarBean)list.get(i);
                
                String Make=bean.getMake();
                String Model=bean.getModel();
                
                if(choose.equals(Make)){
                    cmbModel.addItem(Model);
                }
           
           }
           
        }
        catch(Exception e){e.printStackTrace();}
        
    }//GEN-LAST:event_cmbMakeActionPerformed

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

    private void cmbMakeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusGained
        cmbMake.setBackground(Color.decode("#cceffc"));
        
    }//GEN-LAST:event_cmbMakeFocusGained

    private void cmbMakeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusLost
        cmbMake.setBackground(Color.decode("#ffffff"));
    }//GEN-LAST:event_cmbMakeFocusLost

    private void cmbModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusGained
        cmbModel.setBackground(Color.decode("#cceffc"));
        
    }//GEN-LAST:event_cmbModelFocusGained

    private void cmbModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusLost
        cmbModel.setBackground(Color.decode("#ffffff"));
    }//GEN-LAST:event_cmbModelFocusLost

    private void cmbYearfromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbYearfromFocusGained
        cmbYearfrom.setBackground(Color.decode("#cceffc"));
        
    }//GEN-LAST:event_cmbYearfromFocusGained

    private void cmbYearfromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbYearfromFocusLost
        cmbYearfrom.setBackground(Color.decode("#ffffff"));
    }//GEN-LAST:event_cmbYearfromFocusLost

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                } 
         String Makes=cmbMake.getSelectedItem().toString();
         String Models = cmbModel.getSelectedItem().toString();
          
         int years=0;
         if(!(cmbYearfrom.getSelectedItem().toString().equals("- Select -")))
                 {years = Integer.parseInt(cmbYearfrom.getSelectedItem().toString());}
         
        
         
        if (Makes.equals("- Select -") || cmbYearfrom.getSelectedItem().toString().equals("- Select -")){
          
         
            
            JOptionPane.showMessageDialog(this, "Please enter Make, Model & Year of the Car you want to delete");
                
                
                
                 }

        else {
            
            try
        { 
           ArrayList list = DatabaseManager.getCars();
                       
                
                           
                for(int i=0; i<list.size(); i++){
                CarBean bean = (CarBean)list.get(i);
                
                String Make = bean.getMake();
                String Model = bean.getModel();
                int Year = bean.getYear();
                int Km = bean.getKm();
                String Color = bean.getColors();
                int Price= bean.getPrice();
                String Img = bean.getImg();
                   
                
              if(Makes.equals(Make)&&(Models.equals(Model)||Models.equals("Any Model"))&&years==Year){
                                
                model.addRow(new Object[]{Make,Model,Year,Km,Color,Price,Img});
                 jLabel14.setEnabled(true);
                
               }}}
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
            
            }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
         try {
            String Make=cmbMake.getSelectedItem().toString();
            String Model = cmbModel.getSelectedItem().toString();
            int year = Integer.parseInt(cmbYearfrom.getSelectedItem().toString());
                
            String query = "delete from Cars where Make ='"+Make+"' AND Model = '"+Model+"' AND YEAR ="+year;
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);

           
            
            model.removeRow(0);

            JOptionPane.showMessageDialog(this, "Car deleted succesfully");
            jLabel14.setEnabled(false);

        }
        catch
        (Exception exe){exe.printStackTrace();}
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnsrch hover.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btnsrch.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndel hover.png")));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/btndel hover.png")));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbMake;
    private javax.swing.JComboBox cmbModel;
    private javax.swing.JComboBox cmbYearfrom;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables
}
