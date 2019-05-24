
public class HybridCar extends GasCar {
	 public int capacityBat;

	public HybridCar(String b, String m,float displacementEngine, int power,int capacityBat, 
			int pr) {
		super(b, m,  displacementEngine, power, pr);
		this.capacityBat = capacityBat;
	}
	 
	 public void print(){
		 String startingString = constants[2];
		 String str = this.displacementEngine + "L, " + this.powerEngine + "kW, "
		 + this.capacityBat + "Ah";
		 
		 super.parentPrint(startingString, str);
		
	 }
	
	
}
