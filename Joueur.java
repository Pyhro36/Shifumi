public class Joueur extends Playable {
	
	Joueur(String nom){
		super();
		super.setNom(nom);
	}
	
	public Choix jouer(){
		int choix = -1; 
		while(choix < 0){
			System.out.println("Alors "+super.getNom()+" ? \n Pierre (1), \n Papier (2), \n ou Ciseaux (3) ?");
			choix = Get.nextInt();
			switch(choix){
			case 1:
				for(int i=1;i<=7;i++)
				System.out.println();
				return Choix.PIERRE;
			case 2:
				for(int i=1;i<=7;i++)
				System.out.println();
				return Choix.PAPIER;
			case 3: 
				for(int i=1;i<=7;i++)
				System.out.println();
				return Choix.CISEAUX;
			default:
				System.out.println("Choix non reconnu, veuillez rentrer un nombre entre 1 et 3 pour faire votre choix");
				choix = -1;
				break;
			}
		}
		return null;
	}	
}