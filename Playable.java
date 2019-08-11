
public abstract class Playable {
	
	private int score;
	private String nom;

	Playable(){
		score = 0;
	}
	
	public abstract Choix jouer();
	
	public void win() {
		System.out.println(nom+" gagne la manche");
		score = score + 1;
	}
	
	public String getNom(){
		return nom;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setNom(String str){
		this.nom=str;
	}
}
