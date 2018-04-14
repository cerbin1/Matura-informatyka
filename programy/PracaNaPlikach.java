import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracaNaPlikach {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/liczby.txt"));
        int suma = 0;
        while (scanner.hasNextInt()) {
            int liczbaZPliku = scanner.nextInt();
            System.out.println(liczbaZPliku);
            suma += liczbaZPliku;
        }
        System.out.println("Suma: " + suma);
        scanner = new Scanner(new File("resources/imiona.txt"));
        List<String> imiona = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String imie = scanner.nextLine();
            imiona.add(imie);
        }
        for (String imie : imiona) {
            System.out.print(imie + ", ");
        }
        scanner.close();
    }
}