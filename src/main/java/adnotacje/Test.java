package adnotacje;

public class Test {

    private String zmienna;

    public Test() {
        zmienna = "tekst";
    }

    public void method1() {
        System.out.println("To jest tresc zmiennej zmienna: " + zmienna);
    }

    private void method2() {
        System.out.println("Prywatna metoda");
    }

    public void method3(int n) {
        System.out.println("Metoda z intem : " + n);
    }
}
