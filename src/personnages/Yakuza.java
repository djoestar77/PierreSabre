package personnages;


public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquerCommercant(Commercant commercant) {
		int vole=0;
		String nomCommercant = commercant.getNom();
		
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(nomCommercant+", si tu tiens à la vie donne moi ta bourse!");
		
		vole=commercant.seFaireExtorquer();
		this.gagnerArgent(vole);
		
		this.parler("J'ai piqué les "+vole+" sous de "+nomCommercant+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
}
