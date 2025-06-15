import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI extends JFrame {
    private JPanel panel1;
    private JButton pobierzZamówienieButton;
    private JButton dodajZamówienieButton;
    private JTextArea textArea1;
    private JButton pokażklientówButton;
    protected KolejkaZamówień kolejkaZamówień;
    private MenagerBazyDanych db;


    public GUI() {
        super("Kolejka FIFO ");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        this.kolejkaZamówień = new KolejkaZamówień();
        this.db = new MenagerBazyDanych();
        db.DaneDoPołączenia();

        pobierzZamówienieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pobierzZamówienie();
            }
        });

        dodajZamówienieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajZamówienie();
            }
        });

        pokażklientówButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokażklientów();
            }
        });
    }

    ;

    public void dodajZamówienie() {
        String imieinazwisko = JOptionPane.showInputDialog("Podaj imię i nazwisko klienta:");
        String email = JOptionPane.showInputDialog("Podaj e-mail klienta:");
        Klient klient = new Klient(email, imieinazwisko);
        int ilość = Integer.parseInt(JOptionPane.showInputDialog("Ile produktów klient kupił"));
        List<Produkt> produkty = new ArrayList<>();
        for(int i = 0; i < ilość; i++) {

            produkty.add(new Produkt(JOptionPane.showInputDialog("Jaki produkt klient kupił"), Double.parseDouble(JOptionPane.showInputDialog("Ile ten produkt kosztował"))));
        }

        Zamówienie zamówienie = new Zamówienie(klient, produkty);
        kolejkaZamówień.dodajZamówienie(zamówienie);
        textArea1.append("Dodano: " + zamówienie + "\n");
        db.dodajZamówienie(zamówienie);
    }

    public void pobierzZamówienie() {
        Zamówienie zamówienie = kolejkaZamówień.pobierzZamówienie();
        if (zamówienie != null) {
            textArea1.append("Zrealizowano: " + zamówienie + "\n");
        } else {
            textArea1.append("Brak zamówień w kolejce!\n");
        }
    }

    public void pokażklientów() {
        List<Zamówienie> zamowienia = db.pobierzZamówienia();
        if (zamowienia.isEmpty()) {
            textArea1.append("Brak zapisanych klientów w bazie.\n");
        } else {
            textArea1.append("Lista klientów z bazy:\n");
            for (Zamówienie z : zamowienia) {
                textArea1.append(z.toString() + "\n");
            }
            textArea1.append("-------------------------\n");
        }
    }
}




