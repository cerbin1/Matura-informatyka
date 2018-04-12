public class SchematHornera {
    public static int hornerRekurencyjnie(int[] wspolczynniki, int stopien, int x) {
        if (stopien == 0) {
            return wspolczynniki[0];
        }
        return hornerRekurencyjnie(wspolczynniki, stopien - 1, x) * x + wspolczynniki[stopien];
    }

    public static void main(String... args) {
        // http://www.algorytm.edu.pl/algorytmy-maturalne/schemat-hornera.html
        int[] wspolczynniki = new int[] { 3, 3, -2, 11 };
        int stopien = 3;
        int x = 4;

        // iteracyjnie
        int wynik = wspolczynniki[0];
        for (int i = 1; i <= stopien; i++) {
            wynik = wynik * x + wspolczynniki[i];
        }

        System.out.println("\nIteracyjnie: " + wynik);

        System.out.println("\nRekurencyjnie: " + hornerRekurencyjnie(wspolczynniki, stopien, x));
    }
}