
public class Partie {
	
	int nm;
	
	Partie(){
		System.out.println("Nombre de manches à gagner pour gagner la partie :");
		nm=Get.nextInt();
		System.out.println("C'est parti !");
	}
	public void play(Playable j1, Playable j2){
		int i=1;
		while ((j1.getScore()<nm)&&(j2.getScore()<nm)){
			Manche m1=new Manche(i);
			m1.play(j1, j2);
			i++;
		}
		if (j1.getScore()>j2.getScore()){
			System.out.println(j1.getNom()+" remporte la partie, bien joué !");
		}else{
			System.out.println(j2.getNom()+" remporte la partie, bien joué !");
		}
	}

}
