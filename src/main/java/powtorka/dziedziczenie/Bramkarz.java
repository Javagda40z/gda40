package powtorka.dziedziczenie;

public class Bramkarz extends Zawodnik implements Sprinter {
    public void bron() {
        System.out.println("BRONIE!");
    }

    @Override
    public void kopnij() {
        System.out.println("WYKOP A NIE KOPNIJ");
    }

    @Override
    public void sprint() {
        System.out.println("Lekki sprint");
    }
}
