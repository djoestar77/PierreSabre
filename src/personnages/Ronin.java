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
}
