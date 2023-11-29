package sabs;

import java.util.Scanner;

public class Travail {
public static void main(String[] args) {
	int[] tableau =new int  [3];
	boolean trouve=false;
	int nombreEssai=0;
	double ecart=0;
	double meilleurEcart =0;  
	String meilleurjoueur="";
	double ecartMax=Double.MAX_VALUE;
	double ecartMin=Double.MAX_VALUE;
	for (int j = 0; j < 3; j++) {
		
	
	System.out.println("entree votre Prenom");
	Scanner scanner =new Scanner(System.in);
	String prenom=	scanner.next();
	System.out.println(prenom);
	
	for (int i = 0; i < tableau.length; i++) {
		System.out.println("entree le numero secret "+(i+1));
		tableau[i]=scanner.nextInt();
		
		if(tableau[i]==123) {
			trouve=true;
			System.out.println("trouve");
			break;
		}else {
			 ecart = Math.abs(123-tableau[i]);
			ecartMin=Math.min(ecartMin, ecart);
			nombreEssai++;
			
			System.out.println("pas trouve");
		}
	}
	
	if(trouve)break;
	if(ecartMin < ecartMax)  {
		meilleurjoueur=prenom;
		 meilleurEcart = ecartMin;
		
	}
}
	if(!trouve) {
        System.out.println("Aucun joueur n'a trouvé le nombre secret, mais " + meilleurjoueur + " a l'écart le plus petit."+ meilleurEcart );

	}
}
}
