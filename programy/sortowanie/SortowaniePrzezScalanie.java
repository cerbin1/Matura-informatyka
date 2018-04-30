// Sortowanie przez scalanie (mergesort)
// Tomasz Lubinski
// (c)2006 www.algorytm.org
// Zrodlo: http://www.algorytm.org/algorytmy-sortowania/sortowanie-przez-scalanie-mergesort/merge-j.html

public class SortowaniePrzezScalanie {
    // http://www.algorytm.org/algorytmy-sortowania/sortowanie-przez-scalanie-mergesort.html
    private static final int iloscLiczb = 30;
    private static int liczby[] = { 30, 29, 28, 27, 26, 25, 1, 2, 3, 4, 5, 6, 7, 24, 23, 22, 21, 20, 19, 18, 8, 9, 10,
            11, 17, 16, 15, 13, 14, 12 };
    private static int pomocnicza[] = new int[iloscLiczb]; // Tablica pomocnicza

    /*
     * Scalanie dwoch posortowanych ciagow tab[pocz...sr] i tab[sr+1...kon] i
     * wynik zapisuje w tab[pocz...kon]
     */
    private static void scal(int poczatek, int srodek, int koniec) {
        int i, j, q;
        for (i = poczatek; i <= koniec; i++) {
            pomocnicza[i] = liczby[i]; // Skopiowanie danych do tablicy
                                       // pomocniczej
        }
        i = poczatek;
        j = srodek + 1;
        q = poczatek; // Ustawienie wskaznikow tablic
        while (i <= srodek && j <= koniec) { // Przenoszenie danych z
                                             // sortowaniem ze zbiorow
                                             // pomocniczych do tablicy
                                             // glownej
            if (pomocnicza[i] < pomocnicza[j]) {
                liczby[q++] = pomocnicza[i++];
            } else {
                liczby[q++] = pomocnicza[j++];
            }
        }
        while (i <= srodek) {
            liczby[q++] = pomocnicza[i++]; // Przeniesienie nie skopiowanych
                                           // danych ze zbioru pierwszego w
                                           // przypadku, gdy drugi zbior sie
                                           // skonczyl
        }

    }

    /* Procedura sortowania tab[pocz...kon] */
    public static void posortuj(int pocz, int kon) {
        int sr;
        if (pocz < kon) {
            sr = (pocz + kon) / 2;
            posortuj(pocz, sr); // Dzielenie lewej czesci
            posortuj(sr + 1, kon); // Dzielenie prawej czesci
            scal(pocz, sr, kon); // laczenie czesci lewej i prawej
        }
    }

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i = 0; i < iloscLiczb; i++) {
            System.out.print(liczby[i] + " ");
        }

        posortuj(0, iloscLiczb - 1);

        System.out.println("\nZbior po sortowaniu:");
        for (i = 0; i < iloscLiczb; i++) {
            System.out.print(liczby[i] + " ");
        }

    }
}
