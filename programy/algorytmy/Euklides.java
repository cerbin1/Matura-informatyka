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
    }
}