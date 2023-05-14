import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MonitorGUI extends javax.swing.JFrame {
    private int selectedIndexOfType;
    private ParkingType selectedParkingType;
    private ParkingDeck parkingdeck = ParkingDeck.getInstance();
    private Map<Integer, javax.swing.JPanel> panelMap = new HashMap<>();
    private Map<Integer, Car> carMap = new HashMap();
    private Revenue revenue = Revenue.readRevenue(String.format("Revenue%d.ser", ParkingDeckGUI.getcurrentYear()));
    private int occupiedCounter;

    private Payment payTicket;
    private int parkingspotID;


    public MonitorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel18 = new javax.swing.JPanel();
        Panel14 = new javax.swing.JPanel();
        Panel19 = new javax.swing.JPanel();
        Panel12 = new javax.swing.JPanel();
        Panel20 = new javax.swing.JPanel();
        Panel11 = new javax.swing.JPanel();
        Panel13 = new javax.swing.JPanel();
        Panel16 = new javax.swing.JPanel();
        Panel15 = new javax.swing.JPanel();
        Panel17 = new javax.swing.JPanel();
        Panel29 = new javax.swing.JPanel();
        Panel21 = new javax.swing.JPanel();
        Panel28 = new javax.swing.JPanel();
        Panel23 = new javax.swing.JPanel();
        Panel25 = new javax.swing.JPanel();
        Panel27 = new javax.swing.JPanel();
        Panel24 = new javax.swing.JPanel();
        Panel30 = new javax.swing.JPanel();
        Panel26 = new javax.swing.JPanel();
        Panel22 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        Panel6 = new javax.swing.JPanel();
        Panel7 = new javax.swing.JPanel();
        Panel8 = new javax.swing.JPanel();
        Panel10 = new javax.swing.JPanel();
        Panel9 = new javax.swing.JPanel();

        Label1 = new javax.swing.JLabel();
        Label15 = new javax.swing.JLabel();
        Label14 = new javax.swing.JLabel();
        Label19 = new javax.swing.JLabel();
        Label18 = new javax.swing.JLabel();
        Label12 = new javax.swing.JLabel();
        Label20 = new javax.swing.JLabel();
        Label11 = new javax.swing.JLabel();
        Label13 = new javax.swing.JLabel();
        Label16 = new javax.swing.JLabel();
        Label17 = new javax.swing.JLabel();
        Label29 = new javax.swing.JLabel();
        Label21 = new javax.swing.JLabel();
        Label23 = new javax.swing.JLabel();
        Label28 = new javax.swing.JLabel();
        Label25 = new javax.swing.JLabel();
        Label27 = new javax.swing.JLabel();
        Label24 = new javax.swing.JLabel();
        Label26 = new javax.swing.JLabel();
        Label30 = new javax.swing.JLabel();
        Label22 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();

        forthPrice_label = new javax.swing.JLabel();
        firstPrice_label1 = new javax.swing.JLabel();
        secondPrice_label1 = new javax.swing.JLabel();
        thirdPrice_label1 = new javax.swing.JLabel();
        

        disabled_label1 = new javax.swing.JLabel();
        disabled_label2 = new javax.swing.JLabel();
        family_label3 = new javax.swing.JLabel();
        family_label4 = new javax.swing.JLabel();
        family_label5 = new javax.swing.JLabel();
        family_label6 = new javax.swing.JLabel();
        electric_label07 = new javax.swing.JLabel();
        electric_label08 = new javax.swing.JLabel();
        electric_label09 = new javax.swing.JLabel();
        electric_label10 = new javax.swing.JLabel();

        assignCar_label = new javax.swing.JLabel();
        releaseCar_label = new javax.swing.JLabel();
        confirmButtonAssign = new javax.swing.JButton();
        confirmButtonRelease = new javax.swing.JButton();
        chooseParkingType = new javax.swing.JComboBox<>();
        parkingspotNumber = new javax.swing.JTextField();
        occupied_label = new javax.swing.JLabel();
        numOfOccpiedSpots_label = new javax.swing.JLabel();
        curentPrices_label = new javax.swing.JLabel();




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



        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Panel15.setBackground(new java.awt.Color(204, 204, 204));
        Panel15.setForeground(new java.awt.Color(153, 153, 153));
        Panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label15.setText("15");
        Panel15.add(Label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 80, 120));

        Panel14.setBackground(new java.awt.Color(204, 204, 204));
        Panel14.setForeground(new java.awt.Color(153, 153, 153));
        Panel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label14.setText("14");
        Panel14.add(Label14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 80, 120));

        Panel19.setBackground(new java.awt.Color(204, 204, 204));
        Panel19.setForeground(new java.awt.Color(153, 153, 153));
        Panel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label19.setText("19");
        Panel19.add(Label19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 130, 80, 120));

        Panel18.setBackground(new java.awt.Color(204, 204, 204));
        Panel18.setForeground(new java.awt.Color(153, 153, 153));
        Panel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label18.setText("18");
        Panel18.add(Label18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, 80, 120));

        Panel12.setBackground(new java.awt.Color(204, 204, 204));
        Panel12.setForeground(new java.awt.Color(153, 153, 153));
        Panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label12.setText("12");
        Panel12.add(Label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 80, 120));

        Panel20.setBackground(new java.awt.Color(204, 204, 204));
        Panel20.setForeground(new java.awt.Color(153, 153, 153));
        Panel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label20.setText("20");
        Panel20.add(Label20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 130, 80, 120));

        Panel11.setBackground(new java.awt.Color(204, 204, 204));
        Panel11.setForeground(new java.awt.Color(153, 153, 153));
        Panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label11.setText("11");
        Panel11.add(Label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 80, 120));

        Panel13.setBackground(new java.awt.Color(204, 204, 204));
        Panel13.setForeground(new java.awt.Color(153, 153, 153));
        Panel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label13.setText("13");
        Panel13.add(Label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 80, 120));

        Panel16.setBackground(new java.awt.Color(204, 204, 204));
        Panel16.setForeground(new java.awt.Color(153, 153, 153));
        Panel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label16.setText("16");
        Panel16.add(Label16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 80, 120));

        Panel17.setBackground(new java.awt.Color(204, 204, 204));
        Panel17.setForeground(new java.awt.Color(153, 153, 153));
        Panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label17.setText("17");
        Panel17.add(Label17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 80, 120));

        Panel29.setBackground(new java.awt.Color(204, 204, 204));
        Panel29.setForeground(new java.awt.Color(153, 153, 153));
        Panel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label29.setText("29");
        Panel29.add(Label29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 260, 80, 120));

        Panel21.setBackground(new java.awt.Color(204, 204, 204));
        Panel21.setForeground(new java.awt.Color(153, 153, 153));
        Panel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label21.setText("21");
        Panel21.add(Label21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 80, 120));

        Panel23.setBackground(new java.awt.Color(204, 204, 204));
        Panel23.setForeground(new java.awt.Color(153, 153, 153));
        Panel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label23.setText("23");
        Panel23.add(Label23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, 120));

        Panel28.setBackground(new java.awt.Color(204, 204, 204));
        Panel28.setForeground(new java.awt.Color(153, 153, 153));
        Panel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label28.setText("28");
        Panel28.add(Label28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 80, 120));

        Panel25.setBackground(new java.awt.Color(204, 204, 204));
        Panel25.setForeground(new java.awt.Color(153, 153, 153));
        Panel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label25.setText("25");
        Panel25.add(Label25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 80, 120));

        Panel27.setBackground(new java.awt.Color(204, 204, 204));
        Panel27.setForeground(new java.awt.Color(153, 153, 153));
        Panel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label27.setText("27");
        Panel27.add(Label27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 80, 120));

        Panel24.setBackground(new java.awt.Color(204, 204, 204));
        Panel24.setForeground(new java.awt.Color(153, 153, 153));
        Panel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label24.setText("24");
        Panel24.add(Label24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 80, 120));

        Panel26.setBackground(new java.awt.Color(204, 204, 204));
        Panel26.setForeground(new java.awt.Color(153, 153, 153));
        Panel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label26.setText("26");
        Panel26.add(Label26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 80, 120));

        Panel30.setBackground(new java.awt.Color(204, 204, 204));
        Panel30.setForeground(new java.awt.Color(153, 153, 153));
        Panel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label30.setText("30");
        Panel30.add(Label30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 260, 80, 120));

        Panel22.setBackground(new java.awt.Color(204, 204, 204));
        Panel22.setForeground(new java.awt.Color(153, 153, 153));
        Panel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label22.setText("22");
        Panel22.add(Label22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(Panel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 80, 120));

        chooseParkingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Parking Spot", "Disabled Parking Spot", "Family Parking Spot", "Electric Parking Spot"  }));
        chooseParkingType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseParkingTypeActionPerformed(evt);
            }
        });
        getContentPane().add(chooseParkingType, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 170, 50));

        assignCar_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        assignCar_label.setText("Assign Car");
        getContentPane().add(assignCar_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 90, -1));

        confirmButtonAssign.setText("Confirm");
        confirmButtonAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonAssignActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButtonAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, -1, -1));

        releaseCar_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        releaseCar_label.setText("Release Car");
        getContentPane().add(releaseCar_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, 90, -1));

        parkingspotNumber.setText("Parkingspot Number");
        parkingspotNumber.setForeground(Color.GRAY);
        parkingspotNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkingspotNumberActionPerformed(evt);
            }
        });

        parkingspotNumber.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(parkingspotNumber.getText().equals("Parkingspot Number")){
                    parkingspotNumber.setText("");
                    parkingspotNumber.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(parkingspotNumber.getText().equals("")){
                    parkingspotNumber.setText("Parkingspot Number");
                    parkingspotNumber.setForeground(Color.GRAY);
            } 
        }

    });
        getContentPane().add(parkingspotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 130, 40));

        confirmButtonRelease.setText("Confirm");
        confirmButtonRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonReleaseActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButtonRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 640, -1, -1));

        occupied_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        occupied_label.setText("Occupied");
        getContentPane().add(occupied_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 700, -1, -1));

        numOfOccpiedSpots_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numOfOccpiedSpots_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numOfOccpiedSpots_label.setText("0");
        getContentPane().add(numOfOccpiedSpots_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 730, 20, -1));

        curentPrices_label.setBackground(new java.awt.Color(255, 255, 255));
        curentPrices_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        curentPrices_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curentPrices_label.setText("Current Prices");
        getContentPane().add(curentPrices_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 800, 120, -1));

        forthPrice_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        forthPrice_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forthPrice_label.setText(String.format("Max. Day %21.2f€", Payment.getForthPrice()));
        getContentPane().add(forthPrice_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 930, -1, -1));

        firstPrice_label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstPrice_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstPrice_label1.setText(String.format("15 Min %25.2f€", Payment.getFirstPrice()));
        getContentPane().add(firstPrice_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 840, -1, -1));

        secondPrice_label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        secondPrice_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondPrice_label1.setText(String.format("1 Hour %25.2f€", Payment.getSecondPrice()));
        getContentPane().add(secondPrice_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 870, -1, -1));

        thirdPrice_label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thirdPrice_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdPrice_label1.setText(String.format("Extra Hour %19.2f€", Payment.getThirdPrice()));
        getContentPane().add(thirdPrice_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 900, -1, -1));

        pack();
    }// </editor-fold>                        

    
    // ActionListeners
    
    private void chooseParkingTypeActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        selectedIndexOfType = chooseParkingType.getSelectedIndex();

        switch (selectedIndexOfType) {
            case 0:
                selectedParkingType = ParkingType.STANDARDPARKINGSPOT;
                break;
            case 1:
                selectedParkingType = ParkingType.DISABLEDPARKINGSPOT;
                break;
            case 2:
                selectedParkingType = ParkingType.FAMILYPARKINGSPOT;
                break;
            case 3:
                selectedParkingType = ParkingType.ELECTRICPARKINGSPOT;
                break;
        }
    }    
    
    private void confirmButtonAssignActionPerformed(java.awt.event.ActionEvent evt) {
        Car car = new Car(selectedParkingType);
        
            parkingdeck.assignParkingSpot(car);

        if (car.getParkingSpot() != null) {
            int spotIdOfCar = car.getParkingSpot().getSpotId();

            carMap.put(spotIdOfCar, car);

            JPanel occupiedParkingSpot = panelMap.get(spotIdOfCar);
            occupiedParkingSpot.setBackground(Color.GREEN);
            occupiedCounter++;

            numOfOccpiedSpots_label.setText(String.valueOf(occupiedCounter));
        } 
    }       

    private void parkingspotNumberActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    } 

    private void confirmButtonReleaseActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try {
            parkingspotID = Integer.parseInt(parkingspotNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This is not a valid Parkingspot Number, Please try again!");
        }

        JPanel checkOccupiedSpot = panelMap.get(parkingspotID);

        if(checkOccupiedSpot.getBackground().equals(Color.GREEN)) {
            checkOccupiedSpot.setBackground(new Color(204, 204, 204));
            occupiedCounter--;
            numOfOccpiedSpots_label.setText(String.valueOf(occupiedCounter));

            payTicket = new Payment();

            double price = payTicket.calculateParkingPrice(carMap.get(parkingspotID).getParkingTicket());

            // Saving the payment to Revenue
            revenue.addToRevenue(price, payTicket);
            revenue.writeRevenue(String.format("Revenue%d.ser", ParkingDeckGUI.getcurrentYear()));

            try {
                RevenueGUI.appendNewPayments(payTicket);
                RevenueGUI.setTotalRevenueLabel();
            } catch (NullPointerException e){
                System.out.println("RevenueGUI is not opened");
            }

            JOptionPane.showMessageDialog(null, "Car payed " + price + "€");
            
        } else {
            JOptionPane.showMessageDialog(null, "This Parkingspot is not occupied!");
        }
        
    }        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    private javax.swing.JLabel assignCar_label;
    private javax.swing.JComboBox<String> chooseParkingType;
    private javax.swing.JButton confirmButtonAssign;
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
    private javax.swing.JLabel releaseCar_label;
    private javax.swing.JTextField parkingspotNumber;
    private javax.swing.JButton confirmButtonRelease;
    private javax.swing.JLabel occupied_label;
    private javax.swing.JLabel numOfOccpiedSpots_label;
    private javax.swing.JLabel curentPrices_label;
    private javax.swing.JLabel firstPrice_label1;
    private javax.swing.JLabel forthPrice_label;
    private javax.swing.JLabel secondPrice_label1;
    private javax.swing.JLabel thirdPrice_label1;


    // End of variables declaration                   
}
