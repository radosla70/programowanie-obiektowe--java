import java.util.*;

public class Main {
    // Mapa login -> hasło
    private static Map<String, String> uzytkownicy = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean dziala = true;

        while (dziala) {
            System.out.println("\nWybierz opcję:");
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Zaloguj się");
            System.out.println("3. Wyjście");
            System.out.print("Twój wybór: ");

            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    dodajUzytkownika();
                    break;
                case "2":
                    zaloguj();
                    break;
                case "3":
                    dziala = false;
                    System.out.println("Zakończono program.");
                    break;
                default:
                    System.out.println("Niepoprawna opcja. Spróbuj ponownie.");
            }
        }
    }

    private static void dodajUzytkownika() {
        System.out.print("Podaj login: ");
        String login = scanner.nextLine();

        if (uzytkownicy.containsKey(login)) {
            System.out.println("Użytkownik o takim loginie już istnieje.");
            return;
        }

        System.out.print("Podaj hasło: ");
        String haslo = scanner.nextLine();

        uzytkownicy.put(login, haslo);
        System.out.println("Użytkownik dodany pomyślnie.");
    }

    private static void zaloguj() {
        System.out.print("Login: ");
        String login = scanner.nextLine();

        System.out.print("Hasło: ");
        String haslo = scanner.nextLine();

        if (uzytkownicy.containsKey(login)) {
            String zapisaneHaslo = uzytkownicy.get(login);
            if (zapisaneHaslo.equals(haslo)) {
                System.out.println("Zalogowano pomyślnie!");
            } else {
                System.out.println("Błędne hasło.");
            }
        } else {
            System.out.println("Nie znaleziono użytkownika o podanym loginie.");
        }
    }
}
