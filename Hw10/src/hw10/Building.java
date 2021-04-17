/* Jayla Nicholas 
 * Class: Object-Oriented Programming CPSC-24500-002
 * This is the class Building, that contain the method getCarbonFootprint(), toString(),
 * getThremNaturalGas(), setThremNaturalGas(), getPoundOfCO2(), setPoundOfCO2()
 */
package hw10;

public class Building implements CarbonFootprint {
	
	private double thremNaturalGas;
	private double poundOfCO2;
	
	public Building(double thremNaturalGas, double poundOfCO2) {
		super();
		this.thremNaturalGas = thremNaturalGas;
		this.poundOfCO2 = poundOfCO2; 
	}

	public double getThremNaturalGas() {
		return thremNaturalGas;
	}

	public void setThremNaturalGas(double thremNaturalGas) {
		this.thremNaturalGas = thremNaturalGas;
	}

	public double getPoundOfCO2() {
		return poundOfCO2;
	}

	public void setPoundOfCO2(double poundOfCO2) {
		this.poundOfCO2 = poundOfCO2;
	}

	//BASE EQUATION
	//cal thremNaturalGas * poundOfC02
	@Override
	public double getCarbonFootprint() {
		return thremNaturalGas * poundOfCO2;
	}

	@Override
	public String toString() {
		return "Building: Gas coming out of building = " + thremNaturalGas + "g, pounds of CO2 = " + poundOfCO2 + "lb";
	}
}
