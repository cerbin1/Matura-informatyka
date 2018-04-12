import java.util.Arrays;

public class SortowanieBabalkowe {
	public static void main(String... args) {
//		http://eduinf.waw.pl/inf/alg/003_sort/0004.php
		int[] liczby = new int[] { 32, 12345, 2134, 124, 12, 321, 3, 213, 12,
				321, 31, 4, 1, 5, 2, 64, 3, 634, 643, 6, 2, 1, 3, 5, 4 };

		System.out.println("przed" + Arrays.toString(liczby));

		sortowanieBabalkowe(liczby);
		System.out.println("po sortowaniu: " + Arrays.toString(liczby));
	}

	public static void sortowanieBabalkowe(int[] tablica) {
		boolean zmiana = true;

		for (int i = 1; i < tablica.length && zmiana; i++) {
			zmiana = false;
			for (int j = 0; j < tablica.length - i; j++) {
				if (tablica[j] > tablica[j + 1]) {
					zamienMiejscamiDwaElementy(tablica, j, j + 1);
					zmiana = true;
				}
			}
		}
	}

	public static void zamienMiejscamiDwaElementy(int[] tablica, int i, int j) {
		int temp = tablica[i];
		tablica[i] = tablica[j];
		tablica[j] = temp;
	}
}
