public class Figura2D implements FiguraGeometryczna, interf1,sa,a,a,a{

    double a=3;

    @Override
    public double Pole() {
        return a*a;
    }

    @Override
    public double Obwod() {
        return 4*a;
    }
}
