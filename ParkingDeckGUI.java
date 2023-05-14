import javax.swing.JOptionPane;

public class ParkingDeckGUI extends javax.swing.JFrame {
    private static boolean validYear = false;

    public static int getcurrentYear(){
        int currentYear = 0;
        
        try {
            currentYear = Integer.parseInt(currentYear_textfield.getText());
            if (currentYear < 2023) {
                throw new ArrayIndexOutOfBoundsException(currentYear);
            }
            validYear = true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid year! ");
            validYear = false;
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, currentYear +  " is not a valid year!");
        }
        return currentYear;
    }


    public ParkingDeckGUI() {
        PriceConfigGUI priceConfig = new PriceConfigGUI();
        priceConfig.load();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        logo_label = new javax.swing.JLabel();
        PriceConfigButton = new javax.swing.JButton();
        EmptyButton = new javax.swing.JButton();
        monitorButton = new javax.swing.JButton();
        RevenueButton = new javax.swing.JButton();
        currentYear_textfield = new javax.swing.JTextField();
        currentYear_label = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_label.setIcon(new javax.swing.ImageIcon("images/logo.png")); // NOI18N
        logo_label.setText("jLabel1");
        logo_label.setMaximumSize(new java.awt.Dimension(500, 500));
        logo_label.setMinimumSize(new java.awt.Dimension(500, 500));
        logo_label.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(logo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 500, 500));

        PriceConfigButton.setText("Price Configuration");
        PriceConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceConfigButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PriceConfigButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 150, 60));

        EmptyButton.setText("Monitor");
        EmptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmptyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmptyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 740, 150, 60));

        monitorButton.setText("Monitor");
        monitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(monitorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, 150, 60));

        RevenueButton.setText("Revenue");
        RevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RevenueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 740, 150, 60));

        currentYear_textfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currentYear_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentYear_textfield.setText("2023");
        getContentPane().add(currentYear_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 592, 100, 40));



        currentYear_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currentYear_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentYear_label.setText("Current Year");
        getContentPane().add(currentYear_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        pack();
    }                    

    private void PriceConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        getcurrentYear(); 
        if (validYear) {
            new PriceConfigGUI().setVisible(true);
            validYear = false;
        }       
    }                                                 

    private void EmptyButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        getcurrentYear();                                    
    }                                           

    private void monitorButtonActionPerformed(java.awt.event.ActionEvent evt) {   
        getcurrentYear();
        if (validYear) {
            new MonitorGUI().setVisible(true);
            validYear = false;
        }
    }                                             

    private void RevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {     
          
        getcurrentYear();
        if (validYear) {
            new RevenueGUI().setVisible(true);
            RevenueGUI.appendPreviousPayments();
            RevenueGUI.setTotalRevenueLabel();
            validYear = false;
        }
    }     
    


    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParkingDeckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingDeckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingDeckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingDeckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingDeckGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton EmptyButton;
    private javax.swing.JButton PriceConfigButton;
    private javax.swing.JButton RevenueButton;
    private javax.swing.JLabel logo_label;
    private javax.swing.JButton monitorButton;
    private static javax.swing.JTextField currentYear_textfield;
    private javax.swing.JLabel currentYear_label;
    // End of variables declaration                   
}
