
package Classes;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.sql.*;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.SimpleDateFormat;
public class AdminPanel extends javax.swing.JFrame {
int total;
    public AdminPanel() {
        initComponents();
        jp.setVisible(true);
        jp1.setVisible(false);
        jpsell.setVisible(false);
        jpshow.setVisible(false);
        jp4.setVisible(false);
        jpnew.setVisible(false);
        jpdeal.setVisible(false);
        dealercal.setVisible(false);
        sellcal.setVisible(false);
        custshow.setVisible(false);
        jPanel1.setVisible(false);
        jpbill.setVisible(false);
        
        AutoCompleteDecorator.decorate(prodtext);
        AutoCompleteDecorator.decorate(ordprod);
        AutoCompleteDecorator.decorate(dealertxt);
        AutoCompleteDecorator.decorate(dealtext);
        AutoCompleteDecorator.decorate(sellprod);
        AutoCompleteDecorator.decorate(dealershow);
        AutoCompleteDecorator.decorate(dealershow1);
        AutoCompleteDecorator.decorate(prodshow);
        try{
           String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root",""); 
            String userr = "select DISTINCT * from pname";
            PreparedStatement st = con.prepareStatement(userr);
            ResultSet r=st.executeQuery();
            String dealerr = "select DISTINCT * from dname";
            PreparedStatement dst = con.prepareStatement(dealerr);
            ResultSet rrr=dst.executeQuery();
            String sell = "select DISTINCT * from pname";
            PreparedStatement sellst = con.prepareStatement(sell);
            ResultSet ss=sellst.executeQuery();

            while (r.next()) {  
           prodtext.addItem(r.getString("name"));  
           ordprod.addItem(r.getString("name")); 
           prodshow.addItem(r.getString("name"));
             }
            while (rrr.next()) {  
            dealtext.addItem(rrr.getString("name"));  
            dealertxt.addItem(rrr.getString("name"));  
            dealershow.addItem(rrr.getString("name")); 
            
            }
            while (ss.next()) {  
           sellprod.addItem(ss.getString("name"));  
           dealershow1.addItem(ss.getString("name"));
           
       
             }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERROR");

            }


            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jp = new javax.swing.JPanel();
        jpnew = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        newprod = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jp1 = new javax.swing.JPanel();
        prodtext = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pricetext = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        addnewprod = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        delprod = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        deldeal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        newdeal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dealtext = new javax.swing.JComboBox<>();
        quanttext = new javax.swing.JTextField();
        jpsell = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        sellprod = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sellprice = new javax.swing.JTextField();
        sellbutt = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cmob = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        selltotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        selltable = new javax.swing.JTable();
        sellprice1 = new javax.swing.JTextField();
        sellbutt1 = new javax.swing.JButton();
        selltotal1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jpshow = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        showtable = new javax.swing.JTable();
        jp4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ordprod = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        quanttxt = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        dealertxt = new javax.swing.JComboBox<>();
        jpdeal = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        adddeal = new javax.swing.JButton();
        newdel = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        dealercal = new javax.swing.JPanel();
        todealer = new com.toedter.calendar.JDateChooser();
        fromdealer = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dealershow = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        dealshow = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        sellcal = new javax.swing.JPanel();
        todealer1 = new com.toedter.calendar.JDateChooser();
        fromdealer1 = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        dealershow1 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        dealshow1 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        todealer2 = new com.toedter.calendar.JDateChooser();
        fromdealer2 = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        dealshow2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        custshow = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        custtable = new javax.swing.JTable();
        custshowexit = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        prodshow = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpbill = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        billid = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        billcname = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        billcmob = new javax.swing.JTextField();
        billtotal = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        billdate = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        billtime = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        billdisc = new javax.swing.JTextField();
        discamt = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        billtotal1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        billdisc1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        sidepanel.setBackground(new java.awt.Color(0, 51, 102));
        sidepanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/admin-settings-male.png"))); // NOI18N
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 160));

        jPanel4.setBackground(new java.awt.Color(62, 102, 134));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(102, 102, 255)));

        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ssell.png"))); // NOI18N
        jLabel3.setText("  Sell Products");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidepanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 280, 60));

        jPanel5.setBackground(new java.awt.Color(62, 102, 134));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(102, 102, 255)));

        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/aad.png"))); // NOI18N
        jLabel4.setText("  Add Products");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        sidepanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 60));

        jPanel6.setBackground(new java.awt.Color(62, 102, 134));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(102, 102, 255)));

        jLabel6.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/boox.png"))); // NOI18N
        jLabel6.setText("  Show Products");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 280, 60));

        jPanel7.setBackground(new java.awt.Color(62, 102, 134));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(102, 102, 255)));

        jLabel5.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/order.png"))); // NOI18N
        jLabel5.setText("  Order Products");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 280, 60));

        jButton2.setBackground(new java.awt.Color(62, 102, 134));
        jButton2.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        jButton2.setText("  Log Out");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0), new java.awt.Color(255, 204, 255), new java.awt.Color(204, 0, 204)));
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sidepanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 280, 60));

        jp.setBackground(new java.awt.Color(30, 48, 70));
        jp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnew.setBackground(new java.awt.Color(30, 48, 70));
        jpnew.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel16.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Products:");

        newprod.setBackground(new java.awt.Color(102, 102, 102));
        newprod.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        newprod.setForeground(new java.awt.Color(255, 255, 255));
        newprod.setFocusCycleRoot(true);

        jButton4.setBackground(new java.awt.Color(86, 86, 86));
        jButton4.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton4.setText("Add Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(30, 48, 70));
        jLabel17.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Add New Product");

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setText("X");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnewLayout = new javax.swing.GroupLayout(jpnew);
        jpnew.setLayout(jpnewLayout);
        jpnewLayout.setHorizontalGroup(
            jpnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnewLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(120, 120, 120)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnewLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(jpnewLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel16)
                .addGap(63, 63, 63)
                .addComponent(newprod, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jpnewLayout.setVerticalGroup(
            jpnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewLayout.createSequentialGroup()
                .addGroup(jpnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addComponent(jButton5))
                .addGap(87, 87, 87)
                .addGroup(jpnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(newprod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jp.add(jpnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 610, 340));

        jp1.setBackground(new java.awt.Color(30, 48, 70));
        jp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jp1.setPreferredSize(new java.awt.Dimension(890, 709));

        prodtext.setBackground(new java.awt.Color(102, 102, 102));
        prodtext.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        prodtext.setForeground(new java.awt.Color(255, 255, 255));
        prodtext.setAutoscrolls(true);
        prodtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodtextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Products:");

        jLabel8.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity:");

        jLabel9.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price:");

        jLabel10.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dealer:");

        pricetext.setBackground(new java.awt.Color(102, 102, 102));
        pricetext.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        pricetext.setForeground(new java.awt.Color(255, 255, 255));
        pricetext.setFocusCycleRoot(true);

        jButton3.setBackground(new java.awt.Color(86, 86, 86));
        jButton3.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton3.setText("Add Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        addnewprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-add-64.png"))); // NOI18N
        addnewprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addnewprodMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("New Product?");

        delprod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-delete-64.png"))); // NOI18N
        delprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delprodMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Delete Product?");

        deldeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-delete-64.png"))); // NOI18N
        deldeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deldealMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Delete Dealer?");

        newdeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-add-64.png"))); // NOI18N
        newdeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newdealMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("New Dealer?");

        dealtext.setBackground(new java.awt.Color(102, 102, 102));
        dealtext.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        dealtext.setForeground(new java.awt.Color(255, 255, 255));
        dealtext.setAutoscrolls(true);
        dealtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealtextActionPerformed(evt);
            }
        });

        quanttext.setBackground(new java.awt.Color(102, 102, 102));
        quanttext.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        quanttext.setForeground(new java.awt.Color(255, 255, 255));
        quanttext.setFocusCycleRoot(true);

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delprod)
                                    .addComponent(deldeal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dealtext, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(82, 82, 82)
                                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(prodtext, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pricetext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(quanttext, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(addnewprod)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newdeal)
                                .addGap(83, 83, 83))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodtext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(88, 88, 88)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(quanttext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dealtext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delprod)
                            .addComponent(addnewprod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(232, 232, 232)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deldeal)
                            .addComponent(newdeal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))))
                .addGap(67, 67, 67)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jp.add(jp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 67, 950, 640));

        jpsell.setBackground(new java.awt.Color(30, 48, 70));
        jpsell.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpsell.setPreferredSize(new java.awt.Dimension(890, 709));

        jLabel12.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Products:");

        sellprod.setBackground(new java.awt.Color(102, 102, 102));
        sellprod.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        sellprod.setForeground(new java.awt.Color(255, 255, 255));
        sellprod.setAutoscrolls(true);
        sellprod.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sellprodItemStateChanged(evt);
            }
        });
        sellprod.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                sellprodComponentShown(evt);
            }
        });
        sellprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellprodActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity:");

        jLabel25.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Price:");

        sellprice.setBackground(new java.awt.Color(102, 102, 102));
        sellprice.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        sellprice.setForeground(new java.awt.Color(255, 255, 255));
        sellprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellprice.setFocusCycleRoot(true);

        sellbutt.setBackground(new java.awt.Color(86, 86, 86));
        sellbutt.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        sellbutt.setText("Sell");
        sellbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbuttActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Customer Name:");

        cname.setBackground(new java.awt.Color(102, 102, 102));
        cname.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        cname.setForeground(new java.awt.Color(255, 255, 255));
        cname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cname.setFocusCycleRoot(true);
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Customer Mobile:");

        cmob.setBackground(new java.awt.Color(102, 102, 102));
        cmob.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        cmob.setForeground(new java.awt.Color(255, 255, 255));
        cmob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmob.setFocusCycleRoot(true);

        jLabel26.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total Price:");

        selltotal.setBackground(new java.awt.Color(102, 102, 102));
        selltotal.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        selltotal.setForeground(new java.awt.Color(255, 255, 255));
        selltotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selltotal.setEnabled(false);
        selltotal.setFocusCycleRoot(true);

        selltable.setBackground(new java.awt.Color(51, 51, 51));
        selltable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        selltable.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        selltable.setForeground(new java.awt.Color(153, 153, 153));
        selltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Price", "Total"
            }
        ));
        selltable.setGridColor(new java.awt.Color(0, 0, 0));
        selltable.setRowHeight(40);
        selltable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(selltable);

        sellprice1.setBackground(new java.awt.Color(102, 102, 102));
        sellprice1.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        sellprice1.setForeground(new java.awt.Color(255, 255, 255));
        sellprice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellprice1.setFocusCycleRoot(true);
        sellprice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellprice1FocusLost(evt);
            }
        });
        sellprice1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                sellprice1InputMethodTextChanged(evt);
            }
        });

        sellbutt1.setBackground(new java.awt.Color(86, 86, 86));
        sellbutt1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        sellbutt1.setText("Add to list");
        sellbutt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellbutt1MouseClicked(evt);
            }
        });
        sellbutt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbutt1ActionPerformed(evt);
            }
        });

        selltotal1.setBackground(new java.awt.Color(102, 102, 102));
        selltotal1.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        selltotal1.setForeground(new java.awt.Color(255, 255, 255));
        selltotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        selltotal1.setEnabled(false);
        selltotal1.setFocusCycleRoot(true);

        jLabel29.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Total Cart Price:");

        javax.swing.GroupLayout jpsellLayout = new javax.swing.GroupLayout(jpsell);
        jpsell.setLayout(jpsellLayout);
        jpsellLayout.setHorizontalGroup(
            jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(selltotal)
                        .addComponent(cname)
                        .addComponent(cmob)
                        .addComponent(sellprod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sellprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpsellLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsellLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(selltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsellLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(sellbutt1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sellbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jpsellLayout.setVerticalGroup(
            jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpsellLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellprod, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38)
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpsellLayout.createSequentialGroup()
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(22, 22, 22)
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(sellprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpsellLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmob, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGroup(jpsellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpsellLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(sellbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpsellLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(sellbutt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpsellLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(selltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jp.add(jpsell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 950, 640));

        jpshow.setBackground(new java.awt.Color(30, 48, 70));
        jpshow.setPreferredSize(new java.awt.Dimension(890, 709));

        jButton6.setBackground(new java.awt.Color(86, 86, 86));
        jButton6.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton6.setText("Available Products");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(86, 86, 86));
        jButton9.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton9.setText("Dealer Data");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(86, 86, 86));
        jButton10.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton10.setText("Sell Data");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        showtable.setBackground(new java.awt.Color(51, 51, 51));
        showtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        showtable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        showtable.setForeground(new java.awt.Color(153, 153, 153));
        showtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product", "Dealer", "Price", "Quantity", "Total"
            }
        ));
        showtable.setAlignmentX(1.0F);
        showtable.setAlignmentY(1.0F);
        showtable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showtable.setGridColor(new java.awt.Color(0, 0, 0));
        showtable.setRowHeight(40);
        showtable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(showtable);

        javax.swing.GroupLayout jpshowLayout = new javax.swing.GroupLayout(jpshow);
        jpshow.setLayout(jpshowLayout);
        jpshowLayout.setHorizontalGroup(
            jpshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpshowLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jpshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpshowLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(126, 126, 126)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jpshowLayout.setVerticalGroup(
            jpshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpshowLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jpshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jp.add(jpshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 950, 630));

        jp4.setBackground(new java.awt.Color(30, 48, 70));
        jp4.setPreferredSize(new java.awt.Dimension(890, 709));

        jLabel14.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Products:");

        ordprod.setBackground(new java.awt.Color(102, 102, 102));
        ordprod.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        ordprod.setForeground(new java.awt.Color(255, 255, 255));
        ordprod.setAutoscrolls(true);
        ordprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordprodActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Quantity:");

        quanttxt.setBackground(new java.awt.Color(102, 102, 102));
        quanttxt.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        quanttxt.setForeground(new java.awt.Color(255, 255, 255));
        quanttxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", " " }));
        quanttxt.setAutoscrolls(true);

        jLabel23.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Dealer:");

        jButton8.setBackground(new java.awt.Color(86, 86, 86));
        jButton8.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton8.setText("Order Product");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        dealertxt.setBackground(new java.awt.Color(102, 102, 102));
        dealertxt.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        dealertxt.setForeground(new java.awt.Color(255, 255, 255));
        dealertxt.setAutoscrolls(true);
        dealertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealertxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel23)
                .addGap(106, 106, 106)
                .addComponent(dealertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp4Layout.createSequentialGroup()
                    .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp4Layout.createSequentialGroup()
                            .addGap(289, 289, 289)
                            .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15))
                            .addGap(82, 82, 82)
                            .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ordprod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quanttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jp4Layout.createSequentialGroup()
                            .addGap(384, 384, 384)
                            .addComponent(jButton8)))
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(dealertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
            .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp4Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ordprod, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGap(88, 88, 88)
                    .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(quanttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(229, 229, 229)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        jp.add(jp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 952, 640));

        jpdeal.setBackground(new java.awt.Color(30, 48, 70));
        jpdeal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel22.setBackground(new java.awt.Color(30, 48, 70));
        jLabel22.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Add New Dealer");

        jLabel24.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Dealers:");

        adddeal.setBackground(new java.awt.Color(86, 86, 86));
        adddeal.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        adddeal.setText("Add Dealer");
        adddeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddealActionPerformed(evt);
            }
        });

        newdel.setBackground(new java.awt.Color(102, 102, 102));
        newdel.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        newdel.setForeground(new java.awt.Color(255, 255, 255));
        newdel.setFocusCycleRoot(true);
        newdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newdelActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setText("X");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpdealLayout = new javax.swing.GroupLayout(jpdeal);
        jpdeal.setLayout(jpdealLayout);
        jpdealLayout.setHorizontalGroup(
            jpdealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdealLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpdealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpdealLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(120, 120, 120)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpdealLayout.createSequentialGroup()
                        .addComponent(adddeal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(jpdealLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel24)
                .addGap(63, 63, 63)
                .addComponent(newdel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );
        jpdealLayout.setVerticalGroup(
            jpdealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpdealLayout.createSequentialGroup()
                .addGroup(jpdealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpdealLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addComponent(jButton7))
                .addGap(87, 87, 87)
                .addGroup(jpdealLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(newdel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(adddeal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jp.add(jpdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 610, 340));

        dealercal.setBackground(new java.awt.Color(30, 48, 70));
        dealercal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel30.setBackground(new java.awt.Color(30, 48, 70));
        jLabel30.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Dealer:");

        jLabel31.setBackground(new java.awt.Color(30, 48, 70));
        jLabel31.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("From");

        dealershow.setBackground(new java.awt.Color(102, 102, 102));
        dealershow.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        dealershow.setForeground(new java.awt.Color(255, 255, 255));
        dealershow.setAutoscrolls(true);
        dealershow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealershowActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(30, 48, 70));
        jLabel32.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("To");

        dealshow.setBackground(new java.awt.Color(86, 86, 86));
        dealshow.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        dealshow.setText("Show Data");
        dealshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealshowActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 0, 0));
        jButton12.setText("X");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dealercalLayout = new javax.swing.GroupLayout(dealercal);
        dealercal.setLayout(dealercalLayout);
        dealercalLayout.setHorizontalGroup(
            dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealercalLayout.createSequentialGroup()
                .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dealercalLayout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addComponent(fromdealer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(todealer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(dealercalLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(118, 118, 118)))
                .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dealercalLayout.createSequentialGroup()
                        .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(dealershow, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealercalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dealshow, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        dealercalLayout.setVerticalGroup(
            dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealercalLayout.createSequentialGroup()
                .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dealercalLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealercalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dealercalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dealershow, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(todealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromdealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(dealshow, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jp.add(dealercal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 610, 230));

        sellcal.setBackground(new java.awt.Color(30, 48, 70));
        sellcal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        sellcal.setRequestFocusEnabled(false);
        sellcal.setVerifyInputWhenFocusTarget(false);

        jLabel33.setBackground(new java.awt.Color(30, 48, 70));
        jLabel33.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Products:");

        jLabel34.setBackground(new java.awt.Color(30, 48, 70));
        jLabel34.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("From");

        dealershow1.setBackground(new java.awt.Color(102, 102, 102));
        dealershow1.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        dealershow1.setForeground(new java.awt.Color(255, 255, 255));
        dealershow1.setAutoscrolls(true);
        dealershow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealershow1ActionPerformed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(30, 48, 70));
        jLabel35.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("To");

        dealshow1.setBackground(new java.awt.Color(86, 86, 86));
        dealshow1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        dealshow1.setText("Show Data");
        dealshow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealshow1ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 0, 0));
        jButton13.setText("X");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(30, 48, 70));
        jLabel36.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("From");

        jLabel37.setBackground(new java.awt.Color(30, 48, 70));
        jLabel37.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("To");

        dealshow2.setBackground(new java.awt.Color(86, 86, 86));
        dealshow2.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        dealshow2.setText("Show Data");
        dealshow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealshow2ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Selling data sorted by Date only");

        jLabel39.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Selling data sorted by Date and Products");

        javax.swing.GroupLayout sellcalLayout = new javax.swing.GroupLayout(sellcal);
        sellcal.setLayout(sellcalLayout);
        sellcalLayout.setHorizontalGroup(
            sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellcalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addComponent(fromdealer2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(todealer2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel37)))
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(dealershow1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(294, 294, 294))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(fromdealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(todealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel34)
                        .addGap(181, 181, 181)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dealshow2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(sellcalLayout.createSequentialGroup()
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel39))
                    .addGroup(sellcalLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel38)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                        .addComponent(dealshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(29, 29, 29))))
        );
        sellcalLayout.setVerticalGroup(
            sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellcalLayout.createSequentialGroup()
                        .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromdealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(todealer1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dealshow2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellcalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dealershow1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dealshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fromdealer2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(todealer2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jp.add(sellcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 680, 370));

        custshow.setBackground(new java.awt.Color(30, 48, 60));

        custtable.setBackground(new java.awt.Color(51, 51, 51));
        custtable.setForeground(new java.awt.Color(153, 153, 153));
        custtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CustName", "pname", "price", "quantity", "Total", "Date"
            }
        ));
        custtable.setGridColor(new java.awt.Color(0, 0, 0));
        custtable.setRowHeight(40);
        custtable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(custtable);

        custshowexit.setBackground(new java.awt.Color(204, 0, 0));
        custshowexit.setText("X");
        custshowexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custshowexitActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Customer History");

        javax.swing.GroupLayout custshowLayout = new javax.swing.GroupLayout(custshow);
        custshow.setLayout(custshowLayout);
        custshowLayout.setHorizontalGroup(
            custshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(custshowLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(custshowexit))
        );
        custshowLayout.setVerticalGroup(
            custshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, custshowLayout.createSequentialGroup()
                .addGroup(custshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custshowexit)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp.add(custshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 590, 330));

        jPanel1.setBackground(new java.awt.Color(30, 48, 70));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        prodshow.setBackground(new java.awt.Color(102, 102, 102));
        prodshow.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        prodshow.setForeground(new java.awt.Color(255, 255, 255));
        prodshow.setAutoscrolls(true);
        prodshow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                prodshowItemStateChanged(evt);
            }
        });
        prodshow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                prodshowComponentShown(evt);
            }
        });
        prodshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodshowActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(86, 86, 86));
        jButton14.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton14.setText("All");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(86, 86, 86));
        jButton15.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jButton15.setText("Show");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 0, 51));
        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(prodshow, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton11))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(prodshow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jp.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 450, 90));

        jPanel2.setBackground(new java.awt.Color(30, 48, 70));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome User");

        jButton1.setBackground(new java.awt.Color(112, 36, 36));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 338, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jp.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 70));

        jpbill.setBackground(new java.awt.Color(255, 255, 255));
        jpbill.setForeground(new java.awt.Color(255, 255, 255));
        jpbill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton16.setBackground(new java.awt.Color(153, 0, 0));
        jButton16.setText("X");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jpbill.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));
        jpbill.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 102, 850, 10));

        jLabel42.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Address");
        jpbill.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel43.setFont(new java.awt.Font("BankGothic Md BT", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Company Name");
        jpbill.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel44.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Phone no");
        jpbill.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel45.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Invoice ID:");
        jpbill.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jLabel46.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("My Company");
        jpbill.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        billid.setBackground(new java.awt.Color(255, 255, 255));
        billid.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billid.setForeground(new java.awt.Color(0, 0, 0));
        billid.setBorder(null);
        jpbill.add(billid, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 50, -1));

        jLabel47.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Time:");
        jpbill.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, -1));

        billcname.setBackground(new java.awt.Color(255, 255, 255));
        billcname.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billcname.setForeground(new java.awt.Color(0, 0, 0));
        billcname.setBorder(null);
        jpbill.add(billcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 220, -1));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("To:");
        jpbill.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 60, -1));

        billtable.setAutoCreateRowSorter(true);
        billtable.setBackground(new java.awt.Color(255, 255, 255));
        billtable.setForeground(new java.awt.Color(0, 0, 0));
        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Quantity", "Unit Price", "SGST", "SGST Amount", "CGST", "CGST Amonut", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        billtable.setAlignmentX(2.0F);
        billtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        billtable.setGridColor(new java.awt.Color(255, 255, 255));
        billtable.setRowMargin(5);
        billtable.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(billtable);

        jpbill.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 352, 840, 140));

        jLabel49.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Name :");
        jpbill.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel51.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Phone no :");
        jpbill.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel52.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Total :");
        jpbill.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        billcmob.setBackground(new java.awt.Color(255, 255, 255));
        billcmob.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billcmob.setForeground(new java.awt.Color(0, 0, 0));
        billcmob.setBorder(null);
        billcmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billcmobActionPerformed(evt);
            }
        });
        jpbill.add(billcmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, -1));

        billtotal.setBackground(new java.awt.Color(255, 255, 255));
        billtotal.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billtotal.setForeground(new java.awt.Color(0, 0, 0));
        billtotal.setBorder(null);
        jpbill.add(billtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 130, 30));

        jLabel53.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Invoice");
        jpbill.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        billdate.setBackground(new java.awt.Color(255, 255, 255));
        billdate.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billdate.setForeground(new java.awt.Color(0, 0, 0));
        billdate.setBorder(null);
        jpbill.add(billdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 130, -1));

        jLabel50.setFont(new java.awt.Font("BankGothic Md BT", 3, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Date:");
        jpbill.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        billtime.setBackground(new java.awt.Color(255, 255, 255));
        billtime.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billtime.setForeground(new java.awt.Color(0, 0, 0));
        billtime.setBorder(null);
        jpbill.add(billtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 130, -1));

        jLabel54.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Discount:");
        jpbill.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, 30));

        billdisc.setBackground(new java.awt.Color(255, 255, 255));
        billdisc.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billdisc.setForeground(new java.awt.Color(0, 0, 0));
        billdisc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        billdisc.setBorder(null);
        billdisc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                billdiscFocusLost(evt);
            }
        });
        billdisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdiscActionPerformed(evt);
            }
        });
        jpbill.add(billdisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 40, 30));

        discamt.setBackground(new java.awt.Color(255, 255, 255));
        discamt.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        discamt.setForeground(new java.awt.Color(0, 0, 0));
        discamt.setBorder(null);
        discamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discamtActionPerformed(evt);
            }
        });
        jpbill.add(discamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 90, 30));

        jLabel55.setFont(new java.awt.Font("BankGothic Md BT", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Amount:");
        jpbill.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, -1, 30));

        jLabel56.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Accountant Signature");
        jpbill.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, -1, -1));

        jLabel58.setFont(new java.awt.Font("BankGothic Md BT", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Invoice Value:");
        jpbill.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 570, -1, -1));

        jLabel59.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Receiver Signature");
        jpbill.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        billtotal1.setBackground(new java.awt.Color(255, 255, 255));
        billtotal1.setFont(new java.awt.Font("BankGothic Md BT", 1, 16)); // NOI18N
        billtotal1.setForeground(new java.awt.Color(0, 0, 0));
        billtotal1.setBorder(null);
        jpbill.add(billtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 130, 30));
        jpbill.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 850, -1));

        billdisc1.setBackground(new java.awt.Color(255, 255, 255));
        billdisc1.setFont(new java.awt.Font("BankGothic Md BT", 1, 21)); // NOI18N
        billdisc1.setForeground(new java.awt.Color(0, 0, 0));
        billdisc1.setText("%");
        billdisc1.setBorder(null);
        billdisc1.setFocusable(false);
        billdisc1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                billdisc1FocusLost(evt);
            }
        });
        billdisc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billdisc1ActionPerformed(evt);
            }
        });
        jpbill.add(billdisc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 20, 30));

        jp.add(jpbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code he
        jp1.setVisible(true);
        jpsell.setVisible(false);
        jpshow.setVisible(false);
        jp4.setVisible(false);
        
        jpnew.setVisible(false);
        jpdeal.setVisible(false);
        dealercal.setVisible(false);
        sellcal.setVisible(false);
        custshow.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jpbill.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jpsell.setVisible(true);
        jpshow.setVisible(false);
        jp4.setVisible(false);
        
        jpnew.setVisible(false);
        jpdeal.setVisible(false);
        dealercal.setVisible(false);
        sellcal.setVisible(false);
        custshow.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jpbill.setVisible(false);
        
         try{
        
           
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
           ArrayList<String> mylist = new ArrayList<String>();

            String userr = "select product_name from available where quantity<=20";
             PreparedStatement pst = con.prepareStatement(userr);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               mylist.add(rs.getString("product_name"));
            }
            
            if(!mylist.isEmpty())
            JOptionPane.showMessageDialog(this, "Only few quantities of these products left: "+mylist); 
        
       
         }
        catch(Exception e){
             System.out.println(e);
             
         }
        
        
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jpsell.setVisible(false);
        jpshow.setVisible(true);
        jp4.setVisible(false);
        
        jpnew.setVisible(false);
        jpdeal.setVisible(false);
        dealercal.setVisible(false);
        sellcal.setVisible(false);
        custshow.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jpbill.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        jp1.setVisible(false);
        jpsell.setVisible(false);
        jpshow.setVisible(false);
        jp4.setVisible(true);
        
        jpnew.setVisible(false);
        jpdeal.setVisible(false);
        dealercal.setVisible(false);
        sellcal.setVisible(false);
        custshow.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jpbill.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String prod = prodtext.getSelectedItem().toString();
        String quant = quanttext.getText();
        String price = pricetext.getText();
       String dealer = dealtext.getSelectedItem().toString();
        int no = Integer.parseInt(price)*Integer.parseInt(quant);
        String total = Integer.toString(no);
        String[] arrp =new String[50];
        String[] arrd =new String[50];
        String[] arrpp =new String[50];
        
        if(!price.trim().isEmpty()&&!quant.trim().isEmpty()){
       try{
           
           
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            String product = "select product_name,dealer_name from product";
                PreparedStatement ppst = con.prepareStatement(product);
                ResultSet prs = ppst.executeQuery();
                
              int i =0;
                while(prs.next()){
                arrp[i] = prs.getString("product_name");
                arrd[i] = prs.getString("dealer_name");
//                arrpp[i] = prs.getString("price");
                i++;
                
                }
                List prodd = Arrays.asList(arrp);
                List deall = Arrays.asList(arrd);
//                List pricee = Arrays.asList(arrpp);
                
                
                    if(prodd.contains(prod) && deall.contains(dealer)){
//                    String upd = "update product set quantity=quantity+"+quant+",product_price="+price+",total_cost=total_cost+"+no+" where product_name='"+prod+"' and dealer_name='"+dealer+"'";
//                PreparedStatement ust = con.prepareStatement(upd);
//                ust.execute();
//                String apd = "update available set quantity=quantity+"+quant+",date=curdate() where product_name='"+prod+"'";
//                PreparedStatement ast = con.prepareStatement(apd);
//                ast.execute();
                    String upd =" update product set quantity=quantity+"+quant+",product_price="+price+",total_cost=total_cost+"+no+" where product_name='"+prod+"' and dealer_name='"+dealer+"'";
                PreparedStatement ust = con.prepareStatement(upd);
                ust.execute();
                String apd = "update available set quantity=quantity+"+quant+",date=curdate() where product_name='"+prod+"'";
                PreparedStatement ast = con.prepareStatement(apd);
                ast.execute();
                
                    }
                    else if(prodd.contains(prod) && !deall.contains(dealer)){
                        String userr = "insert into product(product_name,dealer_name,product_price,quantity,total_cost,date) values(?,?,?,?,?,curdate())";
             PreparedStatement pst = con.prepareStatement(userr);
                pst.setString(1, prod);
                pst.setString(2, dealer);
                pst.setString(3, price);
                pst.setString(4, quant);
                pst.setString(5, total);
                pst.execute(); 
                    String aapd = "update available set quantity=quantity+"+quant+",date=curdate() where product_name='"+prod+"'";
                PreparedStatement aast = con.prepareStatement(aapd);
                aast.execute();
                    }
                    else{
                    //
                    String userr = "insert into product(product_name,dealer_name,product_price,quantity,total_cost,date) values(?,?,?,?,?,curdate())";
             PreparedStatement pst = con.prepareStatement(userr);
                pst.setString(1, prod);
                pst.setString(2, dealer);
                pst.setString(3, price);
                pst.setString(4, quant);
                pst.setString(5, total);
                pst.execute(); 
                String available = "insert into available(product_name,quantity,date) values(?,?,curdate())";
             PreparedStatement ast = con.prepareStatement(available);
                ast.setString(1, prod);    
                ast.setString(2, quant);
                ast.execute();
                    }
                
       }
        catch(Exception e){
             System.out.println(e);
             
         }
}
        if(price.trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Fill All Fields");
        }
        JOptionPane.showMessageDialog(this,"Product Added!");
        pricetext.setText(null);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addnewprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addnewprodMouseClicked
        // TODO add your handling code here:
        jpnew.setVisible(true);
        jp1.setVisible(false);
        
    }//GEN-LAST:event_addnewprodMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        

 try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String userr = "insert into pname(name) values(?)";
             PreparedStatement pst = con.prepareStatement(userr);
            pst.setString(1, newprod.getText());


            pst.execute();
            prodtext.addItem(newprod.getText());
            ordprod.addItem(newprod.getText());
            sellprod.addItem(newprod.getText());
        }
        catch(Exception e){
             System.out.println(e);
             
         }
 JOptionPane.showMessageDialog(this,"New Product Added Succesfully");
        jpnew.setVisible(false);
        jp1.setVisible(true);
        newprod.setText(null);

       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jpnew.setVisible(false);
        jp1.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void prodtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodtextActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_prodtextActionPerformed

    private void delprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delprodMouseClicked
   
        String r = "Do you want to delete product "+prodtext.getSelectedItem().toString()+" ?";
        int response = JOptionPane.showConfirmDialog(null, r, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response ==  JOptionPane.YES_OPTION){
            try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            String del =  prodtext.getSelectedItem().toString();
            String userr = "delete from pname where name = ?";
             PreparedStatement pst = con.prepareStatement(userr);
            pst.setString(1,del);


       pst.execute();
      JOptionPane.showMessageDialog(this,"Product Deleted Succesfully");
        prodtext.removeItem(del);
        ordprod.removeItem(del);
        sellprod.removeItem(del);
        }
        catch(Exception e){
             System.out.println(e);
             
         }
 
        }
        
    }//GEN-LAST:event_delprodMouseClicked

    private void ordprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordprodActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
         try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String userr = "insert into order_table(product_name,dealer_name,quantity,date) values(?,?,?,now())";
             PreparedStatement pst = con.prepareStatement(userr);
            pst.setString(1, ordprod.getSelectedItem().toString());
            pst.setString(2, dealertxt.getSelectedItem().toString());
            pst.setString(3, quanttxt.getSelectedItem().toString());
            


            pst.execute();
            JOptionPane.showMessageDialog(this,"  Order Succesful");
        }
        catch(Exception e){
             System.out.println(e);
             
         }
 
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void dealertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealertxtActionPerformed

    private void deldealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deldealMouseClicked
        // TODO add your handling code here:
        
        String r = "Do you want to delete dealer "+dealtext.getSelectedItem().toString()+" ?";
        int response = JOptionPane.showConfirmDialog(null, r, "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response ==  JOptionPane.YES_OPTION){
            try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            String del =  dealtext.getSelectedItem().toString();
            String userr = "delete from dname where name = ?";
             PreparedStatement pst = con.prepareStatement(userr);
            pst.setString(1,del);
            pst.execute();
      JOptionPane.showMessageDialog(this,"Dealer Deleted Succesfully");
        dealtext.removeItem(del);
        dealertxt.removeItem(del);
        }
        catch(Exception e){
             System.out.println(e);
             
        }
        }
    }//GEN-LAST:event_deldealMouseClicked

    private void newdealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newdealMouseClicked
        // TODO add your handling code here:
        jpdeal.setVisible(true);
        jp1.setVisible(false);
    }//GEN-LAST:event_newdealMouseClicked

    private void dealtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealtextActionPerformed

    private void adddealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddealActionPerformed
        // TODO add your handling code here:
        try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String userr = "insert into dname(name) values(?)";
             PreparedStatement pst = con.prepareStatement(userr);
            pst.setString(1, newdel.getText());


            pst.execute();
            dealtext.addItem(newdel.getText());
            dealertxt.addItem(newdel.getText());
           JOptionPane.showMessageDialog(this,"New Dealer Added Succesfully");
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpdeal.setVisible(false);
        jp1.setVisible(true);
        newdel.setText(null);
    }//GEN-LAST:event_adddealActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jpdeal.setVisible(false);
        jp1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void newdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newdelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newdelActionPerformed

    private void sellprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellprodActionPerformed

    private void sellbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbuttActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jpsell.setVisible(false);
        jpbill.setVisible(true);
      

        


        
        String Custname = cname.getText();
        String Custno = cmob.getText();
