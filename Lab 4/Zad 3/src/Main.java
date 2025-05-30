public class Main {
    public static void main(String[] args) {
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        Ksiazka k1 = new Powiesc("Wiedźmin", "Andrzej Sapkowski", 39.99, "Fantasy");
        Ksiazka k2 = new Podrecznik("Matematyka 1", "Nowak", 29.99, "Matematyka");

        ksiegarnia.dodajKsiazke(k1);
        ksiegarnia.dodajKsiazke(k2);

        Klient klient = new Klient("Anna");
        ksiegarnia.dodajKlienta(klient);

        ksiegarnia.pokazKsiazki();

        ksiegarnia.sprzedajKsiazke(klient, 0);
        klient.pokazZakupy();
    }
}
