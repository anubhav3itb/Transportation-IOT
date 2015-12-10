package Java;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import sun.org.mozilla.javascript.ast.Label;

public class SimulationTry {
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
				int two = slider1.getValue();
				System.out.println(two);
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
				int two = slider2.getValue();
				System.out.println(two);
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
				int two = slider3.getValue();
				System.out.println(two);
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
				int two = slider4.getValue();
				System.out.println(two);
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
				int two = slider5.getValue();
				System.out.println(two);
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
				int two = slider6.getValue();
				System.out.println(two);
			}
		};
		slider6.addChangeListener(listner6);
		
		
        pane.add(slider1);
        
        pane.add(slider2);
        pane.add(slider3);
        pane.add(slider4);
        pane.add(slider5);
        pane.add(slider6);
        
        JOptionPane.showConfirmDialog(null, p, "Family and first name : ", JOptionPane.OK_CANCEL_OPTION);
	}
	
}
