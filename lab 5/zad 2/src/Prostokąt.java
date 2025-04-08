public class Prostokąt extends Figura{
    public Prostoakt(String name) {
        super(name);
    }
    double a = 3, b= 5;

    @Override
    public double Pole() {
        return a*b;
    }

    @Override
    public double Obwod() {
        return (2*a)+(2*b);
    }
}
