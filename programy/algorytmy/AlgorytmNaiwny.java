public class AlgorytmNaiwny {
    public static void main(String... args) {
		String wzorzec = "ABC";
		String tekst = "ABAABBABCABBABCABCABCABCABC";

		int dlugoscTekstu = tekst.length();
		int dlugoscWzorca = wzorzec.length();

		System.out.println("Wzorzec jest na indeksach:");
		for (int i = 0; i <= dlugoscTekstu - dlugoscWzorca; i++) {
			int j = 0;
			while ((j < dlugoscWzorca)
					&& (wzorzec.charAt(j) == tekst.charAt(i + j))) {
				j++;
			}
			if (j == dlugoscWzorca) {
				System.out.println(i);
			}
		}
	}
}
