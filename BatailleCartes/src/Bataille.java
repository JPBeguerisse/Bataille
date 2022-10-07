
public class Bataille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Joueur j1 = new Joueur("JoueurA");
		Joueur j2 = new Joueur("JoueurB");


		Paquet table = new Paquet();
		table.initPaquet();
		
		table.melange();
		System.out.println(table);
		
		
		
	}

	
}
