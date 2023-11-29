package sabs;

import java.util.Scanner;

public class exojava {
public static void main(String[] args) {
	
	int nombre=0,nombreEssai=0;
	boolean trouve=false;
	
	Scanner clavier=new Scanner(System.in);
	
	
	for (int i = 0; i <3; i++) {
		System.out.println("Entrer votre prenom ");
		String prenom=clavier.next();
		
	System.out.println("tu t'appelles "+prenom);

		do {
			System.out.println("Entrer le nombre secret");
			nombre=clavier.nextInt();
			trouve=   nombre==123;
	//
			
			
			if (!trouve) {
//				if(nombre<=113 && nombre>=133 )
				double ecart=Math.abs(123-nombre);
				if(ecart>=10)
				nombreEssai++;
				else System.out.println("il ne reste q'un ecart <"+(123-nombre)+" pour trover ce nombre");
				
				if(nombreEssai==3) {
					System.out.println("Arret du partie , nombre essais =3");
					break;
				}
				System.out.println("ce n'est le bon nombre, il vous reste "+(3-nombreEssai)+"essai(s)");
			}
		}while(!trouve  ); // la condition contraire : i==0 ou nombre==123
		
		if( trouve)
		{
			System.out.println("Bravo " +prenom+", le nombre  secret est "+nombre+", apres "+nombreEssai+" Essai(s)");
		break;
		}
		nombreEssai=0;
	}
	}


}

