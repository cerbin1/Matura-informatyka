public class SzyfrCezara {

	public static void main(String[] args) {
		// przesuniecie 3
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// DEFGHIJKLMNOPQRSTUVWXYZABC
		String slowo = "internacjonalizacja";
		slowo = slowo.toUpperCase();
		int klucz = 3;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < slowo.length(); i++) {
			builder.append((char) (65 + (slowo.charAt(i) - (65 - klucz)) % 26));
		}

		String zaszyfrowane = builder.toString();
		System.out.println("slowo: " + slowo);
		System.out.println("zaszyfrowane: " + zaszyfrowane);

		builder = new StringBuilder();
		for (int i = 0; i < zaszyfrowane.length(); i++) {
			builder.append((char) (65 + (zaszyfrowane.charAt(i) - (45 - klucz)) % 26));
		}

		System.out.println("odszyfrowane: " + builder.toString());
	}
}