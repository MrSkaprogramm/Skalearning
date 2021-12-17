public class ElectricEngine extends Engine {
	private static final String fuelType = "Electricity";
	private double enginePower;
	
	public String getFuelType() {
		return fuelType;
	}
	
	public double getEnginePower() {
		return enginePower;
	}
	
	public void setEnginePower(double enginePower) {
		this.enginePower = enginePower;
	}
}
