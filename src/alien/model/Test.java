package alien.model;

public class Test {

	public static void main(String[] args) {
		AlienDictionary d=new AlienDictionary();
		d.addParola(new Alien("jfisd ciao"));
		d.addParola(new Alien("jfisd ciao"));
		
		
		System.out.println(d);
	}

}
