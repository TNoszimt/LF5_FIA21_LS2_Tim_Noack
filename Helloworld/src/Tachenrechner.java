import java.util.Scanner;

public class Tachenrechner {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		int Ergebniss;
		int Zahl1;
		int Zahl2;
		char Zeichen;
		
		
		System.out.println("bitte geben sie die erste Zahl ein");
		Zahl1 = tastatur.nextInt();
		System.out.println("bitte geben Sie eine zweite Zahl ein");
		Zahl2 = tastatur.nextInt();
		System.out.println("bitte geben Sie ein Zeichen zum rechnen ein");
		Zeichen = tastatur.next().charAt(0);
		
		if(Zeichen == '+') {
			Ergebniss = (Zahl1 + Zahl2);
			System.out.println(("das Ergebnis ist: " + Ergebniss);
		} else if (Zeichen == '-'){
			Ergebniss = (Zahl1 - Zahl2);
			System.out.println("das Ergebnis ist: " + Ergebniss);
		} else if (Zeichen == '*'){
			Ergebniss = (Zahl1 * Zahl2);
			System.out.println("das Ergebnis ist: " + Ergebniss);
		} else if (Zeichen == '/'){
			Ergebniss = (Zahl1 / Zahl2);
			System.out.println("das Ergebnis ist: " + Ergebniss);
		}
}
}
