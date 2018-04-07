public class NWW {
    public static void main(String... args) {
        int a = 15;
        int b = 240;
        int iloczyn = a * b;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("NWW: " + iloczyn / a);
    }
}