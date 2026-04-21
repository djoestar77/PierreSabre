package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
		
	}
	
	public int seFaireExtorquer() {
		int vole = this.getArgent();
		this.perdreArgent(vole);
		this.parler("J'ai tout perdu ! Ce monde est trop injuste...");
		return vole;
	}
	
	public void recevoirArgent(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent+" sous ! Je te remercie généreux donateur!");
	}
}
