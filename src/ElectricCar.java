
public class ElectricCar extends Vehicle {
	public int capacityBat;
	
	
	
	public ElectricCar(String b, String m, int power, int pr, int capacityBat) {
		super(b, m, power, pr);
		this.capacityBat = capacityBat;
	}


	public void print(){
		String startingString = constants[0];
		String str = this.powerEngine + "kW, " + this.capacityBat + "Ah";
		super.print(startingString, str); //извикваме да принтира на конзолата директно чрез
		//метода на родителския клас  Vehicle. За целта използваме super
	}
}
