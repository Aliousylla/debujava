package sabs;

import java.util.Scanner;

public class teste {
public static void main(String[] args) {
	
	
	int nombreEssai = 0;
    boolean trouve = false;
    double ecart=0;
    double meilleurEcart = Double.MAX_VALUE;
    String meilleurJoueur = "";
    int[] tableau = new int[3];
    Scanner scanner = new Scanner(System.in);
for (int j = 0; j < 3; j++) {
	

    System.out.println("Entrer votre prénom ");
    String prenom = scanner.next();
    System.out.println("Tu t'appelles " + prenom);
    double ecartMin = Double.MAX_VALUE;

    do {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Saisissez le nombre secret " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();

            if (tableau[i] == 123) {
                trouve = true;
                break;
            } else {
            	 ecart=Math.abs(123-tableau[i]);
            	ecartMin = Math.min(ecartMin, ecart);
				
                nombreEssai++;
                System.out.println("Ce n'est pas le bon nombre, il vous reste " + (3 - nombreEssai) + " essai(s)");

                if (nombreEssai == 3) {
                    System.out.println("Arrêt du partie, nombre d'essais = 3");
                    
                    break;
                }
            }
        }

        
        if (trouve) {
            break;
        }
        if (nombreEssai == 3) break;
    } while (!trouve);

    if (trouve) {
        System.out.println("Bravo " + prenom + ", le nombre secret est 123, après " + (nombreEssai+1) + " essai(s)");
        break;
    }
    if (ecartMin < meilleurEcart) {
        meilleurEcart = ecartMin;
        meilleurJoueur = prenom;
    }
    nombreEssai=0;
}
if (!trouve) {
    System.out.println("Aucun joueur n'a trouvé le nombre secret, mais " + meilleurJoueur + " a l'écart le plus petit."+ meilleurEcart);
}

    scanner.close();
}
}
