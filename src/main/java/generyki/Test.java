package generyki;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        List lista = new ArrayList();
        lista.add("napis");
        lista.add(123);

        for (Object element : lista) {
            System.out.println(((String) element).length());

        }

        List<String> listaZGenerykiem = new ArrayList<String>();
        listaZGenerykiem.add("napis");
//        listaZGenerykiem.add(123);

        for (String element : listaZGenerykiem) {
            System.out.println(element.length());
        }


    }
}
