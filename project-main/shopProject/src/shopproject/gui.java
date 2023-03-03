/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopproject;

// User imports Afaq
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import user.Account;
import user.Shop;
import user.User;

/**
 *
 * @author Afaq Qazi Taimoor Pervaiz
 */
public class gui extends javax.swing.JFrame {
    
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainTabbedPane = new javax.swing.JTabbedPane();
        userTabPanel = new javax.swing.JPanel();
        userTabSidePanel = new javax.swing.JPanel();
        userTabAccountBtn = new javax.swing.JButton();
        UserTabCartBtn = new javax.swing.JButton();
        userTabShopBtn = new javax.swing.JButton();
        userTabAccountPanel = new javax.swing.JPanel();
        userLogoutBtn = new javax.swing.JButton();
        userFormPanel = new javax.swing.JPanel();
        userFormLabel4 = new javax.swing.JLabel();
        userFormUsernameField = new javax.swing.JTextField();
        userFormPasswordField = new javax.swing.JPasswordField();
        userFormLabel5 = new javax.swing.JLabel();
        userFormLabel6 = new javax.swing.JLabel();
        userFormLoginBtn = new javax.swing.JButton();
        userFormRegisterBtn = new javax.swing.JButton();
        userFormEmptyError = new javax.swing.JLabel();
        userFormAlreadRegisteredError = new javax.swing.JLabel();
        userFormIncorrectError = new javax.swing.JLabel();
        userFormRegisteredMsg = new javax.swing.JLabel();
        userTabCartPanel = new javax.swing.JPanel();
        userTabShopPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        shopTableScrollPane = new javax.swing.JScrollPane();
        shopItemsTable = new javax.swing.JTable();
        shopBuyItemBtn = new javax.swing.JButton();
        shopBuyItemBox = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shopItemBoxQtyField = new javax.swing.JTextField();
        shopItemCartBtn = new javax.swing.JButton();
        adminTabPanel = new javax.swing.JPanel();
        adminTabSidePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTabPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTabSidePanel.setBackground(new java.awt.Color(153, 153, 153));

