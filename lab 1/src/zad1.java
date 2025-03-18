//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę studentów: ");
        int n = scanner.nextInt();

        int sumaPunktow = 0;
        int licznik = 1;

        while (licznik <= n) {
            System.out.print("Podaj punkty dla studenta " + licznik + ": ");
            int punkty = scanner.nextInt();
            sumaPunktow += punkty;  // Dodaj punkty do sumy
            licznik++;
        }

        double srednia = (double) sumaPunktow / n;

        System.out.println("Średnia liczba punktów w grupie to: " + srednia);

        scanner.close();
    }
}