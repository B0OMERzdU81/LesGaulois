package personnages;

import personnages.Gaulois;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private String[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		//this.chef=chef;
		villageois = new String[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;

	}

	public void setChef(Chef chef) {
		this.chef = chef;
		System.out.println("Le nouveau chef est : " + chef.getNom());
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] =gaulois.getNom();
		nbVillageois =nbVillageois+ 1;

	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef : " + chef.getNom() + " vivent les légendaires gaulois :");
		System.out.println("- " +chef.getNom());
		int i=0;
		while(villageois[i]!=null) {
			System.out.println("- " + villageois[i]);
			i+=1;
		
	}
	}
	
	
	public String trouverHabitant(int numero) {
		return villageois[numero];
	}

	public static void main(String[] args) {

		Village village = new Village("Village des irréductibles", 30);
		//Gaulois gaulois =village.trouverHabitant(30);
		//On obtient cette exception car la liste est une liste de nom alors que gaulois est un objet

		Chef abraracourcix = new Chef("Abraracourxix", 6, 1, village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois ("Asterix",8);
		village.ajouterHabitant(asterix);
		
		//String F = village.trouverHabitant(1);
		//System.out.println(F);
		//Nous obtenons null car aucun élément n'appartient à villageois[1], car les dictionnaires commencent à partir de l'indice 0.

		//village.afficherVillageois();
		
		Gaulois obelix = new Gaulois ("Obelix",25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
		
		
		
		
	}
}
