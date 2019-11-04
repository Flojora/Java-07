
public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule car = new Car("Voiture", 0);
		System.out.println(car.doStuff());
		
		Vehicule boat = new Boat("Bateau", 0);
		System.out.println(boat.doStuff());
	}

}
