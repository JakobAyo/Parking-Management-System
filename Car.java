import java.io.Serializable;

public class Car implements Serializable{
    private ParkingType type;
    private ParkingSpot spot;
    private ParkingTicket ticket;

    public Car(ParkingType type) {
        this.type = type;
    }

    public void setParkingType(ParkingType type){
        this.type = type;
    }

    public void setParkingSpot(ParkingSpot spot){
        this.spot = spot;
    }

    public void setParkingTicket(ParkingTicket ticket) {
       this.ticket = ticket;
    }

    public ParkingType getParkingType() {
        return type;
    }

    public ParkingSpot getParkingSpot() {
        return spot;
    }

    public ParkingTicket getParkingTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s", type);
    }

}
