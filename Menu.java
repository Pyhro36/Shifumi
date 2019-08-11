import java.util.Scanner;

public class Menu {
	
	private int i;
	
	Menu(){
		System.out.println("------//Jeu du Shifoumi//------ \n (1) Joueur vs IA \n (2) Joueur vs Joueur");
		i=Get.nextInt();
		while (i!=1 && i!=2){
		System.out.println("Valeur non reconnue veuillez choisir entre 1 et 2 :");
		i=Get.nextInt();
		}
	}
	
	public void run(){
		if (i==2){
			Scanner sc = new Scanner(System.in); 
			System.out.println("nom du joueur 1 :");
			String nj1=sc.nextLine();
			Joueur j1=new Joueur(nj1);
			System.out.println("nom du joueur 2 :");
			String nj2=sc.nextLine();
			Joueur j2=new Joueur(nj2);
			Partie p1=new Partie();
			p1.play(j1, j2);
			sc.close();
		}else{
			Scanner sc = new Scanner(System.in); 
			System.out.println("nom du joueur 1 :");
			String nj1=sc.nextLine();
			Joueur j1=new Joueur(nj1);
			System.out.println("Nom de l'IA :");
			String nIA=sc.nextLine();
			IA j2=new IA(nIA);
			Partie p1=new Partie();
			p1.play(j1, j2);
			sc.close();
		}
	}

}
