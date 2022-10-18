package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipement=0;
	private String texte;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
		if (force<=0) {
		    throw new IllegalArgumentException("Valeur de force incorrecte : " + force);
		  }
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert force>0;
//		int f =force;
//		force -= forceCoup;
//		
//		if (force>0) {
//			parler("A�e");
//			
//		}
//		else {
//			parler("J'abandonne ...");
//		}
//		assert force<f;
//		
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// Precondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if(force==0) {
			parler("Aïe");
		}
		else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
			}
			// post condition la force à diminuée
		assert force < oldForce;
		return equipementEjecte;
		}
	
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force ducoup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement!=0) {
			texte += "\n Mais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null &&
						equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	
	
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + toString() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				} 
			else {
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
				}
		return equipementEjecte;
		}
		
	
	
	public void sEquiper(Equipement protection) {
		switch (nbEquipement) {
			case 1:
				repartitionEquipement1(protection);
				break;
					
			case 2:
				repartitionEquipement2(protection);
				break;
			
			default:
				equipements[0]=protection;
				nbEquipement+=1;
				System.out.println("Le soldat " +getNom()+" s'équipe avec un " + protection.toString());
		}	
	}

	
	private void repartitionEquipement1(Equipement protection) {
		if(equipements[0]==protection) {
			System.out.println("Le soldat "+getNom()+ " possède déjà un " + protection.toString() + "!");
		}
		else {
			equipements[1]=protection;
			nbEquipement+=1;
			System.out.println("Le soldat "+getNom()+" s'équipe avec un " + protection.toString());
			}
		}
		
	
	private void repartitionEquipement2(Equipement protection) {

			System.out.println("Le soldat " + getNom() + " est déjà bien protégé !");
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
