public class AlfabetMorsa {
	static char litery[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	static String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	public static void main(String[] args) {
		String slowoDoZaszyfrowania = "SIEMANKO";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < slowoDoZaszyfrowania.length(); i++) {
			sb.append(zamienLitereNaKodMorsa(slowoDoZaszyfrowania.charAt(i))).append(" ");
		}
		System.out.println("Slowo: " + slowoDoZaszyfrowania + ", zaszyfrowane: " + sb.toString());

		String slowoDoOdszyfrowania = "... .. . -- .- -. -.- ---";
		String slowoWKodzieMorsaPodzieloneNaZnaki[] = slowoDoOdszyfrowania.split(" ");
		sb.setLength(0);
		for (int i = 0; i < slowoWKodzieMorsaPodzieloneNaZnaki.length; i++) {
			sb.append(zamienZnakMorsaNaLitere(slowoWKodzieMorsaPodzieloneNaZnaki[i]));
		}
		System.out.println("Slowo w kodzie morsa: " + slowoDoOdszyfrowania + ", odszyfrowane: " + sb.toString());
	}

	private static char zamienZnakMorsaNaLitere(String kodMorsa) {
		for (int i = 0; i < morse.length; i++) {
			if (morse[i].equals(kodMorsa)) {
				return litery[i];
			}
		}
		throw new RuntimeException("Wprowadzono zly kod morsa");
	}

	private static String zamienLitereNaKodMorsa(char litera) {
		for (int i = 0; i < litery.length; i++) {
			if (litery[i] == litera) {
				return morse[i];
			}
		}
		throw new RuntimeException("Wprowadzono niepoprawny znak");
	}
}
