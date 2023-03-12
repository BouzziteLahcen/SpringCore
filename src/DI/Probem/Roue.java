package DI.Probem;

public class Roue {
	private int diametre;
	private String forme;
	public Roue() {
		// TODO Auto-generated constructor stub
	}
	public Roue(int diametre, String forme) {
		
		this.diametre = diametre;
		this.forme = forme;
	}
	public int getDiametre() {
		return diametre;
	}
	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}
	public String getForme() {
		return forme;
	}
	public void setForme(String forme) {
		this.forme = forme;
	}
	

}
