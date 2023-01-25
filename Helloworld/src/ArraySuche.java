
public class ArraySuche {

	public static void main(String[] args) {
		
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 }; 
		int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
		int gesucht = 2;
		int gesucht2 = 3;
		
		for(int i = 0; i <= zahlenArray.length; i++) {
			if(zahlenArray[i] == gesucht) {
				System.out.println("gefunden");
			} else {
				System.out.println("nicht gefunden");
			}
		}
		
		for(int i = 0; i <= zahlenArray2.length; i++) {
			if(zahlenArray2[i] == gesucht2) {
				System.out.println("gefunden");
			} else
				System.out.println("nicht gefunden");
		}
		
	}

}
