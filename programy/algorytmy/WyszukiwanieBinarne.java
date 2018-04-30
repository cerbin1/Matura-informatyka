public class WyszukiwanieBinarne {
    // http://www.algorytm.org/dla-poczatkujacych/szukanie-polowkowe-binarne.html
    private static int[] liczby = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String... args) {
        System.out.println(wyszukiwanieBinarne(1));
        System.out.println(wyszukiwanieBinarne(2));
        System.out.println(wyszukiwanieBinarne(3));
        System.out.println(wyszukiwanieBinarne(4));
        System.out.println(wyszukiwanieBinarne(5));
        System.out.println(wyszukiwanieBinarne(6));
        System.out.println(wyszukiwanieBinarne(7));
        System.out.println(wyszukiwanieBinarne(8));
        System.out.println(wyszukiwanieBinarne(9));
        System.out.println(wyszukiwanieBinarne(10));
    }

    static int wyszukiwanieBinarne(int szukanaLiczba) {
        int lewo = 0;
        int prawo = liczby.length - 1;
        int srodek = 0;
        while (lewo <= prawo) {
            srodek = (lewo + prawo) / 2;
            if (liczby[srodek] == szukanaLiczba) {
                return srodek;
            }
            if (liczby[srodek] > szukanaLiczba) {
                prawo = srodek - 1;
            } else {
                lewo = srodek + 1;
            }
        }
        return -1;
    }
}
