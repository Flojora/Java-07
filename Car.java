
public class Car extends Vehicule{

	public Car(String name, int kilometers) {
		super(name, kilometers);
		
	}


	//Methodes
	@Override
	public String doStuff() {
		String s = "Je suis "+ this.getName() + " et je fais vroum vroum";
		return s;
	}
	
}
