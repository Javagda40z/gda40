package adnotacje;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Application {


    @SuperMetoda
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        List undefinedList = new ArrayList();
//        integerList = (List<Integer>) undefinedList;


        System.out.println(KlasaTestowa.class.getSimpleName());
        System.out.println(KlasaTestowa.class.getDeclaredAnnotations());

        for (Annotation declaredAnnotation : KlasaTestowa.class.getDeclaredAnnotations()) {

            Class<? extends Annotation> annotation = declaredAnnotation.annotationType();
            System.out.println(annotation);

            for (Method method : annotation.getMethods()) {
                System.out.println(method.getName());
            }

        }

    }
}
