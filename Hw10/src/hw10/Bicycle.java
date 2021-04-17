/* Jayla Nicholas 
 * Class: Object-Oriented Programming CPSC-24500-002
 * This is the class Bicycle, that contain the method getCarbonFootprint(), toString(),
 * getCO2fFood(), setCO2fFood(), getBaseBurnCalories(), setBaseBurnCalories(), getProductionOfBike()
 */

package hw10;

public class Bicycle implements CarbonFootprint {
	
	//co2 from making the food you eat (ex: meat is 1500g of Co2)
		private double CO2fFood;
		private double baseBurnCalories;
		private final double productionOfBike = 5.0;
		
		public Bicycle(double cO2fFood, double baseBurnCalories) {
			super();
			CO2fFood = cO2fFood;
			this.baseBurnCalories = baseBurnCalories;
		}

		public double getCO2fFood() {
			return CO2fFood;
		}

		public void setCO2fFood(double cO2fFood) {
			CO2fFood = cO2fFood;
		}

		public double getBaseBurnCalories() {
			return baseBurnCalories;
		}

		public void setBaseBurnCalories(double baseBurnCalories) {
			this.baseBurnCalories = baseBurnCalories;
		}

		public double getProductionOfBike() {
			return productionOfBike;
		}

		//base equation:
		//(CO2Food / baseBurnCalories) + productionOfBike 
		public double getCarbonFootprint() {
			return (CO2fFood / baseBurnCalories) + productionOfBike;
		}

		@Override
		public String toString() {
			return "Bicycle: CO2 from Food = " + CO2fFood + ", Calories you burn from a meal =" + baseBurnCalories + ", CO2 from producing Bike ="
					+ productionOfBike + "g";
		}

}
