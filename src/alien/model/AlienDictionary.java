package alien.model;

import java.util.HashMap;

public class AlienDictionary {
	

	private HashMap<String,String> dizionario;
	
	public AlienDictionary() {
		dizionario=new HashMap<>();
	}
	
	public String controlla(String a) {
		
		
		if(!a.contains(" ")||a.matches(".*\\d.*")||(a.split(" ")[1]==null)||(a.split(" ").length!=2)){
			return "errore";
		}
		else 
			return null;
	}
	public void addParola(Alien a) {
			dizionario.put(a.getParolaA(),a.getTraduzione());
	}
	
	public String traduzione(String a) {
		return dizionario.get(a);
	}

	public HashMap<String, String> getDizionario() {
		return dizionario;
	}
	
	public boolean equals(String a) {
		return dizionario.containsKey(a);
		
	}

	
}
