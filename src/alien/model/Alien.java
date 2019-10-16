package alien.model;

public class Alien {
	
	private String traduzione,parolaA;
	
	public Alien (String a) {
		
		String[] x=a.split(" ");
		this.parolaA=x[0];
		this.traduzione=x[1];
		
	}

	public String getTraduzione() {
		return traduzione;
	}

	public String getParolaA() {
		return parolaA;
	}

	@Override
	public String toString() {
		return "Alien [traduzione=" + traduzione + ", parolaA=" + parolaA + "]";
	}

	
}
