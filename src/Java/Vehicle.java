package Java;

public class Vehicle {
    int wheels;
    int avgSpeed;
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getAvgSpeed() {
        return avgSpeed;
    }
    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }
    public Vehicle(int wheels, int avgSpeed) {
        super();
        this.wheels = wheels;
        this.avgSpeed = avgSpeed;
    }
    
    
   
    
}
