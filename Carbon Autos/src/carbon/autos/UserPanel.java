package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboPopup;

public class UserPanel extends javax.swing.JFrame {

    static String User;
    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff");
    
    public void SearchByMake(String Make){
    SearchCarUser scu = new SearchCarUser(Make,"Model","Body","Color","Any Cylinders","Any Doors","Any Wheel Drive","Any Engine Size","Year From","Year To","fuel","Km From","Km To","Max Price","Min Price","Any Seating","Transmission","yes");
    this.dispose();
    }
    
    public void SearchByBody(String Body){
    SearchCarUser scu = new SearchCarUser("Make","Model",Body,"Color","Any Cylinders","Any Doors","Any Wheel Drive","Any Engine Size","Year From","Year To","fuel","Km From","Km To","Max Price","Min Price","Any Seating","Transmission","yes");
    this.dispose();
    }
    
    public void SearchByFuel(String Fuel){
    SearchCarUser scu = new SearchCarUser("Make","Model","Body","Color","Any Cylinders","Any Doors","Any Wheel Drive","Any Engine Size","Year From","Year To",Fuel,"Km From","Km To","Max Price","Min Price","Any Seating","Transmission","yes");
    this.dispose();
    }
    
    public UserPanel() {
        
        
        initComponents();
        setTitle("Carbon Autos");
        setVisible(true);
        this.setResizable(false);
        
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
        JList lists = popup.getList();
        lists.setSelectionBackground(b);
        
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
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelMake = new javax.swing.JPanel();
        laelChevrolet = new javax.swing.JLabel();
        labelBMW = new javax.swing.JLabel();
        labelMazda = new javax.swing.JLabel();
        labelHyundai = new javax.swing.JLabel();
        labelAudi = new javax.swing.JLabel();
        labelNissan = new javax.swing.JLabel();
        labelHonda = new javax.swing.JLabel();
        labelLamborghini = new javax.swing.JLabel();
        labelToyota = new javax.swing.JLabel();
        labelKia = new javax.swing.JLabel();
        labelSuzuki = new javax.swing.JLabel();
        labelDaihatsu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        labelConvertible = new javax.swing.JLabel();
        labelSedan = new javax.swing.JLabel();
        labelSUV = new javax.swing.JLabel();
        labelLuxury = new javax.swing.JLabel();
        labelhatchback = new javax.swing.JLabel();
        labelMUV = new javax.swing.JLabel();
        labelHybrid = new javax.swing.JLabel();
        labelCoupe = new javax.swing.JLabel();
        labelMinivan = new javax.swing.JLabel();
        PanelFuel = new javax.swing.JPanel();
        labelPetrol = new javax.swing.JLabel();
        labelCNG = new javax.swing.JLabel();
        labelLPG = new javax.swing.JLabel();
        labelDiesel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbMake = new javax.swing.JComboBox();
        cmbModel = new javax.swing.JComboBox();
        cmbBody = new javax.swing.JComboBox();
        cmbFuel = new javax.swing.JComboBox();
        cmbEngine = new javax.swing.JComboBox();
        cmbColor = new javax.swing.JComboBox();
        cmbTrans = new javax.swing.JComboBox();
        cmbkmfrom = new javax.swing.JComboBox();
        cmbkmto = new javax.swing.JComboBox();
        cmbTo = new javax.swing.JComboBox();
        cmbFrom = new javax.swing.JComboBox();
        cmbPricemin = new javax.swing.JComboBox();
        cmbPricemax = new javax.swing.JComboBox();
        cmbSeats = new javax.swing.JComboBox();
        cmbDrive = new javax.swing.JComboBox();
        cmbCylinder = new javax.swing.JComboBox();
        cmbDoor = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/SearchCars.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 120, 310, 90);

        labelWelcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelWelcome.setText("Welcome User");
        jPanel1.add(labelWelcome);
        labelWelcome.setBounds(230, 70, 210, 40);

        labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/WelcomePic.png"))); // NOI18N
        jPanel1.add(labelPic);
        labelPic.setBounds(100, 10, 110, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1140, 60, 190, 60);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panelMake.setBackground(new java.awt.Color(255, 255, 255));
        panelMake.setLayout(new java.awt.GridLayout(4, 4));

