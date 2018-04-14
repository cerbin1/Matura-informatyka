public class Anagramy {
	public static void main(String... args) {
		//		Anagram - kiedy dwa wyrazy składaja sie z tych samych liter
		String wyraz1 = "karol";
		String wyraz2 = "rolka";
		char[] znaki1 = wyrazNaZnaki(wyraz1);
		char[] znaki2 = wyrazNaZnaki(wyraz2);
		posortujBabelkowoWyraz(znaki1);
		posortujBabelkowoWyraz(znaki2);
		System.out.println("wyraz 1: " + new String(znaki1));
		System.out.println("wyraz 2: " + new String(znaki2));

		System.out.println("Czy anagram? " + czyAnagramy(znaki1, znaki2));
	}

	private static boolean czyAnagramy(char[] znaki1, char[] znaki2) {
		if (znaki1.length != znaki2.length) {
			return false;
		}
		for (int i = 0; i < znaki1.length; i++) {
			if (znaki1[i] != znaki2[i]) {
				return false;
			}
		}
		return true;
	}

	private static char[] wyrazNaZnaki(String wyraz) {
		char[] znaki = new char[wyraz.length()];
		for (int i = 0; i < wyraz.length(); i++) {
			znaki[i] = wyraz.charAt(i);
		}
		return znaki;
	}

	private static void posortujBabelkowoWyraz(char[] wyraz) {
		boolean zmiana = true;
		for (int i = 1; i < wyraz.length && zmiana; i++) {
			zmiana = false;
			for (int j = 0; j < wyraz.length - i; j++) {
				if (wyraz[j] > wyraz[j + 1]) {
					char temp = wyraz[j];
					wyraz[j] = wyraz[j + 1];
					wyraz[j + 1] = temp;
					zmiana = true;
				}
			}
		}
	}
}