package sabs;

import java.util.Scanner;

public class Exochaines {
public static void main(String[] args) {
	
	
	Scanner clavier=new Scanner(System.in);
	System.out.println("Entrer un verbe");
	String verbe=clavier.nextLine();
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
	

//CharSequence tspaces = verbe.charAt(2);
//System.out.println(tspaces);
	
	
String tr[]= new String[6]; 
tr[0]="e";
tr[1]="es";
tr[2]="e";
tr[3]="ons";
tr[4]="ez";
tr[5]="ent";

String s[]= new String[6]; 
s[0]="me";
s[1]="te";
s[2]="se";
s[3]="nous";
s[4]="vous";
s[5]="se";

String sj[]= new String[6]; 
sj[0]="je";
sj[1]="tu";
sj[2]="il / elle";
sj[3]="nous";
sj[4]="vous";
sj[5]="ils / elles";


CharSequence tspaces = String.valueOf(verbe.charAt(2));


String radical="";
if (tspaces.equals(" ")  && terminaison.equals("er") ) {
	for (int i = 3; i <= verbe.length()-3; i++) {
		radical+=verbe.charAt(i);
	}
	
	System.out.println(verbe+" est un verbe pronominal  du premier groupe");
	System.out.println(radical +" est le radicle du verbe "+verbe);
	for (int i = 0; i < tr.length; i++) {
		System.out.println(sj[i]+" "+s[i]+" "+radical+tr[i]);
	}


}else if (terminaison.equals("er")) {
	System.out.println(verbe+" est du premier groupe");
	System.out.println(radicale +" est le radicle du verbe "+verbe);
	for (int i = 0; i < tr.length; i++) {
		System.out.println(sj[i]+" "+radicale+tr[i]);
	}
}else {
	System.out.println(verbe+"n'est pas du premier groupe");
}


//	System.out.println("terminaison est "+terminaison);
//	if (terminaison.equals("er") ) {
//		System.out.println(verbe+" est du premier groupe");
//		System.out.println(radicale +" est le radicle du verbe "+verbe);
//		for (int i = 0; i < tr.length; i++) {
//			System.out.println(radicale+tr[i]);
//		}
//
//		
//	} else {
//		System.out.println(verbe+"n'est pas du premier groupe");
//	}
}
}
