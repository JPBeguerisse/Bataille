
public class Paquet {
	private Carte [] cartes;
	private int nbCartes;
	
	public Paquet() {
		cartes = new Carte[52];
	}
	
	public Paquet(Carte [] c, int nbCartes) {
		cartes = new Carte[52];
		this.nbCartes = nbCartes;
		for(int i = 0 ; i<nbCartes; ++i) {
			cartes[i] = c[i];
		}
		nbCartes = 0;
	}
	
	public void initPaquet() {
		int i; 
		COULEUR s = null;
		for(i=0; i<52; ++i) {
			if(i<13)s=COULEUR.COEUR;
			if(i>=13 && i<26)s=COULEUR.CARREAU;
			if(i>=26 && i<39)s=COULEUR.TREFLE;
			if(i>=39 && i<59)s=COULEUR.PIQUE;
			cartes[i] = new Carte(i%13, s);
			nbCartes++;
		}
	}
	
	public void melange() {
		Carte temp;
		int i, j, k=0;
		for(i=0 ; i<500; i++) {
			j=(int)(Math.random()*nbCartes);
			k=(int)(Math.random()*nbCartes);
			temp = cartes[j];
			cartes[j]=cartes[k];
			cartes[k]=temp;
		}
	}
	
	public String toString(){ 
		int i;
		String s="";
		if( nbCartes==0)
			return "Paquet Vide ! " ;
		for (i=0; i<nbCartes; i++){
			s=s+cartes[i].toString()+"\n";
		}
		return s;
	}

	public boolean estVide() {
		if(nbCartes==0)
			return true;
		return false;
	}
	
	
	public int getNbCarte() {
		return this.nbCartes;
	}
	
	public boolean ajouter(Carte c) {
		if(nbCartes<51) {
			cartes[nbCartes]=c;
			nbCartes++;
			return true;
			
		}else
			return false;
	}
	
}
