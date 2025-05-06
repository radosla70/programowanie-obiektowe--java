import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pary = new HashMap<>();

        System.out.println("Wprowadzaj imiona par (po jednym imieniu na osobę). Wpisz \"-\" aby zakończyć.");

        while (true) {
            System.out.print("Podaj pierwsze imię: ");
            String imie1 = scanner.nextLine().trim();
            if (imie1.equals("-")) break;

            System.out.print("Podaj drugie imię (partnera): ");
            String imie2 = scanner.nextLine().trim();
            if (imie2.equals("-")) break;

            // Zapisz parę w obie strony
            pary.put(imie1, imie2);
            pary.put(imie2, imie1);
        }

        System.out.print("Podaj imię, aby znaleźć jego partnera: ");
        String szukaneImie = scanner.nextLine().trim();

        if (pary.containsKey(szukaneImie)) {
            System.out.println("Partner(ka) " + szukaneImie + " to: " + pary.get(szukaneImie));
        } else {
            System.out.println("Nie znaleziono partnera dla podanego imienia.");
        }
    }
}