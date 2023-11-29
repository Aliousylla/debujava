package sabs;


import java.util.Random;
import java.util.Scanner;

public class Serieexo1 {
public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);
	
//nombreCarte(null);	
comparaison(null);
//jeu();

	
		
}

 static String nomJoueurs() {
	Scanner clavier = new Scanner(System.in);
	System.out.println("entree votre nom :");
	String joueur = clavier.next();
	return joueur;
	
}
 static int jeu() {
     Random random = new Random();
     int nombreAleatoire = random.nextInt(10) + 1;
System.out.println(nombreAleatoire);
return nombreAleatoire;
     
 }
 static void comparaison(String joueur) {
	 int numero1, numero2;
	 do {
		 
		 String joueurA= nomJoueurs();
		  numero1= jeu();
	     System.out.println(joueurA +" " +numero1);
	 
		 String joueurB= nomJoueurs();
		 numero2= jeu();
		 System.out.println(joueurB + " "+numero2);
		 if(numero1>numero2) {
			 
			 System.out.println("le joure "+   joueurA +" a gagne avec un carte de "+ numero1);
			 
		 }
		 else if(numero1==numero2){
			 System.out.println("les 2  joures sont a egale ");
		 }
		 else {
			 System.out.println("le joure "+   joueurB +" a gagne avec un carte de "+ numero2);
		}
	} while (numero1==numero2);
	
	
}
 
// static void nombreCarte(String joueur) {
//	 String joueurA= nomJoueurs();
//	 int nomre1= jeu();
//	 
//	 String joueurB= nomJoueurs();
//	 int nomre2= jeu();
//	 System.out.println(joueurA +" " +nomre1);
//	 System.out.println(joueurB + " "+nomre2);
//	
//	
//}

}
