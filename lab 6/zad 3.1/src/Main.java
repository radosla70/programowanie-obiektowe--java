import java.util.*;

public class Main {

    // Metoda do filtrowania niepełnoletnich uczestników
    public static List<Uczestnik> filtrujNiepelnoletnich(List<Uczestnik> uczestnicy) {
        List<Uczestnik> niepelnoletni = new ArrayList<>();
        for (Uczestnik u : uczestnicy) {
            if (u.getWiek() < 18) {
                niepelnoletni.add(u);
            }
        }
        return niepelnoletni;
    }

    public static void main(String[] args) {
        Scanner uczestnicy = new Scanner(System.in);
        // Użycie ArrayList
        System.out.println("Podaj uczestników");
        List<Uczestnik> uczestnicyArrayList = new ArrayList<>();
        uczestnicyArrayList.add(new Uczestnik(uczestnicy.nextInt(),uczestnicy.next(),uczestnicy.nextInt()));
        uczestnicyArrayList.add(new Uczestnik(uczestnicy.nextInt(),uczestnicy.next(),uczestnicy.nextInt()));
        uczestnicyArrayList.add(new Uczestnik(uczestnicy.nextInt(),uczestnicy.next(),uczestnicy.nextInt()));

        // Użycie LinkedList
        List<Uczestnik> uczestnicyLinkedList = new LinkedList<>();
        uczestnicyLinkedList.addAll(uczestnicyArrayList);  // Kopiujemy tych samych

        System.out.println("Wszyscy uczestnicy (ArrayList):");
        for (Uczestnik u : uczestnicyArrayList) {
            System.out.println(u);
        }

        System.out.println("\nNiepełnoletni uczestnicy (LinkedList):");
        List<Uczestnik> niepelnoletni = filtrujNiepelnoletnich(uczestnicyLinkedList);
        for (Uczestnik u : niepelnoletni) {
            System.out.println(u);
        }
    }
}