public class Main {
    public static void main(String[] args) {
        Wypożyczalnia wypozyczalnia = new Wypożyczalnia();

        Pojazd samochod = new Samochod("S123", 50);
        Pojazd rower = new Rower("R456", 10);
        Pojazd hulajnoga = new HulajnogaElektryczna("H789", 20);

        wypozyczalnia.dodajPojazd(samochod);
        wypozyczalnia.dodajPojazd(rower);
        wypozyczalnia.dodajPojazd(hulajnoga);

        wypozyczalnia.wypozyczPojazd("S123");

        wypozyczalnia.obliczKosztWynajmu("R456", 3);

        wypozyczalnia.zwrocPojazd("S123");

        wypozyczalnia.wyswietlPojazdy();
    }
}
