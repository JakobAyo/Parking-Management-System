import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public abstract class ParkingspotStorage {

    public void writeParkingspots(ArrayList<ParkingSpot> parkingSpots){
        
        try{
            FileOutputStream fos = new FileOutputStream("Parkingdeck");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(parkingSpots);
            oos.close();
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<ParkingSpot> readParkingSpots(){
        ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

        try {
            FileInputStream fis = new FileInputStream("Parkingdeck");
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
