
public class Boat extends Vehicule{
	

	public Boat(String name, int kilometers) {
		super(name, kilometers);
	}


	//Methodes
	@Override
	public String doStuff() {
		String s = "Je suis "+ this.getName() + " et je fais glou glou";
		return s;
	}

}
