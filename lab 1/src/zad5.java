import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = scanner.nextLine();
        slowo = slowo.replaceAll("\\s+", "").toLowerCase();
        boolean Palindrom = true;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                Palindrom = false;
                break;
            }
        }
        if (Palindrom) {
            System.out.println("Słowo jest palindromem.");
        } else {
            System.out.println("Słowo nie jest palindromem.");
        }

        scanner.close();
    }
}