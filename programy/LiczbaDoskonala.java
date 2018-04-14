import java.util.Random;

public class LiczbaDoskonala {
	// liczba naturalna, która jest sumą wszystkich swych dzielników właściwych
	// (to znaczy od niej mniejszych), np 6 (1 + 2 + 3 = 6)
	public static void main(String... args) {
		Random random = new Random();
		int liczba = random.nextInt(100);
		int sumaDzielnikow = 0;
		for (int i = 1; i < liczba; i++) {
			if (liczba % i == 0) {
				sumaDzielnikow += i;
				System.out.print(i + ", ");
			}
		}
		System.out.println("suma dzielnikow: " + sumaDzielnikow);
		System.out.println("Liczba " + liczba + (sumaDzielnikow == liczba ? " jest " : " nie jest ") + "doskonala");
	}
}
