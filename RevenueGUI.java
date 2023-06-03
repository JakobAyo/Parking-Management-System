import java.util.ArrayList;

public class RevenueGUI extends javax.swing.JFrame {

    private static Revenue revenue = Revenue.readRevenue(String.format("Revenue%d.ser", ParkingDeckGUI.getcurrentYear()));
    private static ArrayList<Payment> savedPaymentsList = new ArrayList<>();

    public static void appendPreviousPayments(){
        revenue = Revenue.readRevenue(String.format("Revenue%d.ser", ParkingDeckGUI.getcurrentYear()));

        try{
            savedPaymentsList = revenue.getPaymentList();
        } catch (Exception e) {
        }

        if (savedPaymentsList != null) {
            for (Payment payment : savedPaymentsList){
                main_textarea.append(String.valueOf(payment + "\n"));
            }
        }
    }

    public static void appendNewPayments(Payment payment){
        main_textarea.append(String.valueOf(payment + "\n"));
    }

    public static void setTotalRevenueLabel(){
        revenue = Revenue.readRevenue(String.format("Revenue%d.ser", ParkingDeckGUI.getcurrentYear()));
        totalRevenue_label.setText(String.format("Total of: %.2f€", revenue.getRevenue()));
    }


    public RevenueGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        main_textarea = new javax.swing.JTextArea();
        revenue_label = new javax.swing.JLabel();
        totalRevenue_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_textarea.setEditable(false);
        main_textarea.setBackground(new java.awt.Color(255, 255, 255));
        main_textarea.setColumns(20);
        main_textarea.setRows(500);
        main_textarea.setToolTipText("");
        main_textarea.setWrapStyleWord(true);
        scrollpane.setViewportView(main_textarea);

        getContentPane().add(scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 940, 460));

        revenue_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        revenue_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        revenue_label.setText("Revenue ");
        getContentPane().add(revenue_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 80, 40));

        totalRevenue_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalRevenue_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalRevenue_label.setText(String.format("Total of: %.2f€", revenue.getRevenue()));
        getContentPane().add(totalRevenue_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 230, 50));

        pack();
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
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevenueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private static javax.swing.JTextArea main_textarea;
    private javax.swing.JLabel revenue_label;
    private javax.swing.JScrollPane scrollpane;
    private static javax.swing.JLabel totalRevenue_label;
    // End of variables declaration                   
}
