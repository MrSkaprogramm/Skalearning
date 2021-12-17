public class DieselEngine extends Engine {
	private static final String fuelType = "Diesel";
	private double engineVolume;
	
	public String getFuelType() {
		return fuelType;
	}
	
	public double getEngineVolume() {
		return engineVolume;
	}
	
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}
	
}
