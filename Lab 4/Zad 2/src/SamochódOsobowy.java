import java.util.Scanner;

public class SamochódOsobowy extends Samochód {
    private double waga;
    private double pojemnoscSilnika;
    private int iloscOsob;


    public SamochódOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Waga (2.0 - 4.5 t): ");
            waga = scanner.nextDouble();
        } while (waga < 2.0 || waga > 4.5);

        do {
            System.out.print("Pojemność silnika (0.8 - 3.0 l): ");
            pojemnoscSilnika = scanner.nextDouble();
        } while (pojemnoscSilnika < 0.8 || pojemnoscSilnika > 3.0);

        System.out.print("Ilość osób: ");
        iloscOsob = scanner.nextInt();
    }

    @Override
    public void Informacje() {
        super.Informacje();
        System.out.println("Waga: " + waga + " t");
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " l");
        System.out.println("Ilość osób: " + iloscOsob);
    }
}
