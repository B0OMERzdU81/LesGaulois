package personnages;

import personnages.Gaulois;
import personnages.Village;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private String[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		// this.chef=chef;
		int[] villageois = new int[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] =gaulois.getNom();
		nbVillageois += 1;

	}

	public String trouverHabitant(int numero) {
		return villageois[numero];
	}

	public static void main(String[] args) {

		Village village = new Village("Village des irréductibles", 30);
		Gaulois gaulois =village.trouverHabitant(30);
		//On obtient cette exception car l'on sort du tableau

		
		
		
		//Chef abraracourcix = new Chef("Abraracourxix", 6, 1, village);
		//village.ajouterHabitant(asterix.getNom());

	}
}
