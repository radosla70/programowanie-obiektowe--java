// Zdefiniowany wyjątek typu Checked
class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}

public class Main {

    // Metoda obliczająca silnię
    public static long obliczSilnie(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Nie można obliczyć silni z liczby ujemnej.");
        }

        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }

        return wynik;
    }

    // Metoda main
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Podaj liczbę do obliczenia silni: ");

        try {
            int liczba = Integer.parseInt(scanner.nextLine());
            long silnia = obliczSilnie(liczba);
            System.out.println("Silnia z " + liczba + " to: " + silnia);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Wprowadzono niepoprawny format liczby.");
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}