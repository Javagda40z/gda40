package powtorka.dziedziczenie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boisko {

    public static void main(String[] args) {
        Bramkarz bramkarz = new Bramkarz();
        Pilkarz pilkarz = new Pilkarz();
//        Zawodnik zawodnik = new Zawodnik();

        Zawodnik bramkarz1 = new Bramkarz();
        Zawodnik pilkarz1 = new Pilkarz();


//        Bramkarz bramkarz2 = (Bramkarz)bramkarz1;
//        bramkarz2.bron();
//
//        Bramkarz bramkarz3 = (Bramkarz) pilkarz1;
//        bramkarz3.bron();

        bramkarz1.kopnij();
        pilkarz1.kopnij();



        Sprinter bramkarzSprinter = new Bramkarz();
        Sprinter pilkarzSprinter = new Pilkarz();

        niechWszyscySprinterzyBiegajaSprintem(Arrays.asList(bramkarzSprinter, pilkarzSprinter));

        List<Bramkarz> bramkarzList = Arrays.asList(bramkarz);
//        niechWszyscySprinterzyBiegajaSprintem(bramkarzList);
//        niechWszyscySprinterzyBiegajaSprintem(Arrays.asList(bramkarz));



    }

    public static void niechWszyscySprinterzyBiegajaSprintem(List<Sprinter> sprinterList) {

        for (Sprinter sprinter : sprinterList) {
            sprinter.sprint();
        }

    }

}
