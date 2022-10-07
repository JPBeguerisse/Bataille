
enum COULEUR {COEUR, CARREAU, PIQUE, TREFLE}

public class Carte {
	
	static public final String[] NOMS_COULEURS = {"Coeur", "Carreau", "Pique", "Trefle"};

    static public final String[] NOMS_VALEURS = {"Joker", "As", "2", "3", "4",
                     "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi"};
	private int valeur;
	private COULEUR couleur;
	
	
	public Carte(int v, COULEUR c) {
		this.valeur = v;
		this.couleur = c;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public COULEUR getCouleur(Carte c) {
			return couleur;
	}
	
	public String toString (){
		String s=null ; 
		switch (valeur){
		case 12: s ="As"; 
		break ;
		case 0:
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: 
		case 7:
		case 8: s=""+(valeur+2); 
			break ;
		case 9: s="Valet"; 
			break ;
		case 10: s="Dame";
			break ;
		case 11: s ="Roi";
		}
		return s+" de "+couleur ;
	}
	
	public boolean plusForteQue(Carte c){ 
		return valeur>c . getValeur();
	}
	
	public boolean egale(Carte c){
		return valeur==c.valeur ;
	}
}
