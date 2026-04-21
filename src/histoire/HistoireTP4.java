package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", 20);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("kimono", 50);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.boire();
	}

}
