public class Samochod extends Pojazd {

    public Samochod(String id, double cenaZaGodzine) {
        super(id, cenaZaGodzine);
    }

    @Override
    public void info() {
        System.out.println("Samochód o ID: " + getId() + ", Cena za godzinę: " + obliczKoszt(1));
    }
}
