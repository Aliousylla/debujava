package sabs;

import java.util.Scanner;

public class Chaines {
public static void main(String[] args) {
	
	Scanner clavier=new Scanner(System.in);
	System.out.println("Entrer un verbe");
	String verbe=clavier.next();
//	String terminaison= ""+verbe.charAt(verbe.length()-2)+ verbe.charAt(verbe.length()-1);
String terminaison="";
String radicale="";
String radicales="";
	for (int i = verbe.length()-2; i <= verbe.length()-1; i++) {
		terminaison+=verbe.charAt(i);
	}

	for (int i = 0; i <= verbe.length()-3; i++) {
		radicale+=verbe.charAt(i);
	}
	
 

String tr[]= new String[6]; 
tr[0]="e";
tr[1]="es";
tr[2]="e";
tr[3]="ons";
tr[4]="ez";
tr[5]="ent";




	System.out.println("terminaison est "+terminaison);
	if (terminaison.equals("er")) {
		System.out.println(verbe+" est du premier groupe");
		System.out.println(radicale +" est le radicle du verbe "+verbe);
		for (int i = 0; i < tr.length; i++) {
			System.out.println(radicale+tr[i]);
		}

		
	} else {
		System.out.println(verbe+"n'est pas du premier groupe");
	}
}
}
