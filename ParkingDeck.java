import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ParkingDeck extends ParkingspotStorage {
    private ArrayList<ParkingSpot> parkingSpots = readParkingSpots();
    private static int occupiedParkingspots = 0;

    private static ParkingDeck instance;

    private ParkingDeck() {
    }

    public static ParkingDeck getInstance() {
        if (instance == null) {
            instance = new ParkingDeck();
        }
        return instance;
    }

    public void addParkingspot(int spotId, ParkingType parkingtype) {
        parkingSpots.add(new ParkingSpot(spotId, parkingtype));
    }

    public ArrayList<ParkingSpot> listParkingspots(){
        System.out.println(parkingSpots);
        return parkingSpots;
    }

    public void assignParkingSpot(Car car) {
        boolean spotAssigned = false;

        for (ParkingSpot spot : parkingSpots) {
            if (spot.getParkingType() == car.getParkingType() && !spot.isOccupied()) {
                spot.setOccupied(true);
                occupiedParkingspots++;
                spotAssigned = true;

                car.setParkingSpot(spot);
                car.setParkingTicket(new ParkingTicket(LocalTime.now()));
                car.getParkingTicket().setParkingSpot(spot);

                break;
        } 
    }

        if (!spotAssigned && !isFull()) {
            JOptionPane.showMessageDialog(null, "No Parkingspot available (FOR THIS TYPE)");
        } else if (!spotAssigned) {
            JOptionPane.showMessageDialog(null, "No Parkingspots availabe");
        }   
    }


    public static void decrementOccupiedSpots(){
        occupiedParkingspots--;
    }

    public boolean isFull(){
        if (occupiedParkingspots == 30) {
            return true;
        }else
        return false;
    }
}