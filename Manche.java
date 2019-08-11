
public class Manche {
	
	Manche(int n){
		System.out.println(n+"eme manche :");	
	}
	
	public void play(Playable j1, Playable j2){
		Choix ch1=j1.jouer();
		Choix ch2=j2.jouer();
		System.out.println(ch1+" contre "+ch2);
		if (ch1!=ch2){
			if (((ch1==Choix.PAPIER)&&(ch2==Choix.PIERRE))||((ch1==Choix.CISEAUX)&&(ch2==Choix.PAPIER))||((ch1==Choix.PIERRE)&&(ch2==Choix.CISEAUX))){
				j1.win();
			}else{
				j2.win();
			}
		}else{
			System.out.println("égalité !");
		}
		System.out.println("les scores sont maintenant de "+j1.getScore()+" pour "+j1.getNom()+" et de "+j2.getScore()+" pour "+j2.getNom());
	}

}
