package funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {


        Czlowiek czlowiek = new Czlowiek(20, "Mateusz");
        Czlowiek czlowiek1 = new Czlowiek(15, "Adam");
        Czlowiek czlowiek2 = new Czlowiek(19, "JakiesImie");


        Checker checker = czl -> {
            return true;
        };


        List<Czlowiek> czlowieki = Arrays.asList(czlowiek, czlowiek1, czlowiek2);


        List<String> listaImion = czlowieki.stream().map(czl1 -> {
            return czl1.getImie();
        }).collect(Collectors.toList());


        List<String> listaImion2 = czlowieki.stream().map(Czlowiek::getImie).collect(Collectors.toList());


        listaImion.forEach(imie -> System.out.println(imie));


//
//        System.out.println(listaImion);


        czlowieki.forEach(p -> System.out.println(p.getImie()));
        czlowieki.forEach(System.out::println);

        for (Czlowiek czlowiek3 : czlowieki) {
            System.out.println(czlowiek3.getImie());
        }


//        drukuj(czlowieki, czl -> {
//            return czl.getAge() >= 18;
//        });
//

//        czlowieki.stream()
//                .filter(p -> p.getAge() >= 18)
//                .filter(p -> p.getAge() < 30).map(p-> p.getImie())

//                .forEach(p -> System.out.println(p));


        // a -> {  }
//
//        Checker ageChecker = czlowiek4 -> {return true;};
//
//        drukuj(czlowieki, czlowiek3 -> {return false;});
//
//
//
//
//        drukuj(czlowieki, czlowiek4 -> {System.out.println(czlowiek4); return czlowiek4.getAge() > 18;});


        Optional<Czlowiek> mateusz = czlowieki.stream().filter(czlowiek3 -> czlowiek3.getImie().equals("Mateusz")).findFirst();

        if (mateusz.isPresent()) {
            System.out.println(mateusz.get());
        }
        mateusz.orElse(new Czlowiek(1, "Mateusz"));




    }


    public static void drukuj(List<Czlowiek> czlowieki, Predicate<Czlowiek> checker) {
        for (Czlowiek czlowiek : czlowieki) {
            if (checker.test(czlowiek)) {
                System.out.println(czlowiek.getImie());
            }
        }

    }


}
