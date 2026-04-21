package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		
		prof.direBonjour();
		prof.parler("J'ai "+);
	}

}
