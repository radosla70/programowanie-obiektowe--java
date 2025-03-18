import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaDodatnich = 0,liczbaUjemnych = 0,sumaDodatnich = 0,sumaUjemnych = 0;
        System.out.print("Podaj dziesięć liczb\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Podaj liczbę " + i + ": ");
            int liczba = scanner.nextInt();


        if (liczba > 0) {
            liczbaDodatnich++;
            sumaDodatnich += liczba;
        } else if (liczba < 0) {
            liczbaUjemnych++;
            sumaUjemnych += liczba;
        }}
        System.out.println("Ilość liczb dodatnich: " + liczbaDodatnich);
        System.out.println("Suma liczb dodatnich: " + sumaDodatnich);
        System.out.println("Ilość liczb ujemnych: " + liczbaUjemnych);
        System.out.println("Suma liczb ujemnych: " + sumaUjemnych);
        scanner.close();

}}