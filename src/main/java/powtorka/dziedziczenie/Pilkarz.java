package powtorka.dziedziczenie;

public class Pilkarz extends Zawodnik implements Sprinter {

    public void strzelajBramke() {
        System.out.println("Strzelam bramke!");
    }

    @Override
    public void kopnij() {
        System.out.println("KOPNIJ MOCNO");
    }

    @Override
    public void sprint() {
        System.out.println("Mocny sprint");
    }
}
