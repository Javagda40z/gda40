package ludzie;

import java.util.ArrayList;
import java.util.List;

public class Czlowiek {

    private static List<Czlowiek> czlowieki = new ArrayList<>();

    private String imie;

//    public ludzie.Czlowiek(String imie) {
//        this.imie = imie;
//    }

    private Czlowiek() {

    }

    public void wypiszImie() {
        System.out.println(imie);
    }

    public static Czlowiek stworzCzlowieka(String imie) {

        if (czyTakiCzlowiekOTakimImieniuJuzIstnieje(imie)) {
            Czlowiek czlowiek = znajdzCzlowiekiaOImieniu(imie);
            return czlowiek;
        }
        Czlowiek czlowiek = new Czlowiek();
        czlowiek.imie = imie;
        czlowieki.add(czlowiek);
        return czlowiek;

    }

    private static Czlowiek znajdzCzlowiekiaOImieniu(String imie) {
        for (Czlowiek czlowiek : czlowieki) {
            if (imie.equals(czlowiek.imie)) {
                return czlowiek;
            }
        }
        return null;
    }

    public static boolean czyTakiCzlowiekOTakimImieniuJuzIstnieje(String imie) {

        for (Czlowiek czlowiek : czlowieki) {
            if (imie.equals(czlowiek.imie)) {
                return true;
            }
        }
        return false;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
//        throw new RuntimeException("NIE ROB!");
//        this.imie = imie;
    }

    public void gadaj() {

        System.out.println("gadam");

    }
    public void gadaj(String trescGadania) {

        System.out.println(trescGadania);

    }

    public void gadaj(String trescGadania, String trescGadania2) {

        System.out.println(trescGadania);
        System.out.println(trescGadania2);


    }
}