int tot = 0;
int item = 1;
            try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String sell = "select pname,price,quantity,total,date,time from sold_products "
                     + "where time >date_sub(curtime(), interval 100 minute) and custno='"+Custno+"' and confirm=0";
             PreparedStatement sst = con.prepareStatement(sell);
                ResultSet rs = sst.executeQuery();
               String userr = "UPDATE sold_products SET confirm=1 where time >date_sub(curtime(), interval 100 minute) and custno='"+Custno+"'";
             PreparedStatement pst = con.prepareStatement(userr);
                
                pst.execute();
                
        
                DefaultTableModel tm = (DefaultTableModel)billtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    
                double sgstp = 0.05*rs.getInt("price")*rs.getInt("quantity");
                double cgstp = 0.05*rs.getInt("price")*rs.getInt("quantity");
                    Object o[] = {item,rs.getString("pname"),rs.getInt("quantity"),rs.getInt("price"),"5.0%",(sgstp),"5.0%",(cgstp),(rs.getInt("total")+cgstp+sgstp)};
                    tm.addRow(o);
                    tot += (rs.getInt("total")+cgstp+sgstp);
                    item+=1;
                    String time = rs.getString("time");
                    billtime.setText(time);
                    String date = rs.getString("date");
                    billdate.setText(date);
                }
                total = tot;
                billcname.setText(Custname);
                billcmob.setText(Custno);
                billid.setText("1");
                String tott = Integer.toString(tot);
                billtotal.setText(tott);
                
           billtable.getColumnModel().getColumn(0).setPreferredWidth(1);
