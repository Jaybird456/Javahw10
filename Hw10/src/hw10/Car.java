/* Jayla Nicholas 
 * Class: Object-Oriented Programming CPSC-24500-002
 * This is the class Car, that contain the method getCarbonFootprint(), toString(),
 * getMiles(), setMiles(), getAverageMPG(), setAverageMPG(), getDiesel()
 */
package hw10;

public class Car implements CarbonFootprint {

	private double miles;
	private double averageMPG;
	//how much g of co2 diesel makes
	private final double diesel = 2.68;
	
	
	public Car(double miles, double averageMPG) {
		super();
		this.miles = miles;
		this.averageMPG = averageMPG;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getAverageMPG() {
		return averageMPG;
	}

	public void setAverageMPG(double averageMPG) {
		this.averageMPG = averageMPG;
	}

	public double getDiesel() {
		return diesel;
	}
	
	//cal miles/mpg * 2.68 = carbon footprint. 
	public double getCarbonFootprint() {
		return ((miles / averageMPG) * diesel); 
	}

	@Override
	public String toString() {
		return "Car: miles = " + miles + ", average MPG = " + averageMPG + ", CO2 per diesel = " + diesel + "g";
	}
	
}
