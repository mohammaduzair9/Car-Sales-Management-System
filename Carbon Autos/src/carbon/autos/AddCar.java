package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboPopup;

public class AddCar extends javax.swing.JFrame {

    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff"); 
    Color r =Color.red;
    
    public AddCar() {
        initComponents();
       
        setTitle("Carbon Autos");
        
        setVisible(true);
        
        this.setResizable(false);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
       

        chkAc.setBackground(c);
        chkAc.setForeground(c);
        chkAirbag.setBackground(c);
        chkBrake.setBackground(c);
        chkCentrallocking.setBackground(c);
        chkClothtrim.setBackground(c);
        chkEngine.setBackground(c);
        chkHeadlights.setBackground(c);
        chkHillholder.setBackground(c);
        chkLeatherSW.setBackground(c);
        chkLock.setBackground(c);
        chkMap.setBackground(c);
        chkMobile.setBackground(c);
        chkPark.setBackground(c);
        chkPowermirror.setBackground(c);
        chkPowersteering.setBackground(c);
        chkRearspoiler.setBackground(c);
        chkTripcomp.setBackground(c);
        chkUsb.setBackground(c);
        chkWiper.setBackground(c);
        
        
        txtColor.setBorder(a);
        txtEngine.setBorder(a);
        txtKm.setBorder(a);
        txtModel.setBorder(a);
        txtPrice.setBorder(a);
        spnCylinder.setBorder(a);
        spnDoor.setBorder(a);
        spnSeat.setBorder(a);
        spnYear.setBorder(a);
        cmbBody.setBorder(a);
        cmbDrive.setBorder(a);
        cmbFuel.setBorder(a);
        cmbMake.setBorder(a);
        cmbTransmision.setBorder(a);
        
        
        txtColor.setBackground(b);
        txtEngine.setBackground(b);
        txtKm.setBackground(b);
        txtModel.setBackground(b);
        txtPrice.setBackground(b);
        cmbBody.setBackground(b);
        cmbDrive.setBackground(b);
        cmbFuel.setBackground(b);
        cmbMake.setBackground(b);
        cmbTransmision.setBackground(b);
        
        
        Object childb = cmbBody.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupb = (BasicComboPopup)childb;
        JList listb = popupb.getList();
        listb.setSelectionBackground(b);
        
        Object childd = cmbDrive.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupd = (BasicComboPopup)childd;
        JList dlist = popupd.getList();
        dlist.setSelectionBackground(b);
        
        Object childf = cmbFuel.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup fpopup = (BasicComboPopup)childf;
        JList flist = fpopup.getList();
        flist.setSelectionBackground(b);
        
        Object childm = cmbMake.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup mpopup = (BasicComboPopup)childm;
        JList mlist = mpopup.getList();
        mlist.setSelectionBackground(b);
        
        Object child = cmbTransmision.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popup = (BasicComboPopup)child;
        JList list = popup.getList();
        list.setSelectionBackground(b);
        
        ((JSpinner.NumberEditor)spnCylinder.getEditor()).getTextField().setBackground(b);
        ((JSpinner.NumberEditor)spnDoor.getEditor()).getTextField().setBackground(b);
        ((JSpinner.NumberEditor)spnSeat.getEditor()).getTextField().setBackground(b);
        ((JSpinner.NumberEditor)spnYear.getEditor()).getTextField().setBackground(b);
        
        txtColor.setForeground(f);
        txtEngine.setForeground(f);
        txtKm.setForeground(f);
        txtModel.setForeground(f);
        txtPrice.setForeground(f);
        cmbBody.setForeground(f);
        cmbDrive.setForeground(f);
        cmbFuel.setForeground(f);
        cmbMake.setForeground(f);
        cmbTransmision.setForeground(f);
        spnCylinder.setForeground(f);
        spnDoor.setForeground(f);
        spnSeat.setForeground(f);
        spnYear.setForeground(f);
        
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel3.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        
        jPanel2.setBackground(Color.decode("#ffffff"));
        jPanel5.setBackground(Color.decode("#ffffff"));
        jPanel3.setBackground(Color.decode("#ffffff"));
    
        
        labelImg.setOpaque(true);
        labelImg.setBackground(Color.decode("#cceffc"));
    
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        txtEngine = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cmbMake = new javax.swing.JComboBox();
        spnYear = new javax.swing.JSpinner();
        cmbBody = new javax.swing.JComboBox();
        cmbFuel = new javax.swing.JComboBox();
        cmbDrive = new javax.swing.JComboBox();
        spnCylinder = new javax.swing.JSpinner();
        spnDoor = new javax.swing.JSpinner();
        spnSeat = new javax.swing.JSpinner();
        cmbTransmision = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chkAc = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        chkLock = new javax.swing.JCheckBox();
        chkBrake = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        chkPowersteering = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        chkPowermirror = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        chkMobile = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        chkTripcomp = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        chkCentrallocking = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        chkRearspoiler = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        chkPark = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        chkHillholder = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        chkEngine = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        chkClothtrim = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        chkAirbag = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        chkUsb = new javax.swing.JCheckBox();
        jLabel37 = new javax.swing.JLabel();
        chkWiper = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        chkMap = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        chkLeatherSW = new javax.swing.JCheckBox();
        jLabel40 = new javax.swing.JLabel();
        chkHeadlights = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dd = new javax.swing.JLabel();

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

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(50, 0, 150, 150);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_head.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 130);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Seats:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Drive Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Vehicle Details :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Body Type:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Make:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Year:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cylinders:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Engine Size:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Doors:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Price:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Transmision:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Kilometres Travelled:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Colors:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Colors:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Fuel Type:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Model:");

        txtModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtModelFocusLost(evt);
            }
        });
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });

        txtKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKmFocusLost(evt);
            }
        });
        txtKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKmKeyPressed(evt);
            }
        });

        txtEngine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEngineFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEngineFocusLost(evt);
            }
        });
        txtEngine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEngineKeyPressed(evt);
            }
        });

        txtColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColorFocusLost(evt);
            }
        });

        cmbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "AUDI", "BMW", "CHEVROLET", "LAMBORGHINI", "HONDA", "HYUNDAI", "KIA", "MAZDA", "NISSAN", "DAIHATSU", "SUZUKI", "TOYOTA" }));
        cmbMake.setBorder(null);
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

        spnYear.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2014), null, null, Integer.valueOf(1)));
        spnYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spnYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnYearFocusLost(evt);
            }
        });

        cmbBody.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "Convertible", "Coupe", "Hatch back", "Sedan", "SUV", "Luxury", "MUV", "Mini van", "Hybrid" }));
        cmbBody.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbBodyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbBodyFocusLost(evt);
            }
        });
        cmbBody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBodyActionPerformed(evt);
            }
        });

        cmbFuel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "Petrol", "Diesel", "LPG", "CNG" }));
        cmbFuel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbFuelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbFuelFocusLost(evt);
            }
        });
        cmbFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuelActionPerformed(evt);
            }
        });

        cmbDrive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "4WD", "Front", "Rear" }));
        cmbDrive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbDriveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbDriveFocusLost(evt);
            }
        });
        cmbDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDriveActionPerformed(evt);
            }
        });

        spnCylinder.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spnCylinder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spnCylinderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnCylinderFocusLost(evt);
            }
        });

        spnDoor.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spnDoor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spnDoorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnDoorFocusLost(evt);
            }
        });

        spnSeat.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spnSeat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spnSeatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnSeatFocusLost(evt);
            }
        });

        cmbTransmision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select -", "Automatic", "Manual" }));
        cmbTransmision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbTransmisionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTransmisionFocusLost(evt);
            }
        });
        cmbTransmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTransmisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 104, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57))
                            .addComponent(txtPrice)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnYear)
                            .addComponent(cmbBody, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbFuel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDrive, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnCylinder)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSeat)
                            .addComponent(txtColor)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEngine)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnDoor)
                            .addComponent(cmbTransmision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKm))))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel17))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEngine, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(spnYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnDoor)
                            .addComponent(cmbBody, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSeat)
                            .addComponent(cmbFuel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnCylinder)
                    .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 660, 520);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Vehicle Features :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Air Conditioning");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Brake Assist");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Power Steering");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Power Mirror");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Mobile Phone Connectivity");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Trip Computer");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Central Locking");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Rear Spoiler");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Parking Distance Control");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Hill Holder");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Engine Immobilizer");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Cloth Trim");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Dual Airbag Package");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Usb Input Socket");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Intermittent Wipers");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Map/Reading Lamps");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Leather Steering Wheel");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Halogen Headlights");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Anti Lock Braking");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkEngine)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkHillholder)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkCentrallocking)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkTripcomp)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkPowermirror)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkPowersteering)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkBrake)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkAc)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkPark)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkRearspoiler)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(chkLock)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkHeadlights)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkLeatherSW)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkMap)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkWiper)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkUsb)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkAirbag)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkClothtrim)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkMobile)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkLock, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBrake, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPowersteering, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPowermirror, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTripcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCentrallocking, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRearspoiler, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPark, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkHillholder, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkClothtrim, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAirbag, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkUsb, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkWiper, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMap, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkLeatherSW, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkHeadlights, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(720, 150, 250, 520);

        labelImg.setBackground(new java.awt.Color(255, 255, 255));
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addcar default.png"))); // NOI18N
        labelImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimg.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(1000, 150, 330, 390);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addcar.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1000, 580, 330, 90);

        dd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_bg.jpg"))); // NOI18N
        jPanel1.add(dd);
        dd.setBounds(0, -130, 1920, 980);

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

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void cmbBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBodyActionPerformed

    private void cmbFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuelActionPerformed

    private void cmbDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDriveActionPerformed

    private void cmbTransmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTransmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTransmisionActionPerformed

    private void cmbMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMakeActionPerformed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtPrice.setEditable(true);
        } else {
        txtPrice.setEditable(false);
        
    };
    }//GEN-LAST:event_txtPriceKeyPressed

    private void txtKmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmKeyPressed
        
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtKm.setEditable(true);
        } else {
        txtKm.setEditable(false);}
    }//GEN-LAST:event_txtKmKeyPressed

    private void txtEngineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEngineKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        txtEngine.setEditable(true);
        } else {
        txtEngine.setEditable(false);}
    }//GEN-LAST:event_txtEngineKeyPressed

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        txtPrice.setBackground(Color.decode("#cceffc"));
        txtPrice.setBorder(a);
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtKmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKmFocusGained
        txtKm.setBackground(Color.decode("#cceffc"));
        txtKm.setBorder(a);
    }//GEN-LAST:event_txtKmFocusGained

    private void txtEngineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEngineFocusGained
        txtEngine.setBackground(Color.decode("#cceffc"));
        txtEngine.setBorder(a);
    }//GEN-LAST:event_txtEngineFocusGained

    private void txtColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColorFocusGained
        txtColor.setBackground(Color.decode("#cceffc"));
        txtColor.setBorder(a);
    }//GEN-LAST:event_txtColorFocusGained

    private void spnDoorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnDoorFocusGained
        ((JSpinner.NumberEditor)spnDoor.getEditor()).getTextField().setBackground(Color.decode("#cceffc"));
        spnDoor.setBorder(a);
    }//GEN-LAST:event_spnDoorFocusGained

    private void spnSeatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnSeatFocusGained
        ((JSpinner.NumberEditor)spnSeat.getEditor()).getTextField().setBackground(Color.decode("#cceffc"));
        spnSeat.setBorder(a);
    }//GEN-LAST:event_spnSeatFocusGained

    private void cmbTransmisionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransmisionFocusGained
        cmbTransmision.setBackground(Color.decode("#cceffc"));
        cmbTransmision.setBorder(a);
    }//GEN-LAST:event_cmbTransmisionFocusGained

    private void cmbDriveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusGained
        cmbDrive.setBackground(Color.decode("#cceffc"));
        cmbDrive.setBorder(a);
    }//GEN-LAST:event_cmbDriveFocusGained

    private void spnCylinderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnCylinderFocusGained
        ((JSpinner.NumberEditor)spnCylinder.getEditor()).getTextField().setBackground(Color.decode("#cceffc"));
        spnCylinder.setBorder(a);
    }//GEN-LAST:event_spnCylinderFocusGained

    private void cmbFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusGained
        cmbFuel.setBackground(Color.decode("#cceffc"));
        cmbFuel.setBorder(a);
    }//GEN-LAST:event_cmbFuelFocusGained

    private void cmbBodyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusGained
        cmbBody.setBackground(Color.decode("#cceffc"));
        cmbBody.setBorder(a);
    }//GEN-LAST:event_cmbBodyFocusGained

    private void spnYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnYearFocusGained
        System.out.println("saasas");
        ((JSpinner.NumberEditor)spnYear.getEditor()).getTextField().setBackground(b);
        spnYear.setBorder(a);
    }//GEN-LAST:event_spnYearFocusGained

    private void txtModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModelFocusLost
        txtModel.setBackground(b);
    }//GEN-LAST:event_txtModelFocusLost

    private void txtModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtModelFocusGained
        txtModel.setBackground(Color.decode("#cceffc"));
        txtModel.setBorder(a);
    }//GEN-LAST:event_txtModelFocusGained

    private void cmbMakeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusGained
        cmbMake.setBackground(Color.decode("#cceffc"));
        cmbMake.setBorder(a);
    }//GEN-LAST:event_cmbMakeFocusGained

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

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void cmbBodyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusLost
        cmbBody.setBackground(b);
    }//GEN-LAST:event_cmbBodyFocusLost

    private void cmbMakeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusLost
        cmbMake.setBackground(b);
    }//GEN-LAST:event_cmbMakeFocusLost

    private void spnYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnYearFocusLost
        spnYear.setBackground(b);
    }//GEN-LAST:event_spnYearFocusLost

    private void cmbFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusLost
        cmbFuel.setBackground(b);
    }//GEN-LAST:event_cmbFuelFocusLost

    private void cmbDriveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusLost
        cmbDrive.setBackground(b);
    }//GEN-LAST:event_cmbDriveFocusLost

    private void spnCylinderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnCylinderFocusLost
        spnCylinder.setBackground(b);
    }//GEN-LAST:event_spnCylinderFocusLost

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        txtPrice.setBackground(b);
    }//GEN-LAST:event_txtPriceFocusLost

    private void txtKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKmFocusLost
        txtKm.setBackground(b);
    }//GEN-LAST:event_txtKmFocusLost

    private void txtEngineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEngineFocusLost
        txtEngine.setBackground(b);
    }//GEN-LAST:event_txtEngineFocusLost

    private void spnDoorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnDoorFocusLost
        spnDoor.setBackground(b);
    }//GEN-LAST:event_spnDoorFocusLost

    private void spnSeatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnSeatFocusLost
        spnSeat.setBackground(b);
    }//GEN-LAST:event_spnSeatFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
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
            
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimg hover.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addimg.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        
        String take = labelImg.getIcon().toString();
        String chk = take.substring(take.length()-20);
        
        System.out.println(chk);
        
        
        if(cmbMake.getSelectedItem().toString().equals("- Select -") ||
           cmbBody.getSelectedItem().toString().equals("- Select -") ||
           cmbDrive.getSelectedItem().toString().equals("- Select -") ||
           cmbFuel.getSelectedItem().toString().equals("- Select -") ||
           cmbTransmision.getSelectedItem().toString().equals("- Select -") ||
           txtColor.getText().equals("") ||     
           txtEngine.getText().equals("") ||     
           txtKm.getText().equals("") ||
           txtModel.getText().equals("") ||
           txtPrice.getText().equals("")       
                )
        {     
            if(cmbMake.getSelectedItem().toString().equals("- Select -")){
            cmbMake.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(cmbBody.getSelectedItem().toString().equals("- Select -")){
            cmbBody.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(cmbDrive.getSelectedItem().toString().equals("- Select -")){
            cmbDrive.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(cmbFuel.getSelectedItem().toString().equals("- Select -")){
            cmbFuel.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(cmbTransmision.getSelectedItem().toString().equals("- Select -")){
            cmbTransmision.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(txtColor.getText().equals("")){
            txtColor.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(txtEngine.getText().equals("")){
            txtEngine.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(txtKm.getText().equals("")){
            txtKm.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(txtModel .getText().equals("")){
            txtModel.setBorder(BorderFactory.createLineBorder(r));
            }
            
            if(txtPrice.getText().equals("")){
            txtPrice.setBorder(BorderFactory.createLineBorder(r));
            }
                
           
                }
        
        
        
        else if(chk.equals("addcar%20default.png"))
        {
        
        JOptionPane.showMessageDialog(this, "Please insert an image of car");
        }

        else{
        
        String Make = cmbMake.getSelectedItem().toString();
        String Model = txtModel.getText();
        int Year = (Integer) spnYear.getValue();
        String Body_type = cmbBody.getSelectedItem().toString();
        String Fuel_type = cmbFuel.getSelectedItem().toString();
        String Drive_type = cmbDrive.getSelectedItem().toString();
        int Cylinder = (Integer) spnCylinder.getValue();
        int Price = Integer.parseInt(txtPrice.getText());
        int Km = Integer.parseInt(txtKm.getText());
        int Engine_size = Integer.parseInt(txtEngine.getText());
        int Doors = (Integer) spnDoor.getValue();
        int Seats = (Integer) spnSeat.getValue();
        String Transmission = cmbTransmision.getSelectedItem().toString();
        String Colors = txtColor.getText();
        boolean Air_Conditioning = chkAc.isSelected();
        boolean Dual_airbag = chkAirbag.isSelected();
        boolean Brake_assist = chkBrake.isSelected();
        boolean Central_locking = chkCentrallocking.isSelected();
        boolean Cloth_trim = chkClothtrim.isSelected();
        boolean Engine_immobilizer = chkEngine.isSelected();
        boolean Halogen_headlights = chkHeadlights.isSelected();
        boolean Hill_holder = chkHillholder.isSelected();
        boolean Leather_steering_wheel = chkLeatherSW.isSelected();
        boolean Anti_lock_braking = chkLock.isSelected();
        boolean Map_reading_lamps = chkMap.isSelected();
        boolean Mobole_phone_con = chkMobile.isSelected();
        boolean Parking_distance_cont = chkPark.isSelected();
        boolean Power_mirror = chkPowermirror.isSelected();
        boolean Power_steering = chkPowersteering.isSelected();
        boolean Rear_spoiler = chkRearspoiler.isSelected();
        boolean Trip_comp = chkTripcomp.isSelected();
        boolean Usb_input = chkUsb.isSelected();
        boolean intermittenr_wipers = chkWiper.isSelected();
        String img = jFileChooser1.getSelectedFile().toString();
        
        
        System.out.println(Make+"','"+Model+"',"+Year+",'"+Body_type+"','"+Fuel_type+"','"+Drive_type+"',"+Cylinder+","+Price+","+Km+","+Engine_size+","+Doors+","+Seats+",'"+Transmission+"','"+Colors+"','"+Air_Conditioning+"','"+Anti_lock_braking+"','"+Brake_assist+"','"+Power_steering+"','"+Power_mirror+"','"+Mobole_phone_con+"','"+Trip_comp+"','"+Central_locking+"','"+Rear_spoiler+"','"+Parking_distance_cont+"','"+Hill_holder+"','"+Engine_immobilizer+"','"+Cloth_trim+"','"+Dual_airbag+"','"+Usb_input+"','"+intermittenr_wipers+"','"+Map_reading_lamps+"','"+Leather_steering_wheel+"','"+Halogen_headlights+"','"+img);
      
        
        try {
            String query = "insert into Cars (Make,Model,Year,Body_type,Fuel_type,Drive_type,Cylinder,Price,Km,Engine_size,Doors,Seats,Transmission,Color,Air_conditioning,Anti_lock_braking,Brake_assist,Power_steering,Power_mirror,Mobile_phone_con,Trip_comp,Central_lock,Rear_spoiler,Parking_distance_cont,Hill_holder,Engine_immobilizer,Cloth_trim,Dual_airbag,Usb_input,Intermittent_wipers,Map_reading_lamps,Leather_steering_wheel,Halogen_headlights,Img) values ('"+Make+"','"+Model+"',"+Year+",'"+Body_type+"','"+Fuel_type+"','"+Drive_type+"',"+Cylinder+","+Price+","+Km+","+Engine_size+","+Doors+","+Seats+",'"+Transmission+"','"+Colors+"','"+Air_Conditioning+"','"+Anti_lock_braking+"','"+Brake_assist+"','"+Power_steering+"','"+Power_mirror+"','"+Mobole_phone_con+"','"+Trip_comp+"','"+Central_locking+"','"+Rear_spoiler+"','"+Parking_distance_cont+"','"+Hill_holder+"','"+Engine_immobilizer+"','"+Cloth_trim+"','"+Dual_airbag+"','"+Usb_input+"','"+intermittenr_wipers+"','"+Map_reading_lamps+"','"+Leather_steering_wheel+"','"+Halogen_headlights+"','"+img+"')";
            Statement st = DatabaseManager.con.createStatement();
            st.executeUpdate(query);
            
            txtColor.setText("");
            txtEngine.setText("");
            txtKm.setText("");
            txtModel.setText("");
            txtPrice.setText("");
            spnCylinder.setValue(0);
            spnDoor.setValue(0);
            spnSeat.setValue(0);
            spnYear.setValue(2014);
            cmbBody.setSelectedItem("- Select -");
            cmbDrive.setSelectedItem("- Select -");
            cmbFuel.setSelectedItem("- Select -");
            cmbMake.setSelectedItem("- Select -");
            cmbTransmision.setSelectedItem("- Select -");
            labelImg.setIcon(null);
            chkAc.setSelected(false);
            chkAirbag.setSelected(false);
            chkBrake.setSelected(false);
            chkCentrallocking.setSelected(false);
            chkClothtrim.setSelected(false);
            chkEngine.setSelected(false);
            chkHeadlights.setSelected(false);
            chkHillholder.setSelected(false);
            chkLeatherSW.setSelected(false);
            chkLock.setSelected(false);
            chkMap.setSelected(false);
            chkMobile.setSelected(false);
            chkPark.setSelected(false);
            chkPowermirror.setSelected(false);
            chkPowersteering.setSelected(false);
            chkRearspoiler.setSelected(false);
            chkTripcomp.setSelected(false);
            chkUsb.setSelected(false);
            chkWiper.setSelected(false);
            JOptionPane.showMessageDialog(this, "Car Added Succesfully!");
           
           }
        catch
            (Exception exe){exe.printStackTrace();}
        
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addcar hover.png")));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/addcar.png")));
    }//GEN-LAST:event_jLabel21MouseExited

    private void txtColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColorFocusLost
        txtColor.setBackground(b);
    }//GEN-LAST:event_txtColorFocusLost

    private void cmbTransmisionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransmisionFocusLost
        cmbTransmision.setBackground(b);
    }//GEN-LAST:event_cmbTransmisionFocusLost

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel41MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAc;
    private javax.swing.JCheckBox chkAirbag;
    private javax.swing.JCheckBox chkBrake;
    private javax.swing.JCheckBox chkCentrallocking;
    private javax.swing.JCheckBox chkClothtrim;
    private javax.swing.JCheckBox chkEngine;
    private javax.swing.JCheckBox chkHeadlights;
    private javax.swing.JCheckBox chkHillholder;
    private javax.swing.JCheckBox chkLeatherSW;
    private javax.swing.JCheckBox chkLock;
    private javax.swing.JCheckBox chkMap;
    private javax.swing.JCheckBox chkMobile;
    private javax.swing.JCheckBox chkPark;
    private javax.swing.JCheckBox chkPowermirror;
    private javax.swing.JCheckBox chkPowersteering;
    private javax.swing.JCheckBox chkRearspoiler;
    private javax.swing.JCheckBox chkTripcomp;
    private javax.swing.JCheckBox chkUsb;
    private javax.swing.JCheckBox chkWiper;
    private javax.swing.JComboBox cmbBody;
    private javax.swing.JComboBox cmbDrive;
    private javax.swing.JComboBox cmbFuel;
    private javax.swing.JComboBox cmbMake;
    private javax.swing.JComboBox cmbTransmision;
    private javax.swing.JLabel dd;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelImg;
    private javax.swing.JSpinner spnCylinder;
    private javax.swing.JSpinner spnDoor;
    private javax.swing.JSpinner spnSeat;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngine;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
