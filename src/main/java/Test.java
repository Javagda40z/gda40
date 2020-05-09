import ludzie.Czlowiek;

public class Test {

    public static void main(String[] args) {

//        ludzie.Czlowiek czlowiek = new ludzie.Czlowiek();
//        czlowiek.imie = "Mateusz";
//        czlowiek.wypiszImie();
//        ludzie.Czlowiek czlowiek1 = new ludzie.Czlowiek("Mateusz");
//        czlowiek1.wypiszImie();
//        ludzie.Czlowiek.zrobCos();

        Czlowiek czlowiek = Czlowiek.stworzCzlowieka("Mateusz");

        Czlowiek czlowiek1 = Czlowiek.stworzCzlowieka("Mateusz");

        Czlowiek czlowiek2 = Czlowiek.stworzCzlowieka("Mateusz");

        Czlowiek czlowiek3 = Czlowiek.stworzCzlowieka("Mateusz2");

        czlowiek.setImie("x");

        System.out.println(czlowiek.getImie());
        System.out.println(czlowiek1.getImie());
        System.out.println(czlowiek2.getImie());
        System.out.println(czlowiek3.getImie());

        czlowiek.gadaj();
        czlowiek.gadaj("Gadam o czyms");
        czlowiek.gadaj("Gadam o czyms", "Gadam jeszcze o czyms");

    }

}
