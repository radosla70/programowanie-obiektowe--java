public class osoba {
    private  String firstname, lastname;
    private int age;

    public osoba(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public osoba(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }
public void viewData(){
        System.out.println("Imie: "+firstname
        +"\tNazwisko:"+lastname+
                "\tWiek:"+age);
}
}
