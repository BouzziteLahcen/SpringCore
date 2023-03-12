package DI.Probem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// create Voiture 
		Voiture v = new Voiture("BMW");
		System.out.println("Vouture Name :"+v.getName());
		System.out.println("Route info : Route forme  "+v.getRoue().getForme()+" Route Diametre: "+v.getRoue().getDiametre());
		System.out.println("Porte info : Porte matier  "+v.getPorte().getMatier()+" Porte Color: "+v.getPorte().getColor());
	}

}

/*
 * Class Pricipale Contient All Object Nesseciare More Memory
 * Class Pricipale Contient info of All Object Nesseciare Statique info 
 * ==> DI dessign Pattern qui permet de separe entre les classe qui  en relation entre eux 
 * car chaque et votre property libre at manger chaque a seul  
 */