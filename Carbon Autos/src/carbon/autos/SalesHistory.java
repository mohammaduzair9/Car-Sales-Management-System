package carbon.autos;

import com.sun.jmx.snmp.BerDecoder;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class SalesHistory extends javax.swing.JFrame {

    String[][]row={{" "," "," " }};
    String []col = {"Sales Id","Date of Sale","Car Make"," Car Model","Year Made","Color","Price(Rs)","Buyer Name","Buyer CNIC","Creditcard Number"};
        
    DefaultTableModel model =new DefaultTableModel(row,col);
    
    public SalesHistory() {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        this.setResizable(false);
        
        
        
        
        tblResults.setModel(model);
        tblResults.getTableHeader().setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 13));
        tblResults.setRowSelectionAllowed(true);
        tblResults.getTableHeader().setForeground(Color.decode("#333333"));
        
        tblResults.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblResults.getColumnModel().getColumn(1).setPreferredWidth(140);
        tblResults.getColumnModel().getColumn(4).setPreferredWidth(45);
        tblResults.getColumnModel().getColumn(3).setPreferredWidth(90);
        tblResults.getColumnModel().getColumn(9).setPreferredWidth(100);
        
        

        cmbMonth.setForeground(Color.decode("#333333"));
        cmbMonth.setBackground(Color.decode("#ffffff"));
        
        cmbYear.setForeground(Color.decode("#333333"));
        cmbYear.setBackground(Color.decode("#ffffff"));
        
        Object childb = cmbMonth.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupb = (BasicComboPopup)childb;
        JList listb = popupb.getList();
        listb.setSelectionBackground(Color.decode("#ffffff"));
        
        Object child = cmbYear.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popup = (BasicComboPopup)child;
        JList listc = popup.getList();
        listc.setSelectionBackground(Color.decode("#ffffff"));
        
        while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                } 
        
        
        
        try
        { 
           
            ArrayList listSales = DatabaseManager.getSales();
            for(int a=0;a<listSales.size();a++){
                
                SalesBean sBean = (SalesBean)listSales.get(a);
                
                int Sales_Id = sBean.getId();
                int Users_Id = sBean.getUserId();
                int Cars_Id = sBean.getCarId();
                String Date = sBean.getDate();
                
                ArrayList listCar = DatabaseManager.getCars();
            
                for(int i=0; i<listCar.size(); i++){
               
                    CarBean cBean = (CarBean)listCar.get(i);
                
                    int CarId = cBean.getId();
                    String Make = cBean.getMake();
                    String Model = cBean.getModel();
                    int Year = cBean.getYear();
                    String Color = cBean.getColors();
                    int Price= cBean.getPrice();
            
                    if(CarId==Cars_Id){
                    
                        ArrayList listUser = DatabaseManager.getUsers();
                        
                        for(int j=0; j<listUser.size(); j++){
                        
                            UserBean uBean = (UserBean)listUser.get(j);
                            
                            int UserId = uBean.getId();
                            String Username = uBean.getUser_name();
                            String CNIC = uBean.getCNIC();
                            String CreditCard_num = uBean.getCard_number();
                        
                            if(UserId==Users_Id){
                            
                           model.addRow(new Object[]{Sales_Id,Date,Make,Model,Year,Color,Price,Username,CNIC,CreditCard_num});    
                    
                            }
                            
                        }
                        
                    }
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

        jCheckBox37 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        cmbMonth = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Month:");

        tblResults.setAutoCreateRowSorter(true);
        tblResults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sales Id", "Date of Sale", "Car Make", "Car Model", "Year Made", "Color", "Price", "Buyer Name", "Buyer CNIC", "Buyer Credit Card Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResults.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblResults.setRowHeight(30);
        tblResults.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tblResults);

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmbMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        cmbMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbMonthFocusLost(evt);
            }
        });
        cmbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonthActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Year:");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "2013", "2014", "2015", "2016" }));
        cmbYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 191, 254)));
        cmbYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbYearFocusLost(evt);
            }
        });
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 1280, 520);

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

    private void cmbYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbYearFocusGained
        cmbYear.setBackground(Color.decode("#cceffc"));
    }//GEN-LAST:event_cmbYearFocusGained

    private void cmbYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbYearFocusLost
        cmbYear.setBackground(Color.decode("#ffffff"));
    }//GEN-LAST:event_cmbYearFocusLost

    private void cmbMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMonthFocusGained
       cmbMonth.setBackground(Color.decode("#cceffc"));
    }//GEN-LAST:event_cmbMonthFocusGained

    private void cmbMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMonthFocusLost
        cmbMonth.setBackground(Color.decode("#ffffff"));
    }//GEN-LAST:event_cmbMonthFocusLost

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
       while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                }  
        String YearSale="- Select -";
        int MonthSale=0;
        
        if(!(cmbYear.getSelectedItem().toString().equals("- Select -"))){
         YearSale = cmbYear.getSelectedItem().toString();
        }
        if(!(cmbMonth.getSelectedItem().toString().equals("- Select -")))
        {
         MonthSale=cmbMonth.getSelectedIndex();
        }
        
        
        try
        { 
           
            ArrayList listSales = DatabaseManager.getSales();
            for(int a=0;a<listSales.size();a++){
                
                SalesBean sBean = (SalesBean)listSales.get(a);
                
                int Sales_Id = sBean.getId();
                int Users_Id = sBean.getUserId();
                int Cars_Id = sBean.getCarId();
                String Dated = sBean.getDate();
                String Date = Dated.substring(0,4);
                int Month = Integer.parseInt(Dated.substring(5,7));
                
               
                
                ArrayList listCar = DatabaseManager.getCars();
            
                for(int i=0; i<listCar.size(); i++){
               
                    CarBean cBean = (CarBean)listCar.get(i);
                
                    int CarId = cBean.getId();
                    String Make = cBean.getMake();
                    String Model = cBean.getModel();
                    int Year = cBean.getYear();
                    String Color = cBean.getColors();
                    int Price= cBean.getPrice();
            
                    if(CarId==Cars_Id && (Date.equals(YearSale) || YearSale.equals("- Select -")) && (Month==MonthSale || MonthSale==0))
                    {
                    
                        ArrayList listUser = DatabaseManager.getUsers();
                        
                        for(int j=0; j<listUser.size(); j++){
                        
                            UserBean uBean = (UserBean)listUser.get(j);
                            
                            int UserId = uBean.getId();
                            String Username = uBean.getUser_name();
                            String CNIC = uBean.getCNIC();
                            String CreditCard_num = uBean.getCard_number();
                        
                            if(UserId==Users_Id){
                            
                           model.addRow(new Object[]{Sales_Id,Dated,Make,Model,Year,Color,Price,Username,CNIC,CreditCard_num});    
                    
                            }
                            
                        }
                        
                    }
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
        
        
        
    }//GEN-LAST:event_cmbYearActionPerformed

    private void cmbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonthActionPerformed
         while (tblResults.getRowCount() > 0) {
                    ((DefaultTableModel) tblResults.getModel()).removeRow(0);
                }  
        String YearSale="- Select -";
        int MonthSale=0;
        
        if(!(cmbYear.getSelectedItem().toString().equals("- Select -"))){
         YearSale = cmbYear.getSelectedItem().toString();
        }
        if(!(cmbMonth.getSelectedItem().toString().equals("- Select -")))
        {   MonthSale=cmbMonth.getSelectedIndex();
        }
        
        
        try
        { 
           
            ArrayList listSales = DatabaseManager.getSales();
            for(int a=0;a<listSales.size();a++){
                
                SalesBean sBean = (SalesBean)listSales.get(a);
                
                int Sales_Id = sBean.getId();
                int Users_Id = sBean.getUserId();
                int Cars_Id = sBean.getCarId();
                String Dated = sBean.getDate();
                String Date = Dated.substring(0,4);
                int Month = Integer.parseInt(Dated.substring(5,7));
                
               
                
                ArrayList listCar = DatabaseManager.getCars();
            
                for(int i=0; i<listCar.size(); i++){
               
                    CarBean cBean = (CarBean)listCar.get(i);
                
                    int CarId = cBean.getId();
                    String Make = cBean.getMake();
                    String Model = cBean.getModel();
                    int Year = cBean.getYear();
                    String Color = cBean.getColors();
                    int Price= cBean.getPrice();
            
                    if(CarId==Cars_Id && (Date.equals(YearSale) || YearSale.equals("- Select -")) && (Month==MonthSale || MonthSale==0))
                    {
                    
                        ArrayList listUser = DatabaseManager.getUsers();
                        
                        for(int j=0; j<listUser.size(); j++){
                        
                            UserBean uBean = (UserBean)listUser.get(j);
                            
                            int UserId = uBean.getId();
                            String Username = uBean.getUser_name();
                            String CNIC = uBean.getCNIC();
                            String CreditCard_num = uBean.getCard_number();
                        
                            if(UserId==Users_Id){
                            
                           model.addRow(new Object[]{Sales_Id,Dated,Make,Model,Year,Color,Price,Username,CNIC,CreditCard_num});    
                    
                            }
                            
                        }
                        
                    }
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
        
    }//GEN-LAST:event_cmbMonthActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResults;
    // End of variables declaration//GEN-END:variables
}
