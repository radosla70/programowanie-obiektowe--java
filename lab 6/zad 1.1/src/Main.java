package PO_UR.Lab09;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadzaj imiona (wpisz '-' aby zakończyć):");
        listStrings.add(in.next());
        while (true) {
            System.out.print("Podaj imię: ");
            String imie = in.nextLine().trim();

            if (imie.equals("-")) {
                break;
            }

            if (!imie.isEmpty()) {
                listStrings.add(imie);
            }
        }
        System.out.println("Liczba unikalnych imion: " + listStrings.size());
    }
}