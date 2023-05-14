import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public abstract class ParkingspotStorage {
    private ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();

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

    public ArrayList<ParkingSpot> readParkingSpots(){
        
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

        return parkingSpots;
    }
}
