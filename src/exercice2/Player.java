package exercice2;

public class Player {
	
	//class attributes
	
	private String Name;
	
	private int age;
	
	private String Gametype;

	
	//constructeur
	
	public Player(String name, int age, String gametype) {
		super();
		Name = name;
		this.age = age;
		Gametype = gametype;
	}


	public String getName() {
		return Name;
	}


	public int getAge() {
		return age;
	}


	public String getGametype() {
		return Gametype;
	}
	
	
	
	

}
