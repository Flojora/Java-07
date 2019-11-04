
public abstract class Vehicule 
{
	//Attributs
	private String brand;
	private int kilometers;
	
	//Constructeur
	public Vehicule(String name, int kilometers)
	{
		this.brand = name;
		this.kilometers = kilometers;
	}
	
	//Getters
	public String getName() 
	{
		return this.brand;
	}
		
	public int getKilometers()
	{
		return this.kilometers;
	}

	//Setters
	public void setName(String name)
	{
		this.brand = name;
	}
	
	//Méthodes
	public abstract String doStuff();

}