package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Village;
import personnages.Druide;


public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix= new Gaulois("Asterix",8);
		Romain minus= new Romain("Minus",15);
		Druide panoramix = new Druide ("Panoramix",5,10);
		Gaulois obelix= new Gaulois("Obelix",20);
		panoramix.parler("Je vais aller préparer une petite potion...");
		int nb=panoramix.preparerPotion();
		if(panoramix.booster(obelix.getNom())==1) {
			obelix.parler("Par Bélénos, c'est pas juste");
		}
		asterix.boirePotion(nb);
		
		
		asterix.parler("Bonjour");
		minus.parler("UN GA... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
