import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;


public class ParkingTicket implements Serializable {
    private LocalTime enterTime;
    private LocalTime exitTime;
    private ParkingSpot spot;
    private Car car;

    public ParkingTicket(LocalTime enterTime) {
        this.enterTime = enterTime;
    };
 
    public void checkOut(LocalTime exitTime){
        this.exitTime = exitTime;
    };

    public LocalTime getCheckIn() {
        return enterTime;
    }

    public LocalTime getCheckOut() {
        return exitTime;
    }

    public Duration parkingDuration() {
        return Duration.between(enterTime, exitTime);
    }

    public void setParkingSpot(ParkingSpot spot){
        this.spot = spot;
    }

    public ParkingSpot getParkingSpot() {
        return spot;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %02d:%02d:%02d", enterTime.getHour(), enterTime.getMinute(), enterTime.getSecond(), exitTime.getHour(), exitTime.getMinute(), exitTime.getSecond());
    }
}
