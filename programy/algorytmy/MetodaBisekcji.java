public class MetodaBisekcji {
	public static void main(String... args) {
		final double A = -123451;
		final double B = 123123;
		double lewyKraniec = A;
		double prawyKraniec = B;
		while (lewyKraniec <= prawyKraniec) {
			double srodek = (lewyKraniec + prawyKraniec) / 2;
			double wartoscFunkcjiWSrodku = wartoscFunkcjiWPunkcie(srodek);
			if (wartoscFunkcjiWSrodku == 0) {
				System.out.println("Miejsce zerowe iteracyjne: " + srodek);
				break;
			} else {
				if (wartoscFunkcjiWPunkcie(lewyKraniec) * wartoscFunkcjiWSrodku > 0) {
					lewyKraniec = srodek;
				} else {
					prawyKraniec = srodek;
				}
			}
		}

		System.out.println("Miejsce zerowe rekurencyjnie: " + metodaBisekcjiRekurencyjnie(A, B));
	}

	static double wartoscFunkcjiWPunkcie(double x) {
		return 2 * x + 1;
	}

	static double metodaBisekcjiRekurencyjnie(double lewyKraniec, double prawyKraniec) {
		double srodek = (lewyKraniec + prawyKraniec) / 2;
		if (wartoscFunkcjiWPunkcie(srodek) == 0) {
			return srodek;
		}
		if (wartoscFunkcjiWPunkcie(srodek) * wartoscFunkcjiWPunkcie(lewyKraniec) > 0) {
			return metodaBisekcjiRekurencyjnie(srodek, prawyKraniec);
		} else {
			return metodaBisekcjiRekurencyjnie(lewyKraniec, srodek);
		}
	}
}