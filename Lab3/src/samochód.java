public class samochód {
    private String marka, model;
    private int rok;
    private float przebieg, prędkość;

    public samochód() {
        this.prędkość = prędkość;
        this.przebieg = przebieg;
        this.rok = rok;
        this.marka = marka;
        this.model = model;
    }
    public samochód( samochód samochodInny){
        this.marka = samochodInny.marka;
        this.model = samochodInny.model;
        this.rok = samochodInny.rok;
        this.przebieg = samochodInny.przebieg;
        this.prędkość= samochodInny.prędkość;

    }
    public float getPrędkość() {
        return prędkość;
    }

    public void setPrędkość(float prędkość) {
        this.prędkość = prędkość;
    }

    public String getMarka() {
        return marka;
    }


    public String getModel() {
        return model;
    }


    public int getRok() {
        return rok;
    }


    public float getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(float przebieg) {
        this.przebieg = przebieg;
    }

    public void View(){
    System.out.println("Samochód:\n"+
            "marka:"+ marka+ "model:"
    +model+ "rok produkcji:"+rok
    +"przebieg:"+przebieg);
}

    public samochód(String marka, String model, int rok, float przebieg, float prędkość) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.prędkość = prędkość;
    }

    public samochód(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }

    public float przyśpiesz(float value){
    return prędkość+=value;
}

    @Override
    public String toString() {
        return "samochód{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok=" + rok +
                ", przebieg=" + przebieg +
                ", prędkość=" + prędkość +
                '}';
    }
}