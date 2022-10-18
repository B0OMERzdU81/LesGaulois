package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipement=0;
	
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
	
	
	public void sEquiper(Equipement protection) {
		switch(protection) {
			case CASQUE:
				repartitionEquipement(protection);
				break;
					
			case BOUCLIER:
				repartitionEquipement(protection);
				break;

	}
	}

	private void repartitionEquipement(Equipement protection) {
		if(nbEquipement==0) {
			equipements[0]=protection;
			nbEquipement+=1;
			System.out.println("Le soldat "+getNom()+" s'équipe avec un " + protection.toString());
		}
		else if (nbEquipement==1) {
			if(equipements[0]==protection) {
				System.out.println("Le soldat " +getNom()+ " possède déjà un " + protection.toString() + "!");
			}
			else {
				equipements[1]=protection;
				nbEquipement+=1;
				System.out.println("Le soldat "+getNom()+" s'équipe avec un " + protection.toString());
			}
		}
		
		
		else {
			System.out.println("Le soldat "+ getNom() + " est déjà bien protégé !");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Romain jeantix= new Romain("Jeantix",6);
		//System.out.println(jeantix.prendreParole());
		//jeantix.parler("Satané Gaulois");
		//jeantix.recevoirCoup(2);
		jeantix.sEquiper(Equipement.CASQUE);
		jeantix.sEquiper(Equipement.CASQUE);
		jeantix.sEquiper(Equipement.BOUCLIER);
		jeantix.sEquiper(Equipement.CASQUE);
		
	}
	
	
	
	
	
	
	
}
