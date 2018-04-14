public class SitoErastotenesa {
	// wyszukanie liczb pierwszych na przedziale przez wykreslanie
	//  wielokrotnosci liczb pierwszych 
	public static void main(String[] args) {
		int n = 50;
		int[] liczby = new int[n];
		for (int i = 2; i < liczby.length; i++) {
			liczby[i] = i;
		}

		for (int i = 2; i * i <= n; i++) {
			if (liczby[i] != 0) {
				for (int j = i + i; j < n; j += i) {
					liczby[j] = 0;
				}
			}
		}
		System.out.print("Liczby pierwsze: ");
		for (int liczba : liczby) {
			if (liczba != 0) {
				System.out.print(liczba + ", ");
			}
		}
	}
}
