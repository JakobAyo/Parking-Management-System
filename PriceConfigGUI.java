import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class PriceConfigGUI extends javax.swing.JFrame implements Serializable {
    private static final long serialVersionUID = 2L;

    private double firstPrice = 0;
    private double secondPrice = 2;
    private double thirdPrice = 2.5;
    private double forthPrice = 20;

    public void updatePriceList() {
        firstPrice_label.setText(String.format("15 Min %25.2f€", firstPrice));
        secondPrice_label.setText(String.format("1 Hour %25.2f€", secondPrice));
        thirdPrice_label.setText(String.format("Extra Hour %19.2f€", thirdPrice));
        forthPrice_label.setText(String.format("Max. Day %21.2f€", forthPrice));

        Payment.setFirstPrice(firstPrice);
        Payment.setSecondPrice(secondPrice);
        Payment.setThirdPrice(thirdPrice);
        Payment.setForthPrice(forthPrice);

        save();
    }

    public void save(){
        try {
            FileOutputStream fos = new FileOutputStream("PriceConfig.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(firstPrice);
            oos.writeObject(secondPrice);
            oos.writeObject(thirdPrice);
            oos.writeObject(forthPrice);
            oos.close();
            fos.close();
            System.out.println("PriceConfig saved");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("Catched Null");
        }
    }

    public void load(){
        
        try {
            FileInputStream fis = new FileInputStream("PriceConfig.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            firstPrice = (double) ois.readObject();
            secondPrice = (double) ois.readObject();
            thirdPrice = (double) ois.readObject();
            forthPrice = (double) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } 

        Payment.setFirstPrice(firstPrice);
        Payment.setSecondPrice(secondPrice);
        Payment.setThirdPrice(thirdPrice);
        Payment.setForthPrice(forthPrice);

    }


    public PriceConfigGUI() {
        load();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        curentPrices_label = new javax.swing.JLabel();
        firstPrice_label = new javax.swing.JLabel();
        secondPrice_label = new javax.swing.JLabel();
        thirdPrice_label = new javax.swing.JLabel();
        forthPrice_label = new javax.swing.JLabel();
        modifyPrices_label = new javax.swing.JLabel();
        forthModifiedPrice_label = new javax.swing.JLabel();
        fisrtModifiedPrice_label = new javax.swing.JLabel();
        secondModifiedPrice_label = new javax.swing.JLabel();
        thirdModifiedPrice_label = new javax.swing.JLabel();
        firstPrice_textfield = new javax.swing.JTextField();
        secondPrice_textfield = new javax.swing.JTextField();
        thirdPrice_textfield = new javax.swing.JTextField();
        forthPrice_textfield = new javax.swing.JTextField();
        Confirm_button = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        curentPrices_label.setBackground(new java.awt.Color(255, 255, 255));
        curentPrices_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        curentPrices_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curentPrices_label.setText("Current Prices");
        getContentPane().add(curentPrices_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 120, -1));

        firstPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstPrice_label.setText(String.format("15 Min %25.2f€", firstPrice));
        getContentPane().add(firstPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        secondPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondPrice_label.setText(String.format("1 Hour %25.2f€", secondPrice));
        getContentPane().add(secondPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        thirdPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thirdPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdPrice_label.setText(String.format("Extra Hour %19.2f€", thirdPrice));
        getContentPane().add(thirdPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        forthPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forthPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forthPrice_label.setText(String.format("Max. Day %21.2f€", forthPrice));
        getContentPane().add(forthPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, -1, -1));

        modifyPrices_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modifyPrices_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifyPrices_label.setText("Modify Prices");
        getContentPane().add(modifyPrices_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        forthModifiedPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forthModifiedPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forthModifiedPrice_label.setText("Max. Day");
        getContentPane().add(forthModifiedPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 80, -1));

        fisrtModifiedPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fisrtModifiedPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fisrtModifiedPrice_label.setText("15 Min");
        getContentPane().add(fisrtModifiedPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 60, -1));

        secondModifiedPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondModifiedPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondModifiedPrice_label.setText("1 Hour");
        getContentPane().add(secondModifiedPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 60, -1));

        thirdModifiedPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thirdModifiedPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdModifiedPrice_label.setText("Extra Hour");
        getContentPane().add(thirdModifiedPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 90, -1));

        forthPrice_textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        forthPrice_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forthPrice_textfield.setText(String.valueOf(forthPrice));
        forthPrice_textfield.setForeground(Color.GRAY);
        getContentPane().add(forthPrice_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 60, 30));

        forthPrice_textfield.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (forthPrice_textfield.getText().equals(String.valueOf(forthPrice))) {
                    forthPrice_textfield.setText("");
                    forthPrice_textfield.setForeground(Color.BLACK);
            }
        }
            @Override
            public void focusLost(FocusEvent e ) {
                if (forthPrice_textfield.getText().equals("")) {
                    forthPrice_textfield.setText(String.valueOf(forthPrice));
                    forthPrice_textfield.setForeground(Color.GRAY);
                }
            }
        });

        firstPrice_textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstPrice_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstPrice_textfield.setText(String.valueOf(firstPrice));
        firstPrice_textfield.setForeground(Color.GRAY);
        getContentPane().add(firstPrice_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, 60, 30));

        firstPrice_textfield.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstPrice_textfield.getText().equals(String.valueOf(firstPrice))) {
                    firstPrice_textfield.setText("");
                    firstPrice_textfield.setForeground(Color.BLACK);
            }
        }
            @Override
            public void focusLost(FocusEvent e ) {
                if (firstPrice_textfield.getText().equals("")) {
                    firstPrice_textfield.setText(String.valueOf(firstPrice));
                    firstPrice_textfield.setForeground(Color.GRAY);
                }
            }
        });

        secondPrice_textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondPrice_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondPrice_textfield.setText(String.valueOf(secondPrice));
        secondPrice_textfield.setForeground(Color.GRAY);
        getContentPane().add(secondPrice_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 460, 60, 30));

        secondPrice_textfield.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (secondPrice_textfield.getText().equals(String.valueOf(secondPrice))) {
                    secondPrice_textfield.setText("");
                    secondPrice_textfield.setForeground(Color.BLACK);
            }
        }
            @Override
            public void focusLost(FocusEvent e ) {
                if (secondPrice_textfield.getText().equals("")) {
                    secondPrice_textfield.setText(String.valueOf(secondPrice));
                    secondPrice_textfield.setForeground(Color.GRAY);
                }
            }
        });

        thirdPrice_textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thirdPrice_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        thirdPrice_textfield.setText(String.valueOf(thirdPrice));
        thirdPrice_textfield.setForeground(Color.GRAY);
        getContentPane().add(thirdPrice_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 490, 60, 30));

        thirdPrice_textfield.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (thirdPrice_textfield.getText().equals(String.valueOf(thirdPrice))) {
                    thirdPrice_textfield.setText("");
                    thirdPrice_textfield.setForeground(Color.BLACK);
            }
        }
            @Override
            public void focusLost(FocusEvent e ) {
                if (thirdPrice_textfield.getText().equals("")) {
                    thirdPrice_textfield.setText(String.valueOf(thirdPrice));
                    thirdPrice_textfield.setForeground(Color.GRAY);
                }
            }
        });

        Confirm_button.setText("Confirm");
        Confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 100, 40));

        pack();
    }   
         
    
    private void Confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try{
            firstPrice = Double.parseDouble(firstPrice_textfield.getText());
            secondPrice = Double.parseDouble(secondPrice_textfield.getText());
            thirdPrice = Double.parseDouble(thirdPrice_textfield.getText());
            forthPrice = Double.parseDouble(forthPrice_textfield.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter numerical values only");
            System.out.println("wrong Double format");
        }
        updatePriceList();
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
            java.util.logging.Logger.getLogger(PriceConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PriceConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PriceConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PriceConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PriceConfigGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Confirm_button;
    private javax.swing.JLabel curentPrices_label;
    private javax.swing.JLabel firstPrice_label;
    private javax.swing.JTextField firstPrice_textfield;
    private javax.swing.JLabel fisrtModifiedPrice_label;
    private javax.swing.JLabel forthModifiedPrice_label;
    private javax.swing.JLabel forthPrice_label;
    private javax.swing.JTextField forthPrice_textfield;
    private javax.swing.JLabel modifyPrices_label;
    private javax.swing.JLabel secondModifiedPrice_label;
    private javax.swing.JLabel secondPrice_label;
    private javax.swing.JTextField secondPrice_textfield;
    private javax.swing.JLabel thirdModifiedPrice_label;
    private javax.swing.JLabel thirdPrice_label;
    private javax.swing.JTextField thirdPrice_textfield;
    // End of variables declaration                   
}
