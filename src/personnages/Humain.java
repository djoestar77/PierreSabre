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
		return this.nom
	}
	
	public int getArgent() {
		return this.wari
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
	
	public void acheter(String bien, int prix) {
		
	}
	
	private void gagnerArgent(int gain) {
		this.wari += gain;
	}
	
	private void perdreArgent(int perte) {
		this.wari -= perte;
	}
}
