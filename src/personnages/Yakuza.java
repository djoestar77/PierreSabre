package personnages;


public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public String getClan() {
		return this.clan;
	}
	
	public int getReputation() {
		return this.reputation;
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
	
	public int perdre() {
		int perdu = this.getArgent();
		
		this.perdreArgent(perdu);
		this.reputation-=1;
		this.parler("J'ai perdu mon duel et mes "+perdu+" sous, snif... J'ai déshonoré le clan de "+this.clan);
		
		return perdu;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation+=1;
		this.parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
}
