public class Parking {
	public static void main(String[] args) {
		DieselEngine dieselEngine = new DieselEngine();
		ElectricEngine electricEngine = new ElectricEngine();
		PetrolEngine petrolEngine = new PetrolEngine();
		
		Car<DieselEngine> dieselCar = new Car<DieselEngine>(dieselEngine);
		dieselCar.getEngine().setEngineVolume(5.0);
		System.out.println("First car: fuel type - " + dieselCar.getEngine().getFuelType() + ", engine volume -  " + dieselCar.getEngine().getEngineVolume());
		
		Car<ElectricEngine> electricCar = new Car<ElectricEngine>(electricEngine);
		electricCar.getEngine().setEnginePower(100);
		System.out.println("Second car: fuel type - " + electricCar.getEngine().getFuelType() + ", engine power -  " + electricCar.getEngine().getEnginePower());
		
		Car<PetrolEngine> petrolCar = new Car<PetrolEngine>(petrolEngine);
		petrolCar.getEngine().setEngineVolume(3.0);
		System.out.println("Third car: fuel type - " + petrolCar.getEngine().getFuelType() + ", engine volume -  " + petrolCar.getEngine().getEngineVolume());
	}
}
