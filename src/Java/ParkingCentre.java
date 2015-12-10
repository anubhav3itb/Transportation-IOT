package Java;

import java.awt.Point;

public class ParkingCentre {
    Point startLocation;
    Point endLocation;
    int maxCapacity;
    int occupancy;
    
    public ParkingCentre(Point startLocation, Point endLocation, int occupancy) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.occupancy = occupancy;
    }
    public Point getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(Point startLocation) {
        this.startLocation = startLocation;
    }
    public Point getEndLocation() {
        return endLocation;
    }
    public void setEndLocation(Point endLocation) {
        this.endLocation = endLocation;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public int getOccupancy() {
        return occupancy;
    }
    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }
    

}
