import java.util.Random;

public class DzielnikiLiczby {
	public static void main(String[] args) {
		Random random = new Random();
		int liczba = random.nextInt(100);
		System.out.print("Dzielniki liczby " + liczba + ": ");
		for (int i = 1; i <= liczba; i++) {
			if (liczba % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
