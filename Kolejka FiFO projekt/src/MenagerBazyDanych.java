import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenagerBazyDanych {
    private Connection połączenie;

    public void DaneDoPołączenia() {
        String url = "jdbc:mysql://localhost:3306/zamowienia_db?serverTimezone=UTC";
        String użytkownik = "root";
        String hasło = "Test111@";

        try {
            połączenie = DriverManager.getConnection(url, użytkownik, hasło);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dodajZamówienie(Zamówienie zamowienie) {
        String sqlZamowienie = "INSERT INTO zamowienia (imie, email) VALUES (?, ?)";
        String sqlProdukt = "INSERT INTO produkty (nazwa, cena, zamowienie_id) VALUES (?, ?, ?)";

        try {
            połączenie.setAutoCommit(false);
            int zamowienieId;
            try (PreparedStatement pstmt = połączenie.prepareStatement(sqlZamowienie, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, zamowienie.getKlient().getImieinazwisko());
                pstmt.setString(2, zamowienie.getKlient().getEmail());
                pstmt.executeUpdate();

                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    zamowienieId = rs.getInt(1);
                } else {
                    połączenie.rollback();
                    return;
                }
            }

            try (PreparedStatement pstmt2 = połączenie.prepareStatement(sqlProdukt)) {
                for (Produkt p : zamowienie.getProdukty()) {
                    pstmt2.setString(1, p.getNazwa());
                    pstmt2.setDouble(2, p.getCena());
                    pstmt2.setInt(3, zamowienieId);
                    pstmt2.addBatch();
                }
                pstmt2.executeBatch();
            }

            połączenie.commit();
        } catch (SQLException e) {
            try {
                połączenie.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                połączenie.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public List<Zamówienie> pobierzZamówienia() {
        List<Zamówienie> zamowienia = new ArrayList<>();
        String sqlZamowienia = "SELECT * FROM zamowienia";
        String sqlProdukty = "SELECT * FROM produkty WHERE zamowienie_id = ?";

        try (Statement stmt = połączenie.createStatement();
             ResultSet rs = stmt.executeQuery(sqlZamowienia)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String imie = rs.getString("imie");
                String email = rs.getString("email");
                Klient klient = new Klient(email, imie);

                List<Produkt> produkty = new ArrayList<>();
                try (PreparedStatement pstmt = połączenie.prepareStatement(sqlProdukty)) {
                    pstmt.setInt(1, id);
                    ResultSet rsProdukty = pstmt.executeQuery();
                    while (rsProdukty.next()) {
                        String nazwa = rsProdukty.getString("nazwa");
                        double cena = rsProdukty.getDouble("cena");
                        produkty.add(new Produkt(nazwa, cena));
                    }
                }

                zamowienia.add(new Zamówienie(klient, produkty));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return zamowienia;
    }

}
