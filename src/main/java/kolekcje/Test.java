package kolekcje;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> lista;
        lista = new ArrayList<>();
        lista = new LinkedList<>();


        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        //3
        //2
        //1


        String pop = stack.pop();
//        stack.peek()
        System.out.println(pop);


        Queue<String> queue = new ArrayDeque<>();

        queue.add("Mateusz");


        Map<String, String> mapa = new HashMap<>();
        mapa.put("jakisKlucz", "jakasWartosc");

//        String wartosc = mapa.get("jakisKlucz");

//        System.out.println(wartosc);


        List<String> listaKluczyDlaKtorychWartosciSiePowtarzaly = new ArrayList<>();
        String powtarzajacaSie = "jakasWartosc";
        for (String s : mapa.keySet()) {
            String wartosc = mapa.get(s);
            if (wartosc.equals(powtarzajacaSie)) {
                listaKluczyDlaKtorychWartosciSiePowtarzaly.add(s);
            }

        }


        Set<String> zbior = new HashSet<>();
        zbior.add("mateusz");
        zbior.add("mateusz");

        System.out.println(zbior.size());


        boolean string = "String".equals(new String("String"));


        //

        Map<String, String> posortowanaMapa = new TreeMap<>(Comparator.reverseOrder());

        posortowanaMapa.put("1", "jeden");

        posortowanaMapa.put("3", "trzy");

        posortowanaMapa.put("2", "dwa");

        System.out.println(posortowanaMapa.keySet());



    }


}
