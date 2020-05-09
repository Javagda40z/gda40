package powtorka.dziedziczenie;

public class Kalkulator {

    public int potegowanie(int podstawa, int potega) {
        int wynik = podstawa;
        for (int i = 0; i < potega; i++) {
            wynik = mnozenie(wynik,podstawa);
        }

        return wynik;
    }

    private int mnozenie(int a, int b) {
        return a * b;
    }
}
