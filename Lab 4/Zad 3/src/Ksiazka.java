import java.util.*;


class Ksiazka {
    protected String tytul;
    protected String autor;
    protected double cena;

    public Ksiazka(String tytul, String autor, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    public void wypiszInformacje() {
        System.out.println("Tytuł: " + tytul + ", Autor: " + autor + ", Cena: " + cena + " zł");
    }
}

class Podrecznik extends Ksiazka {
    protected String przedmiot;

    public Podrecznik(String tytul, String autor, double cena, String przedmiot) {
        super(tytul, autor, cena);
        this.przedmiot = przedmiot;
    }

    @Override
    public void wypiszInformacje() {
        super.wypiszInformacje();
        System.out.println("Przedmiot: " + this.przedmiot);
    }
}

class Powiesc extends Ksiazka {
    protected String gatunek;

    public Powiesc(String tytul, String autor, double cena, String gatunek) {
        super(tytul, autor, cena);
        this.gatunek = gatunek;
    }

    @Override
    public void wypiszInformacje() {
        super.wypiszInformacje();
        System.out.println("Gatunek: " + this.gatunek);
    }
}

class Klient {
    private String imie;
    private List<Ksiazka> kupioneKsiazki = new ArrayList<>();

    public Klient(String imie) {
        this.imie = imie;
    }

    public void kupKsiazke(Ksiazka ksiazka) {
        System.out.println(this.imie + " kupuje książkę:");
        ksiazka.wypiszInformacje();
        kupioneKsiazki.add(ksiazka);
    }

    public void pokazZakupy() {
        System.out.println("\n" + imie + " kupił(a):");
        for (Ksiazka k : kupioneKsiazki) {
            k.wypiszInformacje();
        }
    }
}


class Ksiegarnia {
    private List<Ksiazka> dostepneKsiazki = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();

    public void dodajKsiazke(Ksiazka ksiazka) {
        dostepneKsiazki.add(ksiazka);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void pokazKsiazki() {
        System.out.println("\nDostępne książki w księgarni:");
        for (Ksiazka k : dostepneKsiazki) {
            k.wypiszInformacje();
        }
    }

    public void sprzedajKsiazke(Klient klient, int index) {
        if (index >= 0 && index < dostepneKsiazki.size()) {
            Ksiazka ksiazka = dostepneKsiazki.get(index);
            klient.kupKsiazke(ksiazka);

            // Rzutowanie przy sprawdzaniu typu książki
            if (ksiazka instanceof Powiesc) {
                Powiesc p = (Powiesc) ksiazka;
                System.out.println("Sprzedano powieść z gatunku: " + p.gatunek);
            } else if (ksiazka instanceof Podrecznik) {
                Podrecznik p = (Podrecznik) ksiazka;
                System.out.println("Sprzedano podręcznik do: " + p.przedmiot);
            }

            dostepneKsiazki.remove(index);
        } else {
            System.out.println("Niepoprawny indeks książki.");
        }
    }
}
