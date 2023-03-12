package DI.Probem;

public class Voiture {

	private String name;
	private Roue roue= new Roue(10,"Circle");
	private Porte porte= new Porte("Fer","Red");
	
	public Voiture() {
		// TODO Auto-generated constructor stub
	}

    public Voiture(String name) {
		
		this.name = name;
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
