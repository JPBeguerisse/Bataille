
public class Joueur {
	private String nom; 
	private int point;
	Paquet carteJoeur;
	
	public Joueur(String n) {
		this.nom = n;
		point = 0;
		carteJoeur = new Paquet();
	}
	

	public void ajoute(Carte c){ 
		carteJoeur.ajouter(c) ;
	}
	
	public void gagnerPoint(int n) {
		point+= n;
	}
	
	public void perdrePoint(int n) {
		point-= n;
	}
	
	public int getPoint() {
		return point;
	}
	
	public String toString() {
		return "Joueur "+ this.nom + " a " + carteJoeur.toString() + " et " + this.point + " points";
	}
	
}
