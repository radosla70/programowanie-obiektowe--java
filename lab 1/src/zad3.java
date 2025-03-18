import java.util.Scanner;

public class zad3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaParzystych = 0;
        System.out.print("Podaj liczbę graniczną n:");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sumaParzystych += i;
            } else if (i % 2 == 1) {

            }}
        System.out.println("Suma liczb parzystych: " + sumaParzystych);
        scanner.close();

    }}