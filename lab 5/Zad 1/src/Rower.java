public class Rower extends Pojazd {

    public Rower(String id, double cenaZaGodzine) {
        super(id, cenaZaGodzine);
    }

    @Override
    public void info() {
        System.out.println("Rower o ID: " + getId() + ", Cena za godzinę: " + obliczKoszt(1));
    }
}