        userTabAccountBtn.setText("Account");
        userTabAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTabAccountBtnActionPerformed(evt);
            }
        });

        UserTabCartBtn.setText("Cart");
        UserTabCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTabCartBtnActionPerformed(evt);
            }
        });

        userTabShopBtn.setText("Shop");
        userTabShopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTabShopBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userTabSidePanelLayout = new javax.swing.GroupLayout(userTabSidePanel);
        userTabSidePanel.setLayout(userTabSidePanelLayout);
        userTabSidePanelLayout.setHorizontalGroup(
            userTabSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userTabSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserTabCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTabAccountBtn)
                    .addComponent(userTabShopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        userTabSidePanelLayout.setVerticalGroup(
            userTabSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabSidePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(userTabAccountBtn)
                .addGap(26, 26, 26)
                .addComponent(UserTabCartBtn)
                .addGap(27, 27, 27)
                .addComponent(userTabShopBtn)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        userTabPanel.add(userTabSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        userTabAccountPanel.setBackground(new java.awt.Color(204, 204, 204));

        userLogoutBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLogoutBtn.setText("Logout");
        userLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogoutBtnActionPerformed(evt);
            }
        });

        userFormPanel.setForeground(new java.awt.Color(255, 0, 0));

        userFormLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        userFormLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormLabel4.setText("Enter Username and Password to Login or Register");

        userFormLabel5.setText(" Username:");

        userFormLabel6.setText(" Password:");

        userFormLoginBtn.setText("Login");
        userFormLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFormLoginBtnActionPerformed(evt);
            }
        });

        userFormRegisterBtn.setText("Register");
        userFormRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFormRegisterBtnActionPerformed(evt);
            }
        });

        userFormEmptyError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userFormEmptyError.setForeground(new java.awt.Color(255, 51, 51));
        userFormEmptyError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormEmptyError.setText("Username or Password is empty");

        userFormAlreadRegisteredError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userFormAlreadRegisteredError.setForeground(new java.awt.Color(255, 51, 51));
        userFormAlreadRegisteredError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormAlreadRegisteredError.setText("This username is already registered");

        userFormIncorrectError.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userFormIncorrectError.setForeground(new java.awt.Color(255, 51, 51));
        userFormIncorrectError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormIncorrectError.setText("Username or Password is incorrect");

        userFormRegisteredMsg.setBackground(new java.awt.Color(102, 102, 102));
        userFormRegisteredMsg.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userFormRegisteredMsg.setForeground(new java.awt.Color(0, 153, 0));
        userFormRegisteredMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userFormRegisteredMsg.setText("User have been Registered");

        javax.swing.GroupLayout userFormPanelLayout = new javax.swing.GroupLayout(userFormPanel);
        userFormPanel.setLayout(userFormPanelLayout);
        userFormPanelLayout.setHorizontalGroup(
            userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormPanelLayout.createSequentialGroup()
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userFormUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                .addComponent(userFormPasswordField)
                                .addComponent(userFormLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userFormLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userFormPanelLayout.createSequentialGroup()
                                    .addComponent(userFormRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(userFormLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addGroup(userFormPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userFormEmptyError, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userFormIncorrectError, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(userFormRegisteredMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userFormPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(userFormLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userFormPanelLayout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(userFormAlreadRegisteredError, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );
        userFormPanelLayout.setVerticalGroup(
            userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userFormLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userFormLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userFormUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userFormLabel6)
                .addGap(5, 5, 5)
                .addComponent(userFormPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFormRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userFormLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFormEmptyError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userFormIncorrectError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(userFormRegisteredMsg)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(userFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userFormPanelLayout.createSequentialGroup()
                    .addContainerGap(292, Short.MAX_VALUE)
                    .addComponent(userFormAlreadRegisteredError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)))
        );

        javax.swing.GroupLayout userTabAccountPanelLayout = new javax.swing.GroupLayout(userTabAccountPanel);
        userTabAccountPanel.setLayout(userTabAccountPanelLayout);
        userTabAccountPanelLayout.setHorizontalGroup(
            userTabAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabAccountPanelLayout.createSequentialGroup()
                .addGroup(userTabAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userTabAccountPanelLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(userLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userTabAccountPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(userFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userTabAccountPanelLayout.setVerticalGroup(
            userTabAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabAccountPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(userFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(userLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userTabPanel.add(userTabAccountPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 950, 580));

        userTabCartPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout userTabCartPanelLayout = new javax.swing.GroupLayout(userTabCartPanel);
        userTabCartPanel.setLayout(userTabCartPanelLayout);
        userTabCartPanelLayout.setHorizontalGroup(
            userTabCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        userTabCartPanelLayout.setVerticalGroup(
            userTabCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        userTabPanel.add(userTabCartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 0, 950, -1));

        userTabShopPanel.setBackground(new java.awt.Color(204, 204, 204));

        Heading.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 0, 0));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Select the item you want to buy and click on the \"buy\" button to Purchase.");

        shopItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ));
        shopTableScrollPane.setViewportView(shopItemsTable);

        shopBuyItemBtn.setText("Buy Item");
        shopBuyItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopBuyItemBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Please Fill out the Details Below:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Enter the quantity of item you are purchasing:");

        shopItemCartBtn.setText("Add Item To Cart");
        shopItemCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopItemCartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shopBuyItemBoxLayout = new javax.swing.GroupLayout(shopBuyItemBox);
        shopBuyItemBox.setLayout(shopBuyItemBoxLayout);
        shopBuyItemBoxLayout.setHorizontalGroup(
            shopBuyItemBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopBuyItemBoxLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(shopBuyItemBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(shopBuyItemBoxLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(shopItemBoxQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
            .addGroup(shopBuyItemBoxLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(shopItemCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shopBuyItemBoxLayout.setVerticalGroup(
            shopBuyItemBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopBuyItemBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopItemBoxQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(shopItemCartBtn)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userTabShopPanelLayout = new javax.swing.GroupLayout(userTabShopPanel);
        userTabShopPanel.setLayout(userTabShopPanelLayout);
        userTabShopPanelLayout.setHorizontalGroup(
            userTabShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabShopPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userTabShopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userTabShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userTabShopPanelLayout.createSequentialGroup()
                        .addComponent(shopTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userTabShopPanelLayout.createSequentialGroup()
                        .addComponent(shopBuyItemBtn)
                        .addGap(431, 431, 431))))
            .addGroup(userTabShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userTabShopPanelLayout.createSequentialGroup()
                    .addContainerGap(248, Short.MAX_VALUE)
                    .addComponent(shopBuyItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
        userTabShopPanelLayout.setVerticalGroup(
            userTabShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabShopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(shopTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(shopBuyItemBtn)
                .addGap(28, 28, 28))
            .addGroup(userTabShopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userTabShopPanelLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(shopBuyItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        userTabPanel.add(userTabShopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 0, 950, -1));

        MainTabbedPane.addTab("User Tab", userTabPanel);

        adminTabPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminTabSidePanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout adminTabSidePanelLayout = new javax.swing.GroupLayout(adminTabSidePanel);
        adminTabSidePanel.setLayout(adminTabSidePanelLayout);
        adminTabSidePanelLayout.setHorizontalGroup(
            adminTabSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        adminTabSidePanelLayout.setVerticalGroup(
            adminTabSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        adminTabPanel.add(adminTabSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        MainTabbedPane.addTab("Admin Tab", adminTabPanel);

        getContentPane().add(MainTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // USER ACTION FUNCTON DO NOT INCLUDE ADMIN FUNCTION WITH THESE
    
    private void userTabAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTabAccountBtnActionPerformed
        // TODO add your handling code here:
        Account.show(this.userFormPanel , this.userLogoutBtn);
        Account.clearErrors(this.userFormEmptyError, this.userFormAlreadRegisteredError , this.userFormIncorrectError , this.userFormRegisteredMsg);
        this.userTabAccountPanel.setVisible(true);
        this.userTabCartPanel.setVisible(false);
        this.userTabShopPanel.setVisible(false);
    }//GEN-LAST:event_userTabAccountBtnActionPerformed

    private void UserTabCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTabCartBtnActionPerformed
        // TODO add your handling code here:
        this.userTabAccountPanel.setVisible(false);
        this.userTabCartPanel.setVisible(true);
        this.userTabShopPanel.setVisible(false);
    }//GEN-LAST:event_UserTabCartBtnActionPerformed

    private void userFormRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFormRegisterBtnActionPerformed
        // TODO add your handling code here:
        Account.clearErrors(this.userFormEmptyError,this.userFormAlreadRegisteredError, this.userFormIncorrectError , this.userFormRegisteredMsg);
        String username = this.userFormUsernameField.getText();
        String password = this.userFormPasswordField.getText();
        Account.registerUser(username , password , this.userFormEmptyError , this.userFormAlreadRegisteredError , this.userFormRegisteredMsg);
    }//GEN-LAST:event_userFormRegisterBtnActionPerformed

    private void userFormLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFormLoginBtnActionPerformed
        // TODO add your handling code here:
        Account.clearErrors(this.userFormEmptyError,this.userFormAlreadRegisteredError, this.userFormIncorrectError , this.userFormRegisteredMsg);        
        String username = this.userFormUsernameField.getText();
        String password = this.userFormPasswordField.getText();
        Account.loginUser(username , password , this.userFormEmptyError , this.userFormIncorrectError);
        Account.show(this.userFormPanel , this.userLogoutBtn);
    }//GEN-LAST:event_userFormLoginBtnActionPerformed

    private void userLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogoutBtnActionPerformed
        // TODO add your handling code here:
        Account.logoutUser();
        Account.show(this.userFormPanel , this.userLogoutBtn);
    }//GEN-LAST:event_userLogoutBtnActionPerformed

    private void userTabShopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTabShopBtnActionPerformed
        if (User.isIsLoggedIn()) {
            // TODO add your handling code here:
            this.userTabAccountPanel.setVisible(false);
            this.userTabCartPanel.setVisible(false);
            this.userTabShopPanel.setVisible(true);

            // shopBuyItemBox should dissapear
            this.shopBuyItemBox.setVisible(false);
            this.shopTableScrollPane.setVisible(true);
            this.shopBuyItemBtn.setVisible(true);

            // load items
            DefaultTableModel model =  (DefaultTableModel)this.shopItemsTable.getModel();
            Shop.loadItems(model);        
        } else {
            JOptionPane.showMessageDialog(null, "User must be logged in in order to view shop");
        }
    }//GEN-LAST:event_userTabShopBtnActionPerformed

    private void shopBuyItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopBuyItemBtnActionPerformed
        // TODO add your handling code here:
        
        if (this.shopItemsTable.getSelectedRow() != -1) {
            // item table should dissapear
            this.shopTableScrollPane.setVisible(false);
            this.shopBuyItemBox.setVisible(true);
            this.shopBuyItemBtn.setVisible(false);
            /*
            DefaultTableModel model =  (DefaultTableModel)this.shopItemsTable.getModel();
            JTable table = this.shopItemsTable;
            Shop.buyItem(model , table);
            */
        }
    }//GEN-LAST:event_shopBuyItemBtnActionPerformed

    private void shopItemCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopItemCartBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopItemCartBtnActionPerformed
    
    // USER ACTION FUNCTON END
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui a = new gui();
                a.setVisible(true);
                // this is so user does not see the account panel when he is not logged in
                a.userTabAccountPanel.setVisible(false);
                a.userTabCartPanel.setVisible(false);
                a.userTabShopPanel.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JTabbedPane MainTabbedPane;
    private javax.swing.JButton UserTabCartBtn;
    private javax.swing.JPanel adminTabPanel;
    private javax.swing.JPanel adminTabSidePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel shopBuyItemBox;
    private javax.swing.JButton shopBuyItemBtn;
    private javax.swing.JTextField shopItemBoxQtyField;
    private javax.swing.JButton shopItemCartBtn;
    private javax.swing.JTable shopItemsTable;
    private javax.swing.JScrollPane shopTableScrollPane;
    private javax.swing.JLabel userFormAlreadRegisteredError;
    private javax.swing.JLabel userFormEmptyError;
    private javax.swing.JLabel userFormIncorrectError;
    private javax.swing.JLabel userFormLabel4;
    private javax.swing.JLabel userFormLabel5;
    private javax.swing.JLabel userFormLabel6;
    private javax.swing.JButton userFormLoginBtn;
    private javax.swing.JPanel userFormPanel;
    private javax.swing.JPasswordField userFormPasswordField;
    private javax.swing.JButton userFormRegisterBtn;
    private javax.swing.JLabel userFormRegisteredMsg;
    private javax.swing.JTextField userFormUsernameField;
    private javax.swing.JButton userLogoutBtn;
    private javax.swing.JButton userTabAccountBtn;
    private javax.swing.JPanel userTabAccountPanel;
    private javax.swing.JPanel userTabCartPanel;
    private javax.swing.JPanel userTabPanel;
    private javax.swing.JButton userTabShopBtn;
    private javax.swing.JPanel userTabShopPanel;
    private javax.swing.JPanel userTabSidePanel;
    // End of variables declaration//GEN-END:variables
}
