package Java;

import java.awt.Point;

public class Flyover extends Road{

    public Flyover(Point startLocation, Point endLocation, Integer lanes,
            Integer ways) {
        super(startLocation, endLocation, lanes, ways);
        this.divider = true;
        // TODO Auto-generated constructor stub
    }
    boolean crossing = false;
   
}