        laelChevrolet.setBackground(new java.awt.Color(218, 222, 224));
        laelChevrolet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/chevrolet.png"))); // NOI18N
        laelChevrolet.setToolTipText("Chevrolet");
        laelChevrolet.setAlignmentY(0.0F);
        laelChevrolet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laelChevrolet.setIconTextGap(0);
        laelChevrolet.setMaximumSize(null);
        laelChevrolet.setOpaque(true);
        laelChevrolet.setPreferredSize(new java.awt.Dimension(100, 100));
        laelChevrolet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laelChevroletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                laelChevroletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                laelChevroletMouseExited(evt);
            }
        });
        panelMake.add(laelChevrolet);

        labelBMW.setBackground(new java.awt.Color(213, 218, 218));
        labelBMW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/bmw.png"))); // NOI18N
        labelBMW.setToolTipText("BMW");
        labelBMW.setAlignmentY(0.0F);
        labelBMW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBMW.setIconTextGap(0);
        labelBMW.setMaximumSize(null);
        labelBMW.setOpaque(true);
        labelBMW.setPreferredSize(new java.awt.Dimension(100, 100));
        labelBMW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBMWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBMWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBMWMouseExited(evt);
            }
        });
        panelMake.add(labelBMW);

        labelMazda.setBackground(new java.awt.Color(230, 233, 234));
        labelMazda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/mazda.png"))); // NOI18N
        labelMazda.setToolTipText("Mazda");
        labelMazda.setAlignmentY(0.0F);
        labelMazda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMazda.setIconTextGap(0);
        labelMazda.setMaximumSize(null);
        labelMazda.setOpaque(true);
        labelMazda.setPreferredSize(new java.awt.Dimension(100, 100));
        labelMazda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMazdaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMazdaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMazdaMouseExited(evt);
            }
        });
        panelMake.add(labelMazda);

        labelHyundai.setBackground(new java.awt.Color(225, 227, 229));
        labelHyundai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/hyundai.png"))); // NOI18N
        labelHyundai.setToolTipText("Hyundai");
        labelHyundai.setAlignmentY(0.0F);
        labelHyundai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHyundai.setIconTextGap(0);
        labelHyundai.setMaximumSize(null);
        labelHyundai.setOpaque(true);
        labelHyundai.setPreferredSize(new java.awt.Dimension(100, 100));
        labelHyundai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHyundaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelHyundaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelHyundaiMouseExited(evt);
            }
        });
        panelMake.add(labelHyundai);

        labelAudi.setBackground(new java.awt.Color(204, 204, 204));
        labelAudi.setForeground(new java.awt.Color(204, 204, 204));
        labelAudi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/audi.png"))); // NOI18N
        labelAudi.setToolTipText("Audi");
        labelAudi.setAlignmentY(0.0F);
        labelAudi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAudi.setIconTextGap(0);
        labelAudi.setMaximumSize(null);
        labelAudi.setOpaque(true);
        labelAudi.setPreferredSize(new java.awt.Dimension(100, 100));
        labelAudi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAudiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAudiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAudiMouseExited(evt);
            }
        });
        panelMake.add(labelAudi);

        labelNissan.setBackground(new java.awt.Color(230, 231, 226));
        labelNissan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/nissan.png"))); // NOI18N
        labelNissan.setToolTipText("Nissan");
        labelNissan.setAlignmentY(0.0F);
        labelNissan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNissan.setIconTextGap(0);
        labelNissan.setMaximumSize(null);
        labelNissan.setOpaque(true);
        labelNissan.setPreferredSize(new java.awt.Dimension(100, 100));
        labelNissan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNissanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNissanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNissanMouseExited(evt);
            }
        });
        panelMake.add(labelNissan);

        labelHonda.setBackground(new java.awt.Color(223, 215, 213));
        labelHonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/honda.png"))); // NOI18N
        labelHonda.setToolTipText("Honda");
        labelHonda.setAlignmentY(0.0F);
        labelHonda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHonda.setIconTextGap(0);
        labelHonda.setMaximumSize(null);
        labelHonda.setOpaque(true);
        labelHonda.setPreferredSize(new java.awt.Dimension(100, 100));
        labelHonda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHondaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelHondaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelHondaMouseExited(evt);
            }
        });
        panelMake.add(labelHonda);

        labelLamborghini.setBackground(new java.awt.Color(233, 234, 235));
        labelLamborghini.setForeground(new java.awt.Color(204, 204, 204));
        labelLamborghini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/lamborghini.png"))); // NOI18N
        labelLamborghini.setToolTipText("Lamborghini");
        labelLamborghini.setAlignmentY(0.0F);
        labelLamborghini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLamborghini.setIconTextGap(0);
        labelLamborghini.setOpaque(true);
        labelLamborghini.setPreferredSize(new java.awt.Dimension(100, 100));
        labelLamborghini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLamborghiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLamborghiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLamborghiniMouseExited(evt);
            }
        });
        panelMake.add(labelLamborghini);

        labelToyota.setBackground(new java.awt.Color(223, 215, 213));
        labelToyota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/toyota.png"))); // NOI18N
        labelToyota.setToolTipText("Toyota");
        labelToyota.setAlignmentY(0.0F);
        labelToyota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelToyota.setIconTextGap(0);
        labelToyota.setMaximumSize(null);
        labelToyota.setOpaque(true);
        labelToyota.setPreferredSize(new java.awt.Dimension(100, 100));
        labelToyota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelToyotaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelToyotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelToyotaMouseExited(evt);
            }
        });
        panelMake.add(labelToyota);

        labelKia.setBackground(new java.awt.Color(230, 231, 232));
        labelKia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/kia.png"))); // NOI18N
        labelKia.setToolTipText("Kia");
        labelKia.setAlignmentY(0.0F);
        labelKia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelKia.setIconTextGap(0);
        labelKia.setMaximumSize(null);
        labelKia.setOpaque(true);
        labelKia.setPreferredSize(new java.awt.Dimension(100, 100));
        labelKia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelKiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelKiaMouseExited(evt);
            }
        });
        panelMake.add(labelKia);

        labelSuzuki.setBackground(new java.awt.Color(204, 204, 204));
        labelSuzuki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/suzuki.png"))); // NOI18N
        labelSuzuki.setToolTipText("Suzuki");
        labelSuzuki.setAlignmentY(0.0F);
        labelSuzuki.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSuzuki.setIconTextGap(0);
        labelSuzuki.setMaximumSize(null);
        labelSuzuki.setOpaque(true);
        labelSuzuki.setPreferredSize(new java.awt.Dimension(100, 100));
        labelSuzuki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSuzukiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSuzukiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSuzukiMouseExited(evt);
            }
        });
        panelMake.add(labelSuzuki);

        labelDaihatsu.setBackground(new java.awt.Color(230, 231, 226));
        labelDaihatsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/daihatsu.png"))); // NOI18N
        labelDaihatsu.setToolTipText("Daihatsu");
        labelDaihatsu.setAlignmentY(0.0F);
        labelDaihatsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDaihatsu.setIconTextGap(0);
        labelDaihatsu.setMaximumSize(null);
        labelDaihatsu.setOpaque(true);
        labelDaihatsu.setPreferredSize(new java.awt.Dimension(100, 100));
        labelDaihatsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDaihatsuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDaihatsuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDaihatsuMouseExited(evt);
            }
        });
        panelMake.add(labelDaihatsu);

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Search by Bodystyle:");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Search by Fuel:");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Search by Make:");

        PanelBody.setBackground(new java.awt.Color(255, 255, 255));
        PanelBody.setLayout(new java.awt.GridLayout(3, 3));

        labelConvertible.setBackground(new java.awt.Color(213, 218, 218));
        labelConvertible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/convertible.png"))); // NOI18N
        labelConvertible.setToolTipText("");
        labelConvertible.setAlignmentY(0.0F);
        labelConvertible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelConvertible.setIconTextGap(0);
        labelConvertible.setOpaque(true);
        labelConvertible.setPreferredSize(new java.awt.Dimension(100, 100));
        labelConvertible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConvertibleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelConvertibleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelConvertibleMouseExited(evt);
            }
        });
        PanelBody.add(labelConvertible);

        labelSedan.setBackground(new java.awt.Color(230, 231, 226));
        labelSedan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Sedan.png"))); // NOI18N
        labelSedan.setToolTipText("");
        labelSedan.setAlignmentY(0.0F);
        labelSedan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSedan.setIconTextGap(0);
        labelSedan.setOpaque(true);
        labelSedan.setPreferredSize(new java.awt.Dimension(100, 100));
        labelSedan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSedanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSedanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSedanMouseExited(evt);
            }
        });
        PanelBody.add(labelSedan);

        labelSUV.setBackground(new java.awt.Color(230, 231, 232));
        labelSUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/SUV.png"))); // NOI18N
        labelSUV.setToolTipText("");
        labelSUV.setAlignmentY(0.0F);
        labelSUV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSUV.setIconTextGap(0);
        labelSUV.setOpaque(true);
        labelSUV.setPreferredSize(new java.awt.Dimension(100, 100));
        labelSUV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSUVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSUVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSUVMouseExited(evt);
            }
        });
        PanelBody.add(labelSUV);

        labelLuxury.setBackground(new java.awt.Color(204, 204, 204));
        labelLuxury.setForeground(new java.awt.Color(204, 204, 204));
        labelLuxury.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Luxury.png"))); // NOI18N
        labelLuxury.setToolTipText("");
        labelLuxury.setAlignmentY(0.0F);
        labelLuxury.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLuxury.setIconTextGap(0);
        labelLuxury.setOpaque(true);
        labelLuxury.setPreferredSize(new java.awt.Dimension(100, 100));
        labelLuxury.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLuxuryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLuxuryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLuxuryMouseExited(evt);
            }
        });
        PanelBody.add(labelLuxury);

        labelhatchback.setBackground(new java.awt.Color(233, 234, 235));
        labelhatchback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/HatchBack.png"))); // NOI18N
        labelhatchback.setToolTipText("");
        labelhatchback.setAlignmentY(0.0F);
        labelhatchback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelhatchback.setIconTextGap(0);
        labelhatchback.setOpaque(true);
        labelhatchback.setPreferredSize(new java.awt.Dimension(100, 100));
        labelhatchback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelhatchbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelhatchbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelhatchbackMouseExited(evt);
            }
        });
        PanelBody.add(labelhatchback);

        labelMUV.setBackground(new java.awt.Color(204, 204, 204));
        labelMUV.setForeground(new java.awt.Color(204, 204, 204));
        labelMUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MUV.png"))); // NOI18N
        labelMUV.setToolTipText("");
        labelMUV.setAlignmentY(0.0F);
        labelMUV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMUV.setIconTextGap(0);
        labelMUV.setOpaque(true);
        labelMUV.setPreferredSize(new java.awt.Dimension(100, 100));
        labelMUV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMUVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMUVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMUVMouseExited(evt);
            }
        });
        PanelBody.add(labelMUV);

        labelHybrid.setBackground(new java.awt.Color(230, 231, 226));
        labelHybrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Hybrid.png"))); // NOI18N
        labelHybrid.setToolTipText("");
        labelHybrid.setAlignmentY(0.0F);
        labelHybrid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHybrid.setIconTextGap(0);
        labelHybrid.setOpaque(true);
        labelHybrid.setPreferredSize(new java.awt.Dimension(100, 100));
        labelHybrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHybridMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelHybridMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelHybridMouseExited(evt);
            }
        });
        PanelBody.add(labelHybrid);

        labelCoupe.setBackground(new java.awt.Color(218, 222, 224));
        labelCoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Coupe.png"))); // NOI18N
        labelCoupe.setToolTipText("");
        labelCoupe.setAlignmentY(0.0F);
        labelCoupe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCoupe.setIconTextGap(0);
        labelCoupe.setOpaque(true);
        labelCoupe.setPreferredSize(new java.awt.Dimension(100, 100));
        labelCoupe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCoupeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCoupeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCoupeMouseExited(evt);
            }
        });
        PanelBody.add(labelCoupe);

        labelMinivan.setBackground(new java.awt.Color(230, 233, 234));
        labelMinivan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MiniVan.png"))); // NOI18N
        labelMinivan.setToolTipText("");
        labelMinivan.setAlignmentY(0.0F);
        labelMinivan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMinivan.setIconTextGap(0);
        labelMinivan.setOpaque(true);
        labelMinivan.setPreferredSize(new java.awt.Dimension(100, 100));
        labelMinivan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinivanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinivanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinivanMouseExited(evt);
            }
        });
        PanelBody.add(labelMinivan);

        PanelFuel.setBackground(new java.awt.Color(255, 255, 255));
        PanelFuel.setLayout(new java.awt.GridLayout(1, 4));

        labelPetrol.setBackground(new java.awt.Color(218, 222, 224));
        labelPetrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/petrol.png"))); // NOI18N
        labelPetrol.setToolTipText("");
        labelPetrol.setAlignmentY(0.0F);
        labelPetrol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPetrol.setIconTextGap(0);
        labelPetrol.setOpaque(true);
        labelPetrol.setPreferredSize(new java.awt.Dimension(100, 100));
        labelPetrol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPetrolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPetrolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPetrolMouseExited(evt);
            }
        });
        PanelFuel.add(labelPetrol);

        labelCNG.setBackground(new java.awt.Color(213, 218, 218));
        labelCNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/CNG.png"))); // NOI18N
        labelCNG.setToolTipText("");
        labelCNG.setAlignmentY(0.0F);
        labelCNG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCNG.setIconTextGap(0);
        labelCNG.setOpaque(true);
        labelCNG.setPreferredSize(new java.awt.Dimension(100, 100));
        labelCNG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCNGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCNGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCNGMouseExited(evt);
            }
        });
        PanelFuel.add(labelCNG);

        labelLPG.setBackground(new java.awt.Color(230, 233, 234));
        labelLPG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/LPG.png"))); // NOI18N
        labelLPG.setToolTipText("");
        labelLPG.setAlignmentY(0.0F);
        labelLPG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLPG.setIconTextGap(0);
        labelLPG.setOpaque(true);
        labelLPG.setPreferredSize(new java.awt.Dimension(100, 100));
        labelLPG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLPGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLPGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLPGMouseExited(evt);
            }
        });
        PanelFuel.add(labelLPG);

        labelDiesel.setBackground(new java.awt.Color(204, 204, 204));
        labelDiesel.setForeground(new java.awt.Color(204, 204, 204));
        labelDiesel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Diesel.png"))); // NOI18N
        labelDiesel.setToolTipText("");
        labelDiesel.setAlignmentY(0.0F);
        labelDiesel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDiesel.setIconTextGap(0);
        labelDiesel.setOpaque(true);
        labelDiesel.setPreferredSize(new java.awt.Dimension(100, 100));
        labelDiesel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDieselMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDieselMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDieselMouseExited(evt);
            }
        });
        PanelFuel.add(labelDiesel);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/or.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(panelMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(475, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(349, Short.MAX_VALUE)
                    .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(64, 64, 64)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(panelMake, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(225, Short.MAX_VALUE)
                    .addComponent(PanelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel4.setBackground(new java.awt.Color(190, 224, 249));

        cmbMake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Make", "AUDI", "BMW", "CHEVROLET", "FORD", "HONDA", "HYUNDAI", "KIA", "MAZDA", "NISSAN", "SUZUKI", "TOYOTA", " " }));
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

        cmbModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Model" }));
        cmbModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbModelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbModelFocusLost(evt);
            }
        });

        cmbBody.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Body Type", "Luxury", "Hybrid", "SUV", "Hatchback", "MUV", "Coupe", "Convertible", "Sedan", "Minivan" }));
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

        cmbFuel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Fuel", "Diesel", "Petrol", "LPG", "CNG", " " }));
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

        cmbkmfrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Km From", "1000", "2500", "5000", "10000", "15000", "25000", "40000", "50000", "100000", "500000", "999999" }));
        cmbkmfrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbkmfromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbkmfromFocusLost(evt);
            }
        });

        cmbkmto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Km To", "1000", "2500", "5000", "10000", "15000", "25000", "40000", "50000", "100000", "500000", "999999" }));
        cmbkmto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbkmtoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbkmtoFocusLost(evt);
            }
        });

        cmbTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year To", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cmbTo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbToFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbToFocusLost(evt);
            }
        });

        cmbFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year From", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cmbFrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbFromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbFromFocusLost(evt);
            }
        });

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

        cmbSeats.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Seating", "2", "3", "4", "5", "6", "7", "8", "9", "10 ", " " }));
        cmbSeats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbSeatsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSeatsFocusLost(evt);
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

        cmbDoor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any Doors", "0", "1", "2", "3", "4", "5", "6", " " }));
        cmbDoor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbDoorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbDoorFocusLost(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/UserSearch.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbFuel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEngine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cmbPricemin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPricemax, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(cmbkmfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbkmto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbDrive, 0, 184, Short.MAX_VALUE)
                                    .addComponent(cmbDoor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbSeats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(cmbCylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbkmfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbkmto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPricemin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPricemax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBody, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDoor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCylinder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 180, 1270, 510);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -90, 1920, 980);

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

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile hover.png")));
       
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/profile.png")));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ProfileSetting1 pro = new ProfileSetting1();
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void labelLuxuryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLuxuryMouseExited
         labelLuxury.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Luxury.png")));
    }//GEN-LAST:event_labelLuxuryMouseExited

    private void labelLuxuryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLuxuryMouseEntered
         labelLuxury.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Luxury hover.png")));
         
    }//GEN-LAST:event_labelLuxuryMouseEntered

    private void labelLuxuryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLuxuryMouseClicked
        this.SearchByBody("Luxury");
    }//GEN-LAST:event_labelLuxuryMouseClicked

    private void labelhatchbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhatchbackMouseExited
        labelhatchback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/HatchBack.png")));
    }//GEN-LAST:event_labelhatchbackMouseExited

    private void labelhatchbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhatchbackMouseEntered
        labelhatchback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Hatchback hover.png")));
    }//GEN-LAST:event_labelhatchbackMouseEntered

    private void labelhatchbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelhatchbackMouseClicked
        this.SearchByBody("Hatchback"); 
    }//GEN-LAST:event_labelhatchbackMouseClicked

    private void labelSUVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSUVMouseExited
         labelSUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/SUV.png")));
    }//GEN-LAST:event_labelSUVMouseExited

    private void labelSUVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSUVMouseEntered
        labelSUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/SUV hover.png")));
    }//GEN-LAST:event_labelSUVMouseEntered

    private void labelSUVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSUVMouseClicked
       this.SearchByBody("SUV");
    }//GEN-LAST:event_labelSUVMouseClicked

    private void labelHybridMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHybridMouseExited
         labelHybrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Hybrid.png")));
    }//GEN-LAST:event_labelHybridMouseExited

    private void labelHybridMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHybridMouseEntered
        labelHybrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Hybrid hover.png")));
    }//GEN-LAST:event_labelHybridMouseEntered

    private void labelHybridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHybridMouseClicked
        this.SearchByBody("Hybrid");
    }//GEN-LAST:event_labelHybridMouseClicked

    private void labelSedanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSedanMouseExited
        labelSedan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Sedan.png")));
    }//GEN-LAST:event_labelSedanMouseExited

    private void labelSedanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSedanMouseEntered
        labelSedan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Sedan hover.png")));
    }//GEN-LAST:event_labelSedanMouseEntered

    private void labelSedanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSedanMouseClicked
        this.SearchByBody("Sedan");
    }//GEN-LAST:event_labelSedanMouseClicked

    private void labelMUVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMUVMouseExited
        labelMUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MUV.png")));
    }//GEN-LAST:event_labelMUVMouseExited

    private void labelMUVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMUVMouseEntered
       labelMUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MUV hover.png")));
    }//GEN-LAST:event_labelMUVMouseEntered

    private void labelMUVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMUVMouseClicked
        this.SearchByBody("MUV");
    }//GEN-LAST:event_labelMUVMouseClicked

    private void labelMinivanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinivanMouseExited
        labelMinivan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MiniVan.png")));
    }//GEN-LAST:event_labelMinivanMouseExited

    private void labelMinivanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinivanMouseEntered
        labelMinivan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/MiniVan hover.png")));
    }//GEN-LAST:event_labelMinivanMouseEntered

    private void labelMinivanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinivanMouseClicked
        this.SearchByBody("Minivan");
    }//GEN-LAST:event_labelMinivanMouseClicked

    private void labelConvertibleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConvertibleMouseExited
        labelConvertible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Convertible.png")));
    }//GEN-LAST:event_labelConvertibleMouseExited

    private void labelConvertibleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConvertibleMouseEntered
        labelConvertible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Convertible hover.png")));
    }//GEN-LAST:event_labelConvertibleMouseEntered

    private void labelConvertibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConvertibleMouseClicked
        this.SearchByBody("Convertible");
    }//GEN-LAST:event_labelConvertibleMouseClicked

    private void labelCoupeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCoupeMouseExited
        labelCoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Coupe.png")));
    }//GEN-LAST:event_labelCoupeMouseExited

    private void labelCoupeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCoupeMouseEntered
        labelCoupe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Coupe hover.png")));
    }//GEN-LAST:event_labelCoupeMouseEntered

    private void labelCoupeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCoupeMouseClicked
        this.SearchByBody("Coupe");
    }//GEN-LAST:event_labelCoupeMouseClicked

    private void labelHyundaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHyundaiMouseExited
        labelHyundai.setBackground(Color.decode("#e1e3e5"));
    }//GEN-LAST:event_labelHyundaiMouseExited

    private void labelHyundaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHyundaiMouseEntered
        labelHyundai.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelHyundaiMouseEntered

    private void labelHyundaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHyundaiMouseClicked
        this.SearchByMake("HYUNDAI");
    }//GEN-LAST:event_labelHyundaiMouseClicked

    private void labelHondaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHondaMouseExited
        labelHonda.setBackground(Color.decode("#dfd7d5"));
    }//GEN-LAST:event_labelHondaMouseExited

    private void labelHondaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHondaMouseEntered
        labelHonda.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelHondaMouseEntered

    private void labelHondaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHondaMouseClicked
        this.SearchByMake("HONDA");
    }//GEN-LAST:event_labelHondaMouseClicked

    private void labelToyotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelToyotaMouseExited
        labelToyota.setBackground(Color.decode("#dfd7d5"));
    }//GEN-LAST:event_labelToyotaMouseExited

    private void labelToyotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelToyotaMouseEntered
        labelToyota.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelToyotaMouseEntered

    private void labelToyotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelToyotaMouseClicked
        this.SearchByMake("TOYOTA");
    }//GEN-LAST:event_labelToyotaMouseClicked

    private void labelLamborghiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLamborghiniMouseExited
        labelLamborghini.setBackground(Color.decode("#e9eaeb"));
    }//GEN-LAST:event_labelLamborghiniMouseExited

    private void labelLamborghiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLamborghiniMouseEntered
        labelLamborghini.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelLamborghiniMouseEntered

    private void labelLamborghiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLamborghiniMouseClicked
        this.SearchByMake("LAMBORGHINI");
    }//GEN-LAST:event_labelLamborghiniMouseClicked

    private void labelSuzukiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSuzukiMouseExited
        labelSuzuki.setBackground(Color.decode("#cccccc"));
    }//GEN-LAST:event_labelSuzukiMouseExited

    private void labelSuzukiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSuzukiMouseEntered
        labelSuzuki.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelSuzukiMouseEntered

    private void labelSuzukiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSuzukiMouseClicked
        this.SearchByMake("SUZUKI");
    }//GEN-LAST:event_labelSuzukiMouseClicked

    private void labelKiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKiaMouseExited
        labelKia.setBackground(Color.decode("#e6e7e8"));
    }//GEN-LAST:event_labelKiaMouseExited

    private void labelKiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKiaMouseEntered
        labelKia.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelKiaMouseEntered

    private void labelKiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKiaMouseClicked
        this.SearchByMake("KIA");
    }//GEN-LAST:event_labelKiaMouseClicked

    private void labelDaihatsuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDaihatsuMouseExited
        labelDaihatsu.setBackground(Color.decode("#e6e7e2"));
    }//GEN-LAST:event_labelDaihatsuMouseExited

    private void labelDaihatsuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDaihatsuMouseEntered
        labelDaihatsu.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelDaihatsuMouseEntered

    private void labelDaihatsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDaihatsuMouseClicked
        this.SearchByMake("DAIHATSU");
    }//GEN-LAST:event_labelDaihatsuMouseClicked

    private void labelNissanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNissanMouseExited
        labelNissan.setBackground(Color.decode("#e6e7e2"));
    }//GEN-LAST:event_labelNissanMouseExited

    private void labelNissanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNissanMouseEntered
        labelNissan.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelNissanMouseEntered

    private void labelNissanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNissanMouseClicked
        this.SearchByMake("NISSAN");
    }//GEN-LAST:event_labelNissanMouseClicked

    private void labelAudiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAudiMouseExited
        labelAudi.setBackground(Color.decode("#cccccc"));
    }//GEN-LAST:event_labelAudiMouseExited

    private void labelAudiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAudiMouseEntered
        labelAudi.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelAudiMouseEntered

    private void labelAudiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAudiMouseClicked
        this.SearchByMake("AUDI");
    }//GEN-LAST:event_labelAudiMouseClicked

    private void labelMazdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMazdaMouseExited
        labelMazda.setBackground(Color.decode("#e6e9ea"));
    }//GEN-LAST:event_labelMazdaMouseExited

    private void labelMazdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMazdaMouseEntered
        labelMazda.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelMazdaMouseEntered

    private void labelMazdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMazdaMouseClicked
        this.SearchByMake("MAZDA");
    }//GEN-LAST:event_labelMazdaMouseClicked

    private void labelBMWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBMWMouseExited
        labelBMW.setBackground(Color.decode("#d5dada"));
    }//GEN-LAST:event_labelBMWMouseExited

    private void labelBMWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBMWMouseEntered
        labelBMW.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_labelBMWMouseEntered

    private void labelBMWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBMWMouseClicked
        this.SearchByMake("BMW");
    }//GEN-LAST:event_labelBMWMouseClicked

    private void laelChevroletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laelChevroletMouseExited
        laelChevrolet.setBackground(Color.decode("#dadee0"));
    }//GEN-LAST:event_laelChevroletMouseExited

    private void laelChevroletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laelChevroletMouseEntered
        laelChevrolet.setBackground(Color.decode("#f3f3f3"));
    }//GEN-LAST:event_laelChevroletMouseEntered

    private void laelChevroletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laelChevroletMouseClicked
        this.SearchByMake("CHEVROLET"); 
    }//GEN-LAST:event_laelChevroletMouseClicked

    private void labelDieselMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDieselMouseExited
        labelDiesel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Diesel.png")));
    }//GEN-LAST:event_labelDieselMouseExited

    private void labelDieselMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDieselMouseEntered
        labelDiesel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Diesel hover.png")));
    }//GEN-LAST:event_labelDieselMouseEntered

    private void labelDieselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDieselMouseClicked
        this.SearchByFuel("Diesel");
    }//GEN-LAST:event_labelDieselMouseClicked

    private void labelLPGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLPGMouseExited
        labelLPG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/LPG.png")));
    }//GEN-LAST:event_labelLPGMouseExited

    private void labelLPGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLPGMouseEntered
        labelLPG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/LPG hover.png")));
    }//GEN-LAST:event_labelLPGMouseEntered

    private void labelLPGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLPGMouseClicked
        this.SearchByFuel("LPG");
    }//GEN-LAST:event_labelLPGMouseClicked

    private void labelCNGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCNGMouseExited
        labelCNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/CNG.png")));
    }//GEN-LAST:event_labelCNGMouseExited

    private void labelCNGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCNGMouseEntered
        labelCNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/CNG hover.png")));
    }//GEN-LAST:event_labelCNGMouseEntered

    private void labelCNGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCNGMouseClicked
        this.SearchByFuel("CNG");
    }//GEN-LAST:event_labelCNGMouseClicked

    private void labelPetrolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPetrolMouseExited
        labelPetrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Petrol.png")));
    }//GEN-LAST:event_labelPetrolMouseExited

    private void labelPetrolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPetrolMouseEntered
        labelPetrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/Petrol hover.png")));
    }//GEN-LAST:event_labelPetrolMouseEntered

    private void labelPetrolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPetrolMouseClicked
        this.SearchByFuel("Petrol");
    }//GEN-LAST:event_labelPetrolMouseClicked

    private void cmbMakeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusGained
        cmbMake.setBackground(Color.decode("#cceffc"));
        cmbMake.setBorder(a);
    }//GEN-LAST:event_cmbMakeFocusGained

    private void cmbMakeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbMakeFocusLost
        cmbMake.setBackground(b);
    }//GEN-LAST:event_cmbMakeFocusLost

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

    private void cmbModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusGained
        cmbModel.setBackground(Color.decode("#cceffc"));
        cmbModel.setBorder(a);
    }//GEN-LAST:event_cmbModelFocusGained

    private void cmbModelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbModelFocusLost
        cmbModel.setBackground(b);
    }//GEN-LAST:event_cmbModelFocusLost

    private void cmbBodyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusGained
        cmbBody.setBackground(Color.decode("#cceffc"));
        cmbBody.setBorder(a);
    }//GEN-LAST:event_cmbBodyFocusGained

    private void cmbBodyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbBodyFocusLost
        cmbBody.setBackground(b);
    }//GEN-LAST:event_cmbBodyFocusLost

    private void cmbBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBodyActionPerformed

    private void cmbFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusGained
        cmbFuel.setBackground(Color.decode("#cceffc"));
        cmbFuel.setBorder(a);
    }//GEN-LAST:event_cmbFuelFocusGained

    private void cmbFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFuelFocusLost
        cmbFuel.setBackground(b);
    }//GEN-LAST:event_cmbFuelFocusLost

    private void cmbFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuelActionPerformed

    private void cmbEngineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEngineFocusGained
        cmbEngine.setBackground(Color.decode("#cceffc"));
        cmbEngine.setBorder(a);
    }//GEN-LAST:event_cmbEngineFocusGained

    private void cmbEngineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEngineFocusLost
        cmbEngine.setBackground(b);
    }//GEN-LAST:event_cmbEngineFocusLost

    private void cmbEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEngineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEngineActionPerformed

    private void cmbColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbColorFocusGained
        cmbColor.setBackground(Color.decode("#cceffc"));
        cmbColor.setBorder(a);
    }//GEN-LAST:event_cmbColorFocusGained

    private void cmbColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbColorFocusLost
        cmbColor.setBackground(b);
    }//GEN-LAST:event_cmbColorFocusLost

    private void cmbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbColorActionPerformed

    private void cmbTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransFocusGained
        cmbTrans.setBackground(Color.decode("#cceffc"));
        cmbTrans.setBorder(a);
    }//GEN-LAST:event_cmbTransFocusGained

    private void cmbTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTransFocusLost
        cmbTrans.setBackground(b);
    }//GEN-LAST:event_cmbTransFocusLost

    private void cmbTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTransActionPerformed

    private void cmbkmfromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmfromFocusGained
        cmbkmfrom.setBackground(Color.decode("#cceffc"));
        cmbkmfrom.setBorder(a);
    }//GEN-LAST:event_cmbkmfromFocusGained

    private void cmbkmfromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmfromFocusLost
        cmbkmfrom.setBackground(b);
    }//GEN-LAST:event_cmbkmfromFocusLost

    private void cmbkmtoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmtoFocusGained
        cmbkmto.setBackground(Color.decode("#cceffc"));
        cmbkmto.setBorder(a);
    }//GEN-LAST:event_cmbkmtoFocusGained

    private void cmbkmtoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbkmtoFocusLost
        cmbkmto.setBackground(b);
    }//GEN-LAST:event_cmbkmtoFocusLost

    private void cmbToFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbToFocusGained
        cmbTo.setBackground(Color.decode("#cceffc"));
        cmbTo.setBorder(a);
    }//GEN-LAST:event_cmbToFocusGained

    private void cmbToFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbToFocusLost
        cmbTo.setBackground(b);
    }//GEN-LAST:event_cmbToFocusLost

    private void cmbFromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFromFocusGained
        cmbFrom.setBackground(Color.decode("#cceffc"));
        cmbFrom.setBorder(a);
    }//GEN-LAST:event_cmbFromFocusGained

    private void cmbFromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbFromFocusLost
        cmbFrom.setBackground(b);
    }//GEN-LAST:event_cmbFromFocusLost

    private void cmbPriceminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPriceminFocusGained
        cmbPricemin.setBackground(Color.decode("#cceffc"));
        cmbPricemin.setBorder(a);
    }//GEN-LAST:event_cmbPriceminFocusGained

    private void cmbPriceminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPriceminFocusLost
        cmbPricemin.setBackground(b);
    }//GEN-LAST:event_cmbPriceminFocusLost

    private void cmbPricemaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPricemaxFocusGained
        cmbPricemax.setBackground(Color.decode("#cceffc"));
        cmbPricemax.setBorder(a);
    }//GEN-LAST:event_cmbPricemaxFocusGained

    private void cmbPricemaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPricemaxFocusLost
        cmbPricemax.setBackground(b);
    }//GEN-LAST:event_cmbPricemaxFocusLost

    private void cmbSeatsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSeatsFocusGained
        cmbSeats.setBackground(Color.decode("#cceffc"));
        cmbSeats.setBorder(a);
    }//GEN-LAST:event_cmbSeatsFocusGained

    private void cmbSeatsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSeatsFocusLost
        cmbSeats.setBackground(b);
    }//GEN-LAST:event_cmbSeatsFocusLost

    private void cmbDriveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusGained
        cmbDrive.setBackground(Color.decode("#cceffc"));
        cmbDrive.setBorder(a);
    }//GEN-LAST:event_cmbDriveFocusGained

    private void cmbDriveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDriveFocusLost
        cmbDrive.setBackground(b);
    }//GEN-LAST:event_cmbDriveFocusLost

    private void cmbDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDriveActionPerformed

    private void cmbCylinderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCylinderFocusGained
        cmbCylinder.setBackground(Color.decode("#cceffc"));
        cmbCylinder.setBorder(a);
    }//GEN-LAST:event_cmbCylinderFocusGained

    private void cmbCylinderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCylinderFocusLost
        cmbCylinder.setBackground(b);
    }//GEN-LAST:event_cmbCylinderFocusLost

    private void cmbCylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCylinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCylinderActionPerformed

    private void cmbDoorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDoorFocusGained
        cmbDoor.setBackground(Color.decode("#cceffc"));
        cmbDoor.setBorder(a);
    }//GEN-LAST:event_cmbDoorFocusGained

    private void cmbDoorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbDoorFocusLost
        cmbDoor.setBackground(b);
    }//GEN-LAST:event_cmbDoorFocusLost

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
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
                
        SearchCarUser usc = new SearchCarUser(sMake,sModel,sBodytype,sColor,sCylinder,sDoor,sDrivetype,sEnginesize,sYearfrom,sYearto,sFueltype,sKmfrom,sKmto,sPricemax,sPricemin,sSeats,sTransmission,"no");

        this.dispose();
        usc.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/UserSearch hover.png")));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/UserSearch.png")));
    }//GEN-LAST:event_jLabel10MouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelFuel;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelAudi;
    private javax.swing.JLabel labelBMW;
    private javax.swing.JLabel labelCNG;
    private javax.swing.JLabel labelConvertible;
    private javax.swing.JLabel labelCoupe;
    private javax.swing.JLabel labelDaihatsu;
    private javax.swing.JLabel labelDiesel;
    private javax.swing.JLabel labelHonda;
    private javax.swing.JLabel labelHybrid;
    private javax.swing.JLabel labelHyundai;
    private javax.swing.JLabel labelKia;
    private javax.swing.JLabel labelLPG;
    private javax.swing.JLabel labelLamborghini;
    private javax.swing.JLabel labelLuxury;
    private javax.swing.JLabel labelMUV;
    private javax.swing.JLabel labelMazda;
    private javax.swing.JLabel labelMinivan;
    private javax.swing.JLabel labelNissan;
    private javax.swing.JLabel labelPetrol;
    private javax.swing.JLabel labelPic;
    private javax.swing.JLabel labelSUV;
    private javax.swing.JLabel labelSedan;
    private javax.swing.JLabel labelSuzuki;
    private javax.swing.JLabel labelToyota;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel labelhatchback;
    private javax.swing.JLabel laelChevrolet;
    private javax.swing.JPanel panelMake;
    // End of variables declaration//GEN-END:variables
}
