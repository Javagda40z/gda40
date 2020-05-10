package generyki;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestMieszkancow {

    public static void main(String[] args) {
//        Miasto miasto = new Miasto("cokolwiek");
//        List<Mieszkaniec> mieszkaniecList = new ArrayList<>();
//        Mieszkaniec mieszkaniec = new Mieszkaniec();
//        mieszkaniec.setId(1);
//        mieszkaniec.setImie("Mateusz");
//        Mieszkaniec mieszkaniec1 = new Mieszkaniec();
//        mieszkaniec1.setId(2);
//        mieszkaniec1.setImie("Adam");
//        mieszkaniecList.add(mieszkaniec);
//        mieszkaniecList.add(mieszkaniec1);
//        miasto.setMieszkancy(mieszkaniecList);
//
//
////        Miasto gdansk = new Miasto("Gdansk");
////        Miasto gdynia = new Miasto("Gdynia");
//
//        Gdanszczanin gdanszczanin = new Gdanszczanin();
//        mieszkaniecList.add(gdanszczanin);
//
//        Miasto<Gdanszczanin> gdansk = new Miasto<Gdanszczanin>("Gdansk");
//
//        Miasto<Gdynianin> gdynia = new Miasto<Gdynianin>("Gdynia");
//
////        Miasto<Object> miastoObiektow = new Miasto<>("Obiekty");
////
////        Miasto<String> miastoString = new Miasto<>("miastoStringow");
//
//
//
//
//
//        List<String> listaStringow = new ArrayList<>();
//        List list = new ArrayList();
//
//
//        listaStringow.add("tekst");
////        list.
//

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.2);
        doubles.add(1.3);

        System.out.println(sum(doubles));

        List<Integer> integers = Arrays.asList(1,2,3,4);

        sum(integers);

        sum(Arrays.asList(1,2,3,4));


        List<Mieszkaniec> lista = new ArrayList<>();
        List<Gdanszczanin> gdanszczanins = new ArrayList<>();

        test(lista);
//        test(gdanszczanins);



    }

    private static void test(List<? super Mieszkaniec> mieszkancy) {


    }

    private static double sum(List<? extends Number> doubles) {
        double sum = 0.0;
        for (Number liczba : doubles) {
            sum+=liczba.doubleValue();
        }
        return sum;
    }


}
