import java.util.List;

public class Zamówienie
{
    private Klient klient;
    private List<Produkt> produkty;

    public Zamówienie(Klient klient, List<Produkt> produkty) {
        this.klient = klient;
        this.produkty = produkty;
    }

    public Klient getKlient() {
        return klient;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }
    @Override
    public String toString(){
        return "Zamówił:" +klient+ "\nProdukty:"+produkty;
    }
}
