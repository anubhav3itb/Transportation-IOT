package Java;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import sun.misc.Sort;


public class Road {
    Point startLocation;
    Point endLocation;
    Integer lanes;
    String side;
    Integer ways;
    Boolean divider;
    public Boolean getDivider() {
        return divider;
    }
    public void setDivider(Boolean divider) {
        this.divider = divider;
    }
    public Road(Point startLocation, Point endLocation, Integer lanes,
            Integer ways) {
        super();
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.lanes = lanes;
        this.ways = ways;
    }
    public Map<Integer, ArrayList<Integer> > getVehicle(int num, int per2v, int per3v, int per4v, int perBus, int perTruck, int perHv) {
        Map<Integer, ArrayList<Integer>> temp = new HashMap<Integer, ArrayList<Integer>>();
        int num2v = (int) (num*per2v)/100;
        int num3v = (int) (num*per3v)/100;
        int num4v = (int) (num*per4v)/100;
        int numBus = (int) (num*perBus)/100;
        int numTruck = (int) (num*perTruck)/100;
        int numHv = (int) (num*perHv)/100;
        int record[] =  {num2v, num3v, num4v, numBus, numTruck, numHv};
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> speed = new ArrayList<Integer>();
            int Low;
            int High;
            
            for (int j=0; j<record[i]; j++) {
                Random r = new Random();
                if(i == 0){
                    Low = 40;
                    High = 70;
                }
                else if (i==1) {
                    Low = 25;
                    High = 50;
                }
                
                else if (i == 2) {
                    Low = 55;
                    High = 90;
                }
                else if (i == 3) {
                    Low = 30;
                    High = 50;
                }
                
                else if (i == 4) {
                    Low = 25;
                    High = 40;
                }
                else{
                    Low = 20;
                    High = 35;
                }
                
                int Result = r.nextInt(High-Low) + Low;
                speed.add(Result);
                
            }
            temp.put(i, speed);
        }
        return temp;
    }
    
    
    
    public Integer getWays() {
        return ways;
    }
    public void setWays(Integer ways) {
        this.ways = ways;
    }
    public Integer getLanes() {
        return lanes;
    }
    public void setLanes(Integer lanes) {
        this.lanes = lanes;
    }
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
    
    public double getTime(Vehicle vehicle, Point end, Map<Integer, ArrayList<Integer> > allVehicle, int congestion) {
        double distance = Math.sqrt((Math.pow((this.getStartLocation().x - end.x), 2.0) + Math.pow((this.getStartLocation().y - end.y), 2.0)));
        int before = 0;
        if (this.lanes == 1){
           double time = distance/vehicle.getAvgSpeed();
           return time;
        }
        else{
            ArrayList<Double> time_arr = new ArrayList<Double>();
            Map<Integer, ArrayList<Integer> > temp = this.getVehicle(50, 20, 30, 20, 10, 10, 10);
            for (Map.Entry entry : temp.entrySet()) {
                ArrayList<Integer> arr = (ArrayList<Integer>) entry.getValue();
                for (int i=0; i< arr.size();i++) {
                    time_arr.add((distance/arr.get(i) * 60) );
                }
            }
            Collections.sort(time_arr);
            
            for(int i=0; i<time_arr.size();i++){
                if (distance/vehicle.getAvgSpeed()*60 < time_arr.get(i))
                    before++;
            }
            return ((int)(time_arr.size()-before)/congestion) + distance/vehicle.getAvgSpeed()*60;  
        }

    }
     
}
