public class IA extends Playable {

	IA(String nom){
		super();
		super.setNom(nom);
	}
	
	public Choix jouer(){
		int choix = (int)(Math.random()*2+1);
		switch(choix){
		case 1:
			System.out.println(super.getNom()+" choisit Pierre");
			return Choix.PIERRE;
		case 2:
			System.out.println(super.getNom()+" choisit Papier");
			return Choix.PAPIER;
		case 3:
			System.out.println(super.getNom()+" choisit Ciseaux");
			return Choix.CISEAUX;
		default:
			break;
		}
		return null;
	}

}
