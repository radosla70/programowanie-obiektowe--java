public enum PizzaSize {
    MALA(25) {
        @Override
        public double getCena() {
            return 20.0;
        }
    },
    SREDNIA(30) {
        @Override
        public double getCena() {
            return 30.0;
        }
    },
    DUZA(40) {
        @Override
        public double getCena() {
            return 40.0;
        }
    };

    private final int srednica;

    PizzaSize(int srednica) {
        this.srednica = srednica;
    }

    public int getSrednica() {
        return srednica;
    }

    public abstract double getCena();
}
