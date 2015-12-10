package Java;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParkingCentre {
    Point location;
    int maxCapacity;
    int occupancy;
    int intakeRate;

    public int getIntakeRate() {
        return intakeRate;
    }
    public void setIntakeRate(int intakeRate) {
        this.intakeRate = intakeRate;
    }
    public ParkingCentre(Point location, int occupancy, int maxCapacity, int intakeRate) {
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.occupancy = occupancy;
        this.intakeRate = intakeRate;
    }
    
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
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
