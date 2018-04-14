import java.util.Random;

public class RozkladLiczbyNaCzynniki {
	public static void main(String[] args) {
		Random random = new Random();
		int liczba = random.nextInt(100);
		System.out.print("Czynniki pierwsze liczby " + liczba + ": ");
		for (int i = 2; i <= liczba; i++) {
			while (liczba % i == 0) {
				System.out.print(i + ", ");
				liczba /= i;
			}
		}
	}

}
