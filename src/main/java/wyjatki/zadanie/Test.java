package wyjatki.zadanie;

public class Test {

    public static void main(String[] args) {
        Shop shop = new Shop(2);
        Person pelnoletni = new Person(20);
        Person niepelnoletni = new Person(15);

        try {
            shop.sellVodka(pelnoletni);
            shop.sellVodka(niepelnoletni);
            //
            //
            shop.sellVodka(pelnoletni);
            shop.sellVodka(pelnoletni);
        } catch (InvalidAgeException e) {
            System.out.println("Wykop ze sklepu");
        } catch (NoVodkaException e) {
            System.out.println("Przepraszamy, dostawa niedlugo");
        }
    }
}
