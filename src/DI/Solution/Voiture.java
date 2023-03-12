package DI.Solution;

public class Voiture {

	private String name;
	private Roue roue;
	private Porte porte;
	
	public Voiture() {
		// TODO Auto-generated constructor stub
	}

  
	public Voiture(String name, Roue roue, Porte porte) {
		
		this.name = name;
		this.roue = roue;
		this.porte = porte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roue getRoue() {
		return roue;
	}

	public void setRoue(Roue roue) {
		this.roue = roue;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}
	
	
}
