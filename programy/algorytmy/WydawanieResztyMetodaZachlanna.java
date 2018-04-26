import java.util.Arrays;

public class WydawanieResztyMetodaZachlanna {
	public static void main(String... args) {
		final double[] NOMINALY = { 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
		int[] ilosciBanknotow = new int[NOMINALY.length];

		double kwota = 1492.83;
		for (int i = 0; i < NOMINALY.length; i++) {
			double nominal = NOMINALY[i];
			if (nominal <= (double) Math.round(kwota * 100) / 100) {
				ilosciBanknotow[i] = (int) (double) Math.round(100 * (kwota / nominal)) / 100;
				kwota -= ilosciBanknotow[i] * nominal;
				System.out.println("kwota: " + kwota);
			}
		}

		System.out.println("Uzyte banknoty: ");
		for (int i = 0; i < ilosciBanknotow.length; i++) {
			if (ilosciBanknotow[i] != 0) {
				System.out.println("Nominal " + NOMINALY[i] + ": " + ilosciBanknotow[i]);
			}
		}
	}

}
