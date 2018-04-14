public class KonwersjaNaSystemyLiczbowe {
	public static void main(String[] args) {
		// Konwersja uzywajac api javy
		String binarna = "10010011";
		String osemkowa = "223";
		String hexadecymalna = "93";

		System.out.println(Integer.parseInt(binarna, 2));
		System.out.println(Integer.parseInt(osemkowa, 8));
		System.out.println(Integer.parseInt(hexadecymalna, 16));

		// z dwojkowego na dziesietny
		int liczbaBinarna = 10010011;
		int binarnyNaDziesietny = 0;
		int potega = 0;
		while (liczbaBinarna != 0) {
			int kolejnaCyfraBinarna = liczbaBinarna % 10;
			if (kolejnaCyfraBinarna == 1) {
				binarnyNaDziesietny += Math.pow(2, potega);
			}
			potega++;
			liczbaBinarna /= 10;
		}
		System.out.println("Liczba binarna na dziesietna wynosi: " + binarnyNaDziesietny);

		// z dziesietnego na dwojkowy
		int liczbaDziesietna = 147;
		String dziesietnaNaBinarna = "";
		while (liczbaDziesietna != 0) {
			dziesietnaNaBinarna += Integer.toString(liczbaDziesietna % 2);
			liczbaDziesietna /= 2;
		}
		System.out.print("Liczba dziesietna na binarna wynosi: ");
		for (int i = dziesietnaNaBinarna.length() - 1; i >= 0; i--) {
			System.out.print(dziesietnaNaBinarna.charAt(i));
		}
	}

}
