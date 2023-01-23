
public class MatheBedingungsSchleifen {

	public static void main(String[] args) {
		int i = 9;
		while(i <= 20) {
			i = i+1;
			if (i == 11) continue;
		     if (i == 18) break;
		     System.out.printf("%d ", i*i);
		}
	}

}
