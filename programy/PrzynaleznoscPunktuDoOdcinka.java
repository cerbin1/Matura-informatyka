public class PrzynaleznoscPunktuDoOdcinka {
    public static void main(String[] args) {
        int x[] = { 0, 4, 2 };
        int y[] = { 0, 0, 0 };

        int wyznacznikMacierzy = x[0] * y[1] + x[1] * y[2] + x[2] * y[0] - x[2] * y[1] - x[0] * y[2] - x[1] * y[0];

        if (wyznacznikMacierzy == 0) {
            if ((Math.min(x[0], x[1]) <= x[2]) && (x[2] <= Math.max(x[0], x[1])) && (Math.min(y[0], y[1]) <= y[2])
                    && (y[2] <= Math.max(y[0], y[1]))) {
                System.out.println("Punkt C nalezy do odcinka");
            } else {
                System.out.println("Punkt C nie nalezy do odcinka");
            }
        } else {
            System.out.println("Punkt C nie nalezy do odcinka");
        }
    }
}
