import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Payment implements Serializable{
    private Duration duration;
    private double price;
    private int durationInMinutes;
    private ParkingTicket ticket;

    private static double firstPrice = 0;
    private static double secondPrice = 2;
    private static double thirdPrice = 2.5;
    private static double forthPrice = 20;
    
    public Payment() {
    }

    public double calculateParkingPrice(ParkingTicket ticket) {
        this.ticket = ticket;
        ticket.checkOut(LocalTime.now());
        duration = ticket.parkingDuration();

        ParkingDeck.decrementOccupiedSpots();
        ticket.getParkingSpot().setOccupied(false);

        durationInMinutes = (int) duration.plusSeconds(59).toMinutes();

        if (durationInMinutes <= 15) {
            price = firstPrice;
            JOptionPane.showMessageDialog(null, "The car parked for " + durationInMinutes + " minutes");
        }else if(durationInMinutes <= 60) {
            price = secondPrice;
            JOptionPane.showMessageDialog(null, "The car parked for " + durationInMinutes + " minutes");
        }
        else if(durationInMinutes - 60 <= 60 * 5) {
            price = duration.toHours() * thirdPrice + secondPrice;
            JOptionPane.showMessageDialog(null, "The car parked for " + duration.toHours() + " hours");
        }else {
            price = forthPrice;
            JOptionPane.showMessageDialog(null, "The car parked for " + duration.toHours() + " hours");
        }
        return price;
    }

    public double getPrice(){
        return price;
    }

    public Duration getDuration(){
        return duration;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("Payment: Custom serialization - writeObject()");
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("Payment: Custom deserialization - readObject()");
        in.defaultReadObject();
    }

    public static void setFirstPrice(double fisrt){
        firstPrice = fisrt;
    }

    public static void setSecondPrice(double second){
        secondPrice = second;
    }

    public static void setThirdPrice(double third){
        thirdPrice = third;
    }

    public static void setForthPrice(double forth){
        forthPrice = forth;
    }

    public static double getFirstPrice(){
        return firstPrice;
    }

    public static double getSecondPrice(){
        return secondPrice;
    }

    public static double getThirdPrice(){
        return thirdPrice;
    }

    public static double getForthPrice(){
        return forthPrice;
    }
    
    

    @Override
    public String toString() {
        return String.format("Parked duration in Minutes: %-10s Payed: %.2f€", durationInMinutes, price);
    }
}
