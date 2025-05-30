public class Main {
    public static void main(String[] args) {
        System.out.println("Tworzenie samochodu osobowego:");
        SamochódOsobowy osobowy = new SamochódOsobowy();

        System.out.println("\nTworzenie samochodu (konstruktor bez parametrów):");
        Samochód samochod1 = new Samochód();

        System.out.println("\nTworzenie samochodu (konstruktor z parametrami):");
        Samochód samochod2 = new Samochód("Toyota", "Corolla", "Sedan", "Srebrny", 2015, 150000);

        System.out.println("\n--- Samochód osobowy ---");
        osobowy.Informacje();

        System.out.println("\n--- Samochód 1 ---");
        samochod1.Informacje();

        System.out.println("\n--- Samochód 2 ---");
        samochod2.Informacje();
    }
}
