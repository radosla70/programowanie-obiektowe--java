import java.util.LinkedList;

public class KolejkaZamówień {
    private LinkedList<Zamówienie> kolejka = new LinkedList<>();
    public void dodajZamówienie(Zamówienie zamówienie){
            kolejka.addLast(zamówienie);
    }
    public Zamówienie pobierzZamówienie(){
        return kolejka.pollFirst();
    }
    public boolean isEmpty(){

        return kolejka.isEmpty();
    }


}
