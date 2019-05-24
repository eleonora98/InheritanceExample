
public class GasCar extends Vehicle{
	public float displacementEngine;

	public GasCar(String b, String m,float displacementEngine, int power, int pr) {
		super(b, m, power, pr);
		this.displacementEngine = displacementEngine;
	}
	
	public void print(){
		String startingString = constants[1];
		String str = this.displacementEngine + "L, " + this.powerEngine +"kW";
		super.print(startingString, str);
	}
	public void parentPrint(String startingString, String str){
		super.print(startingString, str); // samo chrez tozi method moje da sraboti otpechatvaneto za
		// HybridCar, koito nasledava GasCar
		//Tuk izvikvame otpechatvaneto ot Vehicle
		//t.e. - Vehicle -> GasCar -> HybridCar
		}
	
}
