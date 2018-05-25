package tsiry.dev.poc;

public class LambdaDemo {
	
	@FunctionalInterface
	interface Instrument {                  //une interface fonctionnelle n’est rien d’autre qu’une interface avec une seule méthode abstraite. 
		boolean jouer(String morceau);  
		
	}

	public static void main(String[] args) {
	
		//instanciation suivi de l'implémentation du fonction 
		Instrument i = (morceau)-> {System.out.println("Jouer : " +morceau+" à la guitare");return true;};
		
		i.jouer("vive le vent");
		
	}

}
