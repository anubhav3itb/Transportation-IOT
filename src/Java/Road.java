package Java;

import java.awt.Point;


public abstract class Road {
    Point startLocation;
    Point endLocation;
    String side;
    public Point getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(Point startLocation) {
        this.startLocation = startLocation;
    }
    
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public Point getEndLocation() {
        return endLocation;
    }
    public void setEndLocation(Point endLocation) {
        this.endLocation = endLocation;
    }
    
  
    
    
     
}
