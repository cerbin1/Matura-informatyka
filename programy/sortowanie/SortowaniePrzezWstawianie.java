import java.util.*;

public class SortowaniePrzezWstawianie {
    public static void main(String... args) {
        int[] liczby = new int[] { 4, 7, 2, 9, 3 };
        for (int i = 0; i < liczby.length; i++) {
            int min = liczby[i];
            for (int j = i + 1; j < liczby.length; j++) {
                if (liczby[j] < min) {
                    liczby[i] = liczby[j];
                    liczby[j] = min;
                    min = liczby[i];
                }
            }
        }

        System.out.println(Arrays.toString(liczby));
    }
}