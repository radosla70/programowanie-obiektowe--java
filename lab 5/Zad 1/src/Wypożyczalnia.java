import java.util.ArrayList;

public class Wypożyczalnia {

    private ArrayList<Pojazd> pojazdy;

    public Wypożyczalnia() {
        pojazdy = new ArrayList<>();
    }

    public void dodajPojazd(Pojazd pojazd) {
        pojazdy.add(pojazd);
        System.out.println("Dodano pojazd: " + pojazd.getId());
    }

    public void wypozyczPojazd(String id) {
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(id)) {
                p.wypozycz();
                return;
            }
        }
        System.out.println("Pojazd o ID " + id + " nie został znaleziony.");
    }

    public void zwrocPojazd(String id) {
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(id)) {
                p.zwroc();
                return;
            }
        }
        System.out.println("Pojazd o ID " + id + " nie został znaleziony.");
    }

    public void obliczKosztWynajmu(String id, int godziny) {
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(id)) {
                double koszt = p.obliczKoszt(godziny);
                System.out.println("Koszt wynajmu pojazdu o ID " + id + " przez " + godziny + " godziny: " + koszt);
                return;
            }
        }
        System.out.println("Pojazd o ID " + id + " nie został znaleziony.");
    }

    public void wyswietlPojazdy() {
        for (Pojazd p : pojazdy) {
            p.info();
        }
    }
}
