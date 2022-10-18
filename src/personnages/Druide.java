package personnages;

import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion =1;
	
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom=nom;
		this.effetPotionMin=effetPotionMin;
		this.effetPotionMax=effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force de " + effetPotionMin + "  �  " + effetPotionMax + " .");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "' " + texte + "'");
		
	}
	
	
	public int preparerPotion() {
		
		Random random = new Random();
		int nb = random.nextInt(effetPotionMax);
		while(nb <5){
			nb = random.nextInt(effetPotionMax);
		}
		if(nb >7){
			System.out.println("J'ai préparé une super potion de force : " + nb);
			
		}
		else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force : " + nb);
		}
		forcePotion=nb;
		
		return nb;
		
		
	}
	
	public void booster(Gaulois gaulois) {
		if(gaulois.getNom()=="Obelix") {
			System.out.println("Non! Obelix !... Tu n'auras pas de potion magique!");
			System.out.println("Par Belenos c'est pas juste");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
		}
		

	private String prendreParole() {
		return "Le druide " +nom+ " : ";
		
	}
	

	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.preparerPotion();
		
	}
}
