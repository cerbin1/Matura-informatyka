public class SumaCyfrLiczby {
    public static void main(String... args) {
        System.out.println(policzSumeCyfrLiczby(1234567));
    }

    public static int policzSumeCyfrLiczby(int liczba) {
        int sumaCyfr = 0;
        while (liczba != 0) {
            sumaCyfr += liczba % 10;
            liczba /= 10;
        }
        return sumaCyfr;
    }
}