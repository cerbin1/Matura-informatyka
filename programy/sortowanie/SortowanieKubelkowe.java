public class SortowanieKubelkowe {
    public static void main(String... args) {
        // http://eduinf.waw.pl/inf/alg/003_sort/0020.php
        int[] liczby = new int[] { 2, 6, 4, 3, 8, 7, 2, 5, 7, 9, 3, 5, 2, 6 };

        int[] liczniki = new int[liczby.length];
        int min = policzMin(liczby);
        int max = policzMax(liczby);
        for (int i = 0; i < liczby.length; i++) {
            liczniki[liczby[i] - min]++;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);

        System.out.print("posortowane: ");
        for (int j = 0; j < liczniki.length; j++) {
            if (liczniki[j] > 0) {
                for (int k = 0; k < liczniki[j]; k++) {
                    System.out.print(j + min + ", ");
                }
            }
        }

    }

    static int policzMin(int[] liczby) {
        int min = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] < min) {
                min = liczby[i];
            }
        }
        return min;
    }

    static int policzMax(int[] liczby) {
        int max = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] > max) {
                max = liczby[i];
            }
        }
        return max;
    }
}