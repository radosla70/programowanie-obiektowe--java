public class Klient {
    private String imieinazwisko;
    private String email;

    public Klient(String email, String imieinazwisko) {
        this.email = email;
        this.imieinazwisko = imieinazwisko;
    }

    public String getImieinazwisko() {
        return imieinazwisko;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return imieinazwisko + "("+ email+")";
    }
}
