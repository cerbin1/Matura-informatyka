import java.util.Arrays;

public class SortowaniePrzezWybor {
	public static void main(String... args) {
        // http://eduinf.waw.pl/inf/alg/003_sort/0009.php
		int[] liczby = new int[] { 32, 12345, 2134, 124, 12, 321, 3, 213, 12,
				321, 31, 4, 1, 5, 2, 64, 3, 634, 643, 6, 2, 1, 3, 5, 4 };
		
		for (int i = 0; i < liczby.length; i++) {
			for (int j = i + 1; j < liczby.length; j++) {
				if (liczby[j] < liczby[i]) {
					int temp = liczby[i];
					liczby[i] = liczby[j];
					liczby[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(liczby));
	}
}