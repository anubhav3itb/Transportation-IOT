package Java;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Simulation {
    
    public static void main(String args[] ) {
        // TODO Auto-generated method stub
        Flyover fly = new Flyover(new Point(20,30), new Point(30,40), 2, 1);
        Vehicle bike = new Vehicle(2, 50);
        Map<Integer, ArrayList<Integer> > temp = fly.getVehicle(50, 20, 30, 20, 10, 10, 10);
        ParkingCentre pc = new ParkingCentre(new Point(20,30), 10, 40, 2);
        ParkingCentre pc2 = new ParkingCentre(new Point(25,30), 10, 40, -2);
        ParkingCentre pc3 = new ParkingCentre(new Point(28,30), 20, 40, -2);
        ArrayList<ParkingCentre> al = new ArrayList<ParkingCentre>();
        al.add(pc);
        al.add(pc2);
        al.add(pc3);
        fly.getParking(bike, temp, 5, al);
        for (Map.Entry entry : temp.entrySet()) {
//            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println(fly.getTime(bike, new Point(25,35), temp, 5));
    }
}