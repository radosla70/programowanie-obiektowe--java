public class Student {
    osoba person;
    private int nrAlbumu;
    private String kierunek;
    private String specjalnosc;
    private int rokStudiów;


    public Student(int nrAlbumu, String kierunek, String specjalnosc, int rokStudiów) {
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.rokStudiów = rokStudiów;
    }

    public Student(osoba person, int rokStudiów, String specjalnosc, String kierunek, int nrAlbumu) {
        this.person = person;
        this.rokStudiów = rokStudiów;
        this.specjalnosc = specjalnosc;
        this.kierunek = kierunek;
        this.nrAlbumu = nrAlbumu;
    }

    public Student(osoba person, int nrAlbumu, String kierunek) {
        this.person = person;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }

    public Student(osoba person, String kierunek, String specjalnosc) {
        this.person = person;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
    }


    public void viewData(){
        System.out.println("osoba: "+person
                +"\trok studiów:"+rokStudiów+
                "\tspecjalność:"+specjalnosc+"\tkierunek:"+kierunek+"\tnrAlbumu:"+nrAlbumu);
}}
