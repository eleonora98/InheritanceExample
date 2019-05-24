
public class Vehicle {
	public String brand;
	public String model;
	public int powerEngine;
	public int price;
	
	public final String[] constants = {"ELECTRIC_CAR", "GAS_CAR", "HYBRID_CAR"};
	//final - за създаване на константи,т.е. 
	//When a variable is declared with final keyword, its value can’t be modified, essentially, a constant.

	public Vehicle(String b, String m, int power, int pr) { //constructor 
		this.brand = b;
		this.model = m;
		this.powerEngine = power;
		this.price = pr;
	}
	
	public void print(String startingString, String str){
		System.out.println(startingString + ", " + 
				this.brand + ", " + 
				this.model + ", " +
				str + ", " + this.price + "euro");
	}
	
	
}
