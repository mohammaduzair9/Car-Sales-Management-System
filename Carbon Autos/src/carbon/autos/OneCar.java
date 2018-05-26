package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;




public class OneCar extends javax.swing.JFrame {

    ImageIcon icon ;
    public void value(boolean val){
               if(val == true){
                                icon=(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/yes.png")));
               }     
               else{
                                icon=(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/no.png")));
               
               }}
    
    static String User;
    Border a = BorderFactory.createLineBorder(Color.decode("#00bffe"), 1);
    Color b = Color.decode("#ffffff");
    Color f = Color.decode("#333333");
    Color c = Color.decode("#ffffff");
    int Card_number =0;
    
    
    public OneCar(int Id) {
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
                int User_id = bean.getId();
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
        
        try
        { 
           ArrayList lista = DatabaseManager.getCars();
            for(int i=0; i<lista.size(); i++){
                CarBean beans = (CarBean)lista.get(i);
                int Car_id = beans.getId();
               if(Car_id==Id){ 
                String Make=beans.getMake();
                String body=beans.getBodeytype();
                String colors=beans.getColors();
                String drive=beans.getDrivetype();
                String fuel=beans.getFueltype();
                String Img=beans.getImg();
                String Model=beans.getModel();
                String Trans=beans.getTrans();
                int cylin=beans.getCylinder();
                int doors=beans.getDoors();
                int engine=beans.getEnginesize();
                int Km=beans.getKm();
                int price=beans.getPrice();
                int seats=beans.getSeats();
                int year=beans.getYear();
                boolean Ac=beans.getAirconditioning();
                boolean Anti=beans.getAntilock();
                boolean brake=beans.getBrakeassist();
                boolean central=beans.getCentrallock();
                boolean cloth=beans.getClothtrim();
                boolean airbag=beans.getDualairbag();
                boolean immob=beans.getEngineimmobilizer();
                boolean halo=beans.getHalogen();
                boolean hill=beans.getHillholder();
                boolean PS=beans.getLeathersteering();
                boolean map=beans.getMap();
                boolean Mob=beans.getMobcon();
                boolean park=beans.getParkdist();
                boolean rear=beans.getRearspoiler();
                boolean trip=beans.getTripcomp();
                boolean usb=beans.getUsb();
                boolean wipers=beans.getWipers();
                boolean PM=beans.getpowermirror();
                boolean LSW=beans.getLeathersteering();
               
                
		int num=price;
		DecimalFormat df = new DecimalFormat();
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setGroupingSeparator(',');
		
		df.setDecimalFormatSymbols(dfs);
		
	

                labelname.setText(Make +"  "+ year +"  "+ Model);
                labelPrice.setText("RS. "+ df.format((int)num));
                
                valBody.setText("   "+body);
                valColor.setText("   "+colors);
                valDoors.setText("   "+String.valueOf(doors));
                valFuel.setText("   "+fuel);
                valKm.setText("   "+String.valueOf(Km));
                valSeats.setText("   "+String.valueOf(seats));
                valTrans.setText("   "+String.valueOf(Trans));
                valcylin.setText("   "+String.valueOf(cylin));
                valDrive.setText("   "+drive);
                
                value(Ac);
                valac.setIcon(icon);
                value(Anti);
                valanti.setIcon(icon);
                value(LSW);
                valLSW.setIcon(icon);
                value(Mob);
                valmob.setIcon(icon);
                value(PM);
                valpm.setIcon(icon);
                value(PS);
                valps.setIcon(icon);
                value(airbag);
                valairbag.setIcon(icon);
                value(brake);
                valbrake.setIcon(icon);
                value(central);
                valcentral.setIcon(icon);
                value(cloth);
                valcloth.setIcon(icon);
                value(halo);
                valhalo.setIcon(icon);
                value(hill);
                valhill.setIcon(icon);
                value(immob);
                valim.setIcon(icon);
                value(map);
                valmap.setIcon(icon);
                value(park);
                valpark.setIcon(icon);
                value(rear);
                valrear.setIcon(icon);
                value(trip);
                valtrip.setIcon(icon);
                value(usb);
                valusb.setIcon(icon);
                value(wipers);
                valwiper.setIcon(icon);
                        
                
                
                
                
                
                int w = labelimage.getWidth();
                int h =labelimage.getHeight();

                ImageIcon icon = new ImageIcon(""+Img);
                Image img = icon.getImage();

                BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

                Graphics g = bi.createGraphics();
                g.drawImage(img, 0, 0, w, h, null);

                labelimage.setIcon(new ImageIcon(bi));
            
        
                
               }
                
                                                
            
            }
        }
        catch(Exception e){e.printStackTrace();}
        
        
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        btnSignout = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        btnBuy = new javax.swing.JLabel();
        labelimage = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valBody = new javax.swing.JTextField();
        valFuel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valDrive = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valKm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        valDoors = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        valcylin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        valColor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        valTrans = new javax.swing.JTextField();
        valSeats = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        valairbag = new javax.swing.JLabel();
        valac = new javax.swing.JLabel();
        valanti = new javax.swing.JLabel();
        valbrake = new javax.swing.JLabel();
        valps = new javax.swing.JLabel();
        valpm = new javax.swing.JLabel();
        valwiper = new javax.swing.JLabel();
        valrear = new javax.swing.JLabel();
        valcentral = new javax.swing.JLabel();
        valhill = new javax.swing.JLabel();
        valim = new javax.swing.JLabel();
        valtrip = new javax.swing.JLabel();
        valhalo = new javax.swing.JLabel();
        valcloth = new javax.swing.JLabel();
        valusb = new javax.swing.JLabel();
        valmap = new javax.swing.JLabel();
        valmob = new javax.swing.JLabel();
        valpark = new javax.swing.JLabel();
        valLSW = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        btnSignout.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        btnSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout.png"))); // NOI18N
        btnSignout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignoutMouseExited(evt);
            }
        });
        jPanel1.add(btnSignout);
        btnSignout.setBounds(1210, 20, 130, 40);

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
        btnBuy.setBounds(1050, 390, 193, 50);

        labelimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(labelimage);
        labelimage.setBounds(850, 60, 390, 310);

        labelname.setBackground(new java.awt.Color(255, 204, 0));
        labelname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelname.setText("Make,year and Model");
        panel.add(labelname);
        labelname.setBounds(40, 50, 820, 70);

        jLabel5.setBackground(new java.awt.Color(204, 239, 252));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("  Body Type:");
        jLabel5.setFocusable(false);
        jLabel5.setOpaque(true);
        panel.add(jLabel5);
        jLabel5.setBounds(40, 120, 90, 40);

        valBody.setEditable(false);
        valBody.setBackground(new java.awt.Color(204, 239, 252));
        valBody.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valBody.setBorder(null);
        valBody.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valBody.setEnabled(false);
        valBody.setFocusable(false);
        valBody.setSelectionColor(new java.awt.Color(38, 12, 79));
        valBody.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valBodyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valBodyFocusLost(evt);
            }
        });
        valBody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valBodyActionPerformed(evt);
            }
        });
        panel.add(valBody);
        valBody.setBounds(130, 120, 180, 40);

        valFuel.setEditable(false);
        valFuel.setBackground(new java.awt.Color(239, 239, 239));
        valFuel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valFuel.setBorder(null);
        valFuel.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valFuel.setEnabled(false);
        valFuel.setFocusable(false);
        valFuel.setSelectionColor(new java.awt.Color(38, 12, 79));
        valFuel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valFuelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valFuelFocusLost(evt);
            }
        });
        valFuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valFuelActionPerformed(evt);
            }
        });
        panel.add(valFuel);
        valFuel.setBounds(130, 160, 180, 40);

        jLabel7.setBackground(new java.awt.Color(239, 239, 239));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("  Fuel Type:");
        jLabel7.setFocusable(false);
        jLabel7.setOpaque(true);
        panel.add(jLabel7);
        jLabel7.setBounds(40, 160, 90, 40);

        valDrive.setEditable(false);
        valDrive.setBackground(new java.awt.Color(204, 239, 252));
        valDrive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valDrive.setBorder(null);
        valDrive.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valDrive.setEnabled(false);
        valDrive.setFocusable(false);
        valDrive.setSelectionColor(new java.awt.Color(38, 12, 79));
        valDrive.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valDriveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valDriveFocusLost(evt);
            }
        });
        valDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valDriveActionPerformed(evt);
            }
        });
        panel.add(valDrive);
        valDrive.setBounds(130, 200, 180, 40);

        jLabel8.setBackground(new java.awt.Color(204, 239, 252));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("  Drive Type:");
        jLabel8.setFocusable(false);
        jLabel8.setOpaque(true);
        panel.add(jLabel8);
        jLabel8.setBounds(40, 200, 90, 40);

        valKm.setEditable(false);
        valKm.setBackground(new java.awt.Color(204, 239, 252));
        valKm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valKm.setBorder(null);
        valKm.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valKm.setEnabled(false);
        valKm.setFocusable(false);
        valKm.setSelectionColor(new java.awt.Color(38, 12, 79));
        valKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valKmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valKmFocusLost(evt);
            }
        });
        valKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valKmActionPerformed(evt);
            }
        });
        panel.add(valKm);
        valKm.setBounds(420, 200, 180, 40);

        jLabel10.setBackground(new java.awt.Color(204, 239, 252));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Kilometers:");
        jLabel10.setFocusable(false);
        jLabel10.setOpaque(true);
        panel.add(jLabel10);
        jLabel10.setBounds(310, 200, 110, 40);

        valDoors.setEditable(false);
        valDoors.setBackground(new java.awt.Color(204, 239, 252));
        valDoors.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valDoors.setBorder(null);
        valDoors.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valDoors.setEnabled(false);
        valDoors.setFocusable(false);
        valDoors.setSelectionColor(new java.awt.Color(38, 12, 79));
        valDoors.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valDoorsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valDoorsFocusLost(evt);
            }
        });
        valDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valDoorsActionPerformed(evt);
            }
        });
        panel.add(valDoors);
        valDoors.setBounds(680, 200, 150, 40);

        jLabel15.setBackground(new java.awt.Color(255, 204, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Vehicle Features :");
        panel.add(jLabel15);
        jLabel15.setBounds(40, 242, 820, 60);

        jLabel11.setBackground(new java.awt.Color(204, 239, 252));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Doors:");
        jLabel11.setFocusable(false);
        jLabel11.setOpaque(true);
        panel.add(jLabel11);
        jLabel11.setBounds(600, 200, 80, 40);

        valcylin.setEditable(false);
        valcylin.setBackground(new java.awt.Color(239, 239, 239));
        valcylin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valcylin.setBorder(null);
        valcylin.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valcylin.setEnabled(false);
        valcylin.setFocusable(false);
        valcylin.setSelectionColor(new java.awt.Color(38, 12, 79));
        valcylin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valcylinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valcylinFocusLost(evt);
            }
        });
        valcylin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valcylinActionPerformed(evt);
            }
        });
        panel.add(valcylin);
        valcylin.setBounds(680, 160, 150, 40);

        jLabel13.setBackground(new java.awt.Color(239, 239, 239));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Cylinders:");
        jLabel13.setFocusable(false);
        jLabel13.setOpaque(true);
        panel.add(jLabel13);
        jLabel13.setBounds(600, 160, 80, 40);

        valColor.setEditable(false);
        valColor.setBackground(new java.awt.Color(204, 239, 252));
        valColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valColor.setBorder(null);
        valColor.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valColor.setEnabled(false);
        valColor.setFocusable(false);
        valColor.setSelectionColor(new java.awt.Color(38, 12, 79));
        valColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valColorFocusLost(evt);
            }
        });
        valColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valColorActionPerformed(evt);
            }
        });
        panel.add(valColor);
        valColor.setBounds(420, 120, 180, 40);

        jLabel14.setBackground(new java.awt.Color(204, 239, 252));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Color:");
        jLabel14.setFocusable(false);
        jLabel14.setOpaque(true);
        panel.add(jLabel14);
        jLabel14.setBounds(310, 120, 110, 40);

        valTrans.setEditable(false);
        valTrans.setBackground(new java.awt.Color(239, 239, 239));
        valTrans.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valTrans.setBorder(null);
        valTrans.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valTrans.setEnabled(false);
        valTrans.setFocusable(false);
        valTrans.setSelectionColor(new java.awt.Color(38, 12, 79));
        valTrans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valTransFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valTransFocusLost(evt);
            }
        });
        valTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valTransActionPerformed(evt);
            }
        });
        panel.add(valTrans);
        valTrans.setBounds(420, 160, 180, 40);

        valSeats.setEditable(false);
        valSeats.setBackground(new java.awt.Color(204, 239, 252));
        valSeats.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valSeats.setBorder(null);
        valSeats.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        valSeats.setEnabled(false);
        valSeats.setFocusable(false);
        valSeats.setSelectionColor(new java.awt.Color(38, 12, 79));
        valSeats.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                valSeatsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                valSeatsFocusLost(evt);
            }
        });
        valSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valSeatsActionPerformed(evt);
            }
        });
        panel.add(valSeats);
        valSeats.setBounds(680, 120, 150, 40);

        jLabel20.setBackground(new java.awt.Color(239, 239, 239));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Transmission:");
        jLabel20.setFocusable(false);
        jLabel20.setOpaque(true);
        panel.add(jLabel20);
        jLabel20.setBounds(310, 160, 110, 40);

        jLabel21.setBackground(new java.awt.Color(204, 239, 252));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Seats:");
        jLabel21.setFocusable(false);
        jLabel21.setOpaque(true);
        panel.add(jLabel21);
        jLabel21.setBounds(600, 120, 80, 40);

        jLabel23.setBackground(new java.awt.Color(204, 239, 252));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("  Air Conditioning");
        jLabel23.setFocusable(false);
        jLabel23.setOpaque(true);
        panel.add(jLabel23);
        jLabel23.setBounds(40, 300, 140, 30);

        jLabel43.setBackground(new java.awt.Color(239, 239, 239));
        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("  Anti Lock Braking");
        jLabel43.setAlignmentX(0.5F);
        jLabel43.setAutoscrolls(true);
        jLabel43.setFocusable(false);
        jLabel43.setOpaque(true);
        panel.add(jLabel43);
        jLabel43.setBounds(40, 330, 140, 30);

        jLabel25.setBackground(new java.awt.Color(204, 239, 252));
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("  Brake Assist");
        jLabel25.setAlignmentX(0.5F);
        jLabel25.setAutoscrolls(true);
        jLabel25.setFocusable(false);
        jLabel25.setOpaque(true);
        panel.add(jLabel25);
        jLabel25.setBounds(40, 360, 140, 30);

        jLabel26.setBackground(new java.awt.Color(239, 239, 239));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("  Power Steering");
        jLabel26.setAlignmentX(0.5F);
        jLabel26.setAutoscrolls(true);
        jLabel26.setFocusable(false);
        jLabel26.setOpaque(true);
        panel.add(jLabel26);
        jLabel26.setBounds(40, 390, 140, 30);

        jLabel27.setBackground(new java.awt.Color(204, 239, 252));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("  Power Mirror");
        jLabel27.setAlignmentX(0.5F);
        jLabel27.setAutoscrolls(true);
        jLabel27.setFocusable(false);
        jLabel27.setOpaque(true);
        panel.add(jLabel27);
        jLabel27.setBounds(40, 420, 140, 30);

        jLabel28.setBackground(new java.awt.Color(204, 239, 252));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("  Mobile Phone Connectivity");
        jLabel28.setFocusable(false);
        jLabel28.setOpaque(true);
        panel.add(jLabel28);
        jLabel28.setBounds(610, 300, 180, 30);

        jLabel29.setBackground(new java.awt.Color(204, 239, 252));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("  Trip Computer");
        jLabel29.setFocusable(false);
        jLabel29.setOpaque(true);
        panel.add(jLabel29);
        jLabel29.setBounds(420, 300, 140, 30);

        jLabel30.setBackground(new java.awt.Color(204, 239, 252));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("  Central Locking");
        jLabel30.setFocusable(false);
        jLabel30.setOpaque(true);
        panel.add(jLabel30);
        jLabel30.setBounds(230, 360, 140, 30);

        jLabel31.setBackground(new java.awt.Color(239, 239, 239));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("  Rear Spoiler");
        jLabel31.setFocusable(false);
        jLabel31.setOpaque(true);
        panel.add(jLabel31);
        jLabel31.setBounds(230, 330, 140, 30);

        jLabel32.setBackground(new java.awt.Color(239, 239, 239));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("  Parking Distance Control");
        jLabel32.setFocusable(false);
        jLabel32.setOpaque(true);
        panel.add(jLabel32);
        jLabel32.setBounds(610, 330, 180, 30);

        jLabel33.setBackground(new java.awt.Color(239, 239, 239));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("  Hill Holder");
        jLabel33.setFocusable(false);
        jLabel33.setOpaque(true);
        panel.add(jLabel33);
        jLabel33.setBounds(230, 390, 140, 30);

        jLabel34.setBackground(new java.awt.Color(204, 239, 252));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("  Engine Immobilizer");
        jLabel34.setFocusable(false);
        jLabel34.setOpaque(true);
        panel.add(jLabel34);
        jLabel34.setBounds(230, 420, 140, 30);

        jLabel36.setBackground(new java.awt.Color(239, 239, 239));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("  Dual Airbag Package");
        jLabel36.setFocusable(false);
        jLabel36.setOpaque(true);
        panel.add(jLabel36);
        jLabel36.setBounds(610, 390, 180, 30);

        jLabel35.setBackground(new java.awt.Color(204, 239, 252));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("  Cloth Trim");
        jLabel35.setFocusable(false);
        jLabel35.setOpaque(true);
        panel.add(jLabel35);
        jLabel35.setBounds(420, 360, 140, 30);

        jLabel37.setBackground(new java.awt.Color(239, 239, 239));
        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("  Usb Input Socket");
        jLabel37.setFocusable(false);
        jLabel37.setOpaque(true);
        panel.add(jLabel37);
        jLabel37.setBounds(420, 390, 140, 30);

        jLabel38.setBackground(new java.awt.Color(204, 239, 252));
        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("  Intermittent Wipers");
        jLabel38.setFocusable(false);
        jLabel38.setOpaque(true);
        panel.add(jLabel38);
        jLabel38.setBounds(230, 300, 140, 30);

        jLabel40.setBackground(new java.awt.Color(204, 239, 252));
        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("  Leather Steering Wheel");
        jLabel40.setFocusable(false);
        jLabel40.setOpaque(true);
        panel.add(jLabel40);
        jLabel40.setBounds(610, 360, 180, 30);

        jLabel39.setBackground(new java.awt.Color(204, 239, 252));
        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("  Map/Reading Lamps");
        jLabel39.setFocusable(false);
        jLabel39.setOpaque(true);
        panel.add(jLabel39);
        jLabel39.setBounds(420, 420, 140, 30);

        jLabel42.setBackground(new java.awt.Color(239, 239, 239));
        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("  Halogen Headlights");
        jLabel42.setFocusable(false);
        jLabel42.setOpaque(true);
        panel.add(jLabel42);
        jLabel42.setBounds(420, 330, 140, 30);

        labelPrice.setBackground(new java.awt.Color(255, 204, 0));
        labelPrice.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(0, 0, 153));
        labelPrice.setText("Rs.1,00,00,000");
        panel.add(labelPrice);
        labelPrice.setBounds(860, 10, 320, 50);

        valairbag.setBackground(new java.awt.Color(239, 239, 239));
        valairbag.setOpaque(true);
        panel.add(valairbag);
        valairbag.setBounds(790, 390, 40, 30);

        valac.setBackground(new java.awt.Color(206, 239, 252));
        valac.setOpaque(true);
        panel.add(valac);
        valac.setBounds(180, 300, 40, 30);

        valanti.setBackground(new java.awt.Color(239, 239, 239));
        valanti.setOpaque(true);
        panel.add(valanti);
        valanti.setBounds(180, 330, 40, 30);

        valbrake.setBackground(new java.awt.Color(206, 239, 252));
        valbrake.setOpaque(true);
        panel.add(valbrake);
        valbrake.setBounds(180, 360, 40, 30);

        valps.setBackground(new java.awt.Color(239, 239, 239));
        valps.setOpaque(true);
        panel.add(valps);
        valps.setBounds(180, 390, 40, 30);

        valpm.setBackground(new java.awt.Color(206, 239, 252));
        valpm.setOpaque(true);
        panel.add(valpm);
        valpm.setBounds(180, 420, 40, 30);

        valwiper.setBackground(new java.awt.Color(206, 239, 252));
        valwiper.setOpaque(true);
        panel.add(valwiper);
        valwiper.setBounds(370, 300, 40, 30);

        valrear.setBackground(new java.awt.Color(239, 239, 239));
        valrear.setOpaque(true);
        panel.add(valrear);
        valrear.setBounds(370, 330, 40, 30);

        valcentral.setBackground(new java.awt.Color(206, 239, 252));
        valcentral.setOpaque(true);
        panel.add(valcentral);
        valcentral.setBounds(370, 360, 40, 30);

        valhill.setBackground(new java.awt.Color(239, 239, 239));
        valhill.setOpaque(true);
        panel.add(valhill);
        valhill.setBounds(370, 390, 40, 30);

        valim.setBackground(new java.awt.Color(206, 239, 252));
        valim.setOpaque(true);
        panel.add(valim);
        valim.setBounds(370, 420, 40, 30);

        valtrip.setBackground(new java.awt.Color(206, 239, 252));
        valtrip.setOpaque(true);
        panel.add(valtrip);
        valtrip.setBounds(560, 300, 40, 30);

        valhalo.setBackground(new java.awt.Color(239, 239, 239));
        valhalo.setOpaque(true);
        panel.add(valhalo);
        valhalo.setBounds(560, 330, 40, 30);

        valcloth.setBackground(new java.awt.Color(206, 239, 252));
        valcloth.setOpaque(true);
        panel.add(valcloth);
        valcloth.setBounds(560, 360, 40, 30);

        valusb.setBackground(new java.awt.Color(239, 239, 239));
        valusb.setOpaque(true);
        panel.add(valusb);
        valusb.setBounds(560, 390, 40, 30);

        valmap.setBackground(new java.awt.Color(206, 239, 252));
        valmap.setOpaque(true);
        panel.add(valmap);
        valmap.setBounds(560, 420, 40, 30);

        valmob.setBackground(new java.awt.Color(206, 239, 252));
        valmob.setOpaque(true);
        panel.add(valmob);
        valmob.setBounds(790, 300, 40, 30);

        valpark.setBackground(new java.awt.Color(239, 239, 239));
        valpark.setOpaque(true);
        panel.add(valpark);
        valpark.setBounds(790, 330, 40, 30);

        valLSW.setBackground(new java.awt.Color(206, 239, 252));
        valLSW.setOpaque(true);
        panel.add(valLSW);
        valLSW.setBounds(790, 360, 40, 30);

        jPanel1.add(panel);
        panel.setBounds(40, 160, 1270, 500);

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

    private void btnSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignoutMouseClicked
        LoginFrame logfrm = new LoginFrame();

        this.dispose();
        logfrm.setVisible(true);
    }//GEN-LAST:event_btnSignoutMouseClicked

    private void btnSignoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignoutMouseEntered
        btnSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout hover.png")));
    }//GEN-LAST:event_btnSignoutMouseEntered

    private void btnSignoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignoutMouseExited
        btnSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/signout.png")));
    }//GEN-LAST:event_btnSignoutMouseExited

    private void btnBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseClicked
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
  
            String query = "insert into Sales (Date,User_id,Car_id) values (GETDATE(),"+User_id+","+User_id+")";
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

    private void valBodyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valBodyFocusGained
        valBody.setBackground(Color.decode("#cceffc"));
        valBody.setBorder(a);
    }//GEN-LAST:event_valBodyFocusGained

    private void valBodyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valBodyFocusLost
        valBody.setBackground(b);
    }//GEN-LAST:event_valBodyFocusLost

    private void valBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valBodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valBodyActionPerformed

    private void valFuelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valFuelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valFuelFocusGained

    private void valFuelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valFuelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valFuelFocusLost

    private void valFuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valFuelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valFuelActionPerformed

    private void valDriveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valDriveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valDriveFocusGained

    private void valDriveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valDriveFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valDriveFocusLost

    private void valDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valDriveActionPerformed

    private void valKmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valKmFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valKmFocusGained

    private void valKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valKmFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valKmFocusLost

    private void valKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valKmActionPerformed

    private void valDoorsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valDoorsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valDoorsFocusGained

    private void valDoorsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valDoorsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valDoorsFocusLost

    private void valDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valDoorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valDoorsActionPerformed

    private void valcylinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valcylinFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valcylinFocusGained

    private void valcylinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valcylinFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valcylinFocusLost

    private void valcylinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valcylinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valcylinActionPerformed

    private void valColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valColorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valColorFocusGained

    private void valColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valColorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valColorFocusLost

    private void valColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valColorActionPerformed

    private void valTransFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valTransFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valTransFocusGained

    private void valTransFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valTransFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valTransFocusLost

    private void valTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valTransActionPerformed

    private void valSeatsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valSeatsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_valSeatsFocusGained

    private void valSeatsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valSeatsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valSeatsFocusLost

    private void valSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valSeatsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuy;
    private javax.swing.JLabel btnSignout;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPic;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel labelimage;
    private javax.swing.JLabel labelname;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField valBody;
    private javax.swing.JTextField valColor;
    private javax.swing.JTextField valDoors;
    private javax.swing.JTextField valDrive;
    private javax.swing.JTextField valFuel;
    private javax.swing.JTextField valKm;
    private javax.swing.JLabel valLSW;
    private javax.swing.JTextField valSeats;
    private javax.swing.JTextField valTrans;
    private javax.swing.JLabel valac;
    private javax.swing.JLabel valairbag;
    private javax.swing.JLabel valanti;
    private javax.swing.JLabel valbrake;
    private javax.swing.JLabel valcentral;
    private javax.swing.JLabel valcloth;
    private javax.swing.JTextField valcylin;
    private javax.swing.JLabel valhalo;
    private javax.swing.JLabel valhill;
    private javax.swing.JLabel valim;
    private javax.swing.JLabel valmap;
    private javax.swing.JLabel valmob;
    private javax.swing.JLabel valpark;
    private javax.swing.JLabel valpm;
    private javax.swing.JLabel valps;
    private javax.swing.JLabel valrear;
    private javax.swing.JLabel valtrip;
    private javax.swing.JLabel valusb;
    private javax.swing.JLabel valwiper;
    // End of variables declaration//GEN-END:variables

}
