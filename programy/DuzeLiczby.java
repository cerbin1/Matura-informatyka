import java.math.*;

public class DuzeLiczby {
    public static void main(String... args) {
        BigDecimal bigDecimal = new BigDecimal(15);
        System.out.println(bigDecimal.divide(new BigDecimal(5)));
        System.out.println(bigDecimal.multiply(new BigDecimal(10)));
        System.out.println(bigDecimal.pow(2));
        System.out.println(bigDecimal.subtract(new BigDecimal(5)));

        BigInteger bigInteger = new BigInteger("231");
        System.out.println(bigInteger.toString());
    }
}
