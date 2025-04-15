// Checked Exception
class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}

// Klasa Adres z walidacją danych w konstruktorze
class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto)
            throws NieprawidlowyAdresException {

        StringBuilder blad = new StringBuilder();

        if (ulica == null) {
            blad.append("Ulica nie może być nullem. ");
        }
        if (numerDomu <= 0) {
            blad.append("Numer domu musi być większy od zera. ");
        }
        if (kodPocztowy == null) {
            blad.append("Kod pocztowy nie może być nullem. ");
        }
        if (miasto == null) {
            blad.append("Miasto nie może być nullem.");
        }

        if (blad.length() > 0) {
            throw new NieprawidlowyAdresException(blad.toString().trim());
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return ulica + " " + numerDomu + ", " + kodPocztowy + " " + miasto;
    }
}

// Klasa z mainem
public class Main {
    public static void main(String[] args) {
        try {
            // Spróbuj stworzyć adres z błędnymi danymi
            Adres adres = new Adres(null, -5, null, null);
            System.out.println("Adres: " + adres);
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd przy tworzeniu adresu: " + e.getMessage());
        }
    }
}
