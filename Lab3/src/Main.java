public class Main {
    public static void main(String[] args) {
        // zadanie 1
        osoba osoba= new osoba(24,"Jan","Nowak");
        osoba osoba1= new osoba("Janina",24);
        osoba osoba2= new osoba("Janusz",23);
        osoba.viewData();
        osoba1.viewData();
        osoba2.viewData();
        // zadanie 2
        Student student1= new Student(osoba,2,"Programowanie","Informatyka",12345);
        Student student2= new Student(12345,"informatyka","technologie mobilne",3);
        Student student3 = new Student(osoba2,75432,"Informatyka");
        Student student4= new Student(osoba1,"informatyka","aplikacje internatowe");
        student1.viewData();
        student2.viewData();
        student3.viewData();
        student4.viewData();
}}