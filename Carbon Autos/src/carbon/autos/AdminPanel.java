package carbon.autos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class AdminPanel extends javax.swing.JFrame {

    static String User;
    
    public AdminPanel() {
       initComponents();
        setTitle("Carbon Autos");
        setVisible(true);
        this.setResizable(false);
        
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
                    
                        ImageIcon icon = new javax.swing.ImageIcon(""+Img);
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
        jLabel7 = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        search_user = new javax.swing.JLabel();
        change_password = new javax.swing.JLabel();
        add_user = new javax.swing.JLabel();
        add_car = new javax.swing.JLabel();
        delete_user = new javax.swing.JLabel();
        delete_car = new javax.swing.JLabel();
        search_car = new javax.swing.JLabel();
        sales_history = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/ap_rotate1.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 0, 150, 150);

        labelWelcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelWelcome.setText("Welcome User");
        jPanel1.add(labelWelcome);
        labelWelcome.setBounds(1030, 80, 210, 40);

        labelPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/WelcomePic.png"))); // NOI18N
        jPanel1.add(labelPic);
        labelPic.setBounds(1220, 60, 104, 100);

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

        search_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a user icon.png"))); // NOI18N
        search_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_userMouseExited(evt);
            }
        });

        change_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/change password icon.png"))); // NOI18N
        change_password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passwordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                change_passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                change_passwordMouseExited(evt);
            }
        });

        add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a user icon.png"))); // NOI18N
        add_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });

        add_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a car icon.png"))); // NOI18N
        add_car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_carMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_carMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_carMouseExited(evt);
            }
        });

        delete_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a user icon.png"))); // NOI18N
        delete_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_userMouseExited(evt);
            }
        });

        delete_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a car icon.png"))); // NOI18N
        delete_car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_carMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_carMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_carMouseExited(evt);
            }
        });

        search_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a car icon.png"))); // NOI18N
        search_car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_carMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_carMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_carMouseExited(evt);
            }
        });

        sales_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/sales history icon.png"))); // NOI18N
        sales_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales_history.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_historyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sales_historyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sales_historyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(add_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_car, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search_user, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_car)
                    .addComponent(delete_user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sales_history)
                    .addComponent(change_password))
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_car)
                    .addComponent(sales_history)
                    .addComponent(search_car)
                    .addComponent(add_car))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_user)
                    .addComponent(add_user))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 130, 1370, 600);

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

    private void sales_historyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_historyMouseExited
        sales_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/sales history icon.png")));
    }//GEN-LAST:event_sales_historyMouseExited

    private void sales_historyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_historyMouseEntered
        sales_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/sales history hover.png")));
    }//GEN-LAST:event_sales_historyMouseEntered

    private void sales_historyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_historyMouseClicked
        SalesHistory sh = new SalesHistory();

        this.dispose();
        sh.setVisible(true);
    }//GEN-LAST:event_sales_historyMouseClicked

    private void search_carMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_carMouseExited
        search_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a car icon.png")));
    }//GEN-LAST:event_search_carMouseExited

    private void search_carMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_carMouseEntered
        search_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a car hover.png")));
    }//GEN-LAST:event_search_carMouseEntered

    private void search_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_carMouseClicked
        SearchCar sc = new SearchCar();

        this.dispose();
        sc.setVisible(true);
    }//GEN-LAST:event_search_carMouseClicked

    private void delete_carMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_carMouseExited
        delete_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a car icon.png")));
    }//GEN-LAST:event_delete_carMouseExited

    private void delete_carMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_carMouseEntered
        delete_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a car hover.png")));
    }//GEN-LAST:event_delete_carMouseEntered

    private void delete_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_carMouseClicked
        DeleteCar dc = new DeleteCar();

        this.dispose();
        dc.setVisible(true);
    }//GEN-LAST:event_delete_carMouseClicked

    private void delete_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_userMouseExited
        delete_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a user icon.png")));
    }//GEN-LAST:event_delete_userMouseExited

    private void delete_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_userMouseEntered
        delete_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/delete a user hover.png")));
    }//GEN-LAST:event_delete_userMouseEntered

    private void delete_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_userMouseClicked
        DeleteUser du = new DeleteUser();

        this.dispose();
        du.setVisible(true);
    }//GEN-LAST:event_delete_userMouseClicked

    private void add_carMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_carMouseExited
        add_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a car icon.png")));
    }//GEN-LAST:event_add_carMouseExited

    private void add_carMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_carMouseEntered
        add_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a car hover.png")));
    }//GEN-LAST:event_add_carMouseEntered

    private void add_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_carMouseClicked
        AddCar add = new AddCar();
        this.dispose();
        
    }//GEN-LAST:event_add_carMouseClicked

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a user icon.png")));
    }//GEN-LAST:event_add_userMouseExited

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
        add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/add a user hover.png")));
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseClicked
        AddUser au = new AddUser();

        this.dispose();
        au.setVisible(true);
    }//GEN-LAST:event_add_userMouseClicked

    private void change_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseExited
        change_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/change password icon.png")));
    }//GEN-LAST:event_change_passwordMouseExited

    private void change_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseEntered
        change_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/change password hover.png")));
    }//GEN-LAST:event_change_passwordMouseEntered

    private void change_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passwordMouseClicked
        ProfileSetting cp = new ProfileSetting();

        this.dispose();
        cp.setVisible(true);
    }//GEN-LAST:event_change_passwordMouseClicked

    private void search_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_userMouseExited
        search_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a user icon.png")));
    }//GEN-LAST:event_search_userMouseExited

    private void search_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_userMouseEntered
        search_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carbon/autos/search a user hover.png")));
    }//GEN-LAST:event_search_userMouseEntered

    private void search_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_userMouseClicked
        SearchUser su = new SearchUser();

        this.dispose();
        su.setVisible(true);
    }//GEN-LAST:event_search_userMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_car;
    private javax.swing.JLabel add_user;
    private javax.swing.JLabel change_password;
    private javax.swing.JLabel delete_car;
    private javax.swing.JLabel delete_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelPic;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel sales_history;
    private javax.swing.JLabel search_car;
    private javax.swing.JLabel search_user;
    // End of variables declaration//GEN-END:variables
}
