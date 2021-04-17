/* Name: Jayla Nicholas
 * Class: Object-Oriented Programming CPSC-24500-002
 * This program uses the classes Car, Bicycle, and Building. A GUI menu is presented to the user
 * Then they can select the 3 options: Car, Bicycle, and Building. Based on which option is clicked 
 * A series of question will be asked and their carbon footprint of that object will be displayed
 * As well as the objects information they put in.
 */
package hw10;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;


public class CarbonFootprintGUI extends JFrame {
	
	//For the menu + submenu at top
	JMenuBar menuBar;
	JMenu menu;
	JMenu subMenu;
	JMenuItem car;
	JMenuItem building;
	JMenuItem bicycle;
	JFrame frame;
	
	/* This is all the inputs that are needed for each class */
	//inputs for car
	String mile;
	String MPG;
	double miles;
	double avgMPG;
	//inputs for building
	String gas;
	String poundCO2;
	double naturalGas;
	double poundOfCO2;
	//inputs for bicycle
	String CO2Food;
	String burnCalorie;
	double CO2ofFood;
	double burnCalories;
	
	public CarbonFootprintGUI() {
		frame = new JFrame("Carbon Footprint Program");
		menuBar = new JMenuBar();
		
		menu = new JMenu("Carbon Footprint Menu");
		subMenu = new JMenu("Calculate Carbon Footprint"); 
		car = new JMenuItem("Car");
		building = new JMenuItem("Building");
		bicycle = new JMenuItem("Bicycle");
		
		menu.add(subMenu);
		subMenu.add(car);
		subMenu.add(building);
		subMenu.add(bicycle);
		
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//when car menu is clicked user is asked for the miles and avg mpg of their car
		//then the carbon foot print will be displayed  
		 car.addActionListener(new ActionListener(){  
	         public void actionPerformed(ActionEvent e) {              
	        	 mile = JOptionPane.showInputDialog( "Enter how many miles have you driven in your car");
	     		 MPG = JOptionPane.showInputDialog( "Enter your average MPG");
	        	 
	        	 miles = Double.parseDouble(mile);
	        	 avgMPG = Double.parseDouble(MPG);
	        	 
	        	 Car c = new Car(miles, avgMPG);
	        	 
	     		JOptionPane.showMessageDialog(null, "The carbon footprint for you car is: " + c.getCarbonFootprint() + " \nCar's information: " + c.toString(),
	     				"Car's Carbon Footprint & Car's information", JOptionPane.PLAIN_MESSAGE );
	         }  
	        });
		 
		 //when building menu item is clicked user is asked for the amount of gas that comes out of a building 
		 // and the pounds of CO2
		 building.addActionListener(new ActionListener(){  
	         public void actionPerformed(ActionEvent e) {              
	        	 gas = JOptionPane.showInputDialog( "Enter how much natural gas come out of the building");
	        	 poundCO2 = JOptionPane.showInputDialog( "Enter the amount of CO2 in pounds");
	        	 
	        	 naturalGas = Double.parseDouble(gas);
	        	 poundOfCO2 = Double.parseDouble(poundCO2);
	        	 
	        	 Building b = new Building(naturalGas, poundOfCO2);
	        	 
	     		JOptionPane.showMessageDialog(null, "The carbon footprint for the building is: " + b.getCarbonFootprint() + 
	     				" \nBuilding's information: " + b.toString(), "Building's Carbon Footprint & Building Information",
	     				JOptionPane.PLAIN_MESSAGE );
	         }  
	        });
		 
		 //when bicycle menu item is clicked user is asked for the amount of CO2 that was used to make your food
		 //that you ate
		 //Then for the calories you burned 
		 bicycle.addActionListener(new ActionListener(){  
	         public void actionPerformed(ActionEvent e) {              
	        	 CO2Food = JOptionPane.showInputDialog( "Enter how much CO2 was used to make the food you ate");
	        	 burnCalorie = JOptionPane.showInputDialog( "Enter how many calories you burned");
	        	 
	        	 CO2ofFood = Double.parseDouble(CO2Food);
	        	 burnCalories = Double.parseDouble(burnCalorie);
	        	 
	        	 Bicycle bcycle = new Bicycle(CO2ofFood, burnCalories);
	        	 
	     		JOptionPane.showMessageDialog(null, "The carbon footprint for you bicylce is: " + bcycle.getCarbonFootprint()+ 
	     				" \nBicycle's information: " + bcycle.toString(), "Bicycle's Carbon Footprint & Bicycle Information",
	     				JOptionPane.PLAIN_MESSAGE );
	         }  
	        });
	}
	
	//make program run
	public static void main(String args[]) {
		new CarbonFootprintGUI();
		
	}

}

