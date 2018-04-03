public class Silnia {
    public static void main(String... args) {
        System.out.println("silnia iteracyjnie: " + policzSilnie(6));
        System.out.println("silnia rekurencyjnie: " + policzSilnieRekurencyjne(6));
    }

    public static long policzSilnie(int liczba) {
        long wartoscSilnii = 1;
        while (liczba > 1) {
            wartoscSilnii = wartoscSilnii * liczba--;
        }
        return wartoscSilnii;
    }

    public static long policzSilnieRekurencyjne(int liczba) {
        if (liczba <= 1) {
            return 1;
        }
        return liczba * policzSilnieRekurencyjne(liczba - 1);
    }
}