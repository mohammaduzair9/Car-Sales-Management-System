package carbon.autos;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboPopup;

public class SearchCar extends javax.swing.JFrame {

    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff");
    
    public SearchCar() {
        initComponents();
                   
        setTitle("Carbon Autos");
        
        setVisible(true);
        
        this.setResizable(false);
        
        Toolkit kit = this.getToolkit();
        Dimension d = kit.getScreenSize();
        setSize(d.width, d.height-43);
        
        cmbBody.setForeground(f);
        cmbBody.setBorder(a);      
        cmbBody.setBackground(b);
        
        cmbColor.setForeground(f);
        cmbColor.setBorder(a);      
        cmbColor.setBackground(b);
        
        cmbCylinder.setForeground(f);
        cmbCylinder.setBorder(a);      
        cmbCylinder.setBackground(b);
        
        cmbDoor.setForeground(f);
        cmbDoor.setBorder(a);      
        cmbDoor.setBackground(b);
        
        cmbDrive.setForeground(f);
        cmbDrive.setBorder(a);      
        cmbDrive.setBackground(b);
        
        cmbEngine.setForeground(f);
        cmbEngine.setBorder(a);      
        cmbEngine.setBackground(b);
        
        cmbFrom.setForeground(f);
        cmbFrom.setBorder(a);      
        cmbFrom.setBackground(b);
        
        cmbFuel.setForeground(f);
        cmbFuel.setBorder(a);      
        cmbFuel.setBackground(b);
        
        cmbMake .setForeground(f);
        cmbMake.setBorder(a);      
        cmbMake.setBackground(b);
        
        cmbModel.setForeground(f);
        cmbModel.setBorder(a);      
        cmbModel.setBackground(b);
        
        cmbPricemax.setForeground(f);
        cmbPricemax.setBorder(a);      
        cmbPricemax.setBackground(b);
        
        cmbPricemin.setForeground(f);
        cmbPricemin.setBorder(a);      
        cmbPricemin.setBackground(b);
        
        cmbSeats.setForeground(f);
        cmbSeats.setBorder(a);      
        cmbSeats.setBackground(b);
        
        cmbTo.setForeground(f);
        cmbTo.setBorder(a);      
        cmbTo.setBackground(b);
        
        cmbTrans.setForeground(f);
        cmbTrans.setBorder(a);      
        cmbTrans.setBackground(b);
        
        cmbkmfrom.setForeground(f);
        cmbkmfrom.setBorder(a);      
        cmbkmfrom.setBackground(b);
        
        cmbkmto.setForeground(f);
        cmbkmto.setBorder(a);      
        cmbkmto.setBackground(b);
        
        
        Object childb = cmbBody.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupb = (BasicComboPopup)childb;
        JList listb = popupb.getList();
        listb.setSelectionBackground(b);
        
        Object child = cmbColor.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popup = (BasicComboPopup)child;
        JList list = popup.getList();
        list.setSelectionBackground(b);
        
        Object childa = cmbCylinder.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupa = (BasicComboPopup)childa;
        JList lista = popupa.getList();
        lista.setSelectionBackground(b);
        
        Object childc = cmbDoor.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupc = (BasicComboPopup)childc;
        JList listc = popupc.getList();
        listc.setSelectionBackground(b);
        
        Object childd = cmbDrive.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupd = (BasicComboPopup)childd;
        JList listd = popupd.getList();
        listd.setSelectionBackground(b);
        
        Object childe = cmbEngine.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupe = (BasicComboPopup)childe;
        JList liste = popupe.getList();
        liste.setSelectionBackground(b);
        
        Object childf = cmbFrom.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupf = (BasicComboPopup)childf;
        JList listf = popupf.getList();
        listf.setSelectionBackground(b);
        
        Object childg = cmbFuel.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupg = (BasicComboPopup)childg;
        JList listg = popupg.getList();
        listg.setSelectionBackground(b);
        
        Object childh = cmbMake.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popuph = (BasicComboPopup)childh;
        JList listh = popuph.getList();
        listh.setSelectionBackground(b);
        
        Object childj = cmbModel.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupj = (BasicComboPopup)childj;
        JList listj = popupj.getList();
        listj.setSelectionBackground(b);
        
        Object childba = cmbPricemax.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupba = (BasicComboPopup)childba;
        JList listba = popupba.getList();
        listba.setSelectionBackground(b);
        
        Object childbs = cmbPricemin.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbs = (BasicComboPopup)childbs;
        JList listbs = popupbs.getList();
        listbs.setSelectionBackground(b);
        
        Object childbd = cmbBody.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbd = (BasicComboPopup)childbd;
        JList listbd = popupbd.getList();
        listbd.setSelectionBackground(b);
        
        Object childbc = cmbSeats.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbc = (BasicComboPopup)childbc;
        JList listbc = popupbc.getList();
        listbc.setSelectionBackground(b);
        
        Object childbz= cmbTo.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbz = (BasicComboPopup)childbz;
        JList listbz = popupbz.getList();
        listbz.setSelectionBackground(b);
        
        Object childbx = cmbTrans.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbx = (BasicComboPopup)childbx;
        JList listbx = popupbx.getList();
        listbx.setSelectionBackground(b);
        
        Object childbq = cmbkmfrom.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbq = (BasicComboPopup)childbq;
        JList listbq = popupbq.getList();
        listbq.setSelectionBackground(b);
        
        Object childbe = cmbkmto.getAccessibleContext().getAccessibleChild(0);
        BasicComboPopup popupbe = (BasicComboPopup)childbe;
        JList listbe = popupbe.getList();
        listbe.setSelectionBackground(b);
        
        
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.decode("#00bffe"), 2));
        jPanel2.setBackground(Color.decode("#ffffff"));
        
    }

       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox37 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbMake = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbModel = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbFrom = new javax.swing.JComboBox();
        cmbTo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbPricemin = new javax.swing.JComboBox();
        cmbPricemax = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbTrans = new javax.swing.JComboBox();
        cmbSeats = new javax.swing.JComboBox();
        cmbDoor = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbFuel = new javax.swing.JComboBox();
        cmbBody = new javax.swing.JComboBox();
        cmbDrive = new javax.swing.JComboBox();
        cmbCylinder = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbEngine = new javax.swing.JComboBox();
        cmbColor = new javax.swing.JComboBox();
        cmbkmfrom = new javax.swing.JComboBox();
        cmbkmto = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
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

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 0, 150, 150);

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

        cmbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Make", "AUDI", "BMW", "CHEVROLET", "LAMBORGHINI", "HONDA", "HYUNDAI", "KIA", "MAZDA", "NISSAN", "SUZUKI", "TOYOTA", "DAIHATSU", " " }));
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

        cmbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Model" }));
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

        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cmbFrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbFromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbFromFocusLost(evt);
            }
        });

        cmbTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "To", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cmbTo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbToFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbToFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Price:");

        cmbPricemin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Min Price", "1,00,000", "2,50,000", "5,00,000", "10,00,000", "15,00,000", "25,00,000", "30,00,000", "35,00,000", "40,00,000", "50,00,000", "75,00,000", "1,00,00,000" }));
        cmbPricemin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbPriceminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbPriceminFocusLost(evt);
            }
        });

        cmbPricemax.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Max Price", "1,00,000", "2,50,000", "5,00,000", "10,00,000", "15,00,000", "25,00,000", "30,00,000", "35,00,000", "40,00,000", "50,00,000", "75,00,000", "1,00,00,000" }));
        cmbPricemax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbPricemaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbPricemaxFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Transmission:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Kilometres:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Seats:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Doors:");

        cmbTrans.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Transmission", "Automatic", "Manual" }));
        cmbTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTransFocusLost(evt);
            }
        });
        cmbTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTransActionPerformed(evt);
            }
        });

        cmbSeats.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Seating", "2", "3", "4", "5", "6", "7", "8", "9", "10 ", " " }));
        cmbSeats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbSeatsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSeatsFocusLost(evt);
            }
        });

        cmbDoor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Doors", "0", "1", "2", "3", "4", "5", "6", " " }));
        cmbDoor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbDoorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbDoorFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Fuel Type:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Body Type:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Drive Type:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Cylinders:");

        cmbFuel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Fuel", "Diesel", "Leaded", "LPG", "CNG", "Unleaded", "Premium Leaded", "Other" }));
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

        cmbBody.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Body Type", "Convertible", "Coupe", "Luxury", "Hatchback", "Minivan", "Sedan", "SUV", "MUV", "Hybrid" }));
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

        cmbDrive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Wheel Drive", "4WD", "Front", "Rear" }));
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

        cmbCylinder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Cylinders", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbCylinder.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCylinderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbCylinderFocusLost(evt);
            }
        });
        cmbCylinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCylinderActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Engine Size (cc):");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Color:");

        cmbEngine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Engine Size", "600", "800", "1000", "1200", "1400", "1600", "1800", "2000", "2200", "2400", "2600", "2800", "3000 " }));
        cmbEngine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbEngineFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbEngineFocusLost(evt);
            }
        });
        cmbEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEngineActionPerformed(evt);
            }
        });

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Color", "Biege", "Black", "Blue", "Bronze", "Brown", "Custom", "Gold", "Green", "Grey", "Magenta", "Maroon", "Orange", "Pink", "Purple", "Red", "Silver", "White", "Yellow", "Other" }));
        cmbColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbColorFocusLost(evt);
            }
        });
        cmbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColorActionPerformed(evt);
            }
        });

        cmbkmfrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From", "1000", "2500", "5000", "10000", "15000", "25000", "40000", "50000", "100000", "500000", "999999" }));
        cmbkmfrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbkmfromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbkmfromFocusLost(evt);
            }
        });

        cmbkmto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "To", "1000", "2500", "5000", "10000", "15000", "25000", "40000", "50000", "100000", "500000", "999999" }));
        cmbkmto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbkmtoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbkmtoFocusLost(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/findcar.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbFuel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTrans, 0, 199, Short.MAX_VALUE)
                    .addComponent(cmbMake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEngine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBody, 0, 200, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbkmfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbkmto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSeats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbDrive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPricemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbPricemax, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDoor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPricemin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPricemax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbkmfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbkmto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBody, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 150, 1280, 500);

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
        home.setBounds(30, 70, 118, 40);

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

    private void cmbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbColorActionPerformed

    private void cmbEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEngineActionPerformed

    private void cmbCylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCylinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCylinderActionPerformed

    private void cmbDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDriveActionPerformed

    private void cmbBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBodyActionPerformed

    private void cmbFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuelActionPerformed

    private void cmbTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTransActionPerformed

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         String sMake = cmbMake.getSelectedItem().toString();
        String sModel = cmbModel.getSelectedItem().toString();
        String sBodytype= cmbBody.getSelectedItem().toString();
        String sColor = cmbColor.getSelectedItem().toString();
        String sCylinder = cmbCylinder.getSelectedItem().toString();
        String sDoor = cmbDoor.getSelectedItem().toString();
        String sDrivetype = cmbDrive.getSelectedItem().toString();
        String sEnginesize = cmbEngine.getSelectedItem().toString();
        String sYearfrom = cmbFrom.getSelectedItem().toString();
        String sFueltype = cmbFuel.getSelectedItem().toString();
        String sKmfrom = cmbkmfrom.getSelectedItem().toString();
        String sKmto = cmbkmto.getSelectedItem().toString();
        String sPricemax = cmbPricemax.getSelectedItem().toString();
        String sPricemin = cmbPricemin.getSelectedItem().toString();
        String sSeats = cmbSeats.getSelectedItem().toString();
        String sYearto = cmbTo.getSelectedItem().toString();
        String sTransmission = cmbTrans.getSelectedItem().toString();
        
        SearchCarnew scn = new SearchCarnew(sMake,sModel,sBodytype,sColor,sCylinder,sDoor,sDrivetype,sEnginesize,sYearfrom,sYearto,sFueltype,sKmfrom,sKmto,sPricemax,sPricemin,sSeats,sTransmission);
        
        this.dispose();
        scn.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/findcar hover.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/findcar.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void cmbMakeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusGained
        cmbMake.setBackground(Color.decode("#cceffc"));
        cmbMake.setBorder(a);
    }//GEN-LAST:event_cmbMakeFocusGained

    private void cmbTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransFocusGained
        cmbTrans.setBackground(Color.decode("#cceffc"));
        cmbTrans.setBorder(a);
    }//GEN-LAST:event_cmbTransFocusGained

    private void cmbFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusGained
        cmbFuel.setBackground(Color.decode("#cceffc"));
        cmbFuel.setBorder(a);
    }//GEN-LAST:event_cmbFuelFocusGained

    private void cmbEngineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEngineFocusGained
        cmbEngine.setBackground(Color.decode("#cceffc"));
        cmbEngine.setBorder(a);
    }//GEN-LAST:event_cmbEngineFocusGained

    private void cmbModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusGained
        cmbModel.setBackground(Color.decode("#cceffc"));
        cmbModel.setBorder(a);
    }//GEN-LAST:event_cmbModelFocusGained

    private void cmbkmfromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmfromFocusGained
        cmbkmfrom.setBackground(Color.decode("#cceffc"));
        cmbkmfrom.setBorder(a);
    }//GEN-LAST:event_cmbkmfromFocusGained

    private void cmbkmtoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmtoFocusGained
        cmbkmto.setBackground(Color.decode("#cceffc"));
        cmbkmto.setBorder(a);
    }//GEN-LAST:event_cmbkmtoFocusGained

    private void cmbBodyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusGained
        cmbBody.setBackground(Color.decode("#cceffc"));
        cmbBody.setBorder(a);
    }//GEN-LAST:event_cmbBodyFocusGained

    private void cmbColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbColorFocusGained
        cmbColor.setBackground(Color.decode("#cceffc"));
        cmbColor.setBorder(a);
    }//GEN-LAST:event_cmbColorFocusGained

    private void cmbFromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFromFocusGained
        cmbFrom.setBackground(Color.decode("#cceffc"));
        cmbFrom.setBorder(a);
    }//GEN-LAST:event_cmbFromFocusGained

    private void cmbToFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbToFocusGained
        cmbTo.setBackground(Color.decode("#cceffc"));
        cmbTo.setBorder(a);
    }//GEN-LAST:event_cmbToFocusGained

    private void cmbSeatsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSeatsFocusGained
        cmbSeats.setBackground(Color.decode("#cceffc"));
        cmbSeats.setBorder(a);
    }//GEN-LAST:event_cmbSeatsFocusGained

    private void cmbDriveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusGained
        cmbDrive.setBackground(Color.decode("#cceffc"));
        cmbDrive.setBorder(a);
    }//GEN-LAST:event_cmbDriveFocusGained

    private void cmbCylinderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCylinderFocusGained
        cmbCylinder.setBackground(Color.decode("#cceffc"));
        cmbCylinder.setBorder(a);
    }//GEN-LAST:event_cmbCylinderFocusGained

    private void cmbDoorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDoorFocusGained
        cmbDoor.setBackground(Color.decode("#cceffc"));
        cmbDoor.setBorder(a);
    }//GEN-LAST:event_cmbDoorFocusGained

    private void cmbPriceminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPriceminFocusGained
        cmbPricemin.setBackground(Color.decode("#cceffc"));
        cmbPricemin.setBorder(a);
    }//GEN-LAST:event_cmbPriceminFocusGained

    private void cmbPricemaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPricemaxFocusGained
        cmbPricemax.setBackground(Color.decode("#cceffc"));
        cmbPricemax.setBorder(a);
    }//GEN-LAST:event_cmbPricemaxFocusGained

    private void cmbMakeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusLost
        cmbMake.setBackground(b);
    }//GEN-LAST:event_cmbMakeFocusLost

    private void cmbTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransFocusLost
        cmbTrans.setBackground(b);
    }//GEN-LAST:event_cmbTransFocusLost

    private void cmbFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusLost
        cmbFuel.setBackground(b);
    }//GEN-LAST:event_cmbFuelFocusLost

    private void cmbEngineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEngineFocusLost
        cmbEngine.setBackground(b);
    }//GEN-LAST:event_cmbEngineFocusLost

    private void cmbModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusLost
        cmbModel.setBackground(b);
    }//GEN-LAST:event_cmbModelFocusLost

    private void cmbkmfromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmfromFocusLost
        cmbkmfrom.setBackground(b);
    }//GEN-LAST:event_cmbkmfromFocusLost

    private void cmbkmtoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmtoFocusLost
        cmbkmto.setBackground(b);
    }//GEN-LAST:event_cmbkmtoFocusLost

    private void cmbBodyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusLost
        cmbBody.setBackground(b);
    }//GEN-LAST:event_cmbBodyFocusLost

    private void cmbColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbColorFocusLost
        cmbColor.setBackground(b);
    }//GEN-LAST:event_cmbColorFocusLost

    private void cmbFromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFromFocusLost
        cmbFrom.setBackground(b);
    }//GEN-LAST:event_cmbFromFocusLost

    private void cmbToFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbToFocusLost
        cmbTo.setBackground(b);
    }//GEN-LAST:event_cmbToFocusLost

    private void cmbSeatsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSeatsFocusLost
        cmbSeats.setBackground(b);
    }//GEN-LAST:event_cmbSeatsFocusLost

    private void cmbDriveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusLost
        cmbDrive.setBackground(b);
    }//GEN-LAST:event_cmbDriveFocusLost

    private void cmbCylinderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCylinderFocusLost
        cmbCylinder.setBackground(b);
    }//GEN-LAST:event_cmbCylinderFocusLost

    private void cmbPriceminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPriceminFocusLost
        cmbPricemin.setBackground(b);
    }//GEN-LAST:event_cmbPriceminFocusLost

    private void cmbPricemaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPricemaxFocusLost
        cmbPricemax.setBackground(b);
    }//GEN-LAST:event_cmbPricemaxFocusLost

    private void cmbDoorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDoorFocusLost
        cmbDoor.setBackground(b);
    }//GEN-LAST:event_cmbDoorFocusLost

    private void cmbMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMakeActionPerformed
        
        cmbModel.removeAllItems();
        cmbModel.addItem("Any Model");
        
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

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        AdminPanel log = new AdminPanel();
        this.dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBody;
    private javax.swing.JComboBox cmbColor;
    private javax.swing.JComboBox cmbCylinder;
    private javax.swing.JComboBox cmbDoor;
    private javax.swing.JComboBox cmbDrive;
    private javax.swing.JComboBox cmbEngine;
    private javax.swing.JComboBox cmbFrom;
    private javax.swing.JComboBox cmbFuel;
    private javax.swing.JComboBox cmbMake;
    private javax.swing.JComboBox cmbModel;
    private javax.swing.JComboBox cmbPricemax;
    private javax.swing.JComboBox cmbPricemin;
    private javax.swing.JComboBox cmbSeats;
    private javax.swing.JComboBox cmbTo;
    private javax.swing.JComboBox cmbTrans;
    private javax.swing.JComboBox cmbkmfrom;
    private javax.swing.JComboBox cmbkmto;
    private javax.swing.JLabel home;
    private javax.swing.JCheckBox jCheckBox37;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
