public class OdwroconaNotacjaPolska {
	final String operatory[] = { "+", "-", "*", "/" };
	double liczby[];
	int wielkoscTablicy;

	public OdwroconaNotacjaPolska() {
		wyczyscDane();
	}

	public void wyczyscDane() {
		liczby = new double[100];
		wielkoscTablicy = 0;
	}

	public double obliczDzialanie(String dzialanie) {
		wyczyscDane();
		String[] argumenty = dzialanie.split(" ");
		for (int i = 0; i < argumenty.length; i++) {
			if (czyOperator(argumenty[i])) {
				double pierwszaLiczba = pobierzArgument();
				double drugaLiczba = pobierzArgument();
				double wynik = obliczWyrazenie(drugaLiczba, pierwszaLiczba,
						argumenty[i]);
				zapiszWynik(wynik);
			} else {
				dodajArgument(Integer.parseInt(argumenty[i]));
			}
		}
		System.out.println("Wynik: " + liczby[0]);
		return liczby[0];
	}

	private void dodajArgument(int liczba) {
		for (int i = wielkoscTablicy; i > 0; i--) {
			liczby[i] = liczby[i - 1];
		}
		liczby[0] = liczba;
		wielkoscTablicy++;
	}

	private void zapiszWynik(double wynik) {
		for (int i = wielkoscTablicy; i > 0; i--) {
			liczby[i] = liczby[i - 1];
		}
		liczby[0] = wynik;
		wielkoscTablicy++;
	}

	private double obliczWyrazenie(double pierwszaLiczba, double drugaLiczba,
			String operand) {
		wielkoscTablicy -= 2;
		switch (operand) {
		case "+":
			return pierwszaLiczba + drugaLiczba;

		case "-":
			return pierwszaLiczba - drugaLiczba;

		case "*":
			return pierwszaLiczba * drugaLiczba;

		case "/":
			return pierwszaLiczba / drugaLiczba;

		default:
			throw new IllegalArgumentException();
		}
	}

	private double pobierzArgument() {
		double argument = liczby[0];
		for (int i = 0; i < wielkoscTablicy - 1; i++) {
			liczby[i] = liczby[i + 1];
		}
		return argument;
	}

	private boolean czyOperator(String znak) {
		for (int i = 0; i < operatory.length; i++) {
			if (operatory[i].equals(znak)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String... args ){
		OdwroconaNotacjaPolska odwroconaNotacjaPolska = new OdwroconaNotacjaPolska();

		double wynik1 = odwroconaNotacjaPolska.obliczDzialanie("2 3 4 + *");
		double wynik2 = odwroconaNotacjaPolska.obliczDzialanie("2 3 + 5 *");
		double wynik3 = odwroconaNotacjaPolska.obliczDzialanie("2 7 + 3 / 14 3 - 4 * + 2 /");
		double wynik4 = odwroconaNotacjaPolska.obliczDzialanie("12 2 3 4 * 10 5 / + * +");
		double wynik5 = odwroconaNotacjaPolska.obliczDzialanie("3 5 2 * +");
		double wynik6 = odwroconaNotacjaPolska.obliczDzialanie("77 3 + 5 2 - *");
		double wynik7 = odwroconaNotacjaPolska.obliczDzialanie("1 2 + 3 4 * / 8 * 12 + 4 -");
		double wynik8 = odwroconaNotacjaPolska.obliczDzialanie("4 2 * 7 8 / +");
		double wynik9 = odwroconaNotacjaPolska.obliczDzialanie("3 4 + 8 3 2 * * +");
		System.out.println("Powinno byc: 14, jest: " + wynik1);
		System.out.println("Powinno byc: 25, jest: " + wynik2);
		System.out.println("Powinno byc: 23.5, jest: " + wynik3);
		System.out.println("Powinno byc: 40, jest: " + wynik4);
		System.out.println("Powinno byc: 13, jest: " + wynik5);
		System.out.println("Powinno byc: 240, jest: " + wynik6);
		System.out.println("Powinno byc: 10, jest: " + wynik7);
		System.out.println("Powinno byc: 8.875, jest: " + wynik8);
		System.out.println("Powinno byc: 55, jest: " + wynik9);
	}
}
