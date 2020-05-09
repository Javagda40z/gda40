package wyjatki;

import java.io.IOException;

public class Testowa {

    public static void main(String[] args) {

        boolean zmienna = true;


        //
        try {
            nawiazPolaczenieZBaza();
            metodaKtoraRzucaCzasemWyjatek(zmienna);
        } catch (IOException e) {
            System.out.println("Polecial wyjatek uzywam innej metody");
            metodaBezWyjatku(zmienna);
            zerwijPolaczenieZBaza();
        }
        finally {
            zerwijPolaczenieZBaza();
        }

        try (DBConnector connector = new DBConnector()) {
            metodaKtoraRzucaCzasemWyjatek(zmienna);
        } catch (Exception e) {
            System.out.println("Polecial wyjatek uzywam innej metody");
            metodaBezWyjatku(zmienna);
        }
    }

    private static void nawiazPolaczenieZBaza() {
        System.out.println("LACZE Z BAZA");
    }

    private static void zerwijPolaczenieZBaza() {
        System.out.println("KONCZE POLACZENIE Z BAZA DANYCH");
    }

    private static void metodaBezWyjatku(boolean zmienna) {
        if (zmienna) {
            throw new RuntimeException();
        }
        System.out.println("OK");
    }

    private static void metodaKtoraRzucaCzasemWyjatek(boolean zmienna) throws IOException {
        if (zmienna) {
            throw new IOException();
        }
        System.out.println("BEZ WYJATKU OK");
    }


}