billtable.setAutoResizeMode(billtable.AUTO_RESIZE_LAST_COLUMN);
            
            
        }
        catch(Exception e){
             System.out.println(e);
             
         }
            




       
    }//GEN-LAST:event_sellbuttActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void sellprodComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sellprodComponentShown
        // TODO add your handling code here:
      
    }//GEN-LAST:event_sellprodComponentShown

    private void sellprodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sellprodItemStateChanged
        // TODO add your handling code here:
        
        try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            String name = sellprod.getSelectedItem().toString();
            String price = "select (product_price)max from product where product_name='"+name+"'";
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String a = Integer.toString(rs.getInt(1));
                sellprice.setText(a);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
    }//GEN-LAST:event_sellprodItemStateChanged

    private void sellprice1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sellprice1InputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_sellprice1InputMethodTextChanged

    private void sellprice1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellprice1FocusLost
        // TODO add your handling code here:
        String price = sellprice.getText();
        String quant = sellprice1.getText();

        int b = Integer.parseInt(price)*Integer.parseInt(quant);
        String c = Integer.toString(b);
        selltotal.setText(c);
    }//GEN-LAST:event_sellprice1FocusLost

    private void sellbutt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbutt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellbutt1ActionPerformed

    private void sellbutt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellbutt1MouseClicked
        // TODO add your handling code here:
        String prod = sellprod.getSelectedItem().toString();
        String quant = sellprice1.getText();
        String price = sellprice.getText();
       String Custname = cname.getText();
       String Custno = cmob.getText();
       
        int no = Integer.parseInt(price)*Integer.parseInt(quant);
        String total = Integer.toString(no);
        int tot = 0;
        int conf =0;
        if(!price.trim().isEmpty()&&!quant.trim().isEmpty()&&!Custname.trim().isEmpty()&&!Custno.trim().isEmpty()&&!total.trim().isEmpty()){
       try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String userr = "insert into sold_products(pname,price,quantity,custname,custno,total,date,time,confirm) "
                    + "values(?,?,?,?,?,?,curdate(),curtime(),"+conf+")";
             PreparedStatement pst = con.prepareStatement(userr);
                pst.setString(1, prod);
                pst.setString(2, price);
                pst.setString(3, quant);
                pst.setString(4, Custname);
                pst.setString(5, Custno);
                pst.setString(6, total);
                
                pst.execute();
                
             String sell = "select pname,price,quantity,total from sold_products "
                     + "where time >date_sub(curtime(), interval 10 minute) and custno='"+Custno+"' and confirm=0";
             PreparedStatement sst = con.prepareStatement(sell);
                ResultSet rs = sst.executeQuery();
                String remove = "update available set quantity=quantity-"+quant+" where product_name='"+prod+"'";
             PreparedStatement rst = con.prepareStatement(remove);
                rst.execute();
                DefaultTableModel tm = (DefaultTableModel)selltable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("pname"),rs.getInt("price"),rs.getInt("quantity"),rs.getInt("total")};
                    tm.addRow(o);
                    tot += rs.getInt("total");
                }
                String tott = Integer.toString(tot);
                selltotal1.setText(tott);
                
                
        }
        catch(Exception e){
             System.out.println(e);
             
         }
}       sellprice1.setText(null);
       sellprice.setText(null); 
       selltotal.setText(null);
       
    }//GEN-LAST:event_sellbutt1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        try{
