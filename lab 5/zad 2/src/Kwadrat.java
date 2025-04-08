public class Kwadrat extends Figura{
    double a = 2;

    public Kwadrat(String name) {
        super(name);
    }

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }
}

