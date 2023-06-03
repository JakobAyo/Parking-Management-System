import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Principal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.namespace.QName;

public class ParkingLot {
    private ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

    private static ParkingLot instance;

    private ParkingLot() {
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addParkingspot(int spotId, ParkingType parkingtype) {
        parkingSpots.add(new ParkingSpot(spotId, parkingtype));
    }

    public ArrayList<ParkingSpot> listParkingspots(){
        return parkingSpots;
    }

    public void assignParkingSpot(Car car) {
        for (int i = 0; i < parkingSpots.size(); i++) {
            if (parkingSpots.get(i).getParkingType() == car.getParkingType()) {
                if (parkingSpots.get(i).isOccupied()) {
                    // System.out.println("Parking spot is occupied");
                } else {
                    parkingSpots.get(i).setOccupied(true);

                    car.setParkingSpot(parkingSpots.get(i));
                    car.setParkingTicket(new ParkingTicket(LocalTime.of(12, 30, 20)));

                    System.out.println("Parking spot is assigned");
                    break;
                } 
            }
        }
            if (car.getParkingSpot() == null && car.getParkingType() != ParkingType.STANDARDPARKINGSPOT) {
                car.setParkingType(ParkingType.STANDARDPARKINGSPOT);
                System.out.println("Parking spot is not available (FOR THIS TYPE)");
                assignParkingSpot(car);
            }

            if (car.getParkingSpot() == null) {
                System.out.println("Parking spot is not available(FULL)");
            }   
    }

    public void writeParkingspots(){
        
        try{
            FileOutputStream fos = new FileOutputStream("Parkinglot");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(parkingSpots);
            oos.close();
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readParkingSpots(){
        
        try {
            FileInputStream fis = new FileInputStream("Parkinglot");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            parkingSpots = (ArrayList<ParkingSpot>) ois.readObject();

            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}