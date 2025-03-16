import java.util.Scanner;
public class Scan {

    Scanner scanner = new Scanner(System.in);

   

    String ImieiNazwisko = scanner.nextLine();

    String nrAlbumu = scanner.nextLine();
    String rokStudiów = scanner.nextLine();
    String specjalnosc = scanner.nextLine();
    String kierunek = scanner.nextLine();

    Student student = new Student(ImieiNazwisko, nrAlbumu);


    public void viewData(){
        System.out.println("osoba: "+ImieiNazwisko
                +"\trok studiów:"+rokStudiów+
                "\tspecjalność:"+specjalnosc+"\tkierunek:"+kierunek+"\tnrAlbumu:"+nrAlbumu);;

    }}

