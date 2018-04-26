public class Euklides {
    public static void main(String... args) {
        int a = 1989;
        int b = 867;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("NWD: " + a);

        System.out.println("Rekurencyjnie");
        System.out.println("NWD: " + nwd(1989, 867));
    }

    private static int nwd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return nwd(a - b, b);
        } else {
            return nwd(a, b - a);
        }
    }
}