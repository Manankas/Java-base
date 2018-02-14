package trav_maivana7;

public class LambdaDemo {
	
	@FunctionalInterface
	interface Instrument {                  //une interface fonctionnelle n�est rien d�autre qu�une interface avec une seule m�thode abstraite. 
		boolean jouer(String morceau);  
		
	}

	public static void main(String[] args) {
	
		//instanciation suivi de l'impl�mentation du fonction 
		Instrument i = (morceau)-> {System.out.println("Jouer : " +morceau+" � la guitare");return true;};
		
		boolean res = i.jouer("vive le vent");
		System.out.println(res);
	}

}
