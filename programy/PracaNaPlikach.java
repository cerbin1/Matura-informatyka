import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

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
        
        System.out.println("\nOdczytywanie tekstu z pliku");
        scanner = new Scanner(new File("resources/imiona.txt"));
        List<String> imiona = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String imie = scanner.nextLine();
            imiona.add(imie);
        }
        for (String imie : imiona) {
            System.out.print(imie + ", ");
        }

        PrintWriter printWriter = new PrintWriter("resources/numerowanie.txt");
        for (int i = 1; i <= 100; i++) {
            printWriter.println(i);
        }
        printWriter.close();

        
        System.out.println("\n\nUzycie split");
        scanner = new Scanner(new File("resources/tekst.txt"));
        List<String[]> tekstPodzielony = new ArrayList<>();
        while (scanner.hasNextLine()) {
            tekstPodzielony.add(scanner.nextLine().split(" "));
        }
        for (String[] tablicaStringow : tekstPodzielony) {
            System.out.println(Arrays.toString(tablicaStringow));
        }

        scanner.close();
    }
}
