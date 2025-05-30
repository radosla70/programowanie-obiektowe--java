//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println("Rozmiar: " + size);
            System.out.println("Średnica: " + size.getSrednica() + " cm");
            System.out.println("Cena: " + size.getCena() + " zł\n");
        }
    }
}
