package kolekcje;

public class Gracz implements Comparable<Gracz> {

    private int iloscPunktow;
    private String imie;


    public Gracz(int iloscPunktow, String imie) {
        this.iloscPunktow = iloscPunktow;
        this.imie = imie;
    }

    public int getIloscPunktow() {
        return iloscPunktow;
    }

    public void setIloscPunktow(int iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Gracz{" +
                "ranking=" + iloscPunktow +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gracz inny) {

        // a-b
        // a-b = 0 to znaczy ze sa rowne
        // a-b = -1 to znaczy ze b jest wieksze
        // a-b = 1 to znaczy ze a jest wieksze
        // this - inny
        // >= 1
        // = 0
        // <= -1
        return this.iloscPunktow - inny.iloscPunktow;
    }
}
