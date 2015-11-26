package Java;

import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Simulation {
    
    public static void main(String args[] ) {
    	  int numVeh, per2v, per3v, per4v, perbus, pertruck, perhv, vehspeed, vehwheel, xend, yend;
    	
    	  JPanel p = new JPanel();
    	  JTextField numVehicle = new JTextField(5);
    	  JTextField percent2v = new JTextField(5);
    	  JTextField percent3v = new JTextField(5);
    	  JTextField percent4v = new JTextField(5);
    	  JTextField bus = new JTextField(5);
    	  JTextField truck = new JTextField(5);
    	  JTextField hv = new JTextField(5);
    	  
    	  JTextField Vehtype = new JTextField(5);
    	  JTextField VehSpeed = new JTextField(5);
    	  JTextField endX = new JTextField(5);
    	  JTextField endY = new JTextField(5);
    	  
    	  
    	  p.setLayout(new GridLayout(0,2));
          JPanel pane = new JPanel(new GridLayout(0,1));
          p.add(pane);
          
          JPanel pane1 = new JPanel(new GridLayout(0,2));
          p.add(pane1);
          

    	  p.add(new JLabel("Number of Vehicles: "));
    	  p.add(numVehicle);
    	  p.add(new JLabel("Percentage 2 Wheelers: "));
    	  p.add(percent2v);
    	  p.add(new JLabel("Percentage 3 Wheelers: "));
    	  p.add(percent3v);
    	  p.add(new JLabel("Percentage 4 Wheelers: "));
    	  p.add(percent4v);
    	  p.add(new JLabel("Percentage Buses: "));
    	  p.add(bus);
    	  p.add(new JLabel("Percentage Trucks: "));
    	  p.add(truck);
    	  p.add(new JLabel("Percentage heavy vehicles: "));
    	  p.add(hv);
    	  

    	  JOptionPane.showConfirmDialog(null, p, "Family and first name : ", JOptionPane.OK_CANCEL_OPTION);
    	  
    	  if (JOptionPane.OK_OPTION == 0){
    		  String text = numVehicle.getText();
    		  numVeh = Integer.parseInt(text);
    		  
    		  String text1 = percent2v.getText();
    		  per2v = Integer.parseInt(text1);
    		  
    		  String text2 = percent3v.getText();
    		  per3v = Integer.parseInt(text2);
    		  
    		  String text3 = percent4v.getText();
    		  per4v = Integer.parseInt(text3);
    		  
    		  String text4 = bus.getText();
    		  perbus = Integer.parseInt(text4);
    		  
    		  String text5 = truck.getText();
    		  pertruck = Integer.parseInt(text5);
    		  
    		  String text6 = hv.getText();
    		  perhv = Integer.parseInt(text6);
    		  
    		  Flyover fly = new Flyover(new Point(20,30), new Point(30,40), 2, 1);
    		  Map<Integer, ArrayList<Integer> > temp = fly.getVehicle(numVeh, per2v, per3v, per4v, perbus, pertruck, perhv);
    		  
    		    
        		  if (JOptionPane.OK_OPTION == 0){
        			  JPanel p2 = new JPanel();
            		  p2.setLayout(new GridLayout(0,2));
                      
            		  JCheckBox check = new JCheckBox("Get time for a vehicle given end point.");
            		  p2.add(check);
            		  
            		  JOptionPane.showConfirmDialog(null, p2, "Select Visualizations : ", JOptionPane.OK_CANCEL_OPTION);
            		  
            		  if (JOptionPane.OK_OPTION == 0){
            			  JPanel p1 = new JPanel();
                		  p1.setLayout(new GridLayout(0,2));
                          JPanel pane3 = new JPanel(new GridLayout(0,1));
                          p1.add(pane);
                          
                          JPanel pane4 = new JPanel(new GridLayout(0,2));
                          p1.add(pane1);
                          
                          p1.add(new JLabel("Number of Wheels: "));
                    	  p1.add(Vehtype);
                    	  p1.add(new JLabel("Speed of Vehicle: "));
                    	  p1.add(VehSpeed);
                    	  p1.add(new JLabel("X for ending point: "));
                    	  p1.add(endX);
                    	  p1.add(new JLabel("Y for ending point: "));
                    	  p1.add(endY);
                    	  
                    	  
                    	  JOptionPane.showConfirmDialog(null, p1, "Create Vehicle : ", JOptionPane.OK_CANCEL_OPTION);
                    	  
                    	  if (JOptionPane.OK_OPTION == 0){
                    		  
                    		  String text7 = Vehtype.getText();
                    		  vehwheel = Integer.parseInt(text7);
                    		  
                    		  String text8 = VehSpeed.getText();
                    		  vehspeed = Integer.parseInt(text8);
                    		  
                    		  String text9 = numVehicle.getText();
                    		  xend = Integer.parseInt(text);
                    		  
                    		  String text10 = numVehicle.getText();
                    		  yend = Integer.parseInt(text);
                    		  
                    		  Vehicle bike = new Vehicle(vehwheel, vehspeed);
                    		  
                    		  if (JOptionPane.OK_OPTION == 0){
                    			  JPanel p4 = new JPanel();
                        		  p4.setLayout(new GridLayout(2,2));
                        		  
                        		  JTextArea ta = new JTextArea("Time taken to reach from A to B is " + fly.getTime(bike, new Point(xend,yend), temp, 5) + " minutes.", 8, 8);
                        		  ta.setLineWrap(true);
                        		  p4.add(new JScrollPane(ta));
                        		  double distance = Math.sqrt((Math.pow((fly.getStartLocation().x - xend), 2.0) + Math.pow((fly.getStartLocation().y - yend), 2.0)));
                        		  JTextArea tb = new JTextArea("Time taken without congestion: "+distance/bike.getAvgSpeed()*60 + " minutes.", 6, 8);
                        		  tb.setLineWrap(true);
                        		  p4.add(new JScrollPane(tb));
                        		  JOptionPane.showConfirmDialog(null, p4, "Output: ", JOptionPane.OK_CANCEL_OPTION);
                        		  
                    		  }
                    		  //System.out.println("Time taken to reach from A to B is " + fly.getTime(bike, new Point(xend,yend), temp, 5) + " minutes.");
                    		  
            		  	}
                                           
            		  }
        		  }
    		  
    	  }
    	
        /*// TODO Auto-generated method stub
        Flyover fly = new Flyover(new Point(20,30), new Point(30,40), 2, 1);
        Vehicle bike = new Vehicle(2, 50);
        Map<Integer, ArrayList<Integer> > temp = fly.getVehicle(100, 20, 30, 20, 10, 10, 10);
        for (Map.Entry entry : temp.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }*/
        
    }
}
