public abstract class Pojazd {
    private String id;
    private boolean dostepny;
    private double cenaZaGodzine;

    public Pojazd(String id, double cenaZaGodzine) {
        this.id = id;
        this.cenaZaGodzine = cenaZaGodzine;
        this.dostepny = true; // Domyślnie pojazd jest dostępny
    }

    public String getId() {
        return id;
    }

    public boolean isDostepny() {
        return dostepny;
    }

    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println("Pojazd " + id + " został wypożyczony.");
        } else {
            System.out.println("Pojazd " + id + " nie jest dostępny.");
        }
    }

    public void zwroc() {
        dostepny = true;
        System.out.println("Pojazd " + id + " został zwrócony.");
    }

    public double obliczKoszt(int godziny) {
        return godziny * cenaZaGodzine;
    }

    public abstract void info();
}
