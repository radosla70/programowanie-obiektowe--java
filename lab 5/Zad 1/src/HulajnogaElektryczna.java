public class HulajnogaElektryczna extends Pojazd {

    public HulajnogaElektryczna(String id, double cenaZaGodzine) {
        super(id, cenaZaGodzine);
    }

    @Override
    public void info() {
        System.out.println("Hulajnoga elektryczna o ID: " + getId() + ", Cena za godzinę: " + obliczKoszt(1));
    }
}
