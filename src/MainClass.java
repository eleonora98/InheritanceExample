
public class MainClass {

	public static void main(String[] args) {
		ElectricCar carE = new ElectricCar("Tesla", "Model 3", 150, 5000, 3000);
		carE.print();
		GasCar gasCar = new GasCar("Honda", "Civic", 1.5f, 80, 18000);
		gasCar.print();
		HybridCar hybrid = new HybridCar("Toyota", "Prius", 1.5f, 50, 12000, 24000);
		hybrid.print();
		
	

	}

}
