package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int wari;
	
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom=nom;
		this.boissonFav=boisson;
		this.wari=argent;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.wari;
	}
	
	public void parler(String texte) {
		System.out.println("("+this.nom+ ") - " + texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "+this.nom+" et j'aime boire du "+this.boissonFav);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de "+this.boissonFav+" ! GLOUPS !");
	}
	
	public boolean acheter(String bien, int prix) {
		if (prix <= this.wari) {
			this.parler("J'ai "+this.wari+" sous en poche je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
			this.perdreArgent(prix);
			return true;
		} else {
			this.parler("Je n'ai plus que "+this.wari+" sous en poche je ne peux meme pas m'offrir "+bien+" à "+prix+" sous");
			return false;
		}
	}
	
	private void gagnerArgent(int gain) {
		this.wari += gain;
	}
	
	private void perdreArgent(int perte) {
		this.wari -= perte;
	}
}
