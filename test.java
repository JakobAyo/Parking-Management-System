import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Revenue revenue = Revenue.readRevenue(String.format("Revenue%d.ser", 2023));
        ArrayList<Payment> payments = revenue.getPaymentList();

        ParkingDeck parkingDeck = ParkingDeck.getInstance();
        
        ArrayList<ParkingSpot> parkinglots = parkingDeck.listParkingspots();
        System.out.println(parkinglots);

        for (ParkingSpot spot : parkinglots) {
        
        spot.setOccupied(false);;
        }

        parkingDeck.writeParkingspots(parkinglots);
        System.out.println(parkinglots);
    }}
