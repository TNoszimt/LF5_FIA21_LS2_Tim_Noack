import java.util.Scanner;

public class Zinseszins {
	
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);

		int Zins;
		int Jahre;
		int betrag;
		
	    System.out.printf("\n Zins");
		Zins = tastatur.nextInt();
		System.out.printf("\n Jahre");
		Jahre = tastatur.nextInt();
		System.out.printf("\n Betrag");
		betrag = tastatur.nextInt();
		Zins /= 100;
		
		tastatur.close();
		
		for(int i = Jahre; i >= 0; i--) {
			betrag += betrag * Zins;
		}
		System.out.printf("\n das Ergebniss ist" + betrag);

	}

}
