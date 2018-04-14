public class Palindromy {
	public static void main(String... args) {
		String kajak = "kajak";
		String witaj = "witaj";
		System.out.println("Czy " + kajak + " to palindrom " + czyPalindrom(kajak));
		System.out.println("Czy " + witaj + " to palindrom " + czyPalindrom(witaj));
	}

	private static boolean czyPalindrom(String wyraz) {
		String odwroconyWyraz = "";
		for(int i = 0; i < wyraz.length(); i++) {
			odwroconyWyraz += wyraz.charAt(wyraz.length() - 1 - i);
		}
		return odwroconyWyraz.equals(wyraz);
	}
}
