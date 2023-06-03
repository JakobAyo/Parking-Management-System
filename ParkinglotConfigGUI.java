import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ParkinglotConfigGUI extends javax.swing.JFrame {

    private int selectedIndexOfType;
    private ParkingType selectedParkingType;
    private int selectedParkinglotNumber;
    private Map<Integer, javax.swing.JPanel> panelMap = new HashMap<>();

    private Icon disabledIcon = new ImageIcon("images/disabled.png");
    private Icon familyIcon = new ImageIcon("images/family.png");
    private Icon electricIcon = new ImageIcon("images/electric.png");
    
    private ParkingDeck parkingDeck = ParkingDeck.getInstance();
    private ArrayList<ParkingSpot> parkinglots = parkingDeck.listParkingspots();


    public void setParkinglotConfig(){
        javax.swing.JPanel selectedPanel = panelMap.get(selectedParkinglotNumber);
        Component component = selectedPanel.getComponent(1);
        javax.swing.JLabel labelIcon= (javax.swing.JLabel) component;

        switch (selectedParkingType) {
            case DISABLEDPARKINGSPOT:
                labelIcon.setIcon(disabledIcon);
                break;
            case FAMILYPARKINGSPOT:
                labelIcon.setIcon(familyIcon);
                break;
            case ELECTRICPARKINGSPOT:
                labelIcon.setIcon(electricIcon);
                break;
            default:
                labelIcon.setIcon(null);
        }

        parkinglots.get(selectedParkinglotNumber - 1).setParkingType(selectedParkingType);
        parkingDeck.writeParkingspots(parkinglots);
     }

    public void loadLastConfig(){
        
        for (ParkingSpot spot : parkinglots){
            selectedParkinglotNumber = spot.getSpotId();
            selectedParkingType = spot.getParkingType();

            setParkinglotConfig();
        }
    }

    public ParkinglotConfigGUI() {
        initComponents();
        loadLastConfig();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        Panel30 = new javax.swing.JPanel();
        Label30 = new javax.swing.JLabel();
        Panel29 = new javax.swing.JPanel();
        Label29 = new javax.swing.JLabel();
        Panel28 = new javax.swing.JPanel();
        Label28 = new javax.swing.JLabel();
        Panel27 = new javax.swing.JPanel();
        Label27 = new javax.swing.JLabel();
        Panel26 = new javax.swing.JPanel();
        Label26 = new javax.swing.JLabel();
        Panel24 = new javax.swing.JPanel();
        Label24 = new javax.swing.JLabel();
        Panel25 = new javax.swing.JPanel();
        Label25 = new javax.swing.JLabel();
        Panel23 = new javax.swing.JPanel();
        Label23 = new javax.swing.JLabel();
        Panel22 = new javax.swing.JPanel();
        Label22 = new javax.swing.JLabel();
        Panel21 = new javax.swing.JPanel();
        Label21 = new javax.swing.JLabel();
        Panel20 = new javax.swing.JPanel();
        Label20 = new javax.swing.JLabel();
        Panel19 = new javax.swing.JPanel();
        Label19 = new javax.swing.JLabel();
        Panel18 = new javax.swing.JPanel();
        Label18 = new javax.swing.JLabel();
        Panel17 = new javax.swing.JPanel();
        Label17 = new javax.swing.JLabel();
        Panel16 = new javax.swing.JPanel();
        Label16 = new javax.swing.JLabel();
        Panel15 = new javax.swing.JPanel();
        Label15 = new javax.swing.JLabel();
        Panel14 = new javax.swing.JPanel();
        Label14 = new javax.swing.JLabel();
        Panel13 = new javax.swing.JPanel();
        Label13 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        Label12 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        Label11 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        disabled_label1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Label2 = new javax.swing.JLabel();
        disabled_label2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        Label3 = new javax.swing.JLabel();
        family_label3 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        Label4 = new javax.swing.JLabel();
        family_label4 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        Label5 = new javax.swing.JLabel();
        family_label5 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        Label6 = new javax.swing.JLabel();
        family_label6 = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        Label7 = new javax.swing.JLabel();
        electric_label07 = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        Label8 = new javax.swing.JLabel();
        electric_label08 = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        Label9 = new javax.swing.JLabel();
        electric_label09 = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        Label10 = new javax.swing.JLabel();
        electric_label10 = new javax.swing.JLabel();
        ConfigureParkinglot_label = new javax.swing.JLabel();
        parkinglotNumber_textfield = new javax.swing.JTextField();
        chooseParkingType = new javax.swing.JComboBox<>();
        confirm_button = new javax.swing.JButton();
        standard_label11 = new javax.swing.JLabel();
        standard_label12 = new javax.swing.JLabel();
        standard_label13 = new javax.swing.JLabel();
        standard_label14 = new javax.swing.JLabel();
        standard_label15 = new javax.swing.JLabel();
        standard_label16 = new javax.swing.JLabel();
        standard_label17 = new javax.swing.JLabel();
        standard_label18 = new javax.swing.JLabel();
        standard_label19 = new javax.swing.JLabel();
        standard_label20 = new javax.swing.JLabel();
        standard_label21 = new javax.swing.JLabel();
        standard_label22 = new javax.swing.JLabel();
        standard_label23 = new javax.swing.JLabel();
        standard_label24 = new javax.swing.JLabel();
        standard_label25 = new javax.swing.JLabel();
        standard_label26 = new javax.swing.JLabel();
        standard_label27 = new javax.swing.JLabel();
        standard_label28 = new javax.swing.JLabel();
        standard_label29 = new javax.swing.JLabel();
        standard_label30 = new javax.swing.JLabel();

        panelMap.put(1, Panel1);
        panelMap.put(2, Panel2);
        panelMap.put(3, Panel3);
        panelMap.put(4, Panel4);
        panelMap.put(5, Panel5);
        panelMap.put(6, Panel6);
        panelMap.put(7, Panel7);
        panelMap.put(8, Panel8);
        panelMap.put(9, Panel9);
        panelMap.put(10, Panel10);
        panelMap.put(11, Panel11);
        panelMap.put(12, Panel12);
        panelMap.put(13, Panel13);
        panelMap.put(14, Panel14);
        panelMap.put(15, Panel15);
        panelMap.put(16, Panel16);
        panelMap.put(17, Panel17);
        panelMap.put(18, Panel18);
        panelMap.put(19, Panel19);
        panelMap.put(20, Panel20);
        panelMap.put(21, Panel21);
        panelMap.put(22, Panel22);
        panelMap.put(23, Panel23);
        panelMap.put(24, Panel24);
        panelMap.put(25, Panel25);
        panelMap.put(26, Panel26);
        panelMap.put(27, Panel27);
        panelMap.put(28, Panel28);
        panelMap.put(29, Panel29);
        panelMap.put(30, Panel30);


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel30.setBackground(new java.awt.Color(204, 204, 204));
        Panel30.setForeground(new java.awt.Color(153, 153, 153));
        Panel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label30.setText("30");
        Panel30.add(Label30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel30.add(standard_label30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 260, 80, 120));

        Panel29.setBackground(new java.awt.Color(204, 204, 204));
        Panel29.setForeground(new java.awt.Color(153, 153, 153));
        Panel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label29.setText("29");
        Panel29.add(Label29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel29.add(standard_label29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 260, 80, 120));

        Panel28.setBackground(new java.awt.Color(204, 204, 204));
        Panel28.setForeground(new java.awt.Color(153, 153, 153));
        Panel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label28.setText("28");
        Panel28.add(Label28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel28.add(standard_label28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 80, 120));

        Panel27.setBackground(new java.awt.Color(204, 204, 204));
        Panel27.setForeground(new java.awt.Color(153, 153, 153));
        Panel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label27.setText("27");
        Panel27.add(Label27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel27.add(standard_label27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 80, 120));

        Panel26.setBackground(new java.awt.Color(204, 204, 204));
        Panel26.setForeground(new java.awt.Color(153, 153, 153));
        Panel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label26.setText("26");
        Panel26.add(Label26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel26.add(standard_label26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 80, 120));

        Panel24.setBackground(new java.awt.Color(204, 204, 204));
        Panel24.setForeground(new java.awt.Color(153, 153, 153));
        Panel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label24.setText("24");
        Panel24.add(Label24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel24.add(standard_label24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 80, 120));

        Panel25.setBackground(new java.awt.Color(204, 204, 204));
        Panel25.setForeground(new java.awt.Color(153, 153, 153));
        Panel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label25.setText("25");
        Panel25.add(Label25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel25.add(standard_label25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 80, 120));

        Panel23.setBackground(new java.awt.Color(204, 204, 204));
        Panel23.setForeground(new java.awt.Color(153, 153, 153));
        Panel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label23.setText("23");
        Panel23.add(Label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel23.add(standard_label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, 120));

        Panel22.setBackground(new java.awt.Color(204, 204, 204));
        Panel22.setForeground(new java.awt.Color(153, 153, 153));
        Panel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label22.setText("22");
        Panel22.add(Label22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel22.add(standard_label22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 80, 120));

        Panel21.setBackground(new java.awt.Color(204, 204, 204));
        Panel21.setForeground(new java.awt.Color(153, 153, 153));
        Panel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label21.setText("21");
        Panel21.add(Label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel21.add(standard_label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 80, 120));

        Panel20.setBackground(new java.awt.Color(204, 204, 204));
        Panel20.setForeground(new java.awt.Color(153, 153, 153));
        Panel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label20.setText("20");
        Panel20.add(Label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel20.add(standard_label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 130, 80, 120));

        Panel19.setBackground(new java.awt.Color(204, 204, 204));
        Panel19.setForeground(new java.awt.Color(153, 153, 153));
        Panel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label19.setText("19");
        Panel19.add(Label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel19.add(standard_label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 130, 80, 120));

        Panel18.setBackground(new java.awt.Color(204, 204, 204));
        Panel18.setForeground(new java.awt.Color(153, 153, 153));
        Panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label18.setText("18");
        Panel18.add(Label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel18.add(standard_label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, 80, 120));

        Panel17.setBackground(new java.awt.Color(204, 204, 204));
        Panel17.setForeground(new java.awt.Color(153, 153, 153));
        Panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label17.setText("17");
        Panel17.add(Label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel17.add(standard_label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 80, 120));

        Panel16.setBackground(new java.awt.Color(204, 204, 204));
        Panel16.setForeground(new java.awt.Color(153, 153, 153));
        Panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label16.setText("16");
        Panel16.add(Label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel16.add(standard_label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 80, 120));

        Panel15.setBackground(new java.awt.Color(204, 204, 204));
        Panel15.setForeground(new java.awt.Color(153, 153, 153));
        Panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label15.setText("15");
        Panel15.add(Label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel15.add(standard_label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 80, 120));

        Panel14.setBackground(new java.awt.Color(204, 204, 204));
        Panel14.setForeground(new java.awt.Color(153, 153, 153));
        Panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label14.setText("14");
        Panel14.add(Label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel14.add(standard_label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 80, 120));

        Panel13.setBackground(new java.awt.Color(204, 204, 204));
        Panel13.setForeground(new java.awt.Color(153, 153, 153));
        Panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label13.setText("13");
        Panel13.add(Label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel13.add(standard_label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 80, 120));

        Panel12.setBackground(new java.awt.Color(204, 204, 204));
        Panel12.setForeground(new java.awt.Color(153, 153, 153));
        Panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label12.setText("12");
        Panel12.add(Label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel12.add(standard_label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 80, 120));

        Panel11.setBackground(new java.awt.Color(204, 204, 204));
        Panel11.setForeground(new java.awt.Color(153, 153, 153));
        Panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label11.setText("11");
        Panel11.add(Label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        Panel11.add(standard_label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 80, 120));

        Panel1.setBackground(new java.awt.Color(204, 204, 204));
        Panel1.setForeground(new java.awt.Color(153, 153, 153));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label1.setText("01");
        Panel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        

        disabled_label1.setIcon(new javax.swing.ImageIcon("images/disabled.png")); // NOI18N
        Panel1.add(disabled_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 80, 120));

        Panel2.setBackground(new java.awt.Color(204, 204, 204));
        Panel2.setForeground(new java.awt.Color(153, 153, 153));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label2.setText("02");
        Panel2.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        disabled_label2.setIcon(new javax.swing.ImageIcon("images/disabled.png")); // NOI18N
        Panel2.add(disabled_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 80, 120));

        Panel3.setBackground(new java.awt.Color(204, 204, 204));
        Panel3.setForeground(new java.awt.Color(153, 153, 153));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label3.setText("03");
        Panel3.add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        family_label3.setIcon(new javax.swing.ImageIcon("images/family.png")); // NOI18N
        Panel3.add(family_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 80, 120));

        Panel4.setBackground(new java.awt.Color(204, 204, 204));
        Panel4.setForeground(new java.awt.Color(153, 153, 153));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label4.setText("04");
        Panel4.add(Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        family_label4.setIcon(new javax.swing.ImageIcon("images/family.png")); // NOI18N
        Panel4.add(family_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 80, 120));

        Panel5.setBackground(new java.awt.Color(204, 204, 204));
        Panel5.setForeground(new java.awt.Color(153, 153, 153));
        Panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label5.setText("05");
        Panel5.add(Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        family_label5.setIcon(new javax.swing.ImageIcon("images/family.png")); // NOI18N
        Panel5.add(family_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 80, 120));

        Panel6.setBackground(new java.awt.Color(204, 204, 204));
        Panel6.setForeground(new java.awt.Color(153, 153, 153));
        Panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label6.setText("06");
        Panel6.add(Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        family_label6.setIcon(new javax.swing.ImageIcon("images/family.png")); // NOI18N
        Panel6.add(family_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 80, 120));

        Panel7.setBackground(new java.awt.Color(204, 204, 204));
        Panel7.setForeground(new java.awt.Color(153, 153, 153));
        Panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label7.setText("07");
        Panel7.add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        electric_label07.setIcon(new javax.swing.ImageIcon("images/electric.png")); // NOI18N
        Panel7.add(electric_label07, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 80, 120));

        Panel8.setBackground(new java.awt.Color(204, 204, 204));
        Panel8.setForeground(new java.awt.Color(153, 153, 153));
        Panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label8.setText("08");
        Panel8.add(Label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        electric_label08.setIcon(new javax.swing.ImageIcon("images/electric.png")); // NOI18N
        Panel8.add(electric_label08, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 80, 120));

        Panel9.setBackground(new java.awt.Color(204, 204, 204));
        Panel9.setForeground(new java.awt.Color(153, 153, 153));
        Panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label9.setText("09");
        Panel9.add(Label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        electric_label09.setIcon(new javax.swing.ImageIcon("images/electric.png")); // NOI18N
        Panel9.add(electric_label09, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 80, 120));

        Panel10.setBackground(new java.awt.Color(204, 204, 204));
        Panel10.setForeground(new java.awt.Color(153, 153, 153));
        Panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label10.setText("10");
        Panel10.add(Label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        electric_label10.setIcon(new javax.swing.ImageIcon("images/electric.png")); // NOI18N
        Panel10.add(electric_label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        getContentPane().add(Panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 80, 120));

        ConfigureParkinglot_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfigureParkinglot_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConfigureParkinglot_label.setText("Configure Parkinglot");
        getContentPane().add(ConfigureParkinglot_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 170, -1));

        parkinglotNumber_textfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        parkinglotNumber_textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        parkinglotNumber_textfield.setText("Parkinglot Number");
        parkinglotNumber_textfield.setForeground(Color.GRAY);
        parkinglotNumber_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkinglotNumber_textfieldActionPerformed(evt);
            }
        });

        parkinglotNumber_textfield.addFocusListener(new FocusListener() {
           @Override
            public void focusGained(FocusEvent e) {
                if (parkinglotNumber_textfield.getText().equals("Parkinglot Number")) {
                    parkinglotNumber_textfield.setText("");
                    parkinglotNumber_textfield.setForeground(Color.BLACK);
                }
            }
            @Override 
            public void focusLost(FocusEvent e) {
                if (parkinglotNumber_textfield.getText().equals("")) {
                    parkinglotNumber_textfield.setText("Parkinglot Number");
                    parkinglotNumber_textfield.setForeground(Color.GRAY);
                }
            }
        });

        getContentPane().add(parkinglotNumber_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, 150, 50));

        chooseParkingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disabled Parkinglot", "Family Parkinglot", "Electric Parkinglot", "Standard Parkinglot" }));
        chooseParkingType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseParkingTypeActionPerformed(evt);
            }
        });
        getContentPane().add(chooseParkingType, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 150, 50));

        confirm_button.setText("Confirm");
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(confirm_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }                      

    private void parkinglotNumber_textfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    }                                                           

    private void chooseParkingTypeActionPerformed(java.awt.event.ActionEvent evt) {         
        selectedIndexOfType = chooseParkingType.getSelectedIndex();

        switch (selectedIndexOfType) {
            case 0:
                selectedParkingType = ParkingType.DISABLEDPARKINGSPOT;
                break;
            case 1:
                selectedParkingType = ParkingType.FAMILYPARKINGSPOT;
                break;
            case 2:
                selectedParkingType = ParkingType.ELECTRICPARKINGSPOT;
                break;
            case 3:
                selectedParkingType = ParkingType.STANDARDPARKINGSPOT;
                break;
        }
    }    
      

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {         
        try {
            selectedParkinglotNumber = Integer.parseInt(parkinglotNumber_textfield.getText());
            if (selectedParkinglotNumber < 0 || selectedParkinglotNumber > 30) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30");
        }                                    

        try {
            setParkinglotConfig();
        } catch (NullPointerException e){
            
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
            java.util.logging.Logger.getLogger(ParkinglotConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkinglotConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkinglotConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkinglotConfigGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkinglotConfigGUI().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel ConfigureParkinglot_label;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label11;
    private javax.swing.JLabel Label12;
    private javax.swing.JLabel Label13;
    private javax.swing.JLabel Label14;
    private javax.swing.JLabel Label15;
    private javax.swing.JLabel Label16;
    private javax.swing.JLabel Label17;
    private javax.swing.JLabel Label18;
    private javax.swing.JLabel Label19;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label20;
    private javax.swing.JLabel Label21;
    private javax.swing.JLabel Label22;
    private javax.swing.JLabel Label23;
    private javax.swing.JLabel Label24;
    private javax.swing.JLabel Label25;
    private javax.swing.JLabel Label26;
    private javax.swing.JLabel Label27;
    private javax.swing.JLabel Label28;
    private javax.swing.JLabel Label29;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label30;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel17;
    private javax.swing.JPanel Panel18;
    private javax.swing.JPanel Panel19;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JPanel Panel23;
    private javax.swing.JPanel Panel24;
    private javax.swing.JPanel Panel25;
    private javax.swing.JPanel Panel26;
    private javax.swing.JPanel Panel27;
    private javax.swing.JPanel Panel28;
    private javax.swing.JPanel Panel29;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel30;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JComboBox<String> chooseParkingType;
    private javax.swing.JButton confirm_button;
    private javax.swing.JLabel disabled_label1;
    private javax.swing.JLabel disabled_label2;
    private javax.swing.JLabel electric_label07;
    private javax.swing.JLabel electric_label08;
    private javax.swing.JLabel electric_label09;
    private javax.swing.JLabel electric_label10;
    private javax.swing.JLabel family_label3;
    private javax.swing.JLabel family_label4;
    private javax.swing.JLabel family_label5;
    private javax.swing.JLabel family_label6;
    private javax.swing.JTextField parkinglotNumber_textfield;
    private javax.swing.JLabel standard_label11;
    private javax.swing.JLabel standard_label12;
    private javax.swing.JLabel standard_label13;
    private javax.swing.JLabel standard_label14;
    private javax.swing.JLabel standard_label15;
    private javax.swing.JLabel standard_label16;
    private javax.swing.JLabel standard_label17;
    private javax.swing.JLabel standard_label18;
    private javax.swing.JLabel standard_label19;
    private javax.swing.JLabel standard_label20;
    private javax.swing.JLabel standard_label21;
    private javax.swing.JLabel standard_label22;
    private javax.swing.JLabel standard_label23;
    private javax.swing.JLabel standard_label24;
    private javax.swing.JLabel standard_label25;
    private javax.swing.JLabel standard_label26;
    private javax.swing.JLabel standard_label27;
    private javax.swing.JLabel standard_label28;
    private javax.swing.JLabel standard_label29;
    private javax.swing.JLabel standard_label30;
    // End of variables declaration                   
}
