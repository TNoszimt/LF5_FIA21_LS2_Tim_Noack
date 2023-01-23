import java.util.Scanner;

public class Monatsauswahl {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		int Note;
		int Monat;
		
		System.out.print("bitte geben Sie eine Note an");
		Note = tastatur.nextInt();
		
		System.out.print("bitte geben Sie einen Monat an");
		Monat = tastatur.nextInt();
	
		switch (Note) {
		case 1:
            System.out.println("Sehr gut");
            break;
        case 2:
            System.out.println("Gut");
            break;
        case 3:
            System.out.println("Befriedigend");
            break;
        case 4:
            System.out.println("Ausreichend");
            break;
        case 5:
            System.out.println("Mangelhaft");
            break;
        case 6:
            System.out.println("Ungenügend");
            break;

        default:
            System.out.println("Ich kenne die Note nicht!");
            break;
            }
		
		if (Monat == 1) {
			System.out.println("Januar \n und hat 31 Tage");
		} else if (Monat == 2) {
			System.out.println("Febuar \n und hat 28 Tage");
		}else if (Monat == 3) {
			System.out.println("März \n und hat 31 Tage");
		}else if (Monat == 4) {
			System.out.println("April \n und hat 30 Tage");
		}else if (Monat == 5) {
			System.out.println("Mai \n und hat 31 Tage");
		}else if (Monat == 6) {
			System.out.println("Juni \n und hat 30 Tage");
		}else if (Monat == 7) {
			System.out.println("Juli \n und hat 31 Tage");
		}else if (Monat == 8) {
			System.out.println("August \n und hat 31 Tage");
		}else if (Monat == 9) {
			System.out.println("September \n und hat 30 Tage");
		}else if (Monat == 10) {
			System.out.println("Oktober \n und hat 31 Tage");
		}else if (Monat == 11) {
			System.out.println("November \n und hat 30 Tage");
		}else if (Monat == 12) {
			System.out.println("Dezember \n und hat 31 Tage");
		}
	}		
	}
