import java.io.Serializable;

public class ParkingSpot implements Serializable{
    private boolean occupied = false;
    private final int spotId;
    private ParkingType spotType;
    private static final long serialVersionUID = 6417270177049090553L;

    public ParkingSpot(int spotId, ParkingType spotType){
        this.spotId = spotId;
        this.spotType = spotType;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setParkingType(ParkingType spotType) {
        this.spotType = spotType;
    }

    public ParkingType getParkingType() {
        return spotType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    @Override
    public String toString() {
        return String.format("%b %d %s", occupied, spotId, spotType);
    }
}
