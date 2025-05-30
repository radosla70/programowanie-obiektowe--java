//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst do analizy:");
        String tekst = scanner.nextLine();

        tekst = tekst.replaceAll("[\\p{Punct}]", "").toLowerCase();

        String[] slowa = tekst.split("\\s+");

        Map<String, Integer> mapaSlow = new HashMap<>();

        for (String slowo : slowa) {
            if (!slowo.isEmpty()) {
                mapaSlow.put(slowo, mapaSlow.getOrDefault(slowo, 0) + 1);
            }
        }

        System.out.println("\nLiczba wystąpień słów:");
        for (Map.Entry<String, Integer> entry : mapaSlow.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
