public class LiczbyWzgledniePierwsze {

	public static void main(String... args) {
		// Liczby względnie pierwsze – liczby całkowite, których największym
		// wspólnym dzielnikiem jest jedność.
		int a = 6;
		int b = 35;
		System.out.println((nwd(a, b) == 1)? "Liczby sa wzglednie pierwsze" : "Nie sa");
	}

	public static int nwd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
}
