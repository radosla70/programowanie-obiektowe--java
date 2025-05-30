public class Main {
    public static void main(String[] args) {
        // Przykład użycia
        Swiatlo aktualneSwiatlo = Swiatlo.CZERWONE;
        System.out.println("Światło: " + aktualneSwiatlo);
        System.out.println("Komunikat: " + aktualneSwiatlo.getKomunikat());

        aktualneSwiatlo = Swiatlo.ZOLTE;
        System.out.println("\nŚwiatło: " + aktualneSwiatlo);
        System.out.println("Komunikat: " + aktualneSwiatlo.getKomunikat());

        aktualneSwiatlo = Swiatlo.ZIELONE;
        System.out.println("\nŚwiatło: " + aktualneSwiatlo);
        System.out.println("Komunikat: " + aktualneSwiatlo.getKomunikat());
    }
}

enum Swiatlo {
    CZERWONE {
        @Override
        public String getKomunikat() {
            return "Stój!";
        }
    },
    ZOLTE {
        @Override
        public String getKomunikat() {
            return "Uwaga!";
        }
    },
    ZIELONE {
        @Override
        public String getKomunikat() {
            return "Jedź!";
        }
    };

        public abstract String getKomunikat();
}