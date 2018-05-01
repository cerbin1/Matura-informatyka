public class SzyfrPrzestawieniowy {
	public static void main(String[] args) {
		String wyrazDoZaszyfrowania = "ALA MA KOCURKA BURKA I PIESKA BIESKA";
		StringBuilder sb = new StringBuilder();
		int dlugoscWyrazuDoZaszyfrowania = wyrazDoZaszyfrowania.length();
		for (int i = 1; i < dlugoscWyrazuDoZaszyfrowania; i += 2) {
			sb.append(wyrazDoZaszyfrowania.charAt(i)).append(wyrazDoZaszyfrowania.charAt(i - 1));
		}
		if (dlugoscWyrazuDoZaszyfrowania % 2 != 0) {
			sb.append(wyrazDoZaszyfrowania.charAt(dlugoscWyrazuDoZaszyfrowania - 1));
		}

		System.out.println(sb.toString());
	}
}
