package personnages;
import personnages.Druide;

public class Gaulois {
	private String nom;
	private int effetPotion =1;
	private int force;
	private int nbtrophees;
	private Equipement [] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie une bonne beigne dans la mâchoire de " +romain.getNom());
//		if(effetPotion>1){
//			romain.recevoirCoup((force/3)*3);
//			}
//		else {
//			romain.recevoirCoup(force/3);
//
//		}
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbtrophees++) {
		this.trophees[nbtrophees] = trophees[i];
		}
		}
		
	
	public void boirePotion	(int forcePotion ) {
		effetPotion= effetPotion+forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
		
		
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
}

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Asterix",8);
		Druide panoramix = new Druide ("Panoramix",5,10);
		asterix.parler("Bonjour Romain");
		asterix.boirePotion(panoramix.preparerPotion());
		
	}
	
}
