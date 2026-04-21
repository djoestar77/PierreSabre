package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}

	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
		this.perdreArgent(don);
		beneficiaire.recevoirArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int forceRonin = this.honneur*2;
		
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if ( forceRonin >= adversaire.getReputation() ) {
			this.parler("Je t'ai eu ti bandi !");
			int gain = adversaire.perdre();
			this.gagnerArgent(gain);
			this.honneur+=1;
		} else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			int perte = this.getArgent();
			this.perdreArgent(perte);
			adversaire.gagner(perte);
			this.honneur-=1;
		}
	}
}
