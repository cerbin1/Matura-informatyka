import java.util.Arrays;

public class CiagFibonacciego {
	public static void main(String[] args) {
		System.out.println("Iteracyjnie");
		int zakres = 30;
		// iteracyjne
		int[] ciagFibo = new int[zakres];
		if (zakres > 2) {
			ciagFibo[0] = 0;
			ciagFibo[1] = 1;
			for (int i = 2; i < zakres; i++) {
				ciagFibo[i] = ciagFibo[i - 2] + ciagFibo[i - 1];
			}
		}
		System.out.println(Arrays.toString(ciagFibo));

		// rekurencyjnie, obliczanie numeru wyrazu ciagu

		System.out.println("\nRekurencyjnie");
		int numerWyrazuCiagu = 13;
		System.out.println("Numer: " + numerWyrazuCiagu + " ciag = " + policzWyrazCiaguFibonacciego(numerWyrazuCiagu));

	}

	private static int policzWyrazCiaguFibonacciego(int numerWyrazuCiagu) {
		if (numerWyrazuCiagu == 0) {
			return 0;
		}
		if (numerWyrazuCiagu == 1) {
			return 1;
		}
		return policzWyrazCiaguFibonacciego(numerWyrazuCiagu - 2) + policzWyrazCiaguFibonacciego(numerWyrazuCiagu - 1);

	}
}
