package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int wari;
	protected int nbConnaissances;
	protected Humain[] memoire = new Humain[30];
	
	
	
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
	
	protected void parler(String texte) {
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

	public int faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);

		if (this.nbConnaissances < 30) {
			this.memoriser(autreHumain);
			this.parler("Enchanté "+autreHumain.getNom()+" !");
			return this.nbConnaissances;
		} else {
			this.parler("Je ne peux plus me souvenir de "+autreHumain.getNom()+" ...");
			return this.nbConnaissances;
		}
	}

	private void memoriser(Humain autreHumain) {
		if (this.nbConnaissances < 30) {
			this.memoire[this.nbConnaissances] = autreHumain;
			this.nbConnaissances++;
		} else {
			for (int i = 0; i < this.nbConnaissances-1; i++) {
				this.memoire[i] = this.memoire[i + 1];
			}
			this.memoire[this.nbConnaissances-1] = autreHumain;
		}
	}

	private void repondre(Humain autreHumain) {
		this.direBonjour();
	}

	public void listerConnaissances() {
		if (this.nbConnaissances == 0) {
			this.parler("Je ne connais personne ...");
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < this.nbConnaissances; i++) {
				sb.append(this.memoire[i].getNom());
				if (i < this.nbConnaissances - 1) {
					sb.append(", ");
				}
			}
			this.parler("Je connais les personnes suivantes : " + sb.toString());
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.wari += gain;
	}
	
	protected void perdreArgent(int perte) {
		this.wari -= perte;
	}
}
