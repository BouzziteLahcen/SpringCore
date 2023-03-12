package DI.Solution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// create Voiture 
		// Create Object Of Route
		Roue r = new Roue(10, "Circle");
		// Create Object Of Route
		Porte p = new Porte("fer", "red");
		p.setColor("orange");
		//create Voiture Finale 
		Voiture v = new Voiture("BMW",r,p);
		System.out.println("Vouture Name :"+v.getName());
		System.out.println("Route info : Route forme  "+v.getRoue().getForme()+" Route Diametre: "+v.getRoue().getDiametre());
		System.out.println("Porte info : Porte matier  "+v.getPorte().getMatier()+" Porte Color: "+v.getPorte().getColor());
	}

}

/*
 * Handle chaque object seul  
 */