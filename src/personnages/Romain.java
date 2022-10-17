package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
		assert force>0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + ":";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int f =force;
		force -= forceCoup;
		
		if (force>0) {
			parler("A�e");
			
		}
		else {
			parler("J'abandonne ...");
		}
		assert force<f;
		
	}
	public static void main(String[] args) {
		Romain jeantix= new Romain("Jeantix",6);
		System.out.println(jeantix.prendreParole());
		jeantix.parler("Satané Gaulois");
		jeantix.recevoirCoup(2);
		Equipement.BOUCLIER;
		
	}
	
	
	
	
	
	
	
}
