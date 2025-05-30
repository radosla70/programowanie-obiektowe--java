import java.util.*;

public class Main {
    private static Map<String, Double> menu = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean dziala = true;

        while (dziala) {
            System.out.println("\n--- MENU APLIKACJI ---");
            System.out.println("1. Dodaj danie");
            System.out.println("2. Wyświetl kartę dań");
            System.out.println("3. Usuń danie");
            System.out.println("4. Oblicz rachunek");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    dodajDanie();
                    break;
                case "2":
                    wyswietlKarte();
                    break;
                case "3":
                    usunDanie();
                    break;
                case "4":
                    obliczRachunek();
                    break;
                case "5":
                    dziala = false;
                    System.out.println("Zakończono program.");
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
            }
        }
    }

    private static void dodajDanie() {
        System.out.print("Podaj nazwę dania: ");
        String nazwa = scanner.nextLine();

        if (menu.containsKey(nazwa)) {
            System.out.println("To danie już znajduje się w karcie.");
            return;
        }

        System.out.print("Podaj cenę: ");
        try {
            double cena = Double.parseDouble(scanner.nextLine());
            menu.put(nazwa, cena);
            System.out.println("Danie dodane.");
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawna cena.");
        }
    }

    private static void wyswietlKarte() {
        if (menu.isEmpty()) {
            System.out.println("Karta dań jest pusta.");
            return;
        }

        System.out.println("\n--- KARTA DAŃ ---");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.printf("%s - %.2f zł\n", entry.getKey(), entry.getValue());
        }
    }

    private static void usunDanie() {
        System.out.print("Podaj nazwę dania do usunięcia: ");
        String nazwa = scanner.nextLine();

        if (menu.remove(nazwa) != null) {
            System.out.println("Danie usunięte.");
        } else {
            System.out.println("Nie znaleziono takiego dania.");
        }
    }

    private static void obliczRachunek() {
        List<String> zamowienie = new ArrayList<>();
        double suma = 0.0;

        System.out.println("Wpisuj nazwy dań, które chcesz zamówić (wpisz 'koniec' aby zakończyć):");

        while (true) {
            System.out.print("Danie: ");
            String danie = scanner.nextLine();

            if (danie.equalsIgnoreCase("koniec")) {
                break;
            }

            if (menu.containsKey(danie)) {
                zamowienie.add(danie);
                suma += menu.get(danie);
            } else {
                System.out.println("Takie danie nie istnieje w karcie.");
            }
        }

        System.out.println("\n--- RACHUNEK ---");
        for (String danie : zamowienie) {
            System.out.printf("%s - %.2f zł\n", danie, menu.get(danie));
        }
        System.out.printf("RAZEM: %.2f zł\n", suma);
    }
}

