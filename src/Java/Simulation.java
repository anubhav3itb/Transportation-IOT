package Java;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import sun.org.mozilla.javascript.ast.Label;

public class Simulation {
	static int numVeh;
	static int per2v=0;
	static int per3v=0;
	static int per4v=0;
	static int perbus=0;
	static int pertruck=0;
	static int perhv=0;
	static int vehspeed;
	static int vehwheel;
	static int xend;
	static int yend;
	static int finalValue;
	static JTextField totalNow = new JTextField(5);
	
	public static void main(String[] args) {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));
        JPanel pane = new JPanel(new GridLayout(0,1));
        p.add(pane);
        
	  	JTextField numVehicle = new JTextField(5);
        
        final JSlider slider1 = new JSlider();
        final JSlider slider2 = new JSlider();
        final JSlider slider3 = new JSlider();
        final JSlider slider4 = new JSlider();
        final JSlider slider5 = new JSlider();
        final JSlider slider6 = new JSlider();
                
        pane.add(new JLabel("Number of Vehicles: "));
  	  	pane.add(numVehicle);
  	  	
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        slider1.setMajorTickSpacing(20);
        slider1.setMinorTickSpacing(5);
        ChangeListener listner1 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				per2v = slider1.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				
			}
		};
		slider1.addChangeListener(listner1);
		
		slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        ChangeListener listner2 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				per3v = slider2.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				totalNow.setText(""+finalValue);	
			}
		};
		slider2.addChangeListener(listner2);
		
		slider3.setPaintTicks(true);
        slider3.setPaintLabels(true);
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        ChangeListener listner3 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				per4v = slider3.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				totalNow.setText(""+finalValue);
			}
		};
		slider3.addChangeListener(listner3);
		
		slider4.setPaintTicks(true);
        slider4.setPaintLabels(true);
        slider4.setMajorTickSpacing(20);
        slider4.setMinorTickSpacing(5);
        ChangeListener listner4 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				perbus = slider4.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				totalNow.setText(""+finalValue);
			}
		};
		slider4.addChangeListener(listner4);
		
		slider5.setPaintTicks(true);
        slider5.setPaintLabels(true);
        slider5.setMajorTickSpacing(20);
        slider5.setMinorTickSpacing(5);
        ChangeListener listner5 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				pertruck = slider5.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				totalNow.setText(""+finalValue);
				
			}
		};
		slider5.addChangeListener(listner5);
		
		slider6.setPaintTicks(true);
        slider6.setPaintLabels(true);
        slider6.setMajorTickSpacing(20);
        slider6.setMinorTickSpacing(5);
        ChangeListener listner6 = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				perhv = slider6.getValue();
				finalValue = (per2v+per3v+per4v+pertruck+perbus+perhv);
				totalNow.setText(""+finalValue);
			}
		};
		slider6.addChangeListener(listner6);
		
		
		totalNow.setText(""+finalValue);
		
        pane.add(slider1);
        
        pane.add(slider2);
        pane.add(slider3);
        pane.add(slider4);
        pane.add(slider5);
        pane.add(slider6);
        pane.add(totalNow);
        
        JOptionPane.showConfirmDialog(null, p, "Road details : ", JOptionPane.OK_CANCEL_OPTION);
        if (JOptionPane.OK_OPTION == 0){
  		  Flyover fly = new Flyover(new Point(20,30), new Point(30,40), 2, 2);
  		  String text90 = numVehicle.getText();
		  numVeh = Integer.parseInt(text90);
  		  Map<Integer, ArrayList<Integer> > temp = fly.getVehicle(numVeh, per2v, per3v, per4v, perbus, pertruck, perhv);
  		  System.out.println(numVeh + ","+per4v);
  		  System.out.println(temp);
  		  
      		  if (JOptionPane.OK_OPTION == 0){
      			  JPanel p2 = new JPanel();
          		  p2.setLayout(new GridLayout(0,2));
                    
          		  JCheckBox check = new JCheckBox("Get time for a vehicle given end point.");
          		  p2.add(check);
          		  
          		  JOptionPane.showConfirmDialog(null, p2, "Select Visualizations : ", JOptionPane.OK_CANCEL_OPTION);
          		  
          		  if (JOptionPane.OK_OPTION == 0){
          			JTextField Vehtype = new JTextField(5);
          			JTextField VehSpeed = new JTextField(5);
          			JTextField endX = new JTextField(5);
              	  	JTextField endY = new JTextField(5);
          			  
          			  
          			  JPanel p1 = new JPanel();
              		  p1.setLayout(new GridLayout(0,2));
                      JPanel pane3 = new JPanel(new GridLayout(0,1));
                      p1.add(pane3);
                        
                      JPanel pane4 = new JPanel(new GridLayout(0,2));
                      p1.add(pane4);
                        
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
                  		  
                  		  String text9 = endX.getText();
                  		  xend = Integer.parseInt(text9);
                  		  
                  		  String text10 = endY.getText();
                  		  yend = Integer.parseInt(text10);
                  		  
                  		  Vehicle bike = new Vehicle(vehwheel, vehspeed);
                  		  
                  		  if (JOptionPane.OK_OPTION == 0){
                  			  JPanel p4 = new JPanel();
                      		  p4.setLayout(new GridLayout(2,2));
                      		  
                      		JTextArea ta = new JTextArea("Time taken to reach from A to B is " + fly.getTime(bike, new Point(xend,yend), temp, 5) + " minutes.", 6, 8);
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
	}
}
