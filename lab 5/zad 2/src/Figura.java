public abstract class Figura {
    protected String name;
    public void view(){
        System.out.println("Figura o nazwie: "+ name+"\nPole: "+ Pole()+ "\nObwód: "+ Obwod());
    }
    public abstract double Pole();
    public abstract double Obwod();

    public Figura(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
