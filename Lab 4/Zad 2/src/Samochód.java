import java.util.Scanner;

public class Samochód {
    protected String marka;
    protected String model;
    protected String nadwozie;
    protected String kolor;
    protected int rokProdukcji;
    protected int przebieg;

    public Samochód(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        setPrzebieg(przebieg);
    }

    public Samochód() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Marka: ");
        marka = scanner.nextLine();

        System.out.print("Model: ");
        model = scanner.nextLine();

        System.out.print("Nadwozie: ");
        nadwozie = scanner.nextLine();

        System.out.print("Kolor: ");
        kolor = scanner.nextLine();

        System.out.print("Rok produkcji: ");
        rokProdukcji = scanner.nextInt();

        int przebiegInput;
        do {
            System.out.print("Przebieg (km, >=0): ");
            przebiegInput = scanner.nextInt();
        } while (przebiegInput < 0);
        przebieg = przebiegInput;
    }

    private void setPrzebieg(int przebieg) {
        if (przebieg >= 0) {
            this.przebieg = przebieg;
        } else {
            this.przebieg = 0;
        }
    }

    public void Informacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Nadwozie: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }
}