//            String myDriver =  "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
//            Class.forName(myDriver);
//            Connection con  = DriverManager.getConnection(url,"root","");
//            
//            String price = "select * from available";
//             PreparedStatement pst = con.prepareStatement(price);
//            ResultSet rs = pst.executeQuery();
//           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
//                tm.setRowCount(0);
//                while(rs.next()){
//                    Object o[] = {rs.getString("product_name"),rs.getString("dealer_name"),rs.getInt("product_price"),rs.getInt("quantity"),rs.getInt("total_cost")};
//                    tm.addRow(o);
//            }
//        }
//        catch(Exception e){
//             System.out.println(e);
//             
//         }
jpshow.setVisible(false);
jPanel1.setVisible(true);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jpshow.setVisible(false);
        dealercal.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jpshow.setVisible(false);
        sellcal.setVisible(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void dealershowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealershowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealershowActionPerformed

    private void dealshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealshowActionPerformed
        // TODO add your handling code here:
        
        try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
            
            
            String from =sf.format(fromdealer.getDate());
            String to = sf.format(todealer.getDate());
            String deal = dealershow.getSelectedItem().toString();
            System.out.println(to);
            String price = "select product_name,quantity,dealer_name,product_price,total_cost from product where date >='"+from+"' and date<= '"+to+"' and dealer_name = '"+deal+"'";
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("product_name"),rs.getString("dealer_name"),rs.getInt("product_price"),rs.getInt("quantity"),rs.getInt("total_cost")};
                    tm.addRow(o);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpshow.setVisible(true);
        dealercal.setVisible(false);
    }//GEN-LAST:event_dealshowActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        jpshow.setVisible(true);
        dealercal.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void dealershow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealershow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealershow1ActionPerformed

    private void dealshow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealshow1ActionPerformed
        // TODO add your handling code here:
        
         try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
            String sell = dealershow1.getSelectedItem().toString();
            
            String from =sf.format(fromdealer2.getDate());
            String to = sf.format(todealer2.getDate());
            
            System.out.println(to);
            String price = "select pname,price,quantity,total from sold_products where date >='"+from+"' and date<= '"+to+"' and pname = '"+sell+"'";
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("pname"),"",rs.getInt("price"),rs.getInt("quantity"),rs.getInt("total")};
                    tm.addRow(o);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpshow.setVisible(true);
        sellcal.setVisible(false);
        
    }//GEN-LAST:event_dealshow1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jpshow.setVisible(true);
        sellcal.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void dealshow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealshow2ActionPerformed
        // TODO add your handling code here:
        try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
           
            String from =sf.format(fromdealer1.getDate());
            String to = sf.format(todealer1.getDate());
            
            System.out.println(to);
            String price = "select pname,price,quantity,total from sold_products where date >='"+from+"' and date<= '"+to+"'";
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("pname"),"",rs.getInt("price"),rs.getInt("quantity"),rs.getInt("total")};
                    tm.addRow(o);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpshow.setVisible(true);
        sellcal.setVisible(false);
        
    }//GEN-LAST:event_dealshow2ActionPerformed

    private void custshowexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custshowexitActionPerformed
        // TODO add your handling code here:
        custshow.setVisible(false);
        jpsell.setVisible(true);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_custshowexitActionPerformed

    private void prodshowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prodshowItemStateChanged
        // TODO add your handling code here:
              
    }//GEN-LAST:event_prodshowItemStateChanged

    private void prodshowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_prodshowComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_prodshowComponentShown

    private void prodshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodshowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodshowActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
                try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String price = "select * from available";
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("product_name"),"","",rs.getInt("quantity"),""};
                    tm.addRow(o);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpshow.setVisible(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
          try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            String price = "select * from available where product_name = '"+prodshow.getSelectedItem().toString()+"'";
            
            
             PreparedStatement pst = con.prepareStatement(price);
            ResultSet rs = pst.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)showtable.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("product_name"),"","",rs.getInt("quantity"),""};
                    tm.addRow(o);
            }
        }
        catch(Exception e){
             System.out.println(e);
             
         }
        jpshow.setVisible(true);
        jPanel1.setVisible(false);
        
        
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jpshow.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void billcmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billcmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billcmobActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
               String Custno = cmob.getText();
      
        
      
        
       try{
            String myDriver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/MIS?autoReconnect=true&useSSL-false";
            Class.forName(myDriver);
            Connection con  = DriverManager.getConnection(url,"root","");
            
            
             JOptionPane.showMessageDialog(this, "Sold");
             DefaultTableModel tm = (DefaultTableModel)selltable.getModel();
                tm.setRowCount(0);
                String price = "select custname,pname,price,quantity,total,date from sold_products where custname='"+cname.getText()+"'and custno="+cmob.getText()+"";
             PreparedStatement pstt = con.prepareStatement(price);
            ResultSet rs = pstt.executeQuery();
           DefaultTableModel tmm= (DefaultTableModel)custtable.getModel();
                tmm.setRowCount(0);
                while(rs.next()){
                    Object o[] = {rs.getString("custname"),rs.getString("pname"),rs.getInt("price"),rs.getInt("quantity"),rs.getInt("total"),rs.getString("date")};
                    tmm.addRow(o);
            }
                custshow.setVisible(true);
                jpsell.setVisible(false);
                jpbill.setVisible(false);
                
                
                
        }
        catch(Exception e){
             System.out.println(e);
              
        }
       cname.setText(null);
        cmob.setText(null);
        selltotal1.setText(null);
        billtotal1.setText(null);
        billdisc.setText(null);
        discamt.setText(null);
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void billdiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billdiscActionPerformed

    private void discamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discamtActionPerformed

    private void billdiscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billdiscFocusLost
        // TODO add your handling code here:
        
        String disc = billdisc.getText();
                int discc  = Integer.parseInt(disc);
                int amt = (total-(total*discc/100));
                String amtt = Integer.toString(amt);
                int amttt = (total*discc/100);
                String amtttt = Integer.toString(amttt);
                billtotal1.setText(amtt);
                discamt.setText(amtttt);
    }//GEN-LAST:event_billdiscFocusLost

    private void billdisc1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billdisc1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_billdisc1FocusLost

    private void billdisc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billdisc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billdisc1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddeal;
    private javax.swing.JLabel addnewprod;
    private javax.swing.JTextField billcmob;
    private javax.swing.JTextField billcname;
    private javax.swing.JTextField billdate;
    private javax.swing.JTextField billdisc;
    private javax.swing.JTextField billdisc1;
    private javax.swing.JTextField billid;
    private javax.swing.JTable billtable;
    private javax.swing.JTextField billtime;
    private javax.swing.JTextField billtotal;
    private javax.swing.JTextField billtotal1;
    private javax.swing.JTextField cmob;
    private javax.swing.JTextField cname;
    private javax.swing.JPanel custshow;
    private javax.swing.JButton custshowexit;
    private javax.swing.JTable custtable;
    private javax.swing.JPanel dealercal;
    private javax.swing.JComboBox<String> dealershow;
    private javax.swing.JComboBox<String> dealershow1;
    private javax.swing.JComboBox<String> dealertxt;
    private javax.swing.JButton dealshow;
    private javax.swing.JButton dealshow1;
    private javax.swing.JButton dealshow2;
    private javax.swing.JComboBox<String> dealtext;
    private javax.swing.JLabel deldeal;
    private javax.swing.JLabel delprod;
    private javax.swing.JTextField discamt;
    private com.toedter.calendar.JDateChooser fromdealer;
    private com.toedter.calendar.JDateChooser fromdealer1;
    private com.toedter.calendar.JDateChooser fromdealer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jp;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel jpbill;
    private javax.swing.JPanel jpdeal;
    private javax.swing.JPanel jpnew;
    private javax.swing.JPanel jpsell;
    private javax.swing.JPanel jpshow;
    private javax.swing.JLabel newdeal;
    private javax.swing.JTextField newdel;
    private javax.swing.JTextField newprod;
    private javax.swing.JComboBox<String> ordprod;
    private javax.swing.JTextField pricetext;
    private javax.swing.JComboBox<String> prodshow;
    private javax.swing.JComboBox<String> prodtext;
    private javax.swing.JTextField quanttext;
    private javax.swing.JComboBox<String> quanttxt;
    private javax.swing.JButton sellbutt;
    private javax.swing.JButton sellbutt1;
    private javax.swing.JPanel sellcal;
    private javax.swing.JTextField sellprice;
    private javax.swing.JTextField sellprice1;
    private javax.swing.JComboBox<String> sellprod;
    private javax.swing.JTable selltable;
    private javax.swing.JTextField selltotal;
    private javax.swing.JTextField selltotal1;
    private javax.swing.JTable showtable;
    private javax.swing.JPanel sidepanel;
    private com.toedter.calendar.JDateChooser todealer;
    private com.toedter.calendar.JDateChooser todealer1;
    private com.toedter.calendar.JDateChooser todealer2;
    // End of variables declaration//GEN-END:variables
}
