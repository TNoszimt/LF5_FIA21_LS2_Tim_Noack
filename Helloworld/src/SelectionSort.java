public class SelectionSort {
	public static void main(String[] args) {
		int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
		for (int i = 0; i < liste.length; i++) {
			System.out.print(liste[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < liste.length; i++) {
			for (int j = 1; j < (liste.length-1); j++) {
				if (liste[j - 1] > liste[j]) {
//					System.out.printf("i: %d j: %d %n", liste[i], liste[j]);
					int x = liste[j - 1], y = liste[j];
					liste[j - 1] = y;
					liste[j] = x;
				}
			}
			for (int p = 0; p < liste.length; p++) {
				System.out.print(liste[p] + ", ");
			}
			System.out.println();
		}
	}
}